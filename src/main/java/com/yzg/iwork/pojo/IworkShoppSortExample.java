package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkShoppSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkShoppSortExample() {
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

        public Criteria andShoppsortidIsNull() {
            addCriterion("shoppSortId is null");
            return (Criteria) this;
        }

        public Criteria andShoppsortidIsNotNull() {
            addCriterion("shoppSortId is not null");
            return (Criteria) this;
        }

        public Criteria andShoppsortidEqualTo(Integer value) {
            addCriterion("shoppSortId =", value, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidNotEqualTo(Integer value) {
            addCriterion("shoppSortId <>", value, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidGreaterThan(Integer value) {
            addCriterion("shoppSortId >", value, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppSortId >=", value, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidLessThan(Integer value) {
            addCriterion("shoppSortId <", value, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidLessThanOrEqualTo(Integer value) {
            addCriterion("shoppSortId <=", value, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidIn(List<Integer> values) {
            addCriterion("shoppSortId in", values, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidNotIn(List<Integer> values) {
            addCriterion("shoppSortId not in", values, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidBetween(Integer value1, Integer value2) {
            addCriterion("shoppSortId between", value1, value2, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppSortId not between", value1, value2, "shoppsortid");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameIsNull() {
            addCriterion("shoppSortName is null");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameIsNotNull() {
            addCriterion("shoppSortName is not null");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameEqualTo(String value) {
            addCriterion("shoppSortName =", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameNotEqualTo(String value) {
            addCriterion("shoppSortName <>", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameGreaterThan(String value) {
            addCriterion("shoppSortName >", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shoppSortName >=", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameLessThan(String value) {
            addCriterion("shoppSortName <", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameLessThanOrEqualTo(String value) {
            addCriterion("shoppSortName <=", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameLike(String value) {
            addCriterion("shoppSortName like", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameNotLike(String value) {
            addCriterion("shoppSortName not like", value, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameIn(List<String> values) {
            addCriterion("shoppSortName in", values, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameNotIn(List<String> values) {
            addCriterion("shoppSortName not in", values, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameBetween(String value1, String value2) {
            addCriterion("shoppSortName between", value1, value2, "shoppsortname");
            return (Criteria) this;
        }

        public Criteria andShoppsortnameNotBetween(String value1, String value2) {
            addCriterion("shoppSortName not between", value1, value2, "shoppsortname");
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

        public Criteria andShoppsortaddrIsNull() {
            addCriterion("shoppSortAddr is null");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrIsNotNull() {
            addCriterion("shoppSortAddr is not null");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrEqualTo(String value) {
            addCriterion("shoppSortAddr =", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrNotEqualTo(String value) {
            addCriterion("shoppSortAddr <>", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrGreaterThan(String value) {
            addCriterion("shoppSortAddr >", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrGreaterThanOrEqualTo(String value) {
            addCriterion("shoppSortAddr >=", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrLessThan(String value) {
            addCriterion("shoppSortAddr <", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrLessThanOrEqualTo(String value) {
            addCriterion("shoppSortAddr <=", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrLike(String value) {
            addCriterion("shoppSortAddr like", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrNotLike(String value) {
            addCriterion("shoppSortAddr not like", value, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrIn(List<String> values) {
            addCriterion("shoppSortAddr in", values, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrNotIn(List<String> values) {
            addCriterion("shoppSortAddr not in", values, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrBetween(String value1, String value2) {
            addCriterion("shoppSortAddr between", value1, value2, "shoppsortaddr");
            return (Criteria) this;
        }

        public Criteria andShoppsortaddrNotBetween(String value1, String value2) {
            addCriterion("shoppSortAddr not between", value1, value2, "shoppsortaddr");
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