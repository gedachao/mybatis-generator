package com.kong.mybatis.mapper;

import com.kong.mybatis.model.Cat;
import com.kong.mybatis.model.CatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CatMapper {
    long countByExample(CatExample example);

    int deleteByExample(CatExample example);

    int deleteByPrimaryKey(Integer pkCat);

    int insert(Cat record);

    int insertSelective(Cat record);

    List<Cat> selectByExample(CatExample example);

    Cat selectByPrimaryKey(Integer pkCat);

    int updateByExampleSelective(@Param("record") Cat record, @Param("example") CatExample example);

    int updateByExample(@Param("record") Cat record, @Param("example") CatExample example);

    int updateByPrimaryKeySelective(Cat record);

    int updateByPrimaryKey(Cat record);
}