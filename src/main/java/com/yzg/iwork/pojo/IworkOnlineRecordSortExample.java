package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkOnlineRecordSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkOnlineRecordSortExample() {
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

        public Criteria andOnlinerecordsortidIsNull() {
            addCriterion("onlineRecordSortId is null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidIsNotNull() {
            addCriterion("onlineRecordSortId is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidEqualTo(Integer value) {
            addCriterion("onlineRecordSortId =", value, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidNotEqualTo(Integer value) {
            addCriterion("onlineRecordSortId <>", value, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidGreaterThan(Integer value) {
            addCriterion("onlineRecordSortId >", value, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineRecordSortId >=", value, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidLessThan(Integer value) {
            addCriterion("onlineRecordSortId <", value, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidLessThanOrEqualTo(Integer value) {
            addCriterion("onlineRecordSortId <=", value, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidIn(List<Integer> values) {
            addCriterion("onlineRecordSortId in", values, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidNotIn(List<Integer> values) {
            addCriterion("onlineRecordSortId not in", values, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidBetween(Integer value1, Integer value2) {
            addCriterion("onlineRecordSortId between", value1, value2, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineRecordSortId not between", value1, value2, "onlinerecordsortid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameIsNull() {
            addCriterion("onlineRecordSortName is null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameIsNotNull() {
            addCriterion("onlineRecordSortName is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameEqualTo(String value) {
            addCriterion("onlineRecordSortName =", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameNotEqualTo(String value) {
            addCriterion("onlineRecordSortName <>", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameGreaterThan(String value) {
            addCriterion("onlineRecordSortName >", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("onlineRecordSortName >=", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameLessThan(String value) {
            addCriterion("onlineRecordSortName <", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameLessThanOrEqualTo(String value) {
            addCriterion("onlineRecordSortName <=", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameLike(String value) {
            addCriterion("onlineRecordSortName like", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameNotLike(String value) {
            addCriterion("onlineRecordSortName not like", value, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameIn(List<String> values) {
            addCriterion("onlineRecordSortName in", values, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameNotIn(List<String> values) {
            addCriterion("onlineRecordSortName not in", values, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameBetween(String value1, String value2) {
            addCriterion("onlineRecordSortName between", value1, value2, "onlinerecordsortname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordsortnameNotBetween(String value1, String value2) {
            addCriterion("onlineRecordSortName not between", value1, value2, "onlinerecordsortname");
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