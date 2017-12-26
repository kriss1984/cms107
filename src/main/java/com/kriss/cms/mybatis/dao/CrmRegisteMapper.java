package com.kriss.cms.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.kriss.cms.mybatis.dto.CrmRegiste;
import com.kriss.cms.mybatis.dto.CrmRegisteExample;

public interface CrmRegisteMapper {
    int countByExample(CrmRegisteExample example);

    int deleteByExample(CrmRegisteExample example);

    int insert(CrmRegiste record);

    int insertSelective(CrmRegiste record);

    List<CrmRegiste> selectByExample(CrmRegisteExample example);

    int updateByExampleSelective(@Param("record") CrmRegiste record, @Param("example") CrmRegisteExample example);

    int updateByExample(@Param("record") CrmRegiste record, @Param("example") CrmRegisteExample example);
}