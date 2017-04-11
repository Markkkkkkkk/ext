package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class IdcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdcardExample() {
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

        public Criteria andIdcardIdIsNull() {
            addCriterion("idCard_id is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIdIsNotNull() {
            addCriterion("idCard_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardIdEqualTo(Integer value) {
            addCriterion("idCard_id =", value, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdNotEqualTo(Integer value) {
            addCriterion("idCard_id <>", value, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdGreaterThan(Integer value) {
            addCriterion("idCard_id >", value, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("idCard_id >=", value, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdLessThan(Integer value) {
            addCriterion("idCard_id <", value, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdLessThanOrEqualTo(Integer value) {
            addCriterion("idCard_id <=", value, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdIn(List<Integer> values) {
            addCriterion("idCard_id in", values, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdNotIn(List<Integer> values) {
            addCriterion("idCard_id not in", values, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdBetween(Integer value1, Integer value2) {
            addCriterion("idCard_id between", value1, value2, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("idCard_id not between", value1, value2, "idcardId");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceIsNull() {
            addCriterion("idCard_balance is null");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceIsNotNull() {
            addCriterion("idCard_balance is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceEqualTo(Integer value) {
            addCriterion("idCard_balance =", value, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceNotEqualTo(Integer value) {
            addCriterion("idCard_balance <>", value, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceGreaterThan(Integer value) {
            addCriterion("idCard_balance >", value, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("idCard_balance >=", value, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceLessThan(Integer value) {
            addCriterion("idCard_balance <", value, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("idCard_balance <=", value, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceIn(List<Integer> values) {
            addCriterion("idCard_balance in", values, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceNotIn(List<Integer> values) {
            addCriterion("idCard_balance not in", values, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceBetween(Integer value1, Integer value2) {
            addCriterion("idCard_balance between", value1, value2, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("idCard_balance not between", value1, value2, "idcardBalance");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNull() {
            addCriterion("idCard_number is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNotNull() {
            addCriterion("idCard_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberEqualTo(String value) {
            addCriterion("idCard_number =", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotEqualTo(String value) {
            addCriterion("idCard_number <>", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThan(String value) {
            addCriterion("idCard_number >", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("idCard_number >=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThan(String value) {
            addCriterion("idCard_number <", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("idCard_number <=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLike(String value) {
            addCriterion("idCard_number like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotLike(String value) {
            addCriterion("idCard_number not like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIn(List<String> values) {
            addCriterion("idCard_number in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotIn(List<String> values) {
            addCriterion("idCard_number not in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberBetween(String value1, String value2) {
            addCriterion("idCard_number between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("idCard_number not between", value1, value2, "idcardNumber");
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