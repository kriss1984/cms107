package com.kriss.cms.mybatis.dao;

import com.kriss.cms.mybatis.dto.CarRegist;
import com.kriss.cms.mybatis.dto.CarRegistExample;
import com.kriss.cms.mybatis.dto.CrmRegiste;
import com.kriss.cms.mybatis.dto.CrmRegisteExample;
import com.kriss.util.IDGenerator;
import com.kriss.util.Pager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarDao extends  BaseDao {


    public void saveReg(CarRegist carRegist){
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CarRegistMapper crmRegisteMapper =   sqlSession.getMapper(CarRegistMapper.class);
        crmRegisteMapper.insert(carRegist);
        sqlSession.commit();
        sqlSession.close();
    }

    public void listRegs(Pager pager) {
        List  result  = new ArrayList();
        SqlSessionFactory  sqlSessionFactory  = getSession();
        SqlSession  sqlSession  = sqlSessionFactory.openSession();
        CarRegistExample carRegisteExample   =new CarRegistExample();
        carRegisteExample.setOrderByClause("reg_time desc ");
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
