package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressDqIsNull() {
            addCriterion("address_dq is null");
            return (Criteria) this;
        }

        public Criteria andAddressDqIsNotNull() {
            addCriterion("address_dq is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDqEqualTo(Integer value) {
            addCriterion("address_dq =", value, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqNotEqualTo(Integer value) {
            addCriterion("address_dq <>", value, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqGreaterThan(Integer value) {
            addCriterion("address_dq >", value, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_dq >=", value, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqLessThan(Integer value) {
            addCriterion("address_dq <", value, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqLessThanOrEqualTo(Integer value) {
            addCriterion("address_dq <=", value, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqIn(List<Integer> values) {
            addCriterion("address_dq in", values, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqNotIn(List<Integer> values) {
            addCriterion("address_dq not in", values, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqBetween(Integer value1, Integer value2) {
            addCriterion("address_dq between", value1, value2, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressDqNotBetween(Integer value1, Integer value2) {
            addCriterion("address_dq not between", value1, value2, "addressDq");
            return (Criteria) this;
        }

        public Criteria andAddressNativeIsNull() {
            addCriterion("address_native is null");
            return (Criteria) this;
        }

        public Criteria andAddressNativeIsNotNull() {
            addCriterion("address_native is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNativeEqualTo(Integer value) {
            addCriterion("address_native =", value, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeNotEqualTo(Integer value) {
            addCriterion("address_native <>", value, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeGreaterThan(Integer value) {
            addCriterion("address_native >", value, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_native >=", value, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeLessThan(Integer value) {
            addCriterion("address_native <", value, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeLessThanOrEqualTo(Integer value) {
            addCriterion("address_native <=", value, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeIn(List<Integer> values) {
            addCriterion("address_native in", values, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeNotIn(List<Integer> values) {
            addCriterion("address_native not in", values, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeBetween(Integer value1, Integer value2) {
            addCriterion("address_native between", value1, value2, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNativeNotBetween(Integer value1, Integer value2) {
            addCriterion("address_native not between", value1, value2, "addressNative");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressIsNull() {
            addCriterion("address_nowAddress is null");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressIsNotNull() {
            addCriterion("address_nowAddress is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressEqualTo(Integer value) {
            addCriterion("address_nowAddress =", value, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressNotEqualTo(Integer value) {
            addCriterion("address_nowAddress <>", value, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressGreaterThan(Integer value) {
            addCriterion("address_nowAddress >", value, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_nowAddress >=", value, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressLessThan(Integer value) {
            addCriterion("address_nowAddress <", value, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressLessThanOrEqualTo(Integer value) {
            addCriterion("address_nowAddress <=", value, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressIn(List<Integer> values) {
            addCriterion("address_nowAddress in", values, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressNotIn(List<Integer> values) {
            addCriterion("address_nowAddress not in", values, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressBetween(Integer value1, Integer value2) {
            addCriterion("address_nowAddress between", value1, value2, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressNowaddressNotBetween(Integer value1, Integer value2) {
            addCriterion("address_nowAddress not between", value1, value2, "addressNowaddress");
            return (Criteria) this;
        }

        public Criteria andAddressHjIsNull() {
            addCriterion("address_hj is null");
            return (Criteria) this;
        }

        public Criteria andAddressHjIsNotNull() {
            addCriterion("address_hj is not null");
            return (Criteria) this;
        }

        public Criteria andAddressHjEqualTo(Integer value) {
            addCriterion("address_hj =", value, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjNotEqualTo(Integer value) {
            addCriterion("address_hj <>", value, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjGreaterThan(Integer value) {
            addCriterion("address_hj >", value, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_hj >=", value, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjLessThan(Integer value) {
            addCriterion("address_hj <", value, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjLessThanOrEqualTo(Integer value) {
            addCriterion("address_hj <=", value, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjIn(List<Integer> values) {
            addCriterion("address_hj in", values, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjNotIn(List<Integer> values) {
            addCriterion("address_hj not in", values, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjBetween(Integer value1, Integer value2) {
            addCriterion("address_hj between", value1, value2, "addressHj");
            return (Criteria) this;
        }

        public Criteria andAddressHjNotBetween(Integer value1, Integer value2) {
            addCriterion("address_hj not between", value1, value2, "addressHj");
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