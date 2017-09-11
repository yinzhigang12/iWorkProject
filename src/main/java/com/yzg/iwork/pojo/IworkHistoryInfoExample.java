package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkHistoryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkHistoryInfoExample() {
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

        public Criteria andHistoryinfoidIsNull() {
            addCriterion("historyInfoId is null");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidIsNotNull() {
            addCriterion("historyInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidEqualTo(Integer value) {
            addCriterion("historyInfoId =", value, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidNotEqualTo(Integer value) {
            addCriterion("historyInfoId <>", value, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidGreaterThan(Integer value) {
            addCriterion("historyInfoId >", value, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("historyInfoId >=", value, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidLessThan(Integer value) {
            addCriterion("historyInfoId <", value, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("historyInfoId <=", value, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidIn(List<Integer> values) {
            addCriterion("historyInfoId in", values, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidNotIn(List<Integer> values) {
            addCriterion("historyInfoId not in", values, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidBetween(Integer value1, Integer value2) {
            addCriterion("historyInfoId between", value1, value2, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("historyInfoId not between", value1, value2, "historyinfoid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidIsNull() {
            addCriterion("historySortId is null");
            return (Criteria) this;
        }

        public Criteria andHistorysortidIsNotNull() {
            addCriterion("historySortId is not null");
            return (Criteria) this;
        }

        public Criteria andHistorysortidEqualTo(Integer value) {
            addCriterion("historySortId =", value, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidNotEqualTo(Integer value) {
            addCriterion("historySortId <>", value, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidGreaterThan(Integer value) {
            addCriterion("historySortId >", value, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("historySortId >=", value, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidLessThan(Integer value) {
            addCriterion("historySortId <", value, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidLessThanOrEqualTo(Integer value) {
            addCriterion("historySortId <=", value, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidIn(List<Integer> values) {
            addCriterion("historySortId in", values, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidNotIn(List<Integer> values) {
            addCriterion("historySortId not in", values, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidBetween(Integer value1, Integer value2) {
            addCriterion("historySortId between", value1, value2, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistorysortidNotBetween(Integer value1, Integer value2) {
            addCriterion("historySortId not between", value1, value2, "historysortid");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameIsNull() {
            addCriterion("historyInfoName is null");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameIsNotNull() {
            addCriterion("historyInfoName is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameEqualTo(String value) {
            addCriterion("historyInfoName =", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameNotEqualTo(String value) {
            addCriterion("historyInfoName <>", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameGreaterThan(String value) {
            addCriterion("historyInfoName >", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameGreaterThanOrEqualTo(String value) {
            addCriterion("historyInfoName >=", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameLessThan(String value) {
            addCriterion("historyInfoName <", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameLessThanOrEqualTo(String value) {
            addCriterion("historyInfoName <=", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameLike(String value) {
            addCriterion("historyInfoName like", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameNotLike(String value) {
            addCriterion("historyInfoName not like", value, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameIn(List<String> values) {
            addCriterion("historyInfoName in", values, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameNotIn(List<String> values) {
            addCriterion("historyInfoName not in", values, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameBetween(String value1, String value2) {
            addCriterion("historyInfoName between", value1, value2, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistoryinfonameNotBetween(String value1, String value2) {
            addCriterion("historyInfoName not between", value1, value2, "historyinfoname");
            return (Criteria) this;
        }

        public Criteria andHistorytimeIsNull() {
            addCriterion("historyTime is null");
            return (Criteria) this;
        }

        public Criteria andHistorytimeIsNotNull() {
            addCriterion("historyTime is not null");
            return (Criteria) this;
        }

        public Criteria andHistorytimeEqualTo(Date value) {
            addCriterion("historyTime =", value, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeNotEqualTo(Date value) {
            addCriterion("historyTime <>", value, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeGreaterThan(Date value) {
            addCriterion("historyTime >", value, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("historyTime >=", value, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeLessThan(Date value) {
            addCriterion("historyTime <", value, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeLessThanOrEqualTo(Date value) {
            addCriterion("historyTime <=", value, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeIn(List<Date> values) {
            addCriterion("historyTime in", values, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeNotIn(List<Date> values) {
            addCriterion("historyTime not in", values, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeBetween(Date value1, Date value2) {
            addCriterion("historyTime between", value1, value2, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistorytimeNotBetween(Date value1, Date value2) {
            addCriterion("historyTime not between", value1, value2, "historytime");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrIsNull() {
            addCriterion("historyInfoAddr is null");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrIsNotNull() {
            addCriterion("historyInfoAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrEqualTo(String value) {
            addCriterion("historyInfoAddr =", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrNotEqualTo(String value) {
            addCriterion("historyInfoAddr <>", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrGreaterThan(String value) {
            addCriterion("historyInfoAddr >", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrGreaterThanOrEqualTo(String value) {
            addCriterion("historyInfoAddr >=", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrLessThan(String value) {
            addCriterion("historyInfoAddr <", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrLessThanOrEqualTo(String value) {
            addCriterion("historyInfoAddr <=", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrLike(String value) {
            addCriterion("historyInfoAddr like", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrNotLike(String value) {
            addCriterion("historyInfoAddr not like", value, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrIn(List<String> values) {
            addCriterion("historyInfoAddr in", values, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrNotIn(List<String> values) {
            addCriterion("historyInfoAddr not in", values, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrBetween(String value1, String value2) {
            addCriterion("historyInfoAddr between", value1, value2, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andHistoryinfoaddrNotBetween(String value1, String value2) {
            addCriterion("historyInfoAddr not between", value1, value2, "historyinfoaddr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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