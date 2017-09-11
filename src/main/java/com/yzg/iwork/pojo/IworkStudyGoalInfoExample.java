package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkStudyGoalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkStudyGoalInfoExample() {
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

        public Criteria andStudygoalinfoidIsNull() {
            addCriterion("studyGoalInfoId is null");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidIsNotNull() {
            addCriterion("studyGoalInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidEqualTo(Integer value) {
            addCriterion("studyGoalInfoId =", value, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidNotEqualTo(Integer value) {
            addCriterion("studyGoalInfoId <>", value, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidGreaterThan(Integer value) {
            addCriterion("studyGoalInfoId >", value, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studyGoalInfoId >=", value, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidLessThan(Integer value) {
            addCriterion("studyGoalInfoId <", value, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("studyGoalInfoId <=", value, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidIn(List<Integer> values) {
            addCriterion("studyGoalInfoId in", values, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidNotIn(List<Integer> values) {
            addCriterion("studyGoalInfoId not in", values, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidBetween(Integer value1, Integer value2) {
            addCriterion("studyGoalInfoId between", value1, value2, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("studyGoalInfoId not between", value1, value2, "studygoalinfoid");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameIsNull() {
            addCriterion("studyGoalName is null");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameIsNotNull() {
            addCriterion("studyGoalName is not null");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameEqualTo(String value) {
            addCriterion("studyGoalName =", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameNotEqualTo(String value) {
            addCriterion("studyGoalName <>", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameGreaterThan(String value) {
            addCriterion("studyGoalName >", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameGreaterThanOrEqualTo(String value) {
            addCriterion("studyGoalName >=", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameLessThan(String value) {
            addCriterion("studyGoalName <", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameLessThanOrEqualTo(String value) {
            addCriterion("studyGoalName <=", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameLike(String value) {
            addCriterion("studyGoalName like", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameNotLike(String value) {
            addCriterion("studyGoalName not like", value, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameIn(List<String> values) {
            addCriterion("studyGoalName in", values, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameNotIn(List<String> values) {
            addCriterion("studyGoalName not in", values, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameBetween(String value1, String value2) {
            addCriterion("studyGoalName between", value1, value2, "studygoalname");
            return (Criteria) this;
        }

        public Criteria andStudygoalnameNotBetween(String value1, String value2) {
            addCriterion("studyGoalName not between", value1, value2, "studygoalname");
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

        public Criteria andStudygoalsortidIsNull() {
            addCriterion("studyGoalSortId is null");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidIsNotNull() {
            addCriterion("studyGoalSortId is not null");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidEqualTo(Integer value) {
            addCriterion("studyGoalSortId =", value, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidNotEqualTo(Integer value) {
            addCriterion("studyGoalSortId <>", value, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidGreaterThan(Integer value) {
            addCriterion("studyGoalSortId >", value, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studyGoalSortId >=", value, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidLessThan(Integer value) {
            addCriterion("studyGoalSortId <", value, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidLessThanOrEqualTo(Integer value) {
            addCriterion("studyGoalSortId <=", value, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidIn(List<Integer> values) {
            addCriterion("studyGoalSortId in", values, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidNotIn(List<Integer> values) {
            addCriterion("studyGoalSortId not in", values, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidBetween(Integer value1, Integer value2) {
            addCriterion("studyGoalSortId between", value1, value2, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("studyGoalSortId not between", value1, value2, "studygoalsortid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidIsNull() {
            addCriterion("studyGoalStatusId is null");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidIsNotNull() {
            addCriterion("studyGoalStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidEqualTo(Integer value) {
            addCriterion("studyGoalStatusId =", value, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidNotEqualTo(Integer value) {
            addCriterion("studyGoalStatusId <>", value, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidGreaterThan(Integer value) {
            addCriterion("studyGoalStatusId >", value, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studyGoalStatusId >=", value, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidLessThan(Integer value) {
            addCriterion("studyGoalStatusId <", value, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("studyGoalStatusId <=", value, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidIn(List<Integer> values) {
            addCriterion("studyGoalStatusId in", values, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidNotIn(List<Integer> values) {
            addCriterion("studyGoalStatusId not in", values, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidBetween(Integer value1, Integer value2) {
            addCriterion("studyGoalStatusId between", value1, value2, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("studyGoalStatusId not between", value1, value2, "studygoalstatusid");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNull() {
            addCriterion("recordId is null");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNotNull() {
            addCriterion("recordId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordidEqualTo(Integer value) {
            addCriterion("recordId =", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotEqualTo(Integer value) {
            addCriterion("recordId <>", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThan(Integer value) {
            addCriterion("recordId >", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordId >=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThan(Integer value) {
            addCriterion("recordId <", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThanOrEqualTo(Integer value) {
            addCriterion("recordId <=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidIn(List<Integer> values) {
            addCriterion("recordId in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotIn(List<Integer> values) {
            addCriterion("recordId not in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidBetween(Integer value1, Integer value2) {
            addCriterion("recordId between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("recordId not between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidIsNull() {
            addCriterion("recordSortId is null");
            return (Criteria) this;
        }

        public Criteria andRecordsortidIsNotNull() {
            addCriterion("recordSortId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordsortidEqualTo(Integer value) {
            addCriterion("recordSortId =", value, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidNotEqualTo(Integer value) {
            addCriterion("recordSortId <>", value, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidGreaterThan(Integer value) {
            addCriterion("recordSortId >", value, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordSortId >=", value, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidLessThan(Integer value) {
            addCriterion("recordSortId <", value, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidLessThanOrEqualTo(Integer value) {
            addCriterion("recordSortId <=", value, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidIn(List<Integer> values) {
            addCriterion("recordSortId in", values, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidNotIn(List<Integer> values) {
            addCriterion("recordSortId not in", values, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidBetween(Integer value1, Integer value2) {
            addCriterion("recordSortId between", value1, value2, "recordsortid");
            return (Criteria) this;
        }

        public Criteria andRecordsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("recordSortId not between", value1, value2, "recordsortid");
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