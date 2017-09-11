package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkVideoRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkVideoRecordInfoExample() {
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

        public Criteria andVideorecordinfoidIsNull() {
            addCriterion("videoRecordInfoId is null");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidIsNotNull() {
            addCriterion("videoRecordInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidEqualTo(Integer value) {
            addCriterion("videoRecordInfoId =", value, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidNotEqualTo(Integer value) {
            addCriterion("videoRecordInfoId <>", value, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidGreaterThan(Integer value) {
            addCriterion("videoRecordInfoId >", value, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoRecordInfoId >=", value, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidLessThan(Integer value) {
            addCriterion("videoRecordInfoId <", value, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("videoRecordInfoId <=", value, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidIn(List<Integer> values) {
            addCriterion("videoRecordInfoId in", values, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidNotIn(List<Integer> values) {
            addCriterion("videoRecordInfoId not in", values, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidBetween(Integer value1, Integer value2) {
            addCriterion("videoRecordInfoId between", value1, value2, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoRecordInfoId not between", value1, value2, "videorecordinfoid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidIsNull() {
            addCriterion("videoRecordSortId is null");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidIsNotNull() {
            addCriterion("videoRecordSortId is not null");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidEqualTo(Integer value) {
            addCriterion("videoRecordSortId =", value, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidNotEqualTo(Integer value) {
            addCriterion("videoRecordSortId <>", value, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidGreaterThan(Integer value) {
            addCriterion("videoRecordSortId >", value, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoRecordSortId >=", value, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidLessThan(Integer value) {
            addCriterion("videoRecordSortId <", value, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidLessThanOrEqualTo(Integer value) {
            addCriterion("videoRecordSortId <=", value, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidIn(List<Integer> values) {
            addCriterion("videoRecordSortId in", values, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidNotIn(List<Integer> values) {
            addCriterion("videoRecordSortId not in", values, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidBetween(Integer value1, Integer value2) {
            addCriterion("videoRecordSortId between", value1, value2, "videorecordsortid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoRecordSortId not between", value1, value2, "videorecordsortid");
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

        public Criteria andVideorecordtitleIsNull() {
            addCriterion("videoRecordTitle is null");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleIsNotNull() {
            addCriterion("videoRecordTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleEqualTo(String value) {
            addCriterion("videoRecordTitle =", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleNotEqualTo(String value) {
            addCriterion("videoRecordTitle <>", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleGreaterThan(String value) {
            addCriterion("videoRecordTitle >", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleGreaterThanOrEqualTo(String value) {
            addCriterion("videoRecordTitle >=", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleLessThan(String value) {
            addCriterion("videoRecordTitle <", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleLessThanOrEqualTo(String value) {
            addCriterion("videoRecordTitle <=", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleLike(String value) {
            addCriterion("videoRecordTitle like", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleNotLike(String value) {
            addCriterion("videoRecordTitle not like", value, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleIn(List<String> values) {
            addCriterion("videoRecordTitle in", values, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleNotIn(List<String> values) {
            addCriterion("videoRecordTitle not in", values, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleBetween(String value1, String value2) {
            addCriterion("videoRecordTitle between", value1, value2, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordtitleNotBetween(String value1, String value2) {
            addCriterion("videoRecordTitle not between", value1, value2, "videorecordtitle");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrIsNull() {
            addCriterion("videoRecordAddr is null");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrIsNotNull() {
            addCriterion("videoRecordAddr is not null");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrEqualTo(String value) {
            addCriterion("videoRecordAddr =", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrNotEqualTo(String value) {
            addCriterion("videoRecordAddr <>", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrGreaterThan(String value) {
            addCriterion("videoRecordAddr >", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrGreaterThanOrEqualTo(String value) {
            addCriterion("videoRecordAddr >=", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrLessThan(String value) {
            addCriterion("videoRecordAddr <", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrLessThanOrEqualTo(String value) {
            addCriterion("videoRecordAddr <=", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrLike(String value) {
            addCriterion("videoRecordAddr like", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrNotLike(String value) {
            addCriterion("videoRecordAddr not like", value, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrIn(List<String> values) {
            addCriterion("videoRecordAddr in", values, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrNotIn(List<String> values) {
            addCriterion("videoRecordAddr not in", values, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrBetween(String value1, String value2) {
            addCriterion("videoRecordAddr between", value1, value2, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordaddrNotBetween(String value1, String value2) {
            addCriterion("videoRecordAddr not between", value1, value2, "videorecordaddr");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidIsNull() {
            addCriterion("videoRecordSourceId is null");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidIsNotNull() {
            addCriterion("videoRecordSourceId is not null");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidEqualTo(Integer value) {
            addCriterion("videoRecordSourceId =", value, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidNotEqualTo(Integer value) {
            addCriterion("videoRecordSourceId <>", value, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidGreaterThan(Integer value) {
            addCriterion("videoRecordSourceId >", value, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoRecordSourceId >=", value, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidLessThan(Integer value) {
            addCriterion("videoRecordSourceId <", value, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidLessThanOrEqualTo(Integer value) {
            addCriterion("videoRecordSourceId <=", value, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidIn(List<Integer> values) {
            addCriterion("videoRecordSourceId in", values, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidNotIn(List<Integer> values) {
            addCriterion("videoRecordSourceId not in", values, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidBetween(Integer value1, Integer value2) {
            addCriterion("videoRecordSourceId between", value1, value2, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideorecordsourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoRecordSourceId not between", value1, value2, "videorecordsourceid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridIsNull() {
            addCriterion("videoAnchorId is null");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridIsNotNull() {
            addCriterion("videoAnchorId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridEqualTo(Integer value) {
            addCriterion("videoAnchorId =", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridNotEqualTo(Integer value) {
            addCriterion("videoAnchorId <>", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridGreaterThan(Integer value) {
            addCriterion("videoAnchorId >", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoAnchorId >=", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridLessThan(Integer value) {
            addCriterion("videoAnchorId <", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridLessThanOrEqualTo(Integer value) {
            addCriterion("videoAnchorId <=", value, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridIn(List<Integer> values) {
            addCriterion("videoAnchorId in", values, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridNotIn(List<Integer> values) {
            addCriterion("videoAnchorId not in", values, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridBetween(Integer value1, Integer value2) {
            addCriterion("videoAnchorId between", value1, value2, "videoanchorid");
            return (Criteria) this;
        }

        public Criteria andVideoanchoridNotBetween(Integer value1, Integer value2) {
            addCriterion("videoAnchorId not between", value1, value2, "videoanchorid");
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