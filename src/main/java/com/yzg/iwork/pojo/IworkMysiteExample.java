package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkMysiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkMysiteExample() {
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

        public Criteria andMysiteidIsNull() {
            addCriterion("mySiteId is null");
            return (Criteria) this;
        }

        public Criteria andMysiteidIsNotNull() {
            addCriterion("mySiteId is not null");
            return (Criteria) this;
        }

        public Criteria andMysiteidEqualTo(Integer value) {
            addCriterion("mySiteId =", value, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidNotEqualTo(Integer value) {
            addCriterion("mySiteId <>", value, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidGreaterThan(Integer value) {
            addCriterion("mySiteId >", value, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mySiteId >=", value, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidLessThan(Integer value) {
            addCriterion("mySiteId <", value, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidLessThanOrEqualTo(Integer value) {
            addCriterion("mySiteId <=", value, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidIn(List<Integer> values) {
            addCriterion("mySiteId in", values, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidNotIn(List<Integer> values) {
            addCriterion("mySiteId not in", values, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidBetween(Integer value1, Integer value2) {
            addCriterion("mySiteId between", value1, value2, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysiteidNotBetween(Integer value1, Integer value2) {
            addCriterion("mySiteId not between", value1, value2, "mysiteid");
            return (Criteria) this;
        }

        public Criteria andMysitenameIsNull() {
            addCriterion("mySiteName is null");
            return (Criteria) this;
        }

        public Criteria andMysitenameIsNotNull() {
            addCriterion("mySiteName is not null");
            return (Criteria) this;
        }

        public Criteria andMysitenameEqualTo(String value) {
            addCriterion("mySiteName =", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameNotEqualTo(String value) {
            addCriterion("mySiteName <>", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameGreaterThan(String value) {
            addCriterion("mySiteName >", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameGreaterThanOrEqualTo(String value) {
            addCriterion("mySiteName >=", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameLessThan(String value) {
            addCriterion("mySiteName <", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameLessThanOrEqualTo(String value) {
            addCriterion("mySiteName <=", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameLike(String value) {
            addCriterion("mySiteName like", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameNotLike(String value) {
            addCriterion("mySiteName not like", value, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameIn(List<String> values) {
            addCriterion("mySiteName in", values, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameNotIn(List<String> values) {
            addCriterion("mySiteName not in", values, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameBetween(String value1, String value2) {
            addCriterion("mySiteName between", value1, value2, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysitenameNotBetween(String value1, String value2) {
            addCriterion("mySiteName not between", value1, value2, "mysitename");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrIsNull() {
            addCriterion("mySiteAddr is null");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrIsNotNull() {
            addCriterion("mySiteAddr is not null");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrEqualTo(String value) {
            addCriterion("mySiteAddr =", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrNotEqualTo(String value) {
            addCriterion("mySiteAddr <>", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrGreaterThan(String value) {
            addCriterion("mySiteAddr >", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrGreaterThanOrEqualTo(String value) {
            addCriterion("mySiteAddr >=", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrLessThan(String value) {
            addCriterion("mySiteAddr <", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrLessThanOrEqualTo(String value) {
            addCriterion("mySiteAddr <=", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrLike(String value) {
            addCriterion("mySiteAddr like", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrNotLike(String value) {
            addCriterion("mySiteAddr not like", value, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrIn(List<String> values) {
            addCriterion("mySiteAddr in", values, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrNotIn(List<String> values) {
            addCriterion("mySiteAddr not in", values, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrBetween(String value1, String value2) {
            addCriterion("mySiteAddr between", value1, value2, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andMysiteaddrNotBetween(String value1, String value2) {
            addCriterion("mySiteAddr not between", value1, value2, "mysiteaddr");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidIsNull() {
            addCriterion("webSiteSortId is null");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidIsNotNull() {
            addCriterion("webSiteSortId is not null");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidEqualTo(Integer value) {
            addCriterion("webSiteSortId =", value, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidNotEqualTo(Integer value) {
            addCriterion("webSiteSortId <>", value, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidGreaterThan(Integer value) {
            addCriterion("webSiteSortId >", value, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("webSiteSortId >=", value, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidLessThan(Integer value) {
            addCriterion("webSiteSortId <", value, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidLessThanOrEqualTo(Integer value) {
            addCriterion("webSiteSortId <=", value, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidIn(List<Integer> values) {
            addCriterion("webSiteSortId in", values, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidNotIn(List<Integer> values) {
            addCriterion("webSiteSortId not in", values, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidBetween(Integer value1, Integer value2) {
            addCriterion("webSiteSortId between", value1, value2, "websitesortid");
            return (Criteria) this;
        }

        public Criteria andWebsitesortidNotBetween(Integer value1, Integer value2) {
            addCriterion("webSiteSortId not between", value1, value2, "websitesortid");
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