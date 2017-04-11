package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class ShuoshuolikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShuoshuolikeExample() {
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

        public Criteria andShuoshuolikeIdIsNull() {
            addCriterion("shuoshuoLike_id is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdIsNotNull() {
            addCriterion("shuoshuoLike_id is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdEqualTo(Integer value) {
            addCriterion("shuoshuoLike_id =", value, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdNotEqualTo(Integer value) {
            addCriterion("shuoshuoLike_id <>", value, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdGreaterThan(Integer value) {
            addCriterion("shuoshuoLike_id >", value, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoLike_id >=", value, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdLessThan(Integer value) {
            addCriterion("shuoshuoLike_id <", value, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoLike_id <=", value, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdIn(List<Integer> values) {
            addCriterion("shuoshuoLike_id in", values, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdNotIn(List<Integer> values) {
            addCriterion("shuoshuoLike_id not in", values, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoLike_id between", value1, value2, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoLike_id not between", value1, value2, "shuoshuolikeId");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerIsNull() {
            addCriterion("shuoshuoLike_liker is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerIsNotNull() {
            addCriterion("shuoshuoLike_liker is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerEqualTo(String value) {
            addCriterion("shuoshuoLike_liker =", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerNotEqualTo(String value) {
            addCriterion("shuoshuoLike_liker <>", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerGreaterThan(String value) {
            addCriterion("shuoshuoLike_liker >", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerGreaterThanOrEqualTo(String value) {
            addCriterion("shuoshuoLike_liker >=", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerLessThan(String value) {
            addCriterion("shuoshuoLike_liker <", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerLessThanOrEqualTo(String value) {
            addCriterion("shuoshuoLike_liker <=", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerLike(String value) {
            addCriterion("shuoshuoLike_liker like", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerNotLike(String value) {
            addCriterion("shuoshuoLike_liker not like", value, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerIn(List<String> values) {
            addCriterion("shuoshuoLike_liker in", values, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerNotIn(List<String> values) {
            addCriterion("shuoshuoLike_liker not in", values, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerBetween(String value1, String value2) {
            addCriterion("shuoshuoLike_liker between", value1, value2, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeLikerNotBetween(String value1, String value2) {
            addCriterion("shuoshuoLike_liker not between", value1, value2, "shuoshuolikeLiker");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoIsNull() {
            addCriterion("shuoshuoLike_shuoshuo is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoIsNotNull() {
            addCriterion("shuoshuoLike_shuoshuo is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoEqualTo(Integer value) {
            addCriterion("shuoshuoLike_shuoshuo =", value, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoNotEqualTo(Integer value) {
            addCriterion("shuoshuoLike_shuoshuo <>", value, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoGreaterThan(Integer value) {
            addCriterion("shuoshuoLike_shuoshuo >", value, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoLike_shuoshuo >=", value, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoLessThan(Integer value) {
            addCriterion("shuoshuoLike_shuoshuo <", value, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoLike_shuoshuo <=", value, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoIn(List<Integer> values) {
            addCriterion("shuoshuoLike_shuoshuo in", values, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoNotIn(List<Integer> values) {
            addCriterion("shuoshuoLike_shuoshuo not in", values, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoLike_shuoshuo between", value1, value2, "shuoshuolikeShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuolikeShuoshuoNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoLike_shuoshuo not between", value1, value2, "shuoshuolikeShuoshuo");
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