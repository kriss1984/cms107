package com.kriss.cms.mybatis.dao;

import com.kriss.cms.mybatis.dto.CmsArticle;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ArticleDao extends  BaseDao {


    public void saveArticle(CmsArticle cmsArticle){
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CmsArticleMapper cmsArticleMapper =   sqlSession.getMapper(CmsArticleMapper.class);
        cmsArticleMapper.insertSelective(cmsArticle);
        sqlSession.commit();
        sqlSession.close();
    }
}
