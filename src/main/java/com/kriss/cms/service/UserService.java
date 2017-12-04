package com.kriss.cms.service;

import com.kriss.cms.mybatis.dao.UserDao;
import com.kriss.cms.mybatis.dto.CmsUsers;

public class UserService {

    public CmsUsers login(CmsUsers cmsUsers){
        UserDao userDao   = new UserDao();
        return  userDao.login(cmsUsers);
    }
}
