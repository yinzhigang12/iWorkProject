package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkVideoAnchorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkVideoAnchorExample() {
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

        public Criteria andVideoanchoridIsNull() {
            addCriterion("videoAnchorId is null");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridIsNotNull() {
            addCriterion("videoAnchorId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridEqualTo(Integer value) {
            addCriterion("videoAnchorId =", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridNotEqualTo(Integer value) {
            addCriterion("videoAnchorId <>", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridGreaterThan(Integer value) {
            addCriterion("videoAnchorId >", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoAnchorId >=", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridLessThan(Integer value) {
            addCriterion("videoAnchorId <", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridLessThanOrEqualTo(Integer value) {
            addCriterion("videoAnchorId <=", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridIn(List<Integer> values) {
            addCriterion("videoAnchorId in", values, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridNotIn(List<Integer> values) {
            addCriterion("videoAnchorId not in", values, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridBetween(Integer value1, Integer value2) {
            addCriterion("videoAnchorId between", value1, value2, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridNotBetween(Integer value1, Integer value2) {
            addCriterion("videoAnchorId not between", value1, value2, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameIsNull() {
            addCriterion("videoAnchorName is null");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameIsNotNull() {
            addCriterion("videoAnchorName is not null");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameEqualTo(String value) {
            addCriterion("videoAnchorName =", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameNotEqualTo(String value) {
            addCriterion("videoAnchorName <>", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameGreaterThan(String value) {
            addCriterion("videoAnchorName >", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameGreaterThanOrEqualTo(String value) {
            addCriterion("videoAnchorName >=", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameLessThan(String value) {
            addCriterion("videoAnchorName <", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameLessThanOrEqualTo(String value) {
            addCriterion("videoAnchorName <=", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameLike(String value) {
            addCriterion("videoAnchorName like", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameNotLike(String value) {
            addCriterion("videoAnchorName not like", value, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameIn(List<String> values) {
            addCriterion("videoAnchorName in", values, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameNotIn(List<String> values) {
            addCriterion("videoAnchorName not in", values, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameBetween(String value1, String value2) {
            addCriterion("videoAnchorName between", value1, value2, "videoanchorname");
            return (Criteria) this;
        }

        public Criteria andVideoanchornameNotBetween(String value1, String value2) {
            addCriterion("videoAnchorName not between", value1, value2, "videoanchorname");
            return (Criteria) this;
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

        public Criteria andVideoanchortimeIsNull() {
            addCriterion("videoAnchorTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeIsNotNull() {
            addCriterion("videoAnchorTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeEqualTo(Date value) {
            addCriterion("videoAnchorTime =", value, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeNotEqualTo(Date value) {
            addCriterion("videoAnchorTime <>", value, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeGreaterThan(Date value) {
            addCriterion("videoAnchorTime >", value, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("videoAnchorTime >=", value, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeLessThan(Date value) {
            addCriterion("videoAnchorTime <", value, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeLessThanOrEqualTo(Date value) {
            addCriterion("videoAnchorTime <=", value, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeIn(List<Date> values) {
            addCriterion("videoAnchorTime in", values, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeNotIn(List<Date> values) {
            addCriterion("videoAnchorTime not in", values, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeBetween(Date value1, Date value2) {
            addCriterion("videoAnchorTime between", value1, value2, "videoanchortime");
            return (Criteria) this;
        }

        public Criteria andVideoanchortimeNotBetween(Date value1, Date value2) {
            addCriterion("videoAnchorTime not between", value1, value2, "videoanchortime");
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