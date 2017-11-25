package com.kriss.cms.mybatis.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CmsArticleExample() {
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("`article_title` is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("`article_title` is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("`article_title` =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("`article_title` <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("`article_title` >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("`article_title` >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("`article_title` <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("`article_title` <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("`article_title` like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("`article_title` not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("`article_title` in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("`article_title` not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("`article_title` between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("`article_title` not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andClickCntIsNull() {
            addCriterion("`click_cnt` is null");
            return (Criteria) this;
        }

        public Criteria andClickCntIsNotNull() {
            addCriterion("`click_cnt` is not null");
            return (Criteria) this;
        }

        public Criteria andClickCntEqualTo(Integer value) {
            addCriterion("`click_cnt` =", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntNotEqualTo(Integer value) {
            addCriterion("`click_cnt` <>", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntGreaterThan(Integer value) {
            addCriterion("`click_cnt` >", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("`click_cnt` >=", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntLessThan(Integer value) {
            addCriterion("`click_cnt` <", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntLessThanOrEqualTo(Integer value) {
            addCriterion("`click_cnt` <=", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntIn(List<Integer> values) {
            addCriterion("`click_cnt` in", values, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntNotIn(List<Integer> values) {
            addCriterion("`click_cnt` not in", values, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntBetween(Integer value1, Integer value2) {
            addCriterion("`click_cnt` between", value1, value2, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntNotBetween(Integer value1, Integer value2) {
            addCriterion("`click_cnt` not between", value1, value2, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNull() {
            addCriterion("`article_url` is null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNotNull() {
            addCriterion("`article_url` is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlEqualTo(String value) {
            addCriterion("`article_url` =", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotEqualTo(String value) {
            addCriterion("`article_url` <>", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThan(String value) {
            addCriterion("`article_url` >", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("`article_url` >=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThan(String value) {
            addCriterion("`article_url` <", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThanOrEqualTo(String value) {
            addCriterion("`article_url` <=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLike(String value) {
            addCriterion("`article_url` like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotLike(String value) {
            addCriterion("`article_url` not like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIn(List<String> values) {
            addCriterion("`article_url` in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotIn(List<String> values) {
            addCriterion("`article_url` not in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlBetween(String value1, String value2) {
            addCriterion("`article_url` between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotBetween(String value1, String value2) {
            addCriterion("`article_url` not between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("`creator` is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("`creator` is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("`creator` =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("`creator` <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("`creator` >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("`creator` >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("`creator` <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("`creator` <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("`creator` like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("`creator` not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("`creator` in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("`creator` not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("`creator` between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("`creator` not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNull() {
            addCriterion("`key_words` is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNotNull() {
            addCriterion("`key_words` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsEqualTo(String value) {
            addCriterion("`key_words` =", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotEqualTo(String value) {
            addCriterion("`key_words` <>", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThan(String value) {
            addCriterion("`key_words` >", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanOrEqualTo(String value) {
            addCriterion("`key_words` >=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThan(String value) {
            addCriterion("`key_words` <", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanOrEqualTo(String value) {
            addCriterion("`key_words` <=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLike(String value) {
            addCriterion("`key_words` like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotLike(String value) {
            addCriterion("`key_words` not like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIn(List<String> values) {
            addCriterion("`key_words` in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotIn(List<String> values) {
            addCriterion("`key_words` not in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsBetween(String value1, String value2) {
            addCriterion("`key_words` between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotBetween(String value1, String value2) {
            addCriterion("`key_words` not between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("`path` is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("`path` is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("`path` =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("`path` <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("`path` >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("`path` >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("`path` <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("`path` <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("`path` like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("`path` not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("`path` in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("`path` not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("`path` between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("`path` not between", value1, value2, "path");
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