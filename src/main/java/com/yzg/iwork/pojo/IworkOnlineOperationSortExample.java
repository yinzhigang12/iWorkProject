package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkOnlineOperationSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkOnlineOperationSortExample() {
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

        public Criteria andOnlineoperationsortidIsNull() {
            addCriterion("onlineOperationSortId is null");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidIsNotNull() {
            addCriterion("onlineOperationSortId is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidEqualTo(Integer value) {
            addCriterion("onlineOperationSortId =", value, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidNotEqualTo(Integer value) {
            addCriterion("onlineOperationSortId <>", value, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidGreaterThan(Integer value) {
            addCriterion("onlineOperationSortId >", value, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineOperationSortId >=", value, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidLessThan(Integer value) {
            addCriterion("onlineOperationSortId <", value, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidLessThanOrEqualTo(Integer value) {
            addCriterion("onlineOperationSortId <=", value, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidIn(List<Integer> values) {
            addCriterion("onlineOperationSortId in", values, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidNotIn(List<Integer> values) {
            addCriterion("onlineOperationSortId not in", values, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidBetween(Integer value1, Integer value2) {
            addCriterion("onlineOperationSortId between", value1, value2, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineOperationSortId not between", value1, value2, "onlineoperationsortid");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameIsNull() {
            addCriterion("onlineOperationSortName is null");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameIsNotNull() {
            addCriterion("onlineOperationSortName is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameEqualTo(String value) {
            addCriterion("onlineOperationSortName =", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameNotEqualTo(String value) {
            addCriterion("onlineOperationSortName <>", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameGreaterThan(String value) {
            addCriterion("onlineOperationSortName >", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("onlineOperationSortName >=", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameLessThan(String value) {
            addCriterion("onlineOperationSortName <", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameLessThanOrEqualTo(String value) {
            addCriterion("onlineOperationSortName <=", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameLike(String value) {
            addCriterion("onlineOperationSortName like", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameNotLike(String value) {
            addCriterion("onlineOperationSortName not like", value, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameIn(List<String> values) {
            addCriterion("onlineOperationSortName in", values, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameNotIn(List<String> values) {
            addCriterion("onlineOperationSortName not in", values, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameBetween(String value1, String value2) {
            addCriterion("onlineOperationSortName between", value1, value2, "onlineoperationsortname");
            return (Criteria) this;
        }

        public Criteria andOnlineoperationsortnameNotBetween(String value1, String value2) {
            addCriterion("onlineOperationSortName not between", value1, value2, "onlineoperationsortname");
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