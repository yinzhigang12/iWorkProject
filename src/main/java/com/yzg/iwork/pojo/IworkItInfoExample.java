package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkItInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkItInfoExample() {
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

        public Criteria andItinfoidIsNull() {
            addCriterion("itInfoId is null");
            return (Criteria) this;
        }

        public Criteria andItinfoidIsNotNull() {
            addCriterion("itInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andItinfoidEqualTo(Integer value) {
            addCriterion("itInfoId =", value, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidNotEqualTo(Integer value) {
            addCriterion("itInfoId <>", value, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidGreaterThan(Integer value) {
            addCriterion("itInfoId >", value, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itInfoId >=", value, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidLessThan(Integer value) {
            addCriterion("itInfoId <", value, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("itInfoId <=", value, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidIn(List<Integer> values) {
            addCriterion("itInfoId in", values, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidNotIn(List<Integer> values) {
            addCriterion("itInfoId not in", values, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidBetween(Integer value1, Integer value2) {
            addCriterion("itInfoId between", value1, value2, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("itInfoId not between", value1, value2, "itinfoid");
            return (Criteria) this;
        }

        public Criteria andItsortidIsNull() {
            addCriterion("itSortId is null");
            return (Criteria) this;
        }

        public Criteria andItsortidIsNotNull() {
            addCriterion("itSortId is not null");
            return (Criteria) this;
        }

        public Criteria andItsortidEqualTo(Integer value) {
            addCriterion("itSortId =", value, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidNotEqualTo(Integer value) {
            addCriterion("itSortId <>", value, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidGreaterThan(Integer value) {
            addCriterion("itSortId >", value, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itSortId >=", value, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidLessThan(Integer value) {
            addCriterion("itSortId <", value, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidLessThanOrEqualTo(Integer value) {
            addCriterion("itSortId <=", value, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidIn(List<Integer> values) {
            addCriterion("itSortId in", values, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidNotIn(List<Integer> values) {
            addCriterion("itSortId not in", values, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidBetween(Integer value1, Integer value2) {
            addCriterion("itSortId between", value1, value2, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("itSortId not between", value1, value2, "itsortid");
            return (Criteria) this;
        }

        public Criteria andItnameIsNull() {
            addCriterion("itName is null");
            return (Criteria) this;
        }

        public Criteria andItnameIsNotNull() {
            addCriterion("itName is not null");
            return (Criteria) this;
        }

        public Criteria andItnameEqualTo(String value) {
            addCriterion("itName =", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotEqualTo(String value) {
            addCriterion("itName <>", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameGreaterThan(String value) {
            addCriterion("itName >", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameGreaterThanOrEqualTo(String value) {
            addCriterion("itName >=", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameLessThan(String value) {
            addCriterion("itName <", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameLessThanOrEqualTo(String value) {
            addCriterion("itName <=", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameLike(String value) {
            addCriterion("itName like", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotLike(String value) {
            addCriterion("itName not like", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameIn(List<String> values) {
            addCriterion("itName in", values, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotIn(List<String> values) {
            addCriterion("itName not in", values, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameBetween(String value1, String value2) {
            addCriterion("itName between", value1, value2, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotBetween(String value1, String value2) {
            addCriterion("itName not between", value1, value2, "itname");
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