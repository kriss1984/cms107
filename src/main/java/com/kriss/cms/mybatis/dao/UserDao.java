package com.kriss.cms.mybatis.dao;

import com.kriss.cms.mybatis.dto.CmsUsers;
import com.kriss.cms.mybatis.dto.CmsUsersExample;
import com.kriss.util.encript.MD6Util;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDao extends  BaseDao {


    public CmsUsers login(CmsUsers cmsUsers){
        CmsUsers result =null;
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CmsUsersExample  cmsUsersExample  = new CmsUsersExample();
        CmsUsersExample.Criteria   cmsUsersCriteria =  cmsUsersExample.createCriteria();

        cmsUsersCriteria.andLogNameEqualTo(cmsUsers.getLogName());
        CmsUsersMapper cmsUserMapper =   sqlSession.getMapper(CmsUsersMapper.class);
        List<CmsUsers> users = cmsUserMapper.selectByExample(cmsUsersExample);

        if(users!=null&&users.size()>0){
            for(CmsUsers tmp:users){
                if(MD6Util.MD6Equal(tmp.getLogPasswd(),cmsUsers.getLogPasswd())){
                    result = tmp;
                    break;
                }
            }
        }
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
