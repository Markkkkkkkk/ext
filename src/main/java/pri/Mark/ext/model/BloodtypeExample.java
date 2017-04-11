package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class BloodtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BloodtypeExample() {
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

        public Criteria andBloodtypeIdIsNull() {
            addCriterion("bloodType_id is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdIsNotNull() {
            addCriterion("bloodType_id is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdEqualTo(Integer value) {
            addCriterion("bloodType_id =", value, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdNotEqualTo(Integer value) {
            addCriterion("bloodType_id <>", value, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdGreaterThan(Integer value) {
            addCriterion("bloodType_id >", value, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bloodType_id >=", value, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdLessThan(Integer value) {
            addCriterion("bloodType_id <", value, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("bloodType_id <=", value, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdIn(List<Integer> values) {
            addCriterion("bloodType_id in", values, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdNotIn(List<Integer> values) {
            addCriterion("bloodType_id not in", values, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("bloodType_id between", value1, value2, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bloodType_id not between", value1, value2, "bloodtypeId");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeIsNull() {
            addCriterion("bloodType_type is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeIsNotNull() {
            addCriterion("bloodType_type is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeEqualTo(String value) {
            addCriterion("bloodType_type =", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeNotEqualTo(String value) {
            addCriterion("bloodType_type <>", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeGreaterThan(String value) {
            addCriterion("bloodType_type >", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bloodType_type >=", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeLessThan(String value) {
            addCriterion("bloodType_type <", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeLessThanOrEqualTo(String value) {
            addCriterion("bloodType_type <=", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeLike(String value) {
            addCriterion("bloodType_type like", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeNotLike(String value) {
            addCriterion("bloodType_type not like", value, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeIn(List<String> values) {
            addCriterion("bloodType_type in", values, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeNotIn(List<String> values) {
            addCriterion("bloodType_type not in", values, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeBetween(String value1, String value2) {
            addCriterion("bloodType_type between", value1, value2, "bloodtypeType");
            return (Criteria) this;
        }

        public Criteria andBloodtypeTypeNotBetween(String value1, String value2) {
            addCriterion("bloodType_type not between", value1, value2, "bloodtypeType");
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