package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkOnlineResourceSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkOnlineResourceSourceExample() {
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

        public Criteria andOnlineresourceidIsNull() {
            addCriterion("onlineResourceId is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidIsNotNull() {
            addCriterion("onlineResourceId is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidEqualTo(Integer value) {
            addCriterion("onlineResourceId =", value, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidNotEqualTo(Integer value) {
            addCriterion("onlineResourceId <>", value, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidGreaterThan(Integer value) {
            addCriterion("onlineResourceId >", value, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceId >=", value, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidLessThan(Integer value) {
            addCriterion("onlineResourceId <", value, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidLessThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceId <=", value, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidIn(List<Integer> values) {
            addCriterion("onlineResourceId in", values, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidNotIn(List<Integer> values) {
            addCriterion("onlineResourceId not in", values, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceId between", value1, value2, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceId not between", value1, value2, "onlineresourceid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameIsNull() {
            addCriterion("onlineResourceName is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameIsNotNull() {
            addCriterion("onlineResourceName is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameEqualTo(String value) {
            addCriterion("onlineResourceName =", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameNotEqualTo(String value) {
            addCriterion("onlineResourceName <>", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameGreaterThan(String value) {
            addCriterion("onlineResourceName >", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("onlineResourceName >=", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameLessThan(String value) {
            addCriterion("onlineResourceName <", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameLessThanOrEqualTo(String value) {
            addCriterion("onlineResourceName <=", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameLike(String value) {
            addCriterion("onlineResourceName like", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameNotLike(String value) {
            addCriterion("onlineResourceName not like", value, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameIn(List<String> values) {
            addCriterion("onlineResourceName in", values, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameNotIn(List<String> values) {
            addCriterion("onlineResourceName not in", values, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameBetween(String value1, String value2) {
            addCriterion("onlineResourceName between", value1, value2, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcenameNotBetween(String value1, String value2) {
            addCriterion("onlineResourceName not between", value1, value2, "onlineresourcename");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrIsNull() {
            addCriterion("onlineResourceAddr is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrIsNotNull() {
            addCriterion("onlineResourceAddr is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrEqualTo(String value) {
            addCriterion("onlineResourceAddr =", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrNotEqualTo(String value) {
            addCriterion("onlineResourceAddr <>", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrGreaterThan(String value) {
            addCriterion("onlineResourceAddr >", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrGreaterThanOrEqualTo(String value) {
            addCriterion("onlineResourceAddr >=", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrLessThan(String value) {
            addCriterion("onlineResourceAddr <", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrLessThanOrEqualTo(String value) {
            addCriterion("onlineResourceAddr <=", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrLike(String value) {
            addCriterion("onlineResourceAddr like", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrNotLike(String value) {
            addCriterion("onlineResourceAddr not like", value, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrIn(List<String> values) {
            addCriterion("onlineResourceAddr in", values, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrNotIn(List<String> values) {
            addCriterion("onlineResourceAddr not in", values, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrBetween(String value1, String value2) {
            addCriterion("onlineResourceAddr between", value1, value2, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceaddrNotBetween(String value1, String value2) {
            addCriterion("onlineResourceAddr not between", value1, value2, "onlineresourceaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidIsNull() {
            addCriterion("onlineResourceSortId is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidIsNotNull() {
            addCriterion("onlineResourceSortId is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidEqualTo(Integer value) {
            addCriterion("onlineResourceSortId =", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidNotEqualTo(Integer value) {
            addCriterion("onlineResourceSortId <>", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidGreaterThan(Integer value) {
            addCriterion("onlineResourceSortId >", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceSortId >=", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidLessThan(Integer value) {
            addCriterion("onlineResourceSortId <", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidLessThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceSortId <=", value, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidIn(List<Integer> values) {
            addCriterion("onlineResourceSortId in", values, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidNotIn(List<Integer> values) {
            addCriterion("onlineResourceSortId not in", values, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceSortId between", value1, value2, "onlineresourcesortid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourcesortidNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceSortId not between", value1, value2, "onlineresourcesortid");
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