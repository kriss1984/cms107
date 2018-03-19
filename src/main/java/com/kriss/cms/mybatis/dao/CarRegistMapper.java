package com.kriss.cms.mybatis.dao;

import com.kriss.cms.mybatis.dto.CarRegist;
import com.kriss.cms.mybatis.dto.CarRegistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarRegistMapper {
    int countByExample(CarRegistExample example);

    int deleteByExample(CarRegistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarRegist record);

    int insertSelective(CarRegist record);

    List<CarRegist> selectByExample(CarRegistExample example);

    CarRegist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarRegist record, @Param("example") CarRegistExample example);

    int updateByExample(@Param("record") CarRegist record, @Param("example") CarRegistExample example);

    int updateByPrimaryKeySelective(CarRegist record);

    int updateByPrimaryKey(CarRegist record);
}