package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkStudyGoalStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkStudyGoalStatusExample() {
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

        public Criteria andStudygoalstatusnameIsNull() {
            addCriterion("studyGoalStatusName is null");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameIsNotNull() {
            addCriterion("studyGoalStatusName is not null");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameEqualTo(String value) {
            addCriterion("studyGoalStatusName =", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameNotEqualTo(String value) {
            addCriterion("studyGoalStatusName <>", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameGreaterThan(String value) {
            addCriterion("studyGoalStatusName >", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("studyGoalStatusName >=", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameLessThan(String value) {
            addCriterion("studyGoalStatusName <", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameLessThanOrEqualTo(String value) {
            addCriterion("studyGoalStatusName <=", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameLike(String value) {
            addCriterion("studyGoalStatusName like", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameNotLike(String value) {
            addCriterion("studyGoalStatusName not like", value, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameIn(List<String> values) {
            addCriterion("studyGoalStatusName in", values, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameNotIn(List<String> values) {
            addCriterion("studyGoalStatusName not in", values, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameBetween(String value1, String value2) {
            addCriterion("studyGoalStatusName between", value1, value2, "studygoalstatusname");
            return (Criteria) this;
        }

        public Criteria andStudygoalstatusnameNotBetween(String value1, String value2) {
            addCriterion("studyGoalStatusName not between", value1, value2, "studygoalstatusname");
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