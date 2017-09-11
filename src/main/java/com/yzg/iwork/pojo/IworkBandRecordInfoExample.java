package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkBandRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkBandRecordInfoExample() {
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

        public Criteria andBandrecordinfoidIsNull() {
            addCriterion("bandRecordInfoId is null");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidIsNotNull() {
            addCriterion("bandRecordInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidEqualTo(Integer value) {
            addCriterion("bandRecordInfoId =", value, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidNotEqualTo(Integer value) {
            addCriterion("bandRecordInfoId <>", value, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidGreaterThan(Integer value) {
            addCriterion("bandRecordInfoId >", value, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandRecordInfoId >=", value, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidLessThan(Integer value) {
            addCriterion("bandRecordInfoId <", value, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("bandRecordInfoId <=", value, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidIn(List<Integer> values) {
            addCriterion("bandRecordInfoId in", values, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidNotIn(List<Integer> values) {
            addCriterion("bandRecordInfoId not in", values, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidBetween(Integer value1, Integer value2) {
            addCriterion("bandRecordInfoId between", value1, value2, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("bandRecordInfoId not between", value1, value2, "bandrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidIsNull() {
            addCriterion("bandRecordSortId is null");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidIsNotNull() {
            addCriterion("bandRecordSortId is not null");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidEqualTo(Integer value) {
            addCriterion("bandRecordSortId =", value, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidNotEqualTo(Integer value) {
            addCriterion("bandRecordSortId <>", value, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidGreaterThan(Integer value) {
            addCriterion("bandRecordSortId >", value, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandRecordSortId >=", value, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidLessThan(Integer value) {
            addCriterion("bandRecordSortId <", value, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidLessThanOrEqualTo(Integer value) {
            addCriterion("bandRecordSortId <=", value, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidIn(List<Integer> values) {
            addCriterion("bandRecordSortId in", values, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidNotIn(List<Integer> values) {
            addCriterion("bandRecordSortId not in", values, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidBetween(Integer value1, Integer value2) {
            addCriterion("bandRecordSortId between", value1, value2, "bandrecordsortid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("bandRecordSortId not between", value1, value2, "bandrecordsortid");
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

        public Criteria andBandrecordtitleIsNull() {
            addCriterion("bandRecordTitle is null");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleIsNotNull() {
            addCriterion("bandRecordTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleEqualTo(String value) {
            addCriterion("bandRecordTitle =", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleNotEqualTo(String value) {
            addCriterion("bandRecordTitle <>", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleGreaterThan(String value) {
            addCriterion("bandRecordTitle >", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleGreaterThanOrEqualTo(String value) {
            addCriterion("bandRecordTitle >=", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleLessThan(String value) {
            addCriterion("bandRecordTitle <", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleLessThanOrEqualTo(String value) {
            addCriterion("bandRecordTitle <=", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleLike(String value) {
            addCriterion("bandRecordTitle like", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleNotLike(String value) {
            addCriterion("bandRecordTitle not like", value, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleIn(List<String> values) {
            addCriterion("bandRecordTitle in", values, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleNotIn(List<String> values) {
            addCriterion("bandRecordTitle not in", values, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleBetween(String value1, String value2) {
            addCriterion("bandRecordTitle between", value1, value2, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordtitleNotBetween(String value1, String value2) {
            addCriterion("bandRecordTitle not between", value1, value2, "bandrecordtitle");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrIsNull() {
            addCriterion("bandRecordAddr is null");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrIsNotNull() {
            addCriterion("bandRecordAddr is not null");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrEqualTo(String value) {
            addCriterion("bandRecordAddr =", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrNotEqualTo(String value) {
            addCriterion("bandRecordAddr <>", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrGreaterThan(String value) {
            addCriterion("bandRecordAddr >", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrGreaterThanOrEqualTo(String value) {
            addCriterion("bandRecordAddr >=", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrLessThan(String value) {
            addCriterion("bandRecordAddr <", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrLessThanOrEqualTo(String value) {
            addCriterion("bandRecordAddr <=", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrLike(String value) {
            addCriterion("bandRecordAddr like", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrNotLike(String value) {
            addCriterion("bandRecordAddr not like", value, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrIn(List<String> values) {
            addCriterion("bandRecordAddr in", values, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrNotIn(List<String> values) {
            addCriterion("bandRecordAddr not in", values, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrBetween(String value1, String value2) {
            addCriterion("bandRecordAddr between", value1, value2, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordaddrNotBetween(String value1, String value2) {
            addCriterion("bandRecordAddr not between", value1, value2, "bandrecordaddr");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidIsNull() {
            addCriterion("bandRecordSourceId is null");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidIsNotNull() {
            addCriterion("bandRecordSourceId is not null");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidEqualTo(Integer value) {
            addCriterion("bandRecordSourceId =", value, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidNotEqualTo(Integer value) {
            addCriterion("bandRecordSourceId <>", value, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidGreaterThan(Integer value) {
            addCriterion("bandRecordSourceId >", value, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandRecordSourceId >=", value, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidLessThan(Integer value) {
            addCriterion("bandRecordSourceId <", value, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidLessThanOrEqualTo(Integer value) {
            addCriterion("bandRecordSourceId <=", value, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidIn(List<Integer> values) {
            addCriterion("bandRecordSourceId in", values, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidNotIn(List<Integer> values) {
            addCriterion("bandRecordSourceId not in", values, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidBetween(Integer value1, Integer value2) {
            addCriterion("bandRecordSourceId between", value1, value2, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandrecordsourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("bandRecordSourceId not between", value1, value2, "bandrecordsourceid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridIsNull() {
            addCriterion("bandAnchorId is null");
            return (Criteria) this;
        }

        public Criteria andBandanchoridIsNotNull() {
            addCriterion("bandAnchorId is not null");
            return (Criteria) this;
        }

        public Criteria andBandanchoridEqualTo(Integer value) {
            addCriterion("bandAnchorId =", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridNotEqualTo(Integer value) {
            addCriterion("bandAnchorId <>", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridGreaterThan(Integer value) {
            addCriterion("bandAnchorId >", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandAnchorId >=", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridLessThan(Integer value) {
            addCriterion("bandAnchorId <", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridLessThanOrEqualTo(Integer value) {
            addCriterion("bandAnchorId <=", value, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridIn(List<Integer> values) {
            addCriterion("bandAnchorId in", values, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridNotIn(List<Integer> values) {
            addCriterion("bandAnchorId not in", values, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridBetween(Integer value1, Integer value2) {
            addCriterion("bandAnchorId between", value1, value2, "bandanchorid");
            return (Criteria) this;
        }

        public Criteria andBandanchoridNotBetween(Integer value1, Integer value2) {
            addCriterion("bandAnchorId not between", value1, value2, "bandanchorid");
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