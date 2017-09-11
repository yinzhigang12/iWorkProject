package com.yzg.iwork.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IworkEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IworkEvaluateExample() {
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

        public Criteria andEvaluateidIsNull() {
            addCriterion("evaluateId is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIsNotNull() {
            addCriterion("evaluateId is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateidEqualTo(Integer value) {
            addCriterion("evaluateId =", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotEqualTo(Integer value) {
            addCriterion("evaluateId <>", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThan(Integer value) {
            addCriterion("evaluateId >", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluateId >=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThan(Integer value) {
            addCriterion("evaluateId <", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidLessThanOrEqualTo(Integer value) {
            addCriterion("evaluateId <=", value, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidIn(List<Integer> values) {
            addCriterion("evaluateId in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotIn(List<Integer> values) {
            addCriterion("evaluateId not in", values, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidBetween(Integer value1, Integer value2) {
            addCriterion("evaluateId between", value1, value2, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluateidNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluateId not between", value1, value2, "evaluateid");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeIsNull() {
            addCriterion("evaluateType is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeIsNotNull() {
            addCriterion("evaluateType is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeEqualTo(Integer value) {
            addCriterion("evaluateType =", value, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeNotEqualTo(Integer value) {
            addCriterion("evaluateType <>", value, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeGreaterThan(Integer value) {
            addCriterion("evaluateType >", value, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluateType >=", value, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeLessThan(Integer value) {
            addCriterion("evaluateType <", value, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeLessThanOrEqualTo(Integer value) {
            addCriterion("evaluateType <=", value, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeIn(List<Integer> values) {
            addCriterion("evaluateType in", values, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeNotIn(List<Integer> values) {
            addCriterion("evaluateType not in", values, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeBetween(Integer value1, Integer value2) {
            addCriterion("evaluateType between", value1, value2, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andEvaluatetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluateType not between", value1, value2, "evaluatetype");
            return (Criteria) this;
        }

        public Criteria andBvidIsNull() {
            addCriterion("bvId is null");
            return (Criteria) this;
        }

        public Criteria andBvidIsNotNull() {
            addCriterion("bvId is not null");
            return (Criteria) this;
        }

        public Criteria andBvidEqualTo(Integer value) {
            addCriterion("bvId =", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidNotEqualTo(Integer value) {
            addCriterion("bvId <>", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidGreaterThan(Integer value) {
            addCriterion("bvId >", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bvId >=", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidLessThan(Integer value) {
            addCriterion("bvId <", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidLessThanOrEqualTo(Integer value) {
            addCriterion("bvId <=", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidIn(List<Integer> values) {
            addCriterion("bvId in", values, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidNotIn(List<Integer> values) {
            addCriterion("bvId not in", values, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidBetween(Integer value1, Integer value2) {
            addCriterion("bvId between", value1, value2, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidNotBetween(Integer value1, Integer value2) {
            addCriterion("bvId not between", value1, value2, "bvid");
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