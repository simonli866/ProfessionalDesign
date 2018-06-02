package com.chineseivy.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberIsNull() {
            addCriterion("boughtNumber is null");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberIsNotNull() {
            addCriterion("boughtNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberEqualTo(Integer value) {
            addCriterion("boughtNumber =", value, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberNotEqualTo(Integer value) {
            addCriterion("boughtNumber <>", value, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberGreaterThan(Integer value) {
            addCriterion("boughtNumber >", value, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("boughtNumber >=", value, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberLessThan(Integer value) {
            addCriterion("boughtNumber <", value, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberLessThanOrEqualTo(Integer value) {
            addCriterion("boughtNumber <=", value, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberIn(List<Integer> values) {
            addCriterion("boughtNumber in", values, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberNotIn(List<Integer> values) {
            addCriterion("boughtNumber not in", values, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberBetween(Integer value1, Integer value2) {
            addCriterion("boughtNumber between", value1, value2, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("boughtNumber not between", value1, value2, "boughtnumber");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardIsNull() {
            addCriterion("boughtStandard is null");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardIsNotNull() {
            addCriterion("boughtStandard is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardEqualTo(String value) {
            addCriterion("boughtStandard =", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardNotEqualTo(String value) {
            addCriterion("boughtStandard <>", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardGreaterThan(String value) {
            addCriterion("boughtStandard >", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardGreaterThanOrEqualTo(String value) {
            addCriterion("boughtStandard >=", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardLessThan(String value) {
            addCriterion("boughtStandard <", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardLessThanOrEqualTo(String value) {
            addCriterion("boughtStandard <=", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardLike(String value) {
            addCriterion("boughtStandard like", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardNotLike(String value) {
            addCriterion("boughtStandard not like", value, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardIn(List<String> values) {
            addCriterion("boughtStandard in", values, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardNotIn(List<String> values) {
            addCriterion("boughtStandard not in", values, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardBetween(String value1, String value2) {
            addCriterion("boughtStandard between", value1, value2, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtstandardNotBetween(String value1, String value2) {
            addCriterion("boughtStandard not between", value1, value2, "boughtstandard");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceIsNull() {
            addCriterion("boughtPrice is null");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceIsNotNull() {
            addCriterion("boughtPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceEqualTo(BigDecimal value) {
            addCriterion("boughtPrice =", value, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceNotEqualTo(BigDecimal value) {
            addCriterion("boughtPrice <>", value, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceGreaterThan(BigDecimal value) {
            addCriterion("boughtPrice >", value, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boughtPrice >=", value, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceLessThan(BigDecimal value) {
            addCriterion("boughtPrice <", value, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boughtPrice <=", value, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceIn(List<BigDecimal> values) {
            addCriterion("boughtPrice in", values, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceNotIn(List<BigDecimal> values) {
            addCriterion("boughtPrice not in", values, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boughtPrice between", value1, value2, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andBoughtpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boughtPrice not between", value1, value2, "boughtprice");
            return (Criteria) this;
        }

        public Criteria andPaidstateIsNull() {
            addCriterion("paidState is null");
            return (Criteria) this;
        }

        public Criteria andPaidstateIsNotNull() {
            addCriterion("paidState is not null");
            return (Criteria) this;
        }

        public Criteria andPaidstateEqualTo(Integer value) {
            addCriterion("paidState =", value, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateNotEqualTo(Integer value) {
            addCriterion("paidState <>", value, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateGreaterThan(Integer value) {
            addCriterion("paidState >", value, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("paidState >=", value, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateLessThan(Integer value) {
            addCriterion("paidState <", value, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateLessThanOrEqualTo(Integer value) {
            addCriterion("paidState <=", value, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateIn(List<Integer> values) {
            addCriterion("paidState in", values, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateNotIn(List<Integer> values) {
            addCriterion("paidState not in", values, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateBetween(Integer value1, Integer value2) {
            addCriterion("paidState between", value1, value2, "paidstate");
            return (Criteria) this;
        }

        public Criteria andPaidstateNotBetween(Integer value1, Integer value2) {
            addCriterion("paidState not between", value1, value2, "paidstate");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeIsNull() {
            addCriterion("confirmedTime is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeIsNotNull() {
            addCriterion("confirmedTime is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeEqualTo(Date value) {
            addCriterion("confirmedTime =", value, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeNotEqualTo(Date value) {
            addCriterion("confirmedTime <>", value, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeGreaterThan(Date value) {
            addCriterion("confirmedTime >", value, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirmedTime >=", value, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeLessThan(Date value) {
            addCriterion("confirmedTime <", value, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeLessThanOrEqualTo(Date value) {
            addCriterion("confirmedTime <=", value, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeIn(List<Date> values) {
            addCriterion("confirmedTime in", values, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeNotIn(List<Date> values) {
            addCriterion("confirmedTime not in", values, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeBetween(Date value1, Date value2) {
            addCriterion("confirmedTime between", value1, value2, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andConfirmedtimeNotBetween(Date value1, Date value2) {
            addCriterion("confirmedTime not between", value1, value2, "confirmedtime");
            return (Criteria) this;
        }

        public Criteria andLosestateIsNull() {
            addCriterion("loseState is null");
            return (Criteria) this;
        }

        public Criteria andLosestateIsNotNull() {
            addCriterion("loseState is not null");
            return (Criteria) this;
        }

        public Criteria andLosestateEqualTo(Integer value) {
            addCriterion("loseState =", value, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateNotEqualTo(Integer value) {
            addCriterion("loseState <>", value, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateGreaterThan(Integer value) {
            addCriterion("loseState >", value, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("loseState >=", value, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateLessThan(Integer value) {
            addCriterion("loseState <", value, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateLessThanOrEqualTo(Integer value) {
            addCriterion("loseState <=", value, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateIn(List<Integer> values) {
            addCriterion("loseState in", values, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateNotIn(List<Integer> values) {
            addCriterion("loseState not in", values, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateBetween(Integer value1, Integer value2) {
            addCriterion("loseState between", value1, value2, "losestate");
            return (Criteria) this;
        }

        public Criteria andLosestateNotBetween(Integer value1, Integer value2) {
            addCriterion("loseState not between", value1, value2, "losestate");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeIsNull() {
            addCriterion("receivedTime is null");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeIsNotNull() {
            addCriterion("receivedTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeEqualTo(Date value) {
            addCriterion("receivedTime =", value, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeNotEqualTo(Date value) {
            addCriterion("receivedTime <>", value, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeGreaterThan(Date value) {
            addCriterion("receivedTime >", value, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receivedTime >=", value, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeLessThan(Date value) {
            addCriterion("receivedTime <", value, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeLessThanOrEqualTo(Date value) {
            addCriterion("receivedTime <=", value, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeIn(List<Date> values) {
            addCriterion("receivedTime in", values, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeNotIn(List<Date> values) {
            addCriterion("receivedTime not in", values, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeBetween(Date value1, Date value2) {
            addCriterion("receivedTime between", value1, value2, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andReceivedtimeNotBetween(Date value1, Date value2) {
            addCriterion("receivedTime not between", value1, value2, "receivedtime");
            return (Criteria) this;
        }

        public Criteria andCancelstateIsNull() {
            addCriterion("cancelState is null");
            return (Criteria) this;
        }

        public Criteria andCancelstateIsNotNull() {
            addCriterion("cancelState is not null");
            return (Criteria) this;
        }

        public Criteria andCancelstateEqualTo(Integer value) {
            addCriterion("cancelState =", value, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateNotEqualTo(Integer value) {
            addCriterion("cancelState <>", value, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateGreaterThan(Integer value) {
            addCriterion("cancelState >", value, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancelState >=", value, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateLessThan(Integer value) {
            addCriterion("cancelState <", value, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateLessThanOrEqualTo(Integer value) {
            addCriterion("cancelState <=", value, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateIn(List<Integer> values) {
            addCriterion("cancelState in", values, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateNotIn(List<Integer> values) {
            addCriterion("cancelState not in", values, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateBetween(Integer value1, Integer value2) {
            addCriterion("cancelState between", value1, value2, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andCancelstateNotBetween(Integer value1, Integer value2) {
            addCriterion("cancelState not between", value1, value2, "cancelstate");
            return (Criteria) this;
        }

        public Criteria andDeletestateIsNull() {
            addCriterion("deleteState is null");
            return (Criteria) this;
        }

        public Criteria andDeletestateIsNotNull() {
            addCriterion("deleteState is not null");
            return (Criteria) this;
        }

        public Criteria andDeletestateEqualTo(Integer value) {
            addCriterion("deleteState =", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateNotEqualTo(Integer value) {
            addCriterion("deleteState <>", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateGreaterThan(Integer value) {
            addCriterion("deleteState >", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteState >=", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateLessThan(Integer value) {
            addCriterion("deleteState <", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateLessThanOrEqualTo(Integer value) {
            addCriterion("deleteState <=", value, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateIn(List<Integer> values) {
            addCriterion("deleteState in", values, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateNotIn(List<Integer> values) {
            addCriterion("deleteState not in", values, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateBetween(Integer value1, Integer value2) {
            addCriterion("deleteState between", value1, value2, "deletestate");
            return (Criteria) this;
        }

        public Criteria andDeletestateNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteState not between", value1, value2, "deletestate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}