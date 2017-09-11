package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkDocRecordSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkDocRecordSortExample() {
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

        public Criteria andDocrecordsortidIsNull() {
            addCriterion("docRecordSortId is null");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidIsNotNull() {
            addCriterion("docRecordSortId is not null");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidEqualTo(Integer value) {
            addCriterion("docRecordSortId =", value, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidNotEqualTo(Integer value) {
            addCriterion("docRecordSortId <>", value, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidGreaterThan(Integer value) {
            addCriterion("docRecordSortId >", value, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docRecordSortId >=", value, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidLessThan(Integer value) {
            addCriterion("docRecordSortId <", value, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidLessThanOrEqualTo(Integer value) {
            addCriterion("docRecordSortId <=", value, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidIn(List<Integer> values) {
            addCriterion("docRecordSortId in", values, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidNotIn(List<Integer> values) {
            addCriterion("docRecordSortId not in", values, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidBetween(Integer value1, Integer value2) {
            addCriterion("docRecordSortId between", value1, value2, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("docRecordSortId not between", value1, value2, "docrecordsortid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameIsNull() {
            addCriterion("docRecordSortName is null");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameIsNotNull() {
            addCriterion("docRecordSortName is not null");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameEqualTo(String value) {
            addCriterion("docRecordSortName =", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameNotEqualTo(String value) {
            addCriterion("docRecordSortName <>", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameGreaterThan(String value) {
            addCriterion("docRecordSortName >", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("docRecordSortName >=", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameLessThan(String value) {
            addCriterion("docRecordSortName <", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameLessThanOrEqualTo(String value) {
            addCriterion("docRecordSortName <=", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameLike(String value) {
            addCriterion("docRecordSortName like", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameNotLike(String value) {
            addCriterion("docRecordSortName not like", value, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameIn(List<String> values) {
            addCriterion("docRecordSortName in", values, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameNotIn(List<String> values) {
            addCriterion("docRecordSortName not in", values, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameBetween(String value1, String value2) {
            addCriterion("docRecordSortName between", value1, value2, "docrecordsortname");
            return (Criteria) this;
        }

        public Criteria andDocrecordsortnameNotBetween(String value1, String value2) {
            addCriterion("docRecordSortName not between", value1, value2, "docrecordsortname");
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