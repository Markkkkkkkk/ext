package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class ZzmmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZzmmExample() {
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

        public Criteria andZzmmIdIsNull() {
            addCriterion("zzmm_id is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIdIsNotNull() {
            addCriterion("zzmm_id is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmIdEqualTo(Integer value) {
            addCriterion("zzmm_id =", value, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdNotEqualTo(Integer value) {
            addCriterion("zzmm_id <>", value, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdGreaterThan(Integer value) {
            addCriterion("zzmm_id >", value, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zzmm_id >=", value, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdLessThan(Integer value) {
            addCriterion("zzmm_id <", value, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdLessThanOrEqualTo(Integer value) {
            addCriterion("zzmm_id <=", value, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdIn(List<Integer> values) {
            addCriterion("zzmm_id in", values, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdNotIn(List<Integer> values) {
            addCriterion("zzmm_id not in", values, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdBetween(Integer value1, Integer value2) {
            addCriterion("zzmm_id between", value1, value2, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zzmm_id not between", value1, value2, "zzmmId");
            return (Criteria) this;
        }

        public Criteria andZzmmNameIsNull() {
            addCriterion("zzmm_name is null");
            return (Criteria) this;
        }

        public Criteria andZzmmNameIsNotNull() {
            addCriterion("zzmm_name is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmNameEqualTo(String value) {
            addCriterion("zzmm_name =", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameNotEqualTo(String value) {
            addCriterion("zzmm_name <>", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameGreaterThan(String value) {
            addCriterion("zzmm_name >", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm_name >=", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameLessThan(String value) {
            addCriterion("zzmm_name <", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameLessThanOrEqualTo(String value) {
            addCriterion("zzmm_name <=", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameLike(String value) {
            addCriterion("zzmm_name like", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameNotLike(String value) {
            addCriterion("zzmm_name not like", value, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameIn(List<String> values) {
            addCriterion("zzmm_name in", values, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameNotIn(List<String> values) {
            addCriterion("zzmm_name not in", values, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameBetween(String value1, String value2) {
            addCriterion("zzmm_name between", value1, value2, "zzmmName");
            return (Criteria) this;
        }

        public Criteria andZzmmNameNotBetween(String value1, String value2) {
            addCriterion("zzmm_name not between", value1, value2, "zzmmName");
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