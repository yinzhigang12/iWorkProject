package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkResumeModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkResumeModuleExample() {
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

        public Criteria andResumemodulenameIsNull() {
            addCriterion("resumeModuleName is null");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameIsNotNull() {
            addCriterion("resumeModuleName is not null");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameEqualTo(String value) {
            addCriterion("resumeModuleName =", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameNotEqualTo(String value) {
            addCriterion("resumeModuleName <>", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameGreaterThan(String value) {
            addCriterion("resumeModuleName >", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameGreaterThanOrEqualTo(String value) {
            addCriterion("resumeModuleName >=", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameLessThan(String value) {
            addCriterion("resumeModuleName <", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameLessThanOrEqualTo(String value) {
            addCriterion("resumeModuleName <=", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameLike(String value) {
            addCriterion("resumeModuleName like", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameNotLike(String value) {
            addCriterion("resumeModuleName not like", value, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameIn(List<String> values) {
            addCriterion("resumeModuleName in", values, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameNotIn(List<String> values) {
            addCriterion("resumeModuleName not in", values, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameBetween(String value1, String value2) {
            addCriterion("resumeModuleName between", value1, value2, "resumemodulename");
            return (Criteria) this;
        }

        public Criteria andResumemodulenameNotBetween(String value1, String value2) {
            addCriterion("resumeModuleName not between", value1, value2, "resumemodulename");
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