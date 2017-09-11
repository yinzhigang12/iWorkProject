package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkHistorySortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkHistorySortExample() {
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

        public Criteria andHistorysortnameIsNull() {
            addCriterion("historySortName is null");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameIsNotNull() {
            addCriterion("historySortName is not null");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameEqualTo(String value) {
            addCriterion("historySortName =", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameNotEqualTo(String value) {
            addCriterion("historySortName <>", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameGreaterThan(String value) {
            addCriterion("historySortName >", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameGreaterThanOrEqualTo(String value) {
            addCriterion("historySortName >=", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameLessThan(String value) {
            addCriterion("historySortName <", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameLessThanOrEqualTo(String value) {
            addCriterion("historySortName <=", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameLike(String value) {
            addCriterion("historySortName like", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameNotLike(String value) {
            addCriterion("historySortName not like", value, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameIn(List<String> values) {
            addCriterion("historySortName in", values, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameNotIn(List<String> values) {
            addCriterion("historySortName not in", values, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameBetween(String value1, String value2) {
            addCriterion("historySortName between", value1, value2, "historysortname");
            return (Criteria) this;
        }

        public Criteria andHistorysortnameNotBetween(String value1, String value2) {
            addCriterion("historySortName not between", value1, value2, "historysortname");
            return (Criteria) this;
        }

        public Criteria andOpensortidIsNull() {
            addCriterion("openSortId is null");
            return (Criteria) this;
        }

        public Criteria andOpensortidIsNotNull() {
            addCriterion("openSortId is not null");
            return (Criteria) this;
        }

        public Criteria andOpensortidEqualTo(Integer value) {
            addCriterion("openSortId =", value, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidNotEqualTo(Integer value) {
            addCriterion("openSortId <>", value, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidGreaterThan(Integer value) {
            addCriterion("openSortId >", value, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("openSortId >=", value, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidLessThan(Integer value) {
            addCriterion("openSortId <", value, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidLessThanOrEqualTo(Integer value) {
            addCriterion("openSortId <=", value, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidIn(List<Integer> values) {
            addCriterion("openSortId in", values, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidNotIn(List<Integer> values) {
            addCriterion("openSortId not in", values, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidBetween(Integer value1, Integer value2) {
            addCriterion("openSortId between", value1, value2, "opensortid");
            return (Criteria) this;
        }

        public Criteria andOpensortidNotBetween(Integer value1, Integer value2) {
            addCriterion("openSortId not between", value1, value2, "opensortid");
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