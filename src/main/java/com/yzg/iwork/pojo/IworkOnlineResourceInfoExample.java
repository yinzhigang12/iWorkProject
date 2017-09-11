package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkOnlineResourceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkOnlineResourceInfoExample() {
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

        public Criteria andOnlineresourceinfoidIsNull() {
            addCriterion("onlineResourceInfoId is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidIsNotNull() {
            addCriterion("onlineResourceInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidEqualTo(Integer value) {
            addCriterion("onlineResourceInfoId =", value, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidNotEqualTo(Integer value) {
            addCriterion("onlineResourceInfoId <>", value, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidGreaterThan(Integer value) {
            addCriterion("onlineResourceInfoId >", value, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceInfoId >=", value, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidLessThan(Integer value) {
            addCriterion("onlineResourceInfoId <", value, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("onlineResourceInfoId <=", value, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidIn(List<Integer> values) {
            addCriterion("onlineResourceInfoId in", values, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidNotIn(List<Integer> values) {
            addCriterion("onlineResourceInfoId not in", values, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceInfoId between", value1, value2, "onlineresourceinfoid");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("onlineResourceInfoId not between", value1, value2, "onlineresourceinfoid");
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

        public Criteria andOnlineresourceinfonameIsNull() {
            addCriterion("onlineResourceInfoName is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameIsNotNull() {
            addCriterion("onlineResourceInfoName is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameEqualTo(String value) {
            addCriterion("onlineResourceInfoName =", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameNotEqualTo(String value) {
            addCriterion("onlineResourceInfoName <>", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameGreaterThan(String value) {
            addCriterion("onlineResourceInfoName >", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameGreaterThanOrEqualTo(String value) {
            addCriterion("onlineResourceInfoName >=", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameLessThan(String value) {
            addCriterion("onlineResourceInfoName <", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameLessThanOrEqualTo(String value) {
            addCriterion("onlineResourceInfoName <=", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameLike(String value) {
            addCriterion("onlineResourceInfoName like", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameNotLike(String value) {
            addCriterion("onlineResourceInfoName not like", value, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameIn(List<String> values) {
            addCriterion("onlineResourceInfoName in", values, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameNotIn(List<String> values) {
            addCriterion("onlineResourceInfoName not in", values, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameBetween(String value1, String value2) {
            addCriterion("onlineResourceInfoName between", value1, value2, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfonameNotBetween(String value1, String value2) {
            addCriterion("onlineResourceInfoName not between", value1, value2, "onlineresourceinfoname");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrIsNull() {
            addCriterion("onlineResourceInfoAddr is null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrIsNotNull() {
            addCriterion("onlineResourceInfoAddr is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrEqualTo(String value) {
            addCriterion("onlineResourceInfoAddr =", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrNotEqualTo(String value) {
            addCriterion("onlineResourceInfoAddr <>", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrGreaterThan(String value) {
            addCriterion("onlineResourceInfoAddr >", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrGreaterThanOrEqualTo(String value) {
            addCriterion("onlineResourceInfoAddr >=", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrLessThan(String value) {
            addCriterion("onlineResourceInfoAddr <", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrLessThanOrEqualTo(String value) {
            addCriterion("onlineResourceInfoAddr <=", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrLike(String value) {
            addCriterion("onlineResourceInfoAddr like", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrNotLike(String value) {
            addCriterion("onlineResourceInfoAddr not like", value, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrIn(List<String> values) {
            addCriterion("onlineResourceInfoAddr in", values, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrNotIn(List<String> values) {
            addCriterion("onlineResourceInfoAddr not in", values, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrBetween(String value1, String value2) {
            addCriterion("onlineResourceInfoAddr between", value1, value2, "onlineresourceinfoaddr");
            return (Criteria) this;
        }

        public Criteria andOnlineresourceinfoaddrNotBetween(String value1, String value2) {
            addCriterion("onlineResourceInfoAddr not between", value1, value2, "onlineresourceinfoaddr");
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