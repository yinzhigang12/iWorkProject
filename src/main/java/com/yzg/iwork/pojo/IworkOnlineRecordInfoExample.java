package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkOnlineRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkOnlineRecordInfoExample() {
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

        public Criteria andOnlinerecordinfoidIsNull() {
            addCriterion("onlineRecordInfoId is null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidIsNotNull() {
            addCriterion("onlineRecordInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidEqualTo(Integer value) {
            addCriterion("onlineRecordInfoId =", value, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidNotEqualTo(Integer value) {
            addCriterion("onlineRecordInfoId <>", value, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidGreaterThan(Integer value) {
            addCriterion("onlineRecordInfoId >", value, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineRecordInfoId >=", value, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidLessThan(Integer value) {
            addCriterion("onlineRecordInfoId <", value, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("onlineRecordInfoId <=", value, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidIn(List<Integer> values) {
            addCriterion("onlineRecordInfoId in", values, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidNotIn(List<Integer> values) {
            addCriterion("onlineRecordInfoId not in", values, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidBetween(Integer value1, Integer value2) {
            addCriterion("onlineRecordInfoId between", value1, value2, "onlinerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineRecordInfoId not between", value1, value2, "onlinerecordinfoid");
            return (Criteria) this;
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

        public Criteria andOnlinerecordnameIsNull() {
            addCriterion("onlineRecordName is null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameIsNotNull() {
            addCriterion("onlineRecordName is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameEqualTo(String value) {
            addCriterion("onlineRecordName =", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameNotEqualTo(String value) {
            addCriterion("onlineRecordName <>", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameGreaterThan(String value) {
            addCriterion("onlineRecordName >", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameGreaterThanOrEqualTo(String value) {
            addCriterion("onlineRecordName >=", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameLessThan(String value) {
            addCriterion("onlineRecordName <", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameLessThanOrEqualTo(String value) {
            addCriterion("onlineRecordName <=", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameLike(String value) {
            addCriterion("onlineRecordName like", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameNotLike(String value) {
            addCriterion("onlineRecordName not like", value, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameIn(List<String> values) {
            addCriterion("onlineRecordName in", values, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameNotIn(List<String> values) {
            addCriterion("onlineRecordName not in", values, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameBetween(String value1, String value2) {
            addCriterion("onlineRecordName between", value1, value2, "onlinerecordname");
            return (Criteria) this;
        }

        public Criteria andOnlinerecordnameNotBetween(String value1, String value2) {
            addCriterion("onlineRecordName not between", value1, value2, "onlinerecordname");
            return (Criteria) this;
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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