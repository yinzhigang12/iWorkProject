package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkVisitGenreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkVisitGenreExample() {
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

        public Criteria andVisitgenreidIsNull() {
            addCriterion("visitGenreId is null");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidIsNotNull() {
            addCriterion("visitGenreId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidEqualTo(Integer value) {
            addCriterion("visitGenreId =", value, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidNotEqualTo(Integer value) {
            addCriterion("visitGenreId <>", value, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidGreaterThan(Integer value) {
            addCriterion("visitGenreId >", value, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitGenreId >=", value, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidLessThan(Integer value) {
            addCriterion("visitGenreId <", value, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidLessThanOrEqualTo(Integer value) {
            addCriterion("visitGenreId <=", value, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidIn(List<Integer> values) {
            addCriterion("visitGenreId in", values, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidNotIn(List<Integer> values) {
            addCriterion("visitGenreId not in", values, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidBetween(Integer value1, Integer value2) {
            addCriterion("visitGenreId between", value1, value2, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenreidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitGenreId not between", value1, value2, "visitgenreid");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameIsNull() {
            addCriterion("visitGenreName is null");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameIsNotNull() {
            addCriterion("visitGenreName is not null");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameEqualTo(String value) {
            addCriterion("visitGenreName =", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameNotEqualTo(String value) {
            addCriterion("visitGenreName <>", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameGreaterThan(String value) {
            addCriterion("visitGenreName >", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameGreaterThanOrEqualTo(String value) {
            addCriterion("visitGenreName >=", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameLessThan(String value) {
            addCriterion("visitGenreName <", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameLessThanOrEqualTo(String value) {
            addCriterion("visitGenreName <=", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameLike(String value) {
            addCriterion("visitGenreName like", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameNotLike(String value) {
            addCriterion("visitGenreName not like", value, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameIn(List<String> values) {
            addCriterion("visitGenreName in", values, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameNotIn(List<String> values) {
            addCriterion("visitGenreName not in", values, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameBetween(String value1, String value2) {
            addCriterion("visitGenreName between", value1, value2, "visitgenrename");
            return (Criteria) this;
        }

        public Criteria andVisitgenrenameNotBetween(String value1, String value2) {
            addCriterion("visitGenreName not between", value1, value2, "visitgenrename");
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