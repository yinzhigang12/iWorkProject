package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkVideoSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkVideoSortExample() {
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

        public Criteria andVideosortidIsNull() {
            addCriterion("videoSortId is null");
            return (Criteria) this;
        }

        public Criteria andVideosortidIsNotNull() {
            addCriterion("videoSortId is not null");
            return (Criteria) this;
        }

        public Criteria andVideosortidEqualTo(Integer value) {
            addCriterion("videoSortId =", value, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidNotEqualTo(Integer value) {
            addCriterion("videoSortId <>", value, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidGreaterThan(Integer value) {
            addCriterion("videoSortId >", value, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoSortId >=", value, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidLessThan(Integer value) {
            addCriterion("videoSortId <", value, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidLessThanOrEqualTo(Integer value) {
            addCriterion("videoSortId <=", value, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidIn(List<Integer> values) {
            addCriterion("videoSortId in", values, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidNotIn(List<Integer> values) {
            addCriterion("videoSortId not in", values, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidBetween(Integer value1, Integer value2) {
            addCriterion("videoSortId between", value1, value2, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoSortId not between", value1, value2, "videosortid");
            return (Criteria) this;
        }

        public Criteria andVideosortnameIsNull() {
            addCriterion("videoSortName is null");
            return (Criteria) this;
        }

        public Criteria andVideosortnameIsNotNull() {
            addCriterion("videoSortName is not null");
            return (Criteria) this;
        }

        public Criteria andVideosortnameEqualTo(String value) {
            addCriterion("videoSortName =", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotEqualTo(String value) {
            addCriterion("videoSortName <>", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameGreaterThan(String value) {
            addCriterion("videoSortName >", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameGreaterThanOrEqualTo(String value) {
            addCriterion("videoSortName >=", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameLessThan(String value) {
            addCriterion("videoSortName <", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameLessThanOrEqualTo(String value) {
            addCriterion("videoSortName <=", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameLike(String value) {
            addCriterion("videoSortName like", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotLike(String value) {
            addCriterion("videoSortName not like", value, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameIn(List<String> values) {
            addCriterion("videoSortName in", values, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotIn(List<String> values) {
            addCriterion("videoSortName not in", values, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameBetween(String value1, String value2) {
            addCriterion("videoSortName between", value1, value2, "videosortname");
            return (Criteria) this;
        }

        public Criteria andVideosortnameNotBetween(String value1, String value2) {
            addCriterion("videoSortName not between", value1, value2, "videosortname");
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