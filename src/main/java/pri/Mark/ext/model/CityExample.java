package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
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

        public Criteria andCityEncodingIsNull() {
            addCriterion("city_encoding is null");
            return (Criteria) this;
        }

        public Criteria andCityEncodingIsNotNull() {
            addCriterion("city_encoding is not null");
            return (Criteria) this;
        }

        public Criteria andCityEncodingEqualTo(Integer value) {
            addCriterion("city_encoding =", value, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingNotEqualTo(Integer value) {
            addCriterion("city_encoding <>", value, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingGreaterThan(Integer value) {
            addCriterion("city_encoding >", value, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_encoding >=", value, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingLessThan(Integer value) {
            addCriterion("city_encoding <", value, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingLessThanOrEqualTo(Integer value) {
            addCriterion("city_encoding <=", value, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingIn(List<Integer> values) {
            addCriterion("city_encoding in", values, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingNotIn(List<Integer> values) {
            addCriterion("city_encoding not in", values, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingBetween(Integer value1, Integer value2) {
            addCriterion("city_encoding between", value1, value2, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityEncodingNotBetween(Integer value1, Integer value2) {
            addCriterion("city_encoding not between", value1, value2, "cityEncoding");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIsNull() {
            addCriterion("city_province is null");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIsNotNull() {
            addCriterion("city_province is not null");
            return (Criteria) this;
        }

        public Criteria andCityProvinceEqualTo(Integer value) {
            addCriterion("city_province =", value, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceNotEqualTo(Integer value) {
            addCriterion("city_province <>", value, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceGreaterThan(Integer value) {
            addCriterion("city_province >", value, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_province >=", value, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceLessThan(Integer value) {
            addCriterion("city_province <", value, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("city_province <=", value, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceIn(List<Integer> values) {
            addCriterion("city_province in", values, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceNotIn(List<Integer> values) {
            addCriterion("city_province not in", values, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceBetween(Integer value1, Integer value2) {
            addCriterion("city_province between", value1, value2, "cityProvince");
            return (Criteria) this;
        }

        public Criteria andCityProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("city_province not between", value1, value2, "cityProvince");
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