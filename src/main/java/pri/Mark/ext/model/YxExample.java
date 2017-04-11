package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class YxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YxExample() {
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

        public Criteria andYxIdIsNull() {
            addCriterion("yx_id is null");
            return (Criteria) this;
        }

        public Criteria andYxIdIsNotNull() {
            addCriterion("yx_id is not null");
            return (Criteria) this;
        }

        public Criteria andYxIdEqualTo(Integer value) {
            addCriterion("yx_id =", value, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdNotEqualTo(Integer value) {
            addCriterion("yx_id <>", value, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdGreaterThan(Integer value) {
            addCriterion("yx_id >", value, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yx_id >=", value, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdLessThan(Integer value) {
            addCriterion("yx_id <", value, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdLessThanOrEqualTo(Integer value) {
            addCriterion("yx_id <=", value, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdIn(List<Integer> values) {
            addCriterion("yx_id in", values, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdNotIn(List<Integer> values) {
            addCriterion("yx_id not in", values, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdBetween(Integer value1, Integer value2) {
            addCriterion("yx_id between", value1, value2, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yx_id not between", value1, value2, "yxId");
            return (Criteria) this;
        }

        public Criteria andYxNameIsNull() {
            addCriterion("yx_name is null");
            return (Criteria) this;
        }

        public Criteria andYxNameIsNotNull() {
            addCriterion("yx_name is not null");
            return (Criteria) this;
        }

        public Criteria andYxNameEqualTo(String value) {
            addCriterion("yx_name =", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameNotEqualTo(String value) {
            addCriterion("yx_name <>", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameGreaterThan(String value) {
            addCriterion("yx_name >", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameGreaterThanOrEqualTo(String value) {
            addCriterion("yx_name >=", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameLessThan(String value) {
            addCriterion("yx_name <", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameLessThanOrEqualTo(String value) {
            addCriterion("yx_name <=", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameLike(String value) {
            addCriterion("yx_name like", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameNotLike(String value) {
            addCriterion("yx_name not like", value, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameIn(List<String> values) {
            addCriterion("yx_name in", values, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameNotIn(List<String> values) {
            addCriterion("yx_name not in", values, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameBetween(String value1, String value2) {
            addCriterion("yx_name between", value1, value2, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxNameNotBetween(String value1, String value2) {
            addCriterion("yx_name not between", value1, value2, "yxName");
            return (Criteria) this;
        }

        public Criteria andYxXqIsNull() {
            addCriterion("yx_xq is null");
            return (Criteria) this;
        }

        public Criteria andYxXqIsNotNull() {
            addCriterion("yx_xq is not null");
            return (Criteria) this;
        }

        public Criteria andYxXqEqualTo(Integer value) {
            addCriterion("yx_xq =", value, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqNotEqualTo(Integer value) {
            addCriterion("yx_xq <>", value, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqGreaterThan(Integer value) {
            addCriterion("yx_xq >", value, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqGreaterThanOrEqualTo(Integer value) {
            addCriterion("yx_xq >=", value, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqLessThan(Integer value) {
            addCriterion("yx_xq <", value, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqLessThanOrEqualTo(Integer value) {
            addCriterion("yx_xq <=", value, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqIn(List<Integer> values) {
            addCriterion("yx_xq in", values, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqNotIn(List<Integer> values) {
            addCriterion("yx_xq not in", values, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqBetween(Integer value1, Integer value2) {
            addCriterion("yx_xq between", value1, value2, "yxXq");
            return (Criteria) this;
        }

        public Criteria andYxXqNotBetween(Integer value1, Integer value2) {
            addCriterion("yx_xq not between", value1, value2, "yxXq");
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