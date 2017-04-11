package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class IdentitytypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdentitytypeExample() {
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

        public Criteria andIdentitytypeIdIsNull() {
            addCriterion("identityType_id is null");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdIsNotNull() {
            addCriterion("identityType_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdEqualTo(Integer value) {
            addCriterion("identityType_id =", value, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdNotEqualTo(Integer value) {
            addCriterion("identityType_id <>", value, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdGreaterThan(Integer value) {
            addCriterion("identityType_id >", value, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("identityType_id >=", value, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdLessThan(Integer value) {
            addCriterion("identityType_id <", value, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("identityType_id <=", value, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdIn(List<Integer> values) {
            addCriterion("identityType_id in", values, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdNotIn(List<Integer> values) {
            addCriterion("identityType_id not in", values, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdBetween(Integer value1, Integer value2) {
            addCriterion("identityType_id between", value1, value2, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("identityType_id not between", value1, value2, "identitytypeId");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeIsNull() {
            addCriterion("identityTyp_type is null");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeIsNotNull() {
            addCriterion("identityTyp_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeEqualTo(String value) {
            addCriterion("identityTyp_type =", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeNotEqualTo(String value) {
            addCriterion("identityTyp_type <>", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeGreaterThan(String value) {
            addCriterion("identityTyp_type >", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeGreaterThanOrEqualTo(String value) {
            addCriterion("identityTyp_type >=", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeLessThan(String value) {
            addCriterion("identityTyp_type <", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeLessThanOrEqualTo(String value) {
            addCriterion("identityTyp_type <=", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeLike(String value) {
            addCriterion("identityTyp_type like", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeNotLike(String value) {
            addCriterion("identityTyp_type not like", value, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeIn(List<String> values) {
            addCriterion("identityTyp_type in", values, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeNotIn(List<String> values) {
            addCriterion("identityTyp_type not in", values, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeBetween(String value1, String value2) {
            addCriterion("identityTyp_type between", value1, value2, "identitytypType");
            return (Criteria) this;
        }

        public Criteria andIdentitytypTypeNotBetween(String value1, String value2) {
            addCriterion("identityTyp_type not between", value1, value2, "identitytypType");
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