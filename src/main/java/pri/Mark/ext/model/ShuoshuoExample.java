package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShuoshuoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShuoshuoExample() {
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

        public Criteria andShuoshuoIdIsNull() {
            addCriterion("shuoshuo_id is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdIsNotNull() {
            addCriterion("shuoshuo_id is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdEqualTo(Integer value) {
            addCriterion("shuoshuo_id =", value, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdNotEqualTo(Integer value) {
            addCriterion("shuoshuo_id <>", value, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdGreaterThan(Integer value) {
            addCriterion("shuoshuo_id >", value, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuo_id >=", value, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdLessThan(Integer value) {
            addCriterion("shuoshuo_id <", value, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuo_id <=", value, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdIn(List<Integer> values) {
            addCriterion("shuoshuo_id in", values, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdNotIn(List<Integer> values) {
            addCriterion("shuoshuo_id not in", values, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuo_id between", value1, value2, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuo_id not between", value1, value2, "shuoshuoId");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeIsNull() {
            addCriterion("shuoshuo_releaseTime is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeIsNotNull() {
            addCriterion("shuoshuo_releaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeEqualTo(Date value) {
            addCriterion("shuoshuo_releaseTime =", value, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeNotEqualTo(Date value) {
            addCriterion("shuoshuo_releaseTime <>", value, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeGreaterThan(Date value) {
            addCriterion("shuoshuo_releaseTime >", value, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shuoshuo_releaseTime >=", value, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeLessThan(Date value) {
            addCriterion("shuoshuo_releaseTime <", value, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("shuoshuo_releaseTime <=", value, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeIn(List<Date> values) {
            addCriterion("shuoshuo_releaseTime in", values, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeNotIn(List<Date> values) {
            addCriterion("shuoshuo_releaseTime not in", values, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeBetween(Date value1, Date value2) {
            addCriterion("shuoshuo_releaseTime between", value1, value2, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("shuoshuo_releaseTime not between", value1, value2, "shuoshuoReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorIsNull() {
            addCriterion("shuoshuo_promulgator is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorIsNotNull() {
            addCriterion("shuoshuo_promulgator is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorEqualTo(String value) {
            addCriterion("shuoshuo_promulgator =", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorNotEqualTo(String value) {
            addCriterion("shuoshuo_promulgator <>", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorGreaterThan(String value) {
            addCriterion("shuoshuo_promulgator >", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorGreaterThanOrEqualTo(String value) {
            addCriterion("shuoshuo_promulgator >=", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorLessThan(String value) {
            addCriterion("shuoshuo_promulgator <", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorLessThanOrEqualTo(String value) {
            addCriterion("shuoshuo_promulgator <=", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorLike(String value) {
            addCriterion("shuoshuo_promulgator like", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorNotLike(String value) {
            addCriterion("shuoshuo_promulgator not like", value, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorIn(List<String> values) {
            addCriterion("shuoshuo_promulgator in", values, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorNotIn(List<String> values) {
            addCriterion("shuoshuo_promulgator not in", values, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorBetween(String value1, String value2) {
            addCriterion("shuoshuo_promulgator between", value1, value2, "shuoshuoPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuoPromulgatorNotBetween(String value1, String value2) {
            addCriterion("shuoshuo_promulgator not between", value1, value2, "shuoshuoPromulgator");
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