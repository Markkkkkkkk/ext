package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class ApartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApartmentExample() {
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

        public Criteria andApartmentIdIsNull() {
            addCriterion("apartment_id is null");
            return (Criteria) this;
        }

        public Criteria andApartmentIdIsNotNull() {
            addCriterion("apartment_id is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentIdEqualTo(Integer value) {
            addCriterion("apartment_id =", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdNotEqualTo(Integer value) {
            addCriterion("apartment_id <>", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdGreaterThan(Integer value) {
            addCriterion("apartment_id >", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apartment_id >=", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdLessThan(Integer value) {
            addCriterion("apartment_id <", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("apartment_id <=", value, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdIn(List<Integer> values) {
            addCriterion("apartment_id in", values, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdNotIn(List<Integer> values) {
            addCriterion("apartment_id not in", values, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("apartment_id between", value1, value2, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apartment_id not between", value1, value2, "apartmentId");
            return (Criteria) this;
        }

        public Criteria andApartmentYxIsNull() {
            addCriterion("apartment_yx is null");
            return (Criteria) this;
        }

        public Criteria andApartmentYxIsNotNull() {
            addCriterion("apartment_yx is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentYxEqualTo(Integer value) {
            addCriterion("apartment_yx =", value, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxNotEqualTo(Integer value) {
            addCriterion("apartment_yx <>", value, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxGreaterThan(Integer value) {
            addCriterion("apartment_yx >", value, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxGreaterThanOrEqualTo(Integer value) {
            addCriterion("apartment_yx >=", value, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxLessThan(Integer value) {
            addCriterion("apartment_yx <", value, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxLessThanOrEqualTo(Integer value) {
            addCriterion("apartment_yx <=", value, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxIn(List<Integer> values) {
            addCriterion("apartment_yx in", values, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxNotIn(List<Integer> values) {
            addCriterion("apartment_yx not in", values, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxBetween(Integer value1, Integer value2) {
            addCriterion("apartment_yx between", value1, value2, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentYxNotBetween(Integer value1, Integer value2) {
            addCriterion("apartment_yx not between", value1, value2, "apartmentYx");
            return (Criteria) this;
        }

        public Criteria andApartmentNameIsNull() {
            addCriterion("apartment_name is null");
            return (Criteria) this;
        }

        public Criteria andApartmentNameIsNotNull() {
            addCriterion("apartment_name is not null");
            return (Criteria) this;
        }

        public Criteria andApartmentNameEqualTo(String value) {
            addCriterion("apartment_name =", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotEqualTo(String value) {
            addCriterion("apartment_name <>", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameGreaterThan(String value) {
            addCriterion("apartment_name >", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("apartment_name >=", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameLessThan(String value) {
            addCriterion("apartment_name <", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameLessThanOrEqualTo(String value) {
            addCriterion("apartment_name <=", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameLike(String value) {
            addCriterion("apartment_name like", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotLike(String value) {
            addCriterion("apartment_name not like", value, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameIn(List<String> values) {
            addCriterion("apartment_name in", values, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotIn(List<String> values) {
            addCriterion("apartment_name not in", values, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameBetween(String value1, String value2) {
            addCriterion("apartment_name between", value1, value2, "apartmentName");
            return (Criteria) this;
        }

        public Criteria andApartmentNameNotBetween(String value1, String value2) {
            addCriterion("apartment_name not between", value1, value2, "apartmentName");
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