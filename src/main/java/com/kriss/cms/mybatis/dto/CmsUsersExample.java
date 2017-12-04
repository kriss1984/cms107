package com.kriss.cms.mybatis.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CmsUsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

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

        public Criteria andUuidIsNull() {
            addCriterion("`uuid` is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("`uuid` is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("`uuid` =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("`uuid` <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("`uuid` >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("`uuid` >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("`uuid` <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("`uuid` <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("`uuid` like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("`uuid` not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("`uuid` in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("`uuid` not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("`uuid` between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("`uuid` not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNull() {
            addCriterion("`log_name` is null");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNotNull() {
            addCriterion("`log_name` is not null");
            return (Criteria) this;
        }

        public Criteria andLogNameEqualTo(String value) {
            addCriterion("`log_name` =", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotEqualTo(String value) {
            addCriterion("`log_name` <>", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThan(String value) {
            addCriterion("`log_name` >", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThanOrEqualTo(String value) {
            addCriterion("`log_name` >=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThan(String value) {
            addCriterion("`log_name` <", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThanOrEqualTo(String value) {
            addCriterion("`log_name` <=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLike(String value) {
            addCriterion("`log_name` like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotLike(String value) {
            addCriterion("`log_name` not like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameIn(List<String> values) {
            addCriterion("`log_name` in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotIn(List<String> values) {
            addCriterion("`log_name` not in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameBetween(String value1, String value2) {
            addCriterion("`log_name` between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotBetween(String value1, String value2) {
            addCriterion("`log_name` not between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogPasswdIsNull() {
            addCriterion("`log_passwd` is null");
            return (Criteria) this;
        }

        public Criteria andLogPasswdIsNotNull() {
            addCriterion("`log_passwd` is not null");
            return (Criteria) this;
        }

        public Criteria andLogPasswdEqualTo(String value) {
            addCriterion("`log_passwd` =", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdNotEqualTo(String value) {
            addCriterion("`log_passwd` <>", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdGreaterThan(String value) {
            addCriterion("`log_passwd` >", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("`log_passwd` >=", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdLessThan(String value) {
            addCriterion("`log_passwd` <", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdLessThanOrEqualTo(String value) {
            addCriterion("`log_passwd` <=", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdLike(String value) {
            addCriterion("`log_passwd` like", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdNotLike(String value) {
            addCriterion("`log_passwd` not like", value, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdIn(List<String> values) {
            addCriterion("`log_passwd` in", values, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdNotIn(List<String> values) {
            addCriterion("`log_passwd` not in", values, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdBetween(String value1, String value2) {
            addCriterion("`log_passwd` between", value1, value2, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andLogPasswdNotBetween(String value1, String value2) {
            addCriterion("`log_passwd` not between", value1, value2, "logPasswd");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("`nick_name` is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("`nick_name` is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("`nick_name` =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("`nick_name` <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("`nick_name` >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("`nick_name` >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("`nick_name` <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("`nick_name` <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("`nick_name` like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("`nick_name` not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("`nick_name` in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("`nick_name` not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("`nick_name` between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("`nick_name` not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNull() {
            addCriterion("`log_ip` is null");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNotNull() {
            addCriterion("`log_ip` is not null");
            return (Criteria) this;
        }

        public Criteria andLogIpEqualTo(String value) {
            addCriterion("`log_ip` =", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotEqualTo(String value) {
            addCriterion("`log_ip` <>", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThan(String value) {
            addCriterion("`log_ip` >", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("`log_ip` >=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThan(String value) {
            addCriterion("`log_ip` <", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThanOrEqualTo(String value) {
            addCriterion("`log_ip` <=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLike(String value) {
            addCriterion("`log_ip` like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotLike(String value) {
            addCriterion("`log_ip` not like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpIn(List<String> values) {
            addCriterion("`log_ip` in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotIn(List<String> values) {
            addCriterion("`log_ip` not in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpBetween(String value1, String value2) {
            addCriterion("`log_ip` between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotBetween(String value1, String value2) {
            addCriterion("`log_ip` not between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("`log_time` is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("`log_time` is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("`log_time` =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("`log_time` <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("`log_time` >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`log_time` >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("`log_time` <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("`log_time` <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("`log_time` in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("`log_time` not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("`log_time` between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("`log_time` not between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("`user_type` is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("`user_type` is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("`user_type` =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("`user_type` <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("`user_type` >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`user_type` >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("`user_type` <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`user_type` <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("`user_type` in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("`user_type` not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("`user_type` between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`user_type` not between", value1, value2, "userType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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