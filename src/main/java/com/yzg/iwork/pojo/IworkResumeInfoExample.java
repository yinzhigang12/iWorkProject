package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkResumeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkResumeInfoExample() {
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

        public Criteria andResumeinfoidIsNull() {
            addCriterion("resumeInfoId is null");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidIsNotNull() {
            addCriterion("resumeInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidEqualTo(Integer value) {
            addCriterion("resumeInfoId =", value, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidNotEqualTo(Integer value) {
            addCriterion("resumeInfoId <>", value, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidGreaterThan(Integer value) {
            addCriterion("resumeInfoId >", value, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeInfoId >=", value, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidLessThan(Integer value) {
            addCriterion("resumeInfoId <", value, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeInfoId <=", value, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidIn(List<Integer> values) {
            addCriterion("resumeInfoId in", values, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidNotIn(List<Integer> values) {
            addCriterion("resumeInfoId not in", values, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidBetween(Integer value1, Integer value2) {
            addCriterion("resumeInfoId between", value1, value2, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumeinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeInfoId not between", value1, value2, "resumeinfoid");
            return (Criteria) this;
        }

        public Criteria andResumenameIsNull() {
            addCriterion("resumeName is null");
            return (Criteria) this;
        }

        public Criteria andResumenameIsNotNull() {
            addCriterion("resumeName is not null");
            return (Criteria) this;
        }

        public Criteria andResumenameEqualTo(String value) {
            addCriterion("resumeName =", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotEqualTo(String value) {
            addCriterion("resumeName <>", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameGreaterThan(String value) {
            addCriterion("resumeName >", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameGreaterThanOrEqualTo(String value) {
            addCriterion("resumeName >=", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLessThan(String value) {
            addCriterion("resumeName <", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLessThanOrEqualTo(String value) {
            addCriterion("resumeName <=", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLike(String value) {
            addCriterion("resumeName like", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotLike(String value) {
            addCriterion("resumeName not like", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameIn(List<String> values) {
            addCriterion("resumeName in", values, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotIn(List<String> values) {
            addCriterion("resumeName not in", values, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameBetween(String value1, String value2) {
            addCriterion("resumeName between", value1, value2, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotBetween(String value1, String value2) {
            addCriterion("resumeName not between", value1, value2, "resumename");
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

        public Criteria andResumemoduleidIsNull() {
            addCriterion("resumeModuleId is null");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidIsNotNull() {
            addCriterion("resumeModuleId is not null");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidEqualTo(Integer value) {
            addCriterion("resumeModuleId =", value, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidNotEqualTo(Integer value) {
            addCriterion("resumeModuleId <>", value, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidGreaterThan(Integer value) {
            addCriterion("resumeModuleId >", value, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeModuleId >=", value, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidLessThan(Integer value) {
            addCriterion("resumeModuleId <", value, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeModuleId <=", value, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidIn(List<Integer> values) {
            addCriterion("resumeModuleId in", values, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidNotIn(List<Integer> values) {
            addCriterion("resumeModuleId not in", values, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidBetween(Integer value1, Integer value2) {
            addCriterion("resumeModuleId between", value1, value2, "resumemoduleid");
            return (Criteria) this;
        }

        public Criteria andResumemoduleidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeModuleId not between", value1, value2, "resumemoduleid");
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