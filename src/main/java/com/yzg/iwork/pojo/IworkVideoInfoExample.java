package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkVideoInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkVideoInfoExample() {
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

        public Criteria andVideoinfoidIsNull() {
            addCriterion("videoInfoId is null");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidIsNotNull() {
            addCriterion("videoInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidEqualTo(Integer value) {
            addCriterion("videoInfoId =", value, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidNotEqualTo(Integer value) {
            addCriterion("videoInfoId <>", value, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidGreaterThan(Integer value) {
            addCriterion("videoInfoId >", value, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoInfoId >=", value, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidLessThan(Integer value) {
            addCriterion("videoInfoId <", value, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("videoInfoId <=", value, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidIn(List<Integer> values) {
            addCriterion("videoInfoId in", values, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidNotIn(List<Integer> values) {
            addCriterion("videoInfoId not in", values, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidBetween(Integer value1, Integer value2) {
            addCriterion("videoInfoId between", value1, value2, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideoinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoInfoId not between", value1, value2, "videoinfoid");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNull() {
            addCriterion("videoName is null");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNotNull() {
            addCriterion("videoName is not null");
            return (Criteria) this;
        }

        public Criteria andVideonameEqualTo(String value) {
            addCriterion("videoName =", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotEqualTo(String value) {
            addCriterion("videoName <>", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThan(String value) {
            addCriterion("videoName >", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThanOrEqualTo(String value) {
            addCriterion("videoName >=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThan(String value) {
            addCriterion("videoName <", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThanOrEqualTo(String value) {
            addCriterion("videoName <=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLike(String value) {
            addCriterion("videoName like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotLike(String value) {
            addCriterion("videoName not like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameIn(List<String> values) {
            addCriterion("videoName in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotIn(List<String> values) {
            addCriterion("videoName not in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameBetween(String value1, String value2) {
            addCriterion("videoName between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotBetween(String value1, String value2) {
            addCriterion("videoName not between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrIsNull() {
            addCriterion("videoPicAddr is null");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrIsNotNull() {
            addCriterion("videoPicAddr is not null");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrEqualTo(String value) {
            addCriterion("videoPicAddr =", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrNotEqualTo(String value) {
            addCriterion("videoPicAddr <>", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrGreaterThan(String value) {
            addCriterion("videoPicAddr >", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("videoPicAddr >=", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrLessThan(String value) {
            addCriterion("videoPicAddr <", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrLessThanOrEqualTo(String value) {
            addCriterion("videoPicAddr <=", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrLike(String value) {
            addCriterion("videoPicAddr like", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrNotLike(String value) {
            addCriterion("videoPicAddr not like", value, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrIn(List<String> values) {
            addCriterion("videoPicAddr in", values, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrNotIn(List<String> values) {
            addCriterion("videoPicAddr not in", values, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrBetween(String value1, String value2) {
            addCriterion("videoPicAddr between", value1, value2, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideopicaddrNotBetween(String value1, String value2) {
            addCriterion("videoPicAddr not between", value1, value2, "videopicaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrIsNull() {
            addCriterion("videoAddr is null");
            return (Criteria) this;
        }

        public Criteria andVideoaddrIsNotNull() {
            addCriterion("videoAddr is not null");
            return (Criteria) this;
        }

        public Criteria andVideoaddrEqualTo(String value) {
            addCriterion("videoAddr =", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrNotEqualTo(String value) {
            addCriterion("videoAddr <>", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrGreaterThan(String value) {
            addCriterion("videoAddr >", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrGreaterThanOrEqualTo(String value) {
            addCriterion("videoAddr >=", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrLessThan(String value) {
            addCriterion("videoAddr <", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrLessThanOrEqualTo(String value) {
            addCriterion("videoAddr <=", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrLike(String value) {
            addCriterion("videoAddr like", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrNotLike(String value) {
            addCriterion("videoAddr not like", value, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrIn(List<String> values) {
            addCriterion("videoAddr in", values, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrNotIn(List<String> values) {
            addCriterion("videoAddr not in", values, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrBetween(String value1, String value2) {
            addCriterion("videoAddr between", value1, value2, "videoaddr");
            return (Criteria) this;
        }

        public Criteria andVideoaddrNotBetween(String value1, String value2) {
            addCriterion("videoAddr not between", value1, value2, "videoaddr");
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