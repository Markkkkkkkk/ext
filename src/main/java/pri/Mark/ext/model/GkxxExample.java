package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class GkxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GkxxExample() {
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

        public Criteria andGkxxIdIsNull() {
            addCriterion("gkxx_id is null");
            return (Criteria) this;
        }

        public Criteria andGkxxIdIsNotNull() {
            addCriterion("gkxx_id is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxIdEqualTo(Integer value) {
            addCriterion("gkxx_id =", value, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdNotEqualTo(Integer value) {
            addCriterion("gkxx_id <>", value, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdGreaterThan(Integer value) {
            addCriterion("gkxx_id >", value, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gkxx_id >=", value, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdLessThan(Integer value) {
            addCriterion("gkxx_id <", value, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdLessThanOrEqualTo(Integer value) {
            addCriterion("gkxx_id <=", value, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdIn(List<Integer> values) {
            addCriterion("gkxx_id in", values, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdNotIn(List<Integer> values) {
            addCriterion("gkxx_id not in", values, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_id between", value1, value2, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_id not between", value1, value2, "gkxxId");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzIsNull() {
            addCriterion("gkxx_wyyz is null");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzIsNotNull() {
            addCriterion("gkxx_wyyz is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzEqualTo(Integer value) {
            addCriterion("gkxx_wyyz =", value, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzNotEqualTo(Integer value) {
            addCriterion("gkxx_wyyz <>", value, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzGreaterThan(Integer value) {
            addCriterion("gkxx_wyyz >", value, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzGreaterThanOrEqualTo(Integer value) {
            addCriterion("gkxx_wyyz >=", value, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzLessThan(Integer value) {
            addCriterion("gkxx_wyyz <", value, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzLessThanOrEqualTo(Integer value) {
            addCriterion("gkxx_wyyz <=", value, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzIn(List<Integer> values) {
            addCriterion("gkxx_wyyz in", values, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzNotIn(List<Integer> values) {
            addCriterion("gkxx_wyyz not in", values, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_wyyz between", value1, value2, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxWyyzNotBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_wyyz not between", value1, value2, "gkxxWyyz");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjIsNull() {
            addCriterion("gkxx_tdcj is null");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjIsNotNull() {
            addCriterion("gkxx_tdcj is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjEqualTo(Double value) {
            addCriterion("gkxx_tdcj =", value, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjNotEqualTo(Double value) {
            addCriterion("gkxx_tdcj <>", value, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjGreaterThan(Double value) {
            addCriterion("gkxx_tdcj >", value, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjGreaterThanOrEqualTo(Double value) {
            addCriterion("gkxx_tdcj >=", value, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjLessThan(Double value) {
            addCriterion("gkxx_tdcj <", value, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjLessThanOrEqualTo(Double value) {
            addCriterion("gkxx_tdcj <=", value, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjIn(List<Double> values) {
            addCriterion("gkxx_tdcj in", values, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjNotIn(List<Double> values) {
            addCriterion("gkxx_tdcj not in", values, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjBetween(Double value1, Double value2) {
            addCriterion("gkxx_tdcj between", value1, value2, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdcjNotBetween(Double value1, Double value2) {
            addCriterion("gkxx_tdcj not between", value1, value2, "gkxxTdcj");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyIsNull() {
            addCriterion("gkxx_tdzy is null");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyIsNotNull() {
            addCriterion("gkxx_tdzy is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyEqualTo(String value) {
            addCriterion("gkxx_tdzy =", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyNotEqualTo(String value) {
            addCriterion("gkxx_tdzy <>", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyGreaterThan(String value) {
            addCriterion("gkxx_tdzy >", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyGreaterThanOrEqualTo(String value) {
            addCriterion("gkxx_tdzy >=", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyLessThan(String value) {
            addCriterion("gkxx_tdzy <", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyLessThanOrEqualTo(String value) {
            addCriterion("gkxx_tdzy <=", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyLike(String value) {
            addCriterion("gkxx_tdzy like", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyNotLike(String value) {
            addCriterion("gkxx_tdzy not like", value, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyIn(List<String> values) {
            addCriterion("gkxx_tdzy in", values, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyNotIn(List<String> values) {
            addCriterion("gkxx_tdzy not in", values, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyBetween(String value1, String value2) {
            addCriterion("gkxx_tdzy between", value1, value2, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxTdzyNotBetween(String value1, String value2) {
            addCriterion("gkxx_tdzy not between", value1, value2, "gkxxTdzy");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbIsNull() {
            addCriterion("gkxx_kslb is null");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbIsNotNull() {
            addCriterion("gkxx_kslb is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbEqualTo(Integer value) {
            addCriterion("gkxx_kslb =", value, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbNotEqualTo(Integer value) {
            addCriterion("gkxx_kslb <>", value, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbGreaterThan(Integer value) {
            addCriterion("gkxx_kslb >", value, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbGreaterThanOrEqualTo(Integer value) {
            addCriterion("gkxx_kslb >=", value, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbLessThan(Integer value) {
            addCriterion("gkxx_kslb <", value, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbLessThanOrEqualTo(Integer value) {
            addCriterion("gkxx_kslb <=", value, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbIn(List<Integer> values) {
            addCriterion("gkxx_kslb in", values, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbNotIn(List<Integer> values) {
            addCriterion("gkxx_kslb not in", values, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_kslb between", value1, value2, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxKslbNotBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_kslb not between", value1, value2, "gkxxKslb");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrIsNull() {
            addCriterion("gkxx_sjr is null");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrIsNotNull() {
            addCriterion("gkxx_sjr is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrEqualTo(String value) {
            addCriterion("gkxx_sjr =", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrNotEqualTo(String value) {
            addCriterion("gkxx_sjr <>", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrGreaterThan(String value) {
            addCriterion("gkxx_sjr >", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrGreaterThanOrEqualTo(String value) {
            addCriterion("gkxx_sjr >=", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrLessThan(String value) {
            addCriterion("gkxx_sjr <", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrLessThanOrEqualTo(String value) {
            addCriterion("gkxx_sjr <=", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrLike(String value) {
            addCriterion("gkxx_sjr like", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrNotLike(String value) {
            addCriterion("gkxx_sjr not like", value, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrIn(List<String> values) {
            addCriterion("gkxx_sjr in", values, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrNotIn(List<String> values) {
            addCriterion("gkxx_sjr not in", values, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrBetween(String value1, String value2) {
            addCriterion("gkxx_sjr between", value1, value2, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxSjrNotBetween(String value1, String value2) {
            addCriterion("gkxx_sjr not between", value1, value2, "gkxxSjr");
            return (Criteria) this;
        }

        public Criteria andGkxxKlIsNull() {
            addCriterion("gkxx_kl is null");
            return (Criteria) this;
        }

        public Criteria andGkxxKlIsNotNull() {
            addCriterion("gkxx_kl is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxKlEqualTo(String value) {
            addCriterion("gkxx_kl =", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlNotEqualTo(String value) {
            addCriterion("gkxx_kl <>", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlGreaterThan(String value) {
            addCriterion("gkxx_kl >", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlGreaterThanOrEqualTo(String value) {
            addCriterion("gkxx_kl >=", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlLessThan(String value) {
            addCriterion("gkxx_kl <", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlLessThanOrEqualTo(String value) {
            addCriterion("gkxx_kl <=", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlLike(String value) {
            addCriterion("gkxx_kl like", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlNotLike(String value) {
            addCriterion("gkxx_kl not like", value, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlIn(List<String> values) {
            addCriterion("gkxx_kl in", values, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlNotIn(List<String> values) {
            addCriterion("gkxx_kl not in", values, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlBetween(String value1, String value2) {
            addCriterion("gkxx_kl between", value1, value2, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKlNotBetween(String value1, String value2) {
            addCriterion("gkxx_kl not between", value1, value2, "gkxxKl");
            return (Criteria) this;
        }

        public Criteria andGkxxKshIsNull() {
            addCriterion("gkxx_ksh is null");
            return (Criteria) this;
        }

        public Criteria andGkxxKshIsNotNull() {
            addCriterion("gkxx_ksh is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxKshEqualTo(String value) {
            addCriterion("gkxx_ksh =", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshNotEqualTo(String value) {
            addCriterion("gkxx_ksh <>", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshGreaterThan(String value) {
            addCriterion("gkxx_ksh >", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshGreaterThanOrEqualTo(String value) {
            addCriterion("gkxx_ksh >=", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshLessThan(String value) {
            addCriterion("gkxx_ksh <", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshLessThanOrEqualTo(String value) {
            addCriterion("gkxx_ksh <=", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshLike(String value) {
            addCriterion("gkxx_ksh like", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshNotLike(String value) {
            addCriterion("gkxx_ksh not like", value, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshIn(List<String> values) {
            addCriterion("gkxx_ksh in", values, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshNotIn(List<String> values) {
            addCriterion("gkxx_ksh not in", values, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshBetween(String value1, String value2) {
            addCriterion("gkxx_ksh between", value1, value2, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxKshNotBetween(String value1, String value2) {
            addCriterion("gkxx_ksh not between", value1, value2, "gkxxKsh");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcIsNull() {
            addCriterion("gkxx_zxmc is null");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcIsNotNull() {
            addCriterion("gkxx_zxmc is not null");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcEqualTo(Integer value) {
            addCriterion("gkxx_zxmc =", value, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcNotEqualTo(Integer value) {
            addCriterion("gkxx_zxmc <>", value, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcGreaterThan(Integer value) {
            addCriterion("gkxx_zxmc >", value, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcGreaterThanOrEqualTo(Integer value) {
            addCriterion("gkxx_zxmc >=", value, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcLessThan(Integer value) {
            addCriterion("gkxx_zxmc <", value, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcLessThanOrEqualTo(Integer value) {
            addCriterion("gkxx_zxmc <=", value, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcIn(List<Integer> values) {
            addCriterion("gkxx_zxmc in", values, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcNotIn(List<Integer> values) {
            addCriterion("gkxx_zxmc not in", values, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_zxmc between", value1, value2, "gkxxZxmc");
            return (Criteria) this;
        }

        public Criteria andGkxxZxmcNotBetween(Integer value1, Integer value2) {
            addCriterion("gkxx_zxmc not between", value1, value2, "gkxxZxmc");
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