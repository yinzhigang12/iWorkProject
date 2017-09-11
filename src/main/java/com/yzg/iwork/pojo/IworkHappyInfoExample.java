package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkHappyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkHappyInfoExample() {
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

        public Criteria andHappyinfoidIsNull() {
            addCriterion("happyInfoId is null");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidIsNotNull() {
            addCriterion("happyInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidEqualTo(Integer value) {
            addCriterion("happyInfoId =", value, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidNotEqualTo(Integer value) {
            addCriterion("happyInfoId <>", value, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidGreaterThan(Integer value) {
            addCriterion("happyInfoId >", value, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("happyInfoId >=", value, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidLessThan(Integer value) {
            addCriterion("happyInfoId <", value, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("happyInfoId <=", value, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidIn(List<Integer> values) {
            addCriterion("happyInfoId in", values, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidNotIn(List<Integer> values) {
            addCriterion("happyInfoId not in", values, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidBetween(Integer value1, Integer value2) {
            addCriterion("happyInfoId between", value1, value2, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappyinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("happyInfoId not between", value1, value2, "happyinfoid");
            return (Criteria) this;
        }

        public Criteria andHappysortidIsNull() {
            addCriterion("happySortId is null");
            return (Criteria) this;
        }

        public Criteria andHappysortidIsNotNull() {
            addCriterion("happySortId is not null");
            return (Criteria) this;
        }

        public Criteria andHappysortidEqualTo(Integer value) {
            addCriterion("happySortId =", value, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidNotEqualTo(Integer value) {
            addCriterion("happySortId <>", value, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidGreaterThan(Integer value) {
            addCriterion("happySortId >", value, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("happySortId >=", value, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidLessThan(Integer value) {
            addCriterion("happySortId <", value, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidLessThanOrEqualTo(Integer value) {
            addCriterion("happySortId <=", value, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidIn(List<Integer> values) {
            addCriterion("happySortId in", values, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidNotIn(List<Integer> values) {
            addCriterion("happySortId not in", values, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidBetween(Integer value1, Integer value2) {
            addCriterion("happySortId between", value1, value2, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappysortidNotBetween(Integer value1, Integer value2) {
            addCriterion("happySortId not between", value1, value2, "happysortid");
            return (Criteria) this;
        }

        public Criteria andHappynameIsNull() {
            addCriterion("happyName is null");
            return (Criteria) this;
        }

        public Criteria andHappynameIsNotNull() {
            addCriterion("happyName is not null");
            return (Criteria) this;
        }

        public Criteria andHappynameEqualTo(String value) {
            addCriterion("happyName =", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameNotEqualTo(String value) {
            addCriterion("happyName <>", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameGreaterThan(String value) {
            addCriterion("happyName >", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameGreaterThanOrEqualTo(String value) {
            addCriterion("happyName >=", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameLessThan(String value) {
            addCriterion("happyName <", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameLessThanOrEqualTo(String value) {
            addCriterion("happyName <=", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameLike(String value) {
            addCriterion("happyName like", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameNotLike(String value) {
            addCriterion("happyName not like", value, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameIn(List<String> values) {
            addCriterion("happyName in", values, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameNotIn(List<String> values) {
            addCriterion("happyName not in", values, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameBetween(String value1, String value2) {
            addCriterion("happyName between", value1, value2, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappynameNotBetween(String value1, String value2) {
            addCriterion("happyName not between", value1, value2, "happyname");
            return (Criteria) this;
        }

        public Criteria andHappyaddrIsNull() {
            addCriterion("happyAddr is null");
            return (Criteria) this;
        }

        public Criteria andHappyaddrIsNotNull() {
            addCriterion("happyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHappyaddrEqualTo(String value) {
            addCriterion("happyAddr =", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrNotEqualTo(String value) {
            addCriterion("happyAddr <>", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrGreaterThan(String value) {
            addCriterion("happyAddr >", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("happyAddr >=", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrLessThan(String value) {
            addCriterion("happyAddr <", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrLessThanOrEqualTo(String value) {
            addCriterion("happyAddr <=", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrLike(String value) {
            addCriterion("happyAddr like", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrNotLike(String value) {
            addCriterion("happyAddr not like", value, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrIn(List<String> values) {
            addCriterion("happyAddr in", values, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrNotIn(List<String> values) {
            addCriterion("happyAddr not in", values, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrBetween(String value1, String value2) {
            addCriterion("happyAddr between", value1, value2, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappyaddrNotBetween(String value1, String value2) {
            addCriterion("happyAddr not between", value1, value2, "happyaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrIsNull() {
            addCriterion("happyPicAddr is null");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrIsNotNull() {
            addCriterion("happyPicAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrEqualTo(String value) {
            addCriterion("happyPicAddr =", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrNotEqualTo(String value) {
            addCriterion("happyPicAddr <>", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrGreaterThan(String value) {
            addCriterion("happyPicAddr >", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("happyPicAddr >=", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrLessThan(String value) {
            addCriterion("happyPicAddr <", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrLessThanOrEqualTo(String value) {
            addCriterion("happyPicAddr <=", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrLike(String value) {
            addCriterion("happyPicAddr like", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrNotLike(String value) {
            addCriterion("happyPicAddr not like", value, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrIn(List<String> values) {
            addCriterion("happyPicAddr in", values, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrNotIn(List<String> values) {
            addCriterion("happyPicAddr not in", values, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrBetween(String value1, String value2) {
            addCriterion("happyPicAddr between", value1, value2, "happypicaddr");
            return (Criteria) this;
        }

        public Criteria andHappypicaddrNotBetween(String value1, String value2) {
            addCriterion("happyPicAddr not between", value1, value2, "happypicaddr");
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