package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkListenListSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkListenListSortExample() {
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

        public Criteria andListenlistsortidIsNull() {
            addCriterion("listenListSortId is null");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidIsNotNull() {
            addCriterion("listenListSortId is not null");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidEqualTo(Integer value) {
            addCriterion("listenListSortId =", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidNotEqualTo(Integer value) {
            addCriterion("listenListSortId <>", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidGreaterThan(Integer value) {
            addCriterion("listenListSortId >", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("listenListSortId >=", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidLessThan(Integer value) {
            addCriterion("listenListSortId <", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidLessThanOrEqualTo(Integer value) {
            addCriterion("listenListSortId <=", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidIn(List<Integer> values) {
            addCriterion("listenListSortId in", values, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidNotIn(List<Integer> values) {
            addCriterion("listenListSortId not in", values, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidBetween(Integer value1, Integer value2) {
            addCriterion("listenListSortId between", value1, value2, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("listenListSortId not between", value1, value2, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameIsNull() {
            addCriterion("listenListSortName is null");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameIsNotNull() {
            addCriterion("listenListSortName is not null");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameEqualTo(String value) {
            addCriterion("listenListSortName =", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameNotEqualTo(String value) {
            addCriterion("listenListSortName <>", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameGreaterThan(String value) {
            addCriterion("listenListSortName >", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("listenListSortName >=", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameLessThan(String value) {
            addCriterion("listenListSortName <", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameLessThanOrEqualTo(String value) {
            addCriterion("listenListSortName <=", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameLike(String value) {
            addCriterion("listenListSortName like", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameNotLike(String value) {
            addCriterion("listenListSortName not like", value, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameIn(List<String> values) {
            addCriterion("listenListSortName in", values, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameNotIn(List<String> values) {
            addCriterion("listenListSortName not in", values, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameBetween(String value1, String value2) {
            addCriterion("listenListSortName between", value1, value2, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andListenlistsortnameNotBetween(String value1, String value2) {
            addCriterion("listenListSortName not between", value1, value2, "listenlistsortname");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
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