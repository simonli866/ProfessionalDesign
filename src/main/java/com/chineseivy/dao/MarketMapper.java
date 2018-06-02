package com.chineseivy.dao;

import com.chineseivy.bean.Market;
import com.chineseivy.bean.MarketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    long countByExample(MarketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int deleteByExample(MarketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer markid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int insert(Market record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int insertSelective(Market record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    List<Market> selectByExampleWithBLOBs(MarketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    List<Market> selectByExample(MarketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    Market selectByPrimaryKey(Integer markid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Market record, @Param("example") MarketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Market record, @Param("example") MarketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Market record, @Param("example") MarketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Market record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Market record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_market
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Market record);
}