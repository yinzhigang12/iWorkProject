package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkListenListInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkListenListInfoExample() {
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

        public Criteria andListenlistinfoidIsNull() {
            addCriterion("listenListInfoId is null");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidIsNotNull() {
            addCriterion("listenListInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidEqualTo(Integer value) {
            addCriterion("listenListInfoId =", value, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidNotEqualTo(Integer value) {
            addCriterion("listenListInfoId <>", value, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidGreaterThan(Integer value) {
            addCriterion("listenListInfoId >", value, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("listenListInfoId >=", value, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidLessThan(Integer value) {
            addCriterion("listenListInfoId <", value, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("listenListInfoId <=", value, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidIn(List<Integer> values) {
            addCriterion("listenListInfoId in", values, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidNotIn(List<Integer> values) {
            addCriterion("listenListInfoId not in", values, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidBetween(Integer value1, Integer value2) {
            addCriterion("listenListInfoId between", value1, value2, "listenlistinfoid");
            return (Criteria) this;
        }

        public Criteria andListenlistinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("listenListInfoId not between", value1, value2, "listenlistinfoid");
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

        public Criteria andListenlistsortidIsNull() {
            addCriterion("listenListSortId is null");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidIsNotNull() {
            addCriterion("listenListSortId is not null");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidEqualTo(Integer value) {
            addCriterion("listenListSortId =", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidNotEqualTo(Integer value) {
            addCriterion("listenListSortId <>", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidGreaterThan(Integer value) {
            addCriterion("listenListSortId >", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("listenListSortId >=", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidLessThan(Integer value) {
            addCriterion("listenListSortId <", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidLessThanOrEqualTo(Integer value) {
            addCriterion("listenListSortId <=", value, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidIn(List<Integer> values) {
            addCriterion("listenListSortId in", values, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidNotIn(List<Integer> values) {
            addCriterion("listenListSortId not in", values, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidBetween(Integer value1, Integer value2) {
            addCriterion("listenListSortId between", value1, value2, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("listenListSortId not between", value1, value2, "listenlistsortid");
            return (Criteria) this;
        }

        public Criteria andListenlistnameIsNull() {
            addCriterion("listenListName is null");
            return (Criteria) this;
        }

        public Criteria andListenlistnameIsNotNull() {
            addCriterion("listenListName is not null");
            return (Criteria) this;
        }

        public Criteria andListenlistnameEqualTo(String value) {
            addCriterion("listenListName =", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameNotEqualTo(String value) {
            addCriterion("listenListName <>", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameGreaterThan(String value) {
            addCriterion("listenListName >", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameGreaterThanOrEqualTo(String value) {
            addCriterion("listenListName >=", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameLessThan(String value) {
            addCriterion("listenListName <", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameLessThanOrEqualTo(String value) {
            addCriterion("listenListName <=", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameLike(String value) {
            addCriterion("listenListName like", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameNotLike(String value) {
            addCriterion("listenListName not like", value, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameIn(List<String> values) {
            addCriterion("listenListName in", values, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameNotIn(List<String> values) {
            addCriterion("listenListName not in", values, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameBetween(String value1, String value2) {
            addCriterion("listenListName between", value1, value2, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andListenlistnameNotBetween(String value1, String value2) {
            addCriterion("listenListName not between", value1, value2, "listenlistname");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidIsNull() {
            addCriterion("bandInfoSortId is null");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidIsNotNull() {
            addCriterion("bandInfoSortId is not null");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidEqualTo(Integer value) {
            addCriterion("bandInfoSortId =", value, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidNotEqualTo(Integer value) {
            addCriterion("bandInfoSortId <>", value, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidGreaterThan(Integer value) {
            addCriterion("bandInfoSortId >", value, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandInfoSortId >=", value, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidLessThan(Integer value) {
            addCriterion("bandInfoSortId <", value, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidLessThanOrEqualTo(Integer value) {
            addCriterion("bandInfoSortId <=", value, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidIn(List<Integer> values) {
            addCriterion("bandInfoSortId in", values, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidNotIn(List<Integer> values) {
            addCriterion("bandInfoSortId not in", values, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidBetween(Integer value1, Integer value2) {
            addCriterion("bandInfoSortId between", value1, value2, "bandinfosortid");
            return (Criteria) this;
        }

        public Criteria andBandinfosortidNotBetween(Integer value1, Integer value2) {
            addCriterion("bandInfoSortId not between", value1, value2, "bandinfosortid");
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

        public Criteria andBandinfostarttimeIsNull() {
            addCriterion("bandInfoStartTime is null");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeIsNotNull() {
            addCriterion("bandInfoStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeEqualTo(Date value) {
            addCriterion("bandInfoStartTime =", value, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeNotEqualTo(Date value) {
            addCriterion("bandInfoStartTime <>", value, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeGreaterThan(Date value) {
            addCriterion("bandInfoStartTime >", value, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bandInfoStartTime >=", value, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeLessThan(Date value) {
            addCriterion("bandInfoStartTime <", value, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeLessThanOrEqualTo(Date value) {
            addCriterion("bandInfoStartTime <=", value, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeIn(List<Date> values) {
            addCriterion("bandInfoStartTime in", values, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeNotIn(List<Date> values) {
            addCriterion("bandInfoStartTime not in", values, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeBetween(Date value1, Date value2) {
            addCriterion("bandInfoStartTime between", value1, value2, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfostarttimeNotBetween(Date value1, Date value2) {
            addCriterion("bandInfoStartTime not between", value1, value2, "bandinfostarttime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeIsNull() {
            addCriterion("bandInfoEndTime is null");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeIsNotNull() {
            addCriterion("bandInfoEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeEqualTo(Date value) {
            addCriterion("bandInfoEndTime =", value, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeNotEqualTo(Date value) {
            addCriterion("bandInfoEndTime <>", value, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeGreaterThan(Date value) {
            addCriterion("bandInfoEndTime >", value, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bandInfoEndTime >=", value, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeLessThan(Date value) {
            addCriterion("bandInfoEndTime <", value, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeLessThanOrEqualTo(Date value) {
            addCriterion("bandInfoEndTime <=", value, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeIn(List<Date> values) {
            addCriterion("bandInfoEndTime in", values, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeNotIn(List<Date> values) {
            addCriterion("bandInfoEndTime not in", values, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeBetween(Date value1, Date value2) {
            addCriterion("bandInfoEndTime between", value1, value2, "bandinfoendtime");
            return (Criteria) this;
        }

        public Criteria andBandinfoendtimeNotBetween(Date value1, Date value2) {
            addCriterion("bandInfoEndTime not between", value1, value2, "bandinfoendtime");
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