package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class LoantypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoantypeExample() {
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

        public Criteria andLoantypeIdIsNull() {
            addCriterion("loanType_id is null");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdIsNotNull() {
            addCriterion("loanType_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdEqualTo(Integer value) {
            addCriterion("loanType_id =", value, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdNotEqualTo(Integer value) {
            addCriterion("loanType_id <>", value, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdGreaterThan(Integer value) {
            addCriterion("loanType_id >", value, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loanType_id >=", value, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdLessThan(Integer value) {
            addCriterion("loanType_id <", value, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("loanType_id <=", value, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdIn(List<Integer> values) {
            addCriterion("loanType_id in", values, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdNotIn(List<Integer> values) {
            addCriterion("loanType_id not in", values, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdBetween(Integer value1, Integer value2) {
            addCriterion("loanType_id between", value1, value2, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loanType_id not between", value1, value2, "loantypeId");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeIsNull() {
            addCriterion("loanType_type is null");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeIsNotNull() {
            addCriterion("loanType_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeEqualTo(String value) {
            addCriterion("loanType_type =", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeNotEqualTo(String value) {
            addCriterion("loanType_type <>", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeGreaterThan(String value) {
            addCriterion("loanType_type >", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("loanType_type >=", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeLessThan(String value) {
            addCriterion("loanType_type <", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeLessThanOrEqualTo(String value) {
            addCriterion("loanType_type <=", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeLike(String value) {
            addCriterion("loanType_type like", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeNotLike(String value) {
            addCriterion("loanType_type not like", value, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeIn(List<String> values) {
            addCriterion("loanType_type in", values, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeNotIn(List<String> values) {
            addCriterion("loanType_type not in", values, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeBetween(String value1, String value2) {
            addCriterion("loanType_type between", value1, value2, "loantypeType");
            return (Criteria) this;
        }

        public Criteria andLoantypeTypeNotBetween(String value1, String value2) {
            addCriterion("loanType_type not between", value1, value2, "loantypeType");
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