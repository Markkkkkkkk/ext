package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class ReligionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReligionExample() {
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

        public Criteria andReligionIdIsNull() {
            addCriterion("religion_id is null");
            return (Criteria) this;
        }

        public Criteria andReligionIdIsNotNull() {
            addCriterion("religion_id is not null");
            return (Criteria) this;
        }

        public Criteria andReligionIdEqualTo(Integer value) {
            addCriterion("religion_id =", value, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdNotEqualTo(Integer value) {
            addCriterion("religion_id <>", value, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdGreaterThan(Integer value) {
            addCriterion("religion_id >", value, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("religion_id >=", value, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdLessThan(Integer value) {
            addCriterion("religion_id <", value, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdLessThanOrEqualTo(Integer value) {
            addCriterion("religion_id <=", value, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdIn(List<Integer> values) {
            addCriterion("religion_id in", values, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdNotIn(List<Integer> values) {
            addCriterion("religion_id not in", values, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdBetween(Integer value1, Integer value2) {
            addCriterion("religion_id between", value1, value2, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("religion_id not between", value1, value2, "religionId");
            return (Criteria) this;
        }

        public Criteria andReligionNameIsNull() {
            addCriterion("religion_name is null");
            return (Criteria) this;
        }

        public Criteria andReligionNameIsNotNull() {
            addCriterion("religion_name is not null");
            return (Criteria) this;
        }

        public Criteria andReligionNameEqualTo(String value) {
            addCriterion("religion_name =", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameNotEqualTo(String value) {
            addCriterion("religion_name <>", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameGreaterThan(String value) {
            addCriterion("religion_name >", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameGreaterThanOrEqualTo(String value) {
            addCriterion("religion_name >=", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameLessThan(String value) {
            addCriterion("religion_name <", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameLessThanOrEqualTo(String value) {
            addCriterion("religion_name <=", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameLike(String value) {
            addCriterion("religion_name like", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameNotLike(String value) {
            addCriterion("religion_name not like", value, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameIn(List<String> values) {
            addCriterion("religion_name in", values, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameNotIn(List<String> values) {
            addCriterion("religion_name not in", values, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameBetween(String value1, String value2) {
            addCriterion("religion_name between", value1, value2, "religionName");
            return (Criteria) this;
        }

        public Criteria andReligionNameNotBetween(String value1, String value2) {
            addCriterion("religion_name not between", value1, value2, "religionName");
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