package com.kriss.cms.mybatis.dao;

import com.kriss.cms.mybatis.dto.CmsUsers;
import com.kriss.cms.mybatis.dto.CmsUsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsUsersMapper {
    int countByExample(CmsUsersExample example);

    int deleteByExample(CmsUsersExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(CmsUsers record);

    int insertSelective(CmsUsers record);

    List<CmsUsers> selectByExample(CmsUsersExample example);

    CmsUsers selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") CmsUsers record, @Param("example") CmsUsersExample example);

    int updateByExample(@Param("record") CmsUsers record, @Param("example") CmsUsersExample example);

    int updateByPrimaryKeySelective(CmsUsers record);

    int updateByPrimaryKey(CmsUsers record);
}