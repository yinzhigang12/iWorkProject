package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkOnlineResourceSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkOnlineResourceSortExample() {
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

        public Criteria andOnlineresourcesortidIsNull() {
            addCriterion("onlineResourceSortId is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidIsNotNull() {
            addCriterion("onlineResourceSortId is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidEqualTo(Integer value) {
            addCriterion("onlineResourceSortId =", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidNotEqualTo(Integer value) {
            addCriterion("onlineResourceSortId <>", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidGreaterThan(Integer value) {
            addCriterion("onlineResourceSortId >", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceSortId >=", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidLessThan(Integer value) {
            addCriterion("onlineResourceSortId <", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidLessThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceSortId <=", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidIn(List<Integer> values) {
            addCriterion("onlineResourceSortId in", values, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidNotIn(List<Integer> values) {
            addCriterion("onlineResourceSortId not in", values, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceSortId between", value1, value2, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceSortId not between", value1, value2, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameIsNull() {
            addCriterion("onlineResourceSortName is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameIsNotNull() {
            addCriterion("onlineResourceSortName is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameEqualTo(String value) {
            addCriterion("onlineResourceSortName =", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameNotEqualTo(String value) {
            addCriterion("onlineResourceSortName <>", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameGreaterThan(String value) {
            addCriterion("onlineResourceSortName >", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameGreaterThanOrEqualTo(String value) {
            addCriterion("onlineResourceSortName >=", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameLessThan(String value) {
            addCriterion("onlineResourceSortName <", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameLessThanOrEqualTo(String value) {
            addCriterion("onlineResourceSortName <=", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameLike(String value) {
            addCriterion("onlineResourceSortName like", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameNotLike(String value) {
            addCriterion("onlineResourceSortName not like", value, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameIn(List<String> values) {
            addCriterion("onlineResourceSortName in", values, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameNotIn(List<String> values) {
            addCriterion("onlineResourceSortName not in", values, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameBetween(String value1, String value2) {
            addCriterion("onlineResourceSortName between", value1, value2, "onlineresourcesortname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortnameNotBetween(String value1, String value2) {
            addCriterion("onlineResourceSortName not between", value1, value2, "onlineresourcesortname");
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