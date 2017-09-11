package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkPictureRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkPictureRecordInfoExample() {
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

        public Criteria andPicturerecordinfoidIsNull() {
            addCriterion("pictureRecordInfoId is null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidIsNotNull() {
            addCriterion("pictureRecordInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidEqualTo(Integer value) {
            addCriterion("pictureRecordInfoId =", value, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidNotEqualTo(Integer value) {
            addCriterion("pictureRecordInfoId <>", value, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidGreaterThan(Integer value) {
            addCriterion("pictureRecordInfoId >", value, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictureRecordInfoId >=", value, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidLessThan(Integer value) {
            addCriterion("pictureRecordInfoId <", value, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("pictureRecordInfoId <=", value, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidIn(List<Integer> values) {
            addCriterion("pictureRecordInfoId in", values, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidNotIn(List<Integer> values) {
            addCriterion("pictureRecordInfoId not in", values, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidBetween(Integer value1, Integer value2) {
            addCriterion("pictureRecordInfoId between", value1, value2, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("pictureRecordInfoId not between", value1, value2, "picturerecordinfoid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidIsNull() {
            addCriterion("pictureRecordSortId is null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidIsNotNull() {
            addCriterion("pictureRecordSortId is not null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidEqualTo(Integer value) {
            addCriterion("pictureRecordSortId =", value, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidNotEqualTo(Integer value) {
            addCriterion("pictureRecordSortId <>", value, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidGreaterThan(Integer value) {
            addCriterion("pictureRecordSortId >", value, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictureRecordSortId >=", value, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidLessThan(Integer value) {
            addCriterion("pictureRecordSortId <", value, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidLessThanOrEqualTo(Integer value) {
            addCriterion("pictureRecordSortId <=", value, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidIn(List<Integer> values) {
            addCriterion("pictureRecordSortId in", values, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidNotIn(List<Integer> values) {
            addCriterion("pictureRecordSortId not in", values, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidBetween(Integer value1, Integer value2) {
            addCriterion("pictureRecordSortId between", value1, value2, "picturerecordsortid");
            return (Criteria) this;
        }

        public Criteria andPicturerecordsortidNotBetween(Integer value1, Integer value2) {
            addCriterion("pictureRecordSortId not between", value1, value2, "picturerecordsortid");
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

        public Criteria andPicturerecordtitleIsNull() {
            addCriterion("pictureRecordTitle is null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleIsNotNull() {
            addCriterion("pictureRecordTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleEqualTo(String value) {
            addCriterion("pictureRecordTitle =", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleNotEqualTo(String value) {
            addCriterion("pictureRecordTitle <>", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleGreaterThan(String value) {
            addCriterion("pictureRecordTitle >", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleGreaterThanOrEqualTo(String value) {
            addCriterion("pictureRecordTitle >=", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleLessThan(String value) {
            addCriterion("pictureRecordTitle <", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleLessThanOrEqualTo(String value) {
            addCriterion("pictureRecordTitle <=", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleLike(String value) {
            addCriterion("pictureRecordTitle like", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleNotLike(String value) {
            addCriterion("pictureRecordTitle not like", value, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleIn(List<String> values) {
            addCriterion("pictureRecordTitle in", values, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleNotIn(List<String> values) {
            addCriterion("pictureRecordTitle not in", values, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleBetween(String value1, String value2) {
            addCriterion("pictureRecordTitle between", value1, value2, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordtitleNotBetween(String value1, String value2) {
            addCriterion("pictureRecordTitle not between", value1, value2, "picturerecordtitle");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrIsNull() {
            addCriterion("pictureRecordAddr is null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrIsNotNull() {
            addCriterion("pictureRecordAddr is not null");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrEqualTo(String value) {
            addCriterion("pictureRecordAddr =", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrNotEqualTo(String value) {
            addCriterion("pictureRecordAddr <>", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrGreaterThan(String value) {
            addCriterion("pictureRecordAddr >", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrGreaterThanOrEqualTo(String value) {
            addCriterion("pictureRecordAddr >=", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrLessThan(String value) {
            addCriterion("pictureRecordAddr <", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrLessThanOrEqualTo(String value) {
            addCriterion("pictureRecordAddr <=", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrLike(String value) {
            addCriterion("pictureRecordAddr like", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrNotLike(String value) {
            addCriterion("pictureRecordAddr not like", value, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrIn(List<String> values) {
            addCriterion("pictureRecordAddr in", values, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrNotIn(List<String> values) {
            addCriterion("pictureRecordAddr not in", values, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrBetween(String value1, String value2) {
            addCriterion("pictureRecordAddr between", value1, value2, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturerecordaddrNotBetween(String value1, String value2) {
            addCriterion("pictureRecordAddr not between", value1, value2, "picturerecordaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrIsNull() {
            addCriterion("pictureSourceAddr is null");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrIsNotNull() {
            addCriterion("pictureSourceAddr is not null");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrEqualTo(String value) {
            addCriterion("pictureSourceAddr =", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrNotEqualTo(String value) {
            addCriterion("pictureSourceAddr <>", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrGreaterThan(String value) {
            addCriterion("pictureSourceAddr >", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrGreaterThanOrEqualTo(String value) {
            addCriterion("pictureSourceAddr >=", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrLessThan(String value) {
            addCriterion("pictureSourceAddr <", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrLessThanOrEqualTo(String value) {
            addCriterion("pictureSourceAddr <=", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrLike(String value) {
            addCriterion("pictureSourceAddr like", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrNotLike(String value) {
            addCriterion("pictureSourceAddr not like", value, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrIn(List<String> values) {
            addCriterion("pictureSourceAddr in", values, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrNotIn(List<String> values) {
            addCriterion("pictureSourceAddr not in", values, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrBetween(String value1, String value2) {
            addCriterion("pictureSourceAddr between", value1, value2, "picturesourceaddr");
            return (Criteria) this;
        }

        public Criteria andPicturesourceaddrNotBetween(String value1, String value2) {
            addCriterion("pictureSourceAddr not between", value1, value2, "picturesourceaddr");
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