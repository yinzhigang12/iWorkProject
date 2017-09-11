package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.List;

public class IworkBooksInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkBooksInfoExample() {
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

        public Criteria andBooksnameIsNull() {
            addCriterion("booksName is null");
            return (Criteria) this;
        }

        public Criteria andBooksnameIsNotNull() {
            addCriterion("booksName is not null");
            return (Criteria) this;
        }

        public Criteria andBooksnameEqualTo(String value) {
            addCriterion("booksName =", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotEqualTo(String value) {
            addCriterion("booksName <>", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameGreaterThan(String value) {
            addCriterion("booksName >", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameGreaterThanOrEqualTo(String value) {
            addCriterion("booksName >=", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameLessThan(String value) {
            addCriterion("booksName <", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameLessThanOrEqualTo(String value) {
            addCriterion("booksName <=", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameLike(String value) {
            addCriterion("booksName like", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotLike(String value) {
            addCriterion("booksName not like", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameIn(List<String> values) {
            addCriterion("booksName in", values, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotIn(List<String> values) {
            addCriterion("booksName not in", values, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameBetween(String value1, String value2) {
            addCriterion("booksName between", value1, value2, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotBetween(String value1, String value2) {
            addCriterion("booksName not between", value1, value2, "booksname");
            return (Criteria) this;
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

        public Criteria andBooksinfoaddrIsNull() {
            addCriterion("booksInfoAddr is null");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrIsNotNull() {
            addCriterion("booksInfoAddr is not null");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrEqualTo(String value) {
            addCriterion("booksInfoAddr =", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrNotEqualTo(String value) {
            addCriterion("booksInfoAddr <>", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrGreaterThan(String value) {
            addCriterion("booksInfoAddr >", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrGreaterThanOrEqualTo(String value) {
            addCriterion("booksInfoAddr >=", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrLessThan(String value) {
            addCriterion("booksInfoAddr <", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrLessThanOrEqualTo(String value) {
            addCriterion("booksInfoAddr <=", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrLike(String value) {
            addCriterion("booksInfoAddr like", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrNotLike(String value) {
            addCriterion("booksInfoAddr not like", value, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrIn(List<String> values) {
            addCriterion("booksInfoAddr in", values, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrNotIn(List<String> values) {
            addCriterion("booksInfoAddr not in", values, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrBetween(String value1, String value2) {
            addCriterion("booksInfoAddr between", value1, value2, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBooksinfoaddrNotBetween(String value1, String value2) {
            addCriterion("booksInfoAddr not between", value1, value2, "booksinfoaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrIsNull() {
            addCriterion("booksPicAddr is null");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrIsNotNull() {
            addCriterion("booksPicAddr is not null");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrEqualTo(String value) {
            addCriterion("booksPicAddr =", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrNotEqualTo(String value) {
            addCriterion("booksPicAddr <>", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrGreaterThan(String value) {
            addCriterion("booksPicAddr >", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("booksPicAddr >=", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrLessThan(String value) {
            addCriterion("booksPicAddr <", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrLessThanOrEqualTo(String value) {
            addCriterion("booksPicAddr <=", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrLike(String value) {
            addCriterion("booksPicAddr like", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrNotLike(String value) {
            addCriterion("booksPicAddr not like", value, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrIn(List<String> values) {
            addCriterion("booksPicAddr in", values, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrNotIn(List<String> values) {
            addCriterion("booksPicAddr not in", values, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrBetween(String value1, String value2) {
            addCriterion("booksPicAddr between", value1, value2, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspicaddrNotBetween(String value1, String value2) {
            addCriterion("booksPicAddr not between", value1, value2, "bookspicaddr");
            return (Criteria) this;
        }

        public Criteria andBookspressIsNull() {
            addCriterion("booksPress is null");
            return (Criteria) this;
        }

        public Criteria andBookspressIsNotNull() {
            addCriterion("booksPress is not null");
            return (Criteria) this;
        }

        public Criteria andBookspressEqualTo(String value) {
            addCriterion("booksPress =", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressNotEqualTo(String value) {
            addCriterion("booksPress <>", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressGreaterThan(String value) {
            addCriterion("booksPress >", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressGreaterThanOrEqualTo(String value) {
            addCriterion("booksPress >=", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressLessThan(String value) {
            addCriterion("booksPress <", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressLessThanOrEqualTo(String value) {
            addCriterion("booksPress <=", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressLike(String value) {
            addCriterion("booksPress like", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressNotLike(String value) {
            addCriterion("booksPress not like", value, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressIn(List<String> values) {
            addCriterion("booksPress in", values, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressNotIn(List<String> values) {
            addCriterion("booksPress not in", values, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressBetween(String value1, String value2) {
            addCriterion("booksPress between", value1, value2, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspressNotBetween(String value1, String value2) {
            addCriterion("booksPress not between", value1, value2, "bookspress");
            return (Criteria) this;
        }

        public Criteria andBookspriceIsNull() {
            addCriterion("booksPrice is null");
            return (Criteria) this;
        }

        public Criteria andBookspriceIsNotNull() {
            addCriterion("booksPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBookspriceEqualTo(Double value) {
            addCriterion("booksPrice =", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceNotEqualTo(Double value) {
            addCriterion("booksPrice <>", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceGreaterThan(Double value) {
            addCriterion("booksPrice >", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("booksPrice >=", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceLessThan(Double value) {
            addCriterion("booksPrice <", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceLessThanOrEqualTo(Double value) {
            addCriterion("booksPrice <=", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceIn(List<Double> values) {
            addCriterion("booksPrice in", values, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceNotIn(List<Double> values) {
            addCriterion("booksPrice not in", values, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceBetween(Double value1, Double value2) {
            addCriterion("booksPrice between", value1, value2, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceNotBetween(Double value1, Double value2) {
            addCriterion("booksPrice not between", value1, value2, "booksprice");
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