package com.kriss.cms.service;

import com.kriss.cms.mybatis.dao.ArticleDao;
import com.kriss.cms.mybatis.dto.CmsArticle;

public class ArticleService {

    public void saveArticle(CmsArticle cmsArticle){
        ArticleDao articleDao   = new ArticleDao();
        articleDao.saveArticle(cmsArticle);
    }
}
