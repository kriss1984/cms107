package com.kriss.cms.service;

import com.kriss.cms.mybatis.dao.ArticleDao;
import com.kriss.cms.mybatis.dto.CmsArticle;
import com.kriss.util.Pager;

public class ArticleService {

    public void saveArticle(CmsArticle cmsArticle){
        ArticleDao articleDao   = new ArticleDao();
        articleDao.saveArticle(cmsArticle);
    }

    public void listArticle(Pager pager){
        ArticleDao articleDao   = new ArticleDao();
        articleDao.listArticle(pager);
    }
}
