package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DescriptionExample() {
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

        public Criteria andDescriptionIdIsNull() {
            addCriterion("description_id is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdIsNotNull() {
            addCriterion("description_id is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdEqualTo(Integer value) {
            addCriterion("description_id =", value, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdNotEqualTo(Integer value) {
            addCriterion("description_id <>", value, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdGreaterThan(Integer value) {
            addCriterion("description_id >", value, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("description_id >=", value, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdLessThan(Integer value) {
            addCriterion("description_id <", value, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("description_id <=", value, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdIn(List<Integer> values) {
            addCriterion("description_id in", values, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdNotIn(List<Integer> values) {
            addCriterion("description_id not in", values, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdBetween(Integer value1, Integer value2) {
            addCriterion("description_id between", value1, value2, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("description_id not between", value1, value2, "descriptionId");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeIsNull() {
            addCriterion("description_inputTime is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeIsNotNull() {
            addCriterion("description_inputTime is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeEqualTo(Date value) {
            addCriterion("description_inputTime =", value, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeNotEqualTo(Date value) {
            addCriterion("description_inputTime <>", value, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeGreaterThan(Date value) {
            addCriterion("description_inputTime >", value, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("description_inputTime >=", value, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeLessThan(Date value) {
            addCriterion("description_inputTime <", value, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeLessThanOrEqualTo(Date value) {
            addCriterion("description_inputTime <=", value, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeIn(List<Date> values) {
            addCriterion("description_inputTime in", values, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeNotIn(List<Date> values) {
            addCriterion("description_inputTime not in", values, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeBetween(Date value1, Date value2) {
            addCriterion("description_inputTime between", value1, value2, "descriptionInputtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionInputtimeNotBetween(Date value1, Date value2) {
            addCriterion("description_inputTime not between", value1, value2, "descriptionInputtime");
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