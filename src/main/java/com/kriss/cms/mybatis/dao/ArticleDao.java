package com.kriss.cms.mybatis.dao;

import com.kriss.cms.mybatis.dto.CmsArticle;
import com.kriss.cms.mybatis.dto.CmsArticleExample;
import com.kriss.util.Pager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class ArticleDao extends  BaseDao {


    public void saveArticle(CmsArticle cmsArticle){
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CmsArticleMapper cmsArticleMapper =   sqlSession.getMapper(CmsArticleMapper.class);
        cmsArticleMapper.insertSelective(cmsArticle);
        sqlSession.commit();
        sqlSession.close();
    }


    public void listArticle(Pager pager){
        List  result  = new ArrayList();
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();

        CmsArticleExample cmsArticleExample   =new CmsArticleExample();
        cmsArticleExample.setOrderByClause("create_time desc ");
        cmsArticleExample.setLimitStart(pager.getStart());
        cmsArticleExample.setLimitEnd(pager.getPageSize());

        CmsArticleMapper cmsArticleMapper  =   sqlSession.getMapper(CmsArticleMapper.class);
        result =  cmsArticleMapper.selectByExample(cmsArticleExample);
        int total  =  cmsArticleMapper.countByExample(cmsArticleExample);
        pager.setRows(result);
        pager.setRecords(total);
        sqlSession.commit();
        sqlSession.close();
    }

    public void updateClickCntByLink(String link){
        CmsArticle  result  = new CmsArticle();
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();

        CmsArticleExample cmsArticleExample   =new CmsArticleExample();
        CmsArticleExample.Criteria  cmsArticleCriteria = cmsArticleExample.createCriteria();
        cmsArticleCriteria.andPathLike("%"+link+"%");

        CmsArticleMapper cmsArticleMapper  =   sqlSession.getMapper(CmsArticleMapper.class);
        List articles =  cmsArticleMapper.selectByExample(cmsArticleExample);
        if(articles!=null&&articles.size()>0){
            result =(CmsArticle)articles.get(0);
            result.setClickCnt(result.getClickCnt()+1);
            cmsArticleMapper.updateByPrimaryKey(result);
        }
        sqlSession.commit();
        sqlSession.close();

    }

}
