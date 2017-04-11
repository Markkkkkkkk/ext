package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class TownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TownExample() {
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

        public Criteria andTownEncodingIsNull() {
            addCriterion("town_encoding is null");
            return (Criteria) this;
        }

        public Criteria andTownEncodingIsNotNull() {
            addCriterion("town_encoding is not null");
            return (Criteria) this;
        }

        public Criteria andTownEncodingEqualTo(Integer value) {
            addCriterion("town_encoding =", value, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingNotEqualTo(Integer value) {
            addCriterion("town_encoding <>", value, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingGreaterThan(Integer value) {
            addCriterion("town_encoding >", value, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingGreaterThanOrEqualTo(Integer value) {
            addCriterion("town_encoding >=", value, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingLessThan(Integer value) {
            addCriterion("town_encoding <", value, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingLessThanOrEqualTo(Integer value) {
            addCriterion("town_encoding <=", value, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingIn(List<Integer> values) {
            addCriterion("town_encoding in", values, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingNotIn(List<Integer> values) {
            addCriterion("town_encoding not in", values, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingBetween(Integer value1, Integer value2) {
            addCriterion("town_encoding between", value1, value2, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownEncodingNotBetween(Integer value1, Integer value2) {
            addCriterion("town_encoding not between", value1, value2, "townEncoding");
            return (Criteria) this;
        }

        public Criteria andTownNameIsNull() {
            addCriterion("town_name is null");
            return (Criteria) this;
        }

        public Criteria andTownNameIsNotNull() {
            addCriterion("town_name is not null");
            return (Criteria) this;
        }

        public Criteria andTownNameEqualTo(String value) {
            addCriterion("town_name =", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameNotEqualTo(String value) {
            addCriterion("town_name <>", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameGreaterThan(String value) {
            addCriterion("town_name >", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameGreaterThanOrEqualTo(String value) {
            addCriterion("town_name >=", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameLessThan(String value) {
            addCriterion("town_name <", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameLessThanOrEqualTo(String value) {
            addCriterion("town_name <=", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameLike(String value) {
            addCriterion("town_name like", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameNotLike(String value) {
            addCriterion("town_name not like", value, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameIn(List<String> values) {
            addCriterion("town_name in", values, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameNotIn(List<String> values) {
            addCriterion("town_name not in", values, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameBetween(String value1, String value2) {
            addCriterion("town_name between", value1, value2, "townName");
            return (Criteria) this;
        }

        public Criteria andTownNameNotBetween(String value1, String value2) {
            addCriterion("town_name not between", value1, value2, "townName");
            return (Criteria) this;
        }

        public Criteria andTownCityIsNull() {
            addCriterion("town_city is null");
            return (Criteria) this;
        }

        public Criteria andTownCityIsNotNull() {
            addCriterion("town_city is not null");
            return (Criteria) this;
        }

        public Criteria andTownCityEqualTo(Integer value) {
            addCriterion("town_city =", value, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityNotEqualTo(Integer value) {
            addCriterion("town_city <>", value, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityGreaterThan(Integer value) {
            addCriterion("town_city >", value, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("town_city >=", value, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityLessThan(Integer value) {
            addCriterion("town_city <", value, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityLessThanOrEqualTo(Integer value) {
            addCriterion("town_city <=", value, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityIn(List<Integer> values) {
            addCriterion("town_city in", values, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityNotIn(List<Integer> values) {
            addCriterion("town_city not in", values, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityBetween(Integer value1, Integer value2) {
            addCriterion("town_city between", value1, value2, "townCity");
            return (Criteria) this;
        }

        public Criteria andTownCityNotBetween(Integer value1, Integer value2) {
            addCriterion("town_city not between", value1, value2, "townCity");
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