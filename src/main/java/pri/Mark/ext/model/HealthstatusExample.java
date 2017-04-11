package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class HealthstatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HealthstatusExample() {
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

        public Criteria andHealthstatusIdIsNull() {
            addCriterion("healthStatus_id is null");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdIsNotNull() {
            addCriterion("healthStatus_id is not null");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdEqualTo(Integer value) {
            addCriterion("healthStatus_id =", value, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdNotEqualTo(Integer value) {
            addCriterion("healthStatus_id <>", value, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdGreaterThan(Integer value) {
            addCriterion("healthStatus_id >", value, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("healthStatus_id >=", value, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdLessThan(Integer value) {
            addCriterion("healthStatus_id <", value, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("healthStatus_id <=", value, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdIn(List<Integer> values) {
            addCriterion("healthStatus_id in", values, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdNotIn(List<Integer> values) {
            addCriterion("healthStatus_id not in", values, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdBetween(Integer value1, Integer value2) {
            addCriterion("healthStatus_id between", value1, value2, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("healthStatus_id not between", value1, value2, "healthstatusId");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeIsNull() {
            addCriterion("healthStatus_type is null");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeIsNotNull() {
            addCriterion("healthStatus_type is not null");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeEqualTo(String value) {
            addCriterion("healthStatus_type =", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeNotEqualTo(String value) {
            addCriterion("healthStatus_type <>", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeGreaterThan(String value) {
            addCriterion("healthStatus_type >", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("healthStatus_type >=", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeLessThan(String value) {
            addCriterion("healthStatus_type <", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeLessThanOrEqualTo(String value) {
            addCriterion("healthStatus_type <=", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeLike(String value) {
            addCriterion("healthStatus_type like", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeNotLike(String value) {
            addCriterion("healthStatus_type not like", value, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeIn(List<String> values) {
            addCriterion("healthStatus_type in", values, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeNotIn(List<String> values) {
            addCriterion("healthStatus_type not in", values, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeBetween(String value1, String value2) {
            addCriterion("healthStatus_type between", value1, value2, "healthstatusType");
            return (Criteria) this;
        }

        public Criteria andHealthstatusTypeNotBetween(String value1, String value2) {
            addCriterion("healthStatus_type not between", value1, value2, "healthstatusType");
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