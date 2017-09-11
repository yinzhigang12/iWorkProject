package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkBooksMarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkBooksMarkExample() {
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

        public Criteria andBooksmarkidIsNull() {
            addCriterion("booksMarkId is null");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidIsNotNull() {
            addCriterion("booksMarkId is not null");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidEqualTo(Integer value) {
            addCriterion("booksMarkId =", value, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidNotEqualTo(Integer value) {
            addCriterion("booksMarkId <>", value, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidGreaterThan(Integer value) {
            addCriterion("booksMarkId >", value, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("booksMarkId >=", value, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidLessThan(Integer value) {
            addCriterion("booksMarkId <", value, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidLessThanOrEqualTo(Integer value) {
            addCriterion("booksMarkId <=", value, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidIn(List<Integer> values) {
            addCriterion("booksMarkId in", values, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidNotIn(List<Integer> values) {
            addCriterion("booksMarkId not in", values, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidBetween(Integer value1, Integer value2) {
            addCriterion("booksMarkId between", value1, value2, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarkidNotBetween(Integer value1, Integer value2) {
            addCriterion("booksMarkId not between", value1, value2, "booksmarkid");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameIsNull() {
            addCriterion("booksMarkName is null");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameIsNotNull() {
            addCriterion("booksMarkName is not null");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameEqualTo(String value) {
            addCriterion("booksMarkName =", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameNotEqualTo(String value) {
            addCriterion("booksMarkName <>", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameGreaterThan(String value) {
            addCriterion("booksMarkName >", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameGreaterThanOrEqualTo(String value) {
            addCriterion("booksMarkName >=", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameLessThan(String value) {
            addCriterion("booksMarkName <", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameLessThanOrEqualTo(String value) {
            addCriterion("booksMarkName <=", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameLike(String value) {
            addCriterion("booksMarkName like", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameNotLike(String value) {
            addCriterion("booksMarkName not like", value, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameIn(List<String> values) {
            addCriterion("booksMarkName in", values, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameNotIn(List<String> values) {
            addCriterion("booksMarkName not in", values, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameBetween(String value1, String value2) {
            addCriterion("booksMarkName between", value1, value2, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksmarknameNotBetween(String value1, String value2) {
            addCriterion("booksMarkName not between", value1, value2, "booksmarkname");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidIsNull() {
            addCriterion("booksInfoId is null");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidIsNotNull() {
            addCriterion("booksInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidEqualTo(Integer value) {
            addCriterion("booksInfoId =", value, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidNotEqualTo(Integer value) {
            addCriterion("booksInfoId <>", value, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidGreaterThan(Integer value) {
            addCriterion("booksInfoId >", value, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("booksInfoId >=", value, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidLessThan(Integer value) {
            addCriterion("booksInfoId <", value, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("booksInfoId <=", value, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidIn(List<Integer> values) {
            addCriterion("booksInfoId in", values, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidNotIn(List<Integer> values) {
            addCriterion("booksInfoId not in", values, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidBetween(Integer value1, Integer value2) {
            addCriterion("booksInfoId between", value1, value2, "booksinfoid");
            return (Criteria) this;
        }

        public Criteria andBooksinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("booksInfoId not between", value1, value2, "booksinfoid");
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

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
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