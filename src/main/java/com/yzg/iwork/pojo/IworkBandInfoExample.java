package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkBandInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkBandInfoExample() {
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

        public Criteria andBandnameIsNull() {
            addCriterion("bandName is null");
            return (Criteria) this;
        }

        public Criteria andBandnameIsNotNull() {
            addCriterion("bandName is not null");
            return (Criteria) this;
        }

        public Criteria andBandnameEqualTo(String value) {
            addCriterion("bandName =", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameNotEqualTo(String value) {
            addCriterion("bandName <>", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameGreaterThan(String value) {
            addCriterion("bandName >", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameGreaterThanOrEqualTo(String value) {
            addCriterion("bandName >=", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameLessThan(String value) {
            addCriterion("bandName <", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameLessThanOrEqualTo(String value) {
            addCriterion("bandName <=", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameLike(String value) {
            addCriterion("bandName like", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameNotLike(String value) {
            addCriterion("bandName not like", value, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameIn(List<String> values) {
            addCriterion("bandName in", values, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameNotIn(List<String> values) {
            addCriterion("bandName not in", values, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameBetween(String value1, String value2) {
            addCriterion("bandName between", value1, value2, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandnameNotBetween(String value1, String value2) {
            addCriterion("bandName not between", value1, value2, "bandname");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrIsNull() {
            addCriterion("bandPicAddr is null");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrIsNotNull() {
            addCriterion("bandPicAddr is not null");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrEqualTo(String value) {
            addCriterion("bandPicAddr =", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrNotEqualTo(String value) {
            addCriterion("bandPicAddr <>", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrGreaterThan(String value) {
            addCriterion("bandPicAddr >", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("bandPicAddr >=", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrLessThan(String value) {
            addCriterion("bandPicAddr <", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrLessThanOrEqualTo(String value) {
            addCriterion("bandPicAddr <=", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrLike(String value) {
            addCriterion("bandPicAddr like", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrNotLike(String value) {
            addCriterion("bandPicAddr not like", value, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrIn(List<String> values) {
            addCriterion("bandPicAddr in", values, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrNotIn(List<String> values) {
            addCriterion("bandPicAddr not in", values, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrBetween(String value1, String value2) {
            addCriterion("bandPicAddr between", value1, value2, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandpicaddrNotBetween(String value1, String value2) {
            addCriterion("bandPicAddr not between", value1, value2, "bandpicaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrIsNull() {
            addCriterion("bandAddr is null");
            return (Criteria) this;
        }

        public Criteria andBandaddrIsNotNull() {
            addCriterion("bandAddr is not null");
            return (Criteria) this;
        }

        public Criteria andBandaddrEqualTo(String value) {
            addCriterion("bandAddr =", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrNotEqualTo(String value) {
            addCriterion("bandAddr <>", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrGreaterThan(String value) {
            addCriterion("bandAddr >", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrGreaterThanOrEqualTo(String value) {
            addCriterion("bandAddr >=", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrLessThan(String value) {
            addCriterion("bandAddr <", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrLessThanOrEqualTo(String value) {
            addCriterion("bandAddr <=", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrLike(String value) {
            addCriterion("bandAddr like", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrNotLike(String value) {
            addCriterion("bandAddr not like", value, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrIn(List<String> values) {
            addCriterion("bandAddr in", values, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrNotIn(List<String> values) {
            addCriterion("bandAddr not in", values, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrBetween(String value1, String value2) {
            addCriterion("bandAddr between", value1, value2, "bandaddr");
            return (Criteria) this;
        }

        public Criteria andBandaddrNotBetween(String value1, String value2) {
            addCriterion("bandAddr not between", value1, value2, "bandaddr");
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