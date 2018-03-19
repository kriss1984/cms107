package com.kriss.cms.mybatis.dao;

import com.kriss.cms.mybatis.dto.*;
import com.kriss.util.IDGenerator;
import com.kriss.util.Pager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BizDao extends  BaseDao {


    public void saveReg(CrmRegiste crmRegiste){
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CrmRegisteMapper crmRegisteMapper =   sqlSession.getMapper(CrmRegisteMapper.class);
        crmRegiste.setUuid(IDGenerator.uuid());
        crmRegisteMapper.insert(crmRegiste);
        sqlSession.commit();
        sqlSession.close();
    }


    public void listRegs(Pager pager) {
        List  result  = new ArrayList();
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CrmRegisteExample crmRegisteExample   =new CrmRegisteExample();
        crmRegisteExample.setOrderByClause("reg_time desc ");
        crmRegisteExample.setLimitStart(pager.getStart());
        crmRegisteExample.setLimitEnd(pager.getPageSize());

        CrmRegisteMapper crmRegisteMapper  =   sqlSession.getMapper(CrmRegisteMapper.class);
        result =  crmRegisteMapper.selectByExample(crmRegisteExample);
        int total  =  crmRegisteMapper.countByExample(crmRegisteExample);
        pager.setRows(result);
        pager.setRecords(total);
        sqlSession.close();
    }

    public void listCarRegs(Pager pager) {
        List  result  = new ArrayList();
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CarRegistExample carRegisteExample   =new CarRegistExample();
        carRegisteExample.setOrderByClause("registTime desc ");
        carRegisteExample.setLimitStart(pager.getStart());
        carRegisteExample.setLimitEnd(pager.getPageSize());

        CarRegistMapper carRegisteMapper  =   sqlSession.getMapper(CarRegistMapper.class);
        result =  carRegisteMapper.selectByExample(carRegisteExample);
        int total  =  carRegisteMapper.countByExample(carRegisteExample);
        pager.setRows(result);
        pager.setRecords(total);
        sqlSession.close();
    }



    public List listRegsByMap(Map condition){
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CrmRegisteExample crmRegisteExample   =new CrmRegisteExample();
        crmRegisteExample.setOrderByClause("reg_time desc ");

        CrmRegisteMapper crmRegisteMapper  =   sqlSession.getMapper(CrmRegisteMapper.class);
        return   crmRegisteMapper.selectByExample(crmRegisteExample);

    }



}
