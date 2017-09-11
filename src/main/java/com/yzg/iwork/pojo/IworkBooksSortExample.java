package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkBooksSortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkBooksSortExample() {
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

        public Criteria andBookssortidIsNull() {
            addCriterion("booksSortId is null");
            return (Criteria) this;
        }

        public Criteria andBookssortidIsNotNull() {
            addCriterion("booksSortId is not null");
            return (Criteria) this;
        }

        public Criteria andBookssortidEqualTo(Integer value) {
            addCriterion("booksSortId =", value, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidNotEqualTo(Integer value) {
            addCriterion("booksSortId <>", value, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidGreaterThan(Integer value) {
            addCriterion("booksSortId >", value, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("booksSortId >=", value, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidLessThan(Integer value) {
            addCriterion("booksSortId <", value, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidLessThanOrEqualTo(Integer value) {
            addCriterion("booksSortId <=", value, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidIn(List<Integer> values) {
            addCriterion("booksSortId in", values, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidNotIn(List<Integer> values) {
            addCriterion("booksSortId not in", values, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidBetween(Integer value1, Integer value2) {
            addCriterion("booksSortId between", value1, value2, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortidNotBetween(Integer value1, Integer value2) {
            addCriterion("booksSortId not between", value1, value2, "bookssortid");
            return (Criteria) this;
        }

        public Criteria andBookssortnameIsNull() {
            addCriterion("booksSortName is null");
            return (Criteria) this;
        }

        public Criteria andBookssortnameIsNotNull() {
            addCriterion("booksSortName is not null");
            return (Criteria) this;
        }

        public Criteria andBookssortnameEqualTo(String value) {
            addCriterion("booksSortName =", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameNotEqualTo(String value) {
            addCriterion("booksSortName <>", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameGreaterThan(String value) {
            addCriterion("booksSortName >", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameGreaterThanOrEqualTo(String value) {
            addCriterion("booksSortName >=", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameLessThan(String value) {
            addCriterion("booksSortName <", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameLessThanOrEqualTo(String value) {
            addCriterion("booksSortName <=", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameLike(String value) {
            addCriterion("booksSortName like", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameNotLike(String value) {
            addCriterion("booksSortName not like", value, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameIn(List<String> values) {
            addCriterion("booksSortName in", values, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameNotIn(List<String> values) {
            addCriterion("booksSortName not in", values, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameBetween(String value1, String value2) {
            addCriterion("booksSortName between", value1, value2, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssortnameNotBetween(String value1, String value2) {
            addCriterion("booksSortName not between", value1, value2, "bookssortname");
            return (Criteria) this;
        }

        public Criteria andBookssourceidIsNull() {
            addCriterion("booksSourceId is null");
            return (Criteria) this;
        }

        public Criteria andBookssourceidIsNotNull() {
            addCriterion("booksSourceId is not null");
            return (Criteria) this;
        }

        public Criteria andBookssourceidEqualTo(Integer value) {
            addCriterion("booksSourceId =", value, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidNotEqualTo(Integer value) {
            addCriterion("booksSourceId <>", value, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidGreaterThan(Integer value) {
            addCriterion("booksSourceId >", value, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("booksSourceId >=", value, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidLessThan(Integer value) {
            addCriterion("booksSourceId <", value, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidLessThanOrEqualTo(Integer value) {
            addCriterion("booksSourceId <=", value, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidIn(List<Integer> values) {
            addCriterion("booksSourceId in", values, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidNotIn(List<Integer> values) {
            addCriterion("booksSourceId not in", values, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidBetween(Integer value1, Integer value2) {
            addCriterion("booksSourceId between", value1, value2, "bookssourceid");
            return (Criteria) this;
        }

        public Criteria andBookssourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("booksSourceId not between", value1, value2, "bookssourceid");
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