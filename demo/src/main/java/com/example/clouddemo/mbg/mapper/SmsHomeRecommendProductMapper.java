package com.example.clouddemo.mbg.mapper;

import com.example.clouddemo.mbg.model.SmsHomeRecommendProduct;
import com.example.clouddemo.mbg.model.SmsHomeRecommendProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsHomeRecommendProductMapper {
    long countByExample(SmsHomeRecommendProductExample example);

    int deleteByExample(SmsHomeRecommendProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    int insertSelective(SmsHomeRecommendProduct record);

    List<SmsHomeRecommendProduct> selectByExample(SmsHomeRecommendProductExample example);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);

    int updateByExample(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}