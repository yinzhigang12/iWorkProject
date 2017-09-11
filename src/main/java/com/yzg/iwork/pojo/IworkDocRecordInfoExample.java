package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkDocRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkDocRecordInfoExample() {
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

        public Criteria andDocrecordinfoidIsNull() {
            addCriterion("docRecordInfoId is null");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidIsNotNull() {
            addCriterion("docRecordInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidEqualTo(Integer value) {
            addCriterion("docRecordInfoId =", value, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidNotEqualTo(Integer value) {
            addCriterion("docRecordInfoId <>", value, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidGreaterThan(Integer value) {
            addCriterion("docRecordInfoId >", value, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docRecordInfoId >=", value, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidLessThan(Integer value) {
            addCriterion("docRecordInfoId <", value, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("docRecordInfoId <=", value, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidIn(List<Integer> values) {
            addCriterion("docRecordInfoId in", values, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidNotIn(List<Integer> values) {
            addCriterion("docRecordInfoId not in", values, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidBetween(Integer value1, Integer value2) {
            addCriterion("docRecordInfoId between", value1, value2, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("docRecordInfoId not between", value1, value2, "docrecordinfoid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidIsNull() {
            addCriterion("docRecordSourtId is null");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidIsNotNull() {
            addCriterion("docRecordSourtId is not null");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidEqualTo(Integer value) {
            addCriterion("docRecordSourtId =", value, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidNotEqualTo(Integer value) {
            addCriterion("docRecordSourtId <>", value, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidGreaterThan(Integer value) {
            addCriterion("docRecordSourtId >", value, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docRecordSourtId >=", value, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidLessThan(Integer value) {
            addCriterion("docRecordSourtId <", value, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidLessThanOrEqualTo(Integer value) {
            addCriterion("docRecordSourtId <=", value, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidIn(List<Integer> values) {
            addCriterion("docRecordSourtId in", values, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidNotIn(List<Integer> values) {
            addCriterion("docRecordSourtId not in", values, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidBetween(Integer value1, Integer value2) {
            addCriterion("docRecordSourtId between", value1, value2, "docrecordsourtid");
            return (Criteria) this;
        }

        public Criteria andDocrecordsourtidNotBetween(Integer value1, Integer value2) {
            addCriterion("docRecordSourtId not between", value1, value2, "docrecordsourtid");
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

        public Criteria andDocrecordtitleIsNull() {
            addCriterion("docRecordTitle is null");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleIsNotNull() {
            addCriterion("docRecordTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleEqualTo(String value) {
            addCriterion("docRecordTitle =", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleNotEqualTo(String value) {
            addCriterion("docRecordTitle <>", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleGreaterThan(String value) {
            addCriterion("docRecordTitle >", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleGreaterThanOrEqualTo(String value) {
            addCriterion("docRecordTitle >=", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleLessThan(String value) {
            addCriterion("docRecordTitle <", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleLessThanOrEqualTo(String value) {
            addCriterion("docRecordTitle <=", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleLike(String value) {
            addCriterion("docRecordTitle like", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleNotLike(String value) {
            addCriterion("docRecordTitle not like", value, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleIn(List<String> values) {
            addCriterion("docRecordTitle in", values, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleNotIn(List<String> values) {
            addCriterion("docRecordTitle not in", values, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleBetween(String value1, String value2) {
            addCriterion("docRecordTitle between", value1, value2, "docrecordtitle");
            return (Criteria) this;
        }

        public Criteria andDocrecordtitleNotBetween(String value1, String value2) {
            addCriterion("docRecordTitle not between", value1, value2, "docrecordtitle");
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

        public Criteria andDocsourceaddrIsNull() {
            addCriterion("docSourceAddr is null");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrIsNotNull() {
            addCriterion("docSourceAddr is not null");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrEqualTo(String value) {
            addCriterion("docSourceAddr =", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrNotEqualTo(String value) {
            addCriterion("docSourceAddr <>", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrGreaterThan(String value) {
            addCriterion("docSourceAddr >", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrGreaterThanOrEqualTo(String value) {
            addCriterion("docSourceAddr >=", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrLessThan(String value) {
            addCriterion("docSourceAddr <", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrLessThanOrEqualTo(String value) {
            addCriterion("docSourceAddr <=", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrLike(String value) {
            addCriterion("docSourceAddr like", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrNotLike(String value) {
            addCriterion("docSourceAddr not like", value, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrIn(List<String> values) {
            addCriterion("docSourceAddr in", values, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrNotIn(List<String> values) {
            addCriterion("docSourceAddr not in", values, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrBetween(String value1, String value2) {
            addCriterion("docSourceAddr between", value1, value2, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDocsourceaddrNotBetween(String value1, String value2) {
            addCriterion("docSourceAddr not between", value1, value2, "docsourceaddr");
            return (Criteria) this;
        }

        public Criteria andDockeyIsNull() {
            addCriterion("docKey is null");
            return (Criteria) this;
        }

        public Criteria andDockeyIsNotNull() {
            addCriterion("docKey is not null");
            return (Criteria) this;
        }

        public Criteria andDockeyEqualTo(String value) {
            addCriterion("docKey =", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyNotEqualTo(String value) {
            addCriterion("docKey <>", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyGreaterThan(String value) {
            addCriterion("docKey >", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyGreaterThanOrEqualTo(String value) {
            addCriterion("docKey >=", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyLessThan(String value) {
            addCriterion("docKey <", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyLessThanOrEqualTo(String value) {
            addCriterion("docKey <=", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyLike(String value) {
            addCriterion("docKey like", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyNotLike(String value) {
            addCriterion("docKey not like", value, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyIn(List<String> values) {
            addCriterion("docKey in", values, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyNotIn(List<String> values) {
            addCriterion("docKey not in", values, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyBetween(String value1, String value2) {
            addCriterion("docKey between", value1, value2, "dockey");
            return (Criteria) this;
        }

        public Criteria andDockeyNotBetween(String value1, String value2) {
            addCriterion("docKey not between", value1, value2, "dockey");
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