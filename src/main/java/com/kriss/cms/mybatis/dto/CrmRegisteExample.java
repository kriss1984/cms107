package com.kriss.cms.mybatis.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmRegisteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CrmRegisteExample() {
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

        public Criteria andRegNameIsNull() {
            addCriterion("`reg_name` is null");
            return (Criteria) this;
        }

        public Criteria andRegNameIsNotNull() {
            addCriterion("`reg_name` is not null");
            return (Criteria) this;
        }

        public Criteria andRegNameEqualTo(String value) {
            addCriterion("`reg_name` =", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotEqualTo(String value) {
            addCriterion("`reg_name` <>", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameGreaterThan(String value) {
            addCriterion("`reg_name` >", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("`reg_name` >=", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLessThan(String value) {
            addCriterion("`reg_name` <", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLessThanOrEqualTo(String value) {
            addCriterion("`reg_name` <=", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLike(String value) {
            addCriterion("`reg_name` like", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotLike(String value) {
            addCriterion("`reg_name` not like", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameIn(List<String> values) {
            addCriterion("`reg_name` in", values, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotIn(List<String> values) {
            addCriterion("`reg_name` not in", values, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameBetween(String value1, String value2) {
            addCriterion("`reg_name` between", value1, value2, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotBetween(String value1, String value2) {
            addCriterion("`reg_name` not between", value1, value2, "regName");
            return (Criteria) this;
        }

        public Criteria andRegPhoneIsNull() {
            addCriterion("`reg_phone` is null");
            return (Criteria) this;
        }

        public Criteria andRegPhoneIsNotNull() {
            addCriterion("`reg_phone` is not null");
            return (Criteria) this;
        }

        public Criteria andRegPhoneEqualTo(String value) {
            addCriterion("`reg_phone` =", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneNotEqualTo(String value) {
            addCriterion("`reg_phone` <>", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneGreaterThan(String value) {
            addCriterion("`reg_phone` >", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("`reg_phone` >=", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneLessThan(String value) {
            addCriterion("`reg_phone` <", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneLessThanOrEqualTo(String value) {
            addCriterion("`reg_phone` <=", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneLike(String value) {
            addCriterion("`reg_phone` like", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneNotLike(String value) {
            addCriterion("`reg_phone` not like", value, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneIn(List<String> values) {
            addCriterion("`reg_phone` in", values, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneNotIn(List<String> values) {
            addCriterion("`reg_phone` not in", values, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneBetween(String value1, String value2) {
            addCriterion("`reg_phone` between", value1, value2, "regPhone");
            return (Criteria) this;
        }

        public Criteria andRegPhoneNotBetween(String value1, String value2) {
            addCriterion("`reg_phone` not between", value1, value2, "regPhone");
            return (Criteria) this;
        }

        public Criteria andJiancaiIsNull() {
            addCriterion("`jiancai` is null");
            return (Criteria) this;
        }

        public Criteria andJiancaiIsNotNull() {
            addCriterion("`jiancai` is not null");
            return (Criteria) this;
        }

        public Criteria andJiancaiEqualTo(String value) {
            addCriterion("`jiancai` =", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiNotEqualTo(String value) {
            addCriterion("`jiancai` <>", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiGreaterThan(String value) {
            addCriterion("`jiancai` >", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiGreaterThanOrEqualTo(String value) {
            addCriterion("`jiancai` >=", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiLessThan(String value) {
            addCriterion("`jiancai` <", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiLessThanOrEqualTo(String value) {
            addCriterion("`jiancai` <=", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiLike(String value) {
            addCriterion("`jiancai` like", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiNotLike(String value) {
            addCriterion("`jiancai` not like", value, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiIn(List<String> values) {
            addCriterion("`jiancai` in", values, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiNotIn(List<String> values) {
            addCriterion("`jiancai` not in", values, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiBetween(String value1, String value2) {
            addCriterion("`jiancai` between", value1, value2, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiancaiNotBetween(String value1, String value2) {
            addCriterion("`jiancai` not between", value1, value2, "jiancai");
            return (Criteria) this;
        }

        public Criteria andJiadianIsNull() {
            addCriterion("`jiadian` is null");
            return (Criteria) this;
        }

        public Criteria andJiadianIsNotNull() {
            addCriterion("`jiadian` is not null");
            return (Criteria) this;
        }

        public Criteria andJiadianEqualTo(String value) {
            addCriterion("`jiadian` =", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianNotEqualTo(String value) {
            addCriterion("`jiadian` <>", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianGreaterThan(String value) {
            addCriterion("`jiadian` >", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianGreaterThanOrEqualTo(String value) {
            addCriterion("`jiadian` >=", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianLessThan(String value) {
            addCriterion("`jiadian` <", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianLessThanOrEqualTo(String value) {
            addCriterion("`jiadian` <=", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianLike(String value) {
            addCriterion("`jiadian` like", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianNotLike(String value) {
            addCriterion("`jiadian` not like", value, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianIn(List<String> values) {
            addCriterion("`jiadian` in", values, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianNotIn(List<String> values) {
            addCriterion("`jiadian` not in", values, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianBetween(String value1, String value2) {
            addCriterion("`jiadian` between", value1, value2, "jiadian");
            return (Criteria) this;
        }

        public Criteria andJiadianNotBetween(String value1, String value2) {
            addCriterion("`jiadian` not between", value1, value2, "jiadian");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsIsNull() {
            addCriterion("`zhuangxiugs` is null");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsIsNotNull() {
            addCriterion("`zhuangxiugs` is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsEqualTo(String value) {
            addCriterion("`zhuangxiugs` =", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsNotEqualTo(String value) {
            addCriterion("`zhuangxiugs` <>", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsGreaterThan(String value) {
            addCriterion("`zhuangxiugs` >", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsGreaterThanOrEqualTo(String value) {
            addCriterion("`zhuangxiugs` >=", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsLessThan(String value) {
            addCriterion("`zhuangxiugs` <", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsLessThanOrEqualTo(String value) {
            addCriterion("`zhuangxiugs` <=", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsLike(String value) {
            addCriterion("`zhuangxiugs` like", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsNotLike(String value) {
            addCriterion("`zhuangxiugs` not like", value, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsIn(List<String> values) {
            addCriterion("`zhuangxiugs` in", values, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsNotIn(List<String> values) {
            addCriterion("`zhuangxiugs` not in", values, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsBetween(String value1, String value2) {
            addCriterion("`zhuangxiugs` between", value1, value2, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andZhuangxiugsNotBetween(String value1, String value2) {
            addCriterion("`zhuangxiugs` not between", value1, value2, "zhuangxiugs");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcIsNull() {
            addCriterion("`jiaquanjc` is null");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcIsNotNull() {
            addCriterion("`jiaquanjc` is not null");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcEqualTo(String value) {
            addCriterion("`jiaquanjc` =", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcNotEqualTo(String value) {
            addCriterion("`jiaquanjc` <>", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcGreaterThan(String value) {
            addCriterion("`jiaquanjc` >", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcGreaterThanOrEqualTo(String value) {
            addCriterion("`jiaquanjc` >=", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcLessThan(String value) {
            addCriterion("`jiaquanjc` <", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcLessThanOrEqualTo(String value) {
            addCriterion("`jiaquanjc` <=", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcLike(String value) {
            addCriterion("`jiaquanjc` like", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcNotLike(String value) {
            addCriterion("`jiaquanjc` not like", value, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcIn(List<String> values) {
            addCriterion("`jiaquanjc` in", values, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcNotIn(List<String> values) {
            addCriterion("`jiaquanjc` not in", values, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcBetween(String value1, String value2) {
            addCriterion("`jiaquanjc` between", value1, value2, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andJiaquanjcNotBetween(String value1, String value2) {
            addCriterion("`jiaquanjc` not between", value1, value2, "jiaquanjc");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("`reg_time` is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("`reg_time` is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("`reg_time` =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("`reg_time` <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("`reg_time` >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`reg_time` >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("`reg_time` <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("`reg_time` <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("`reg_time` in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("`reg_time` not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("`reg_time` between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("`reg_time` not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNull() {
            addCriterion("`reg_source` is null");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNotNull() {
            addCriterion("`reg_source` is not null");
            return (Criteria) this;
        }

        public Criteria andRegSourceEqualTo(String value) {
            addCriterion("`reg_source` =", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotEqualTo(String value) {
            addCriterion("`reg_source` <>", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThan(String value) {
            addCriterion("`reg_source` >", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThanOrEqualTo(String value) {
            addCriterion("`reg_source` >=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThan(String value) {
            addCriterion("`reg_source` <", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThanOrEqualTo(String value) {
            addCriterion("`reg_source` <=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLike(String value) {
            addCriterion("`reg_source` like", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotLike(String value) {
            addCriterion("`reg_source` not like", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceIn(List<String> values) {
            addCriterion("`reg_source` in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotIn(List<String> values) {
            addCriterion("`reg_source` not in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceBetween(String value1, String value2) {
            addCriterion("`reg_source` between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotBetween(String value1, String value2) {
            addCriterion("`reg_source` not between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andReqIpIsNull() {
            addCriterion("`req_ip` is null");
            return (Criteria) this;
        }

        public Criteria andReqIpIsNotNull() {
            addCriterion("`req_ip` is not null");
            return (Criteria) this;
        }

        public Criteria andReqIpEqualTo(String value) {
            addCriterion("`req_ip` =", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotEqualTo(String value) {
            addCriterion("`req_ip` <>", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpGreaterThan(String value) {
            addCriterion("`req_ip` >", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpGreaterThanOrEqualTo(String value) {
            addCriterion("`req_ip` >=", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLessThan(String value) {
            addCriterion("`req_ip` <", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLessThanOrEqualTo(String value) {
            addCriterion("`req_ip` <=", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLike(String value) {
            addCriterion("`req_ip` like", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotLike(String value) {
            addCriterion("`req_ip` not like", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpIn(List<String> values) {
            addCriterion("`req_ip` in", values, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotIn(List<String> values) {
            addCriterion("`req_ip` not in", values, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpBetween(String value1, String value2) {
            addCriterion("`req_ip` between", value1, value2, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotBetween(String value1, String value2) {
            addCriterion("`req_ip` not between", value1, value2, "reqIp");
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