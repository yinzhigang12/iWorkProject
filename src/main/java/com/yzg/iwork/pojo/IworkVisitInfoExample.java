package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkVisitInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkVisitInfoExample() {
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

        public Criteria andVisitinfoidIsNull() {
            addCriterion("visitInfoId is null");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidIsNotNull() {
            addCriterion("visitInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidEqualTo(Integer value) {
            addCriterion("visitInfoId =", value, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidNotEqualTo(Integer value) {
            addCriterion("visitInfoId <>", value, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidGreaterThan(Integer value) {
            addCriterion("visitInfoId >", value, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitInfoId >=", value, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidLessThan(Integer value) {
            addCriterion("visitInfoId <", value, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("visitInfoId <=", value, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidIn(List<Integer> values) {
            addCriterion("visitInfoId in", values, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidNotIn(List<Integer> values) {
            addCriterion("visitInfoId not in", values, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidBetween(Integer value1, Integer value2) {
            addCriterion("visitInfoId between", value1, value2, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitInfoId not between", value1, value2, "visitinfoid");
            return (Criteria) this;
        }

        public Criteria andVisitnameIsNull() {
            addCriterion("visitName is null");
            return (Criteria) this;
        }

        public Criteria andVisitnameIsNotNull() {
            addCriterion("visitName is not null");
            return (Criteria) this;
        }

        public Criteria andVisitnameEqualTo(String value) {
            addCriterion("visitName =", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotEqualTo(String value) {
            addCriterion("visitName <>", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameGreaterThan(String value) {
            addCriterion("visitName >", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameGreaterThanOrEqualTo(String value) {
            addCriterion("visitName >=", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameLessThan(String value) {
            addCriterion("visitName <", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameLessThanOrEqualTo(String value) {
            addCriterion("visitName <=", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameLike(String value) {
            addCriterion("visitName like", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotLike(String value) {
            addCriterion("visitName not like", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameIn(List<String> values) {
            addCriterion("visitName in", values, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotIn(List<String> values) {
            addCriterion("visitName not in", values, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameBetween(String value1, String value2) {
            addCriterion("visitName between", value1, value2, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotBetween(String value1, String value2) {
            addCriterion("visitName not between", value1, value2, "visitname");
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

        public Criteria andVisitsortidIsNull() {
            addCriterion("visitSortId is null");
            return (Criteria) this;
        }

        public Criteria andVisitsortidIsNotNull() {
            addCriterion("visitSortId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitsortidEqualTo(Integer value) {
            addCriterion("visitSortId =", value, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidNotEqualTo(Integer value) {
            addCriterion("visitSortId <>", value, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidGreaterThan(Integer value) {
            addCriterion("visitSortId >", value, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitSortId >=", value, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidLessThan(Integer value) {
            addCriterion("visitSortId <", value, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidLessThanOrEqualTo(Integer value) {
            addCriterion("visitSortId <=", value, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidIn(List<Integer> values) {
            addCriterion("visitSortId in", values, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidNotIn(List<Integer> values) {
            addCriterion("visitSortId not in", values, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidBetween(Integer value1, Integer value2) {
            addCriterion("visitSortId between", value1, value2, "visitsortid");
            return (Criteria) this;
        }

        public Criteria andVisitsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitSortId not between", value1, value2, "visitsortid");
            return (Criteria) this;
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRemindsortidIsNull() {
            addCriterion("remindSortId is null");
            return (Criteria) this;
        }

        public Criteria andRemindsortidIsNotNull() {
            addCriterion("remindSortId is not null");
            return (Criteria) this;
        }

        public Criteria andRemindsortidEqualTo(Integer value) {
            addCriterion("remindSortId =", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidNotEqualTo(Integer value) {
            addCriterion("remindSortId <>", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidGreaterThan(Integer value) {
            addCriterion("remindSortId >", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("remindSortId >=", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidLessThan(Integer value) {
            addCriterion("remindSortId <", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidLessThanOrEqualTo(Integer value) {
            addCriterion("remindSortId <=", value, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidIn(List<Integer> values) {
            addCriterion("remindSortId in", values, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidNotIn(List<Integer> values) {
            addCriterion("remindSortId not in", values, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidBetween(Integer value1, Integer value2) {
            addCriterion("remindSortId between", value1, value2, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andRemindsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("remindSortId not between", value1, value2, "remindsortid");
            return (Criteria) this;
        }

        public Criteria andVisitaddrIsNull() {
            addCriterion("visitAddr is null");
            return (Criteria) this;
        }

        public Criteria andVisitaddrIsNotNull() {
            addCriterion("visitAddr is not null");
            return (Criteria) this;
        }

        public Criteria andVisitaddrEqualTo(String value) {
            addCriterion("visitAddr =", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrNotEqualTo(String value) {
            addCriterion("visitAddr <>", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrGreaterThan(String value) {
            addCriterion("visitAddr >", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrGreaterThanOrEqualTo(String value) {
            addCriterion("visitAddr >=", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrLessThan(String value) {
            addCriterion("visitAddr <", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrLessThanOrEqualTo(String value) {
            addCriterion("visitAddr <=", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrLike(String value) {
            addCriterion("visitAddr like", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrNotLike(String value) {
            addCriterion("visitAddr not like", value, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrIn(List<String> values) {
            addCriterion("visitAddr in", values, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrNotIn(List<String> values) {
            addCriterion("visitAddr not in", values, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrBetween(String value1, String value2) {
            addCriterion("visitAddr between", value1, value2, "visitaddr");
            return (Criteria) this;
        }

        public Criteria andVisitaddrNotBetween(String value1, String value2) {
            addCriterion("visitAddr not between", value1, value2, "visitaddr");
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