package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkRemindSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkRemindSortExample() {
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

        public Criteria andRemindsortidIsNull() {
            addCriterion("remindSortId is null");
            return (Criteria) this;
        }

        public Criteria andRemindsortidIsNotNull() {
            addCriterion("remindSortId is not null");
            return (Criteria) this;
        }

        public Criteria andRemindsortidEqualTo(Integer value) {
            addCriterion("remindSortId =", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidNotEqualTo(Integer value) {
            addCriterion("remindSortId <>", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidGreaterThan(Integer value) {
            addCriterion("remindSortId >", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("remindSortId >=", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidLessThan(Integer value) {
            addCriterion("remindSortId <", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidLessThanOrEqualTo(Integer value) {
            addCriterion("remindSortId <=", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidIn(List<Integer> values) {
            addCriterion("remindSortId in", values, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidNotIn(List<Integer> values) {
            addCriterion("remindSortId not in", values, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidBetween(Integer value1, Integer value2) {
            addCriterion("remindSortId between", value1, value2, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("remindSortId not between", value1, value2, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameIsNull() {
            addCriterion("remindSortName is null");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameIsNotNull() {
            addCriterion("remindSortName is not null");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameEqualTo(String value) {
            addCriterion("remindSortName =", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameNotEqualTo(String value) {
            addCriterion("remindSortName <>", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameGreaterThan(String value) {
            addCriterion("remindSortName >", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("remindSortName >=", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameLessThan(String value) {
            addCriterion("remindSortName <", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameLessThanOrEqualTo(String value) {
            addCriterion("remindSortName <=", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameLike(String value) {
            addCriterion("remindSortName like", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameNotLike(String value) {
            addCriterion("remindSortName not like", value, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameIn(List<String> values) {
            addCriterion("remindSortName in", values, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameNotIn(List<String> values) {
            addCriterion("remindSortName not in", values, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameBetween(String value1, String value2) {
            addCriterion("remindSortName between", value1, value2, "remindsortname");
            return (Criteria) this;
        }

        public Criteria andRemindsortnameNotBetween(String value1, String value2) {
            addCriterion("remindSortName not between", value1, value2, "remindsortname");
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