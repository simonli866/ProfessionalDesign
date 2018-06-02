package com.chineseivy.dao;

import com.chineseivy.bean.Recommend;
import com.chineseivy.bean.RecommendExample;
import java.util.List;

import com.chineseivy.bean.RecommendPackage;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface RecommendMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recommend
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer recommendid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recommend
     *
     * @mbg.generated
     */
    int insertSelective(Recommend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recommend
     *
     * @mbg.generated
     */
    RecommendPackage selectByPrimaryKey(Integer recommendid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recommend
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Recommend record);

}