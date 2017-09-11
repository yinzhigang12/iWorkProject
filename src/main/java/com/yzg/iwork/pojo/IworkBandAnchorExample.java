package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkBandAnchorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkBandAnchorExample() {
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

        public Criteria andBandanchoridIsNull() {
            addCriterion("bandAnchorId is null");
            return (Criteria) this;
        }

        public Criteria andBandanchoridIsNotNull() {
            addCriterion("bandAnchorId is not null");
            return (Criteria) this;
        }

        public Criteria andBandanchoridEqualTo(Integer value) {
            addCriterion("bandAnchorId =", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridNotEqualTo(Integer value) {
            addCriterion("bandAnchorId <>", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridGreaterThan(Integer value) {
            addCriterion("bandAnchorId >", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandAnchorId >=", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridLessThan(Integer value) {
            addCriterion("bandAnchorId <", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridLessThanOrEqualTo(Integer value) {
            addCriterion("bandAnchorId <=", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridIn(List<Integer> values) {
            addCriterion("bandAnchorId in", values, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridNotIn(List<Integer> values) {
            addCriterion("bandAnchorId not in", values, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridBetween(Integer value1, Integer value2) {
            addCriterion("bandAnchorId between", value1, value2, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridNotBetween(Integer value1, Integer value2) {
            addCriterion("bandAnchorId not between", value1, value2, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchornameIsNull() {
            addCriterion("bandAnchorName is null");
            return (Criteria) this;
        }

        public Criteria andBandanchornameIsNotNull() {
            addCriterion("bandAnchorName is not null");
            return (Criteria) this;
        }

        public Criteria andBandanchornameEqualTo(String value) {
            addCriterion("bandAnchorName =", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameNotEqualTo(String value) {
            addCriterion("bandAnchorName <>", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameGreaterThan(String value) {
            addCriterion("bandAnchorName >", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameGreaterThanOrEqualTo(String value) {
            addCriterion("bandAnchorName >=", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameLessThan(String value) {
            addCriterion("bandAnchorName <", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameLessThanOrEqualTo(String value) {
            addCriterion("bandAnchorName <=", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameLike(String value) {
            addCriterion("bandAnchorName like", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameNotLike(String value) {
            addCriterion("bandAnchorName not like", value, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameIn(List<String> values) {
            addCriterion("bandAnchorName in", values, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameNotIn(List<String> values) {
            addCriterion("bandAnchorName not in", values, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameBetween(String value1, String value2) {
            addCriterion("bandAnchorName between", value1, value2, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandanchornameNotBetween(String value1, String value2) {
            addCriterion("bandAnchorName not between", value1, value2, "bandanchorname");
            return (Criteria) this;
        }

        public Criteria andBandinfoidIsNull() {
            addCriterion("bandInfoId is null");
            return (Criteria) this;
        }

        public Criteria andBandinfoidIsNotNull() {
            addCriterion("bandInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andBandinfoidEqualTo(Integer value) {
            addCriterion("bandInfoId =", value, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidNotEqualTo(Integer value) {
            addCriterion("bandInfoId <>", value, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidGreaterThan(Integer value) {
            addCriterion("bandInfoId >", value, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandInfoId >=", value, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidLessThan(Integer value) {
            addCriterion("bandInfoId <", value, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("bandInfoId <=", value, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidIn(List<Integer> values) {
            addCriterion("bandInfoId in", values, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidNotIn(List<Integer> values) {
            addCriterion("bandInfoId not in", values, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidBetween(Integer value1, Integer value2) {
            addCriterion("bandInfoId between", value1, value2, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("bandInfoId not between", value1, value2, "bandinfoid");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeIsNull() {
            addCriterion("bandAnchorTime is null");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeIsNotNull() {
            addCriterion("bandAnchorTime is not null");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeEqualTo(Date value) {
            addCriterion("bandAnchorTime =", value, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeNotEqualTo(Date value) {
            addCriterion("bandAnchorTime <>", value, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeGreaterThan(Date value) {
            addCriterion("bandAnchorTime >", value, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bandAnchorTime >=", value, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeLessThan(Date value) {
            addCriterion("bandAnchorTime <", value, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeLessThanOrEqualTo(Date value) {
            addCriterion("bandAnchorTime <=", value, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeIn(List<Date> values) {
            addCriterion("bandAnchorTime in", values, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeNotIn(List<Date> values) {
            addCriterion("bandAnchorTime not in", values, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeBetween(Date value1, Date value2) {
            addCriterion("bandAnchorTime between", value1, value2, "bandanchortime");
            return (Criteria) this;
        }

        public Criteria andBandanchortimeNotBetween(Date value1, Date value2) {
            addCriterion("bandAnchorTime not between", value1, value2, "bandanchortime");
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