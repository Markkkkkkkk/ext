package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class HighschoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HighschoolExample() {
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

        public Criteria andHighschoolIdIsNull() {
            addCriterion("highSchool_id is null");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdIsNotNull() {
            addCriterion("highSchool_id is not null");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdEqualTo(Integer value) {
            addCriterion("highSchool_id =", value, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdNotEqualTo(Integer value) {
            addCriterion("highSchool_id <>", value, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdGreaterThan(Integer value) {
            addCriterion("highSchool_id >", value, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("highSchool_id >=", value, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdLessThan(Integer value) {
            addCriterion("highSchool_id <", value, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("highSchool_id <=", value, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdIn(List<Integer> values) {
            addCriterion("highSchool_id in", values, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdNotIn(List<Integer> values) {
            addCriterion("highSchool_id not in", values, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdBetween(Integer value1, Integer value2) {
            addCriterion("highSchool_id between", value1, value2, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("highSchool_id not between", value1, value2, "highschoolId");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameIsNull() {
            addCriterion("highSchool_name is null");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameIsNotNull() {
            addCriterion("highSchool_name is not null");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameEqualTo(String value) {
            addCriterion("highSchool_name =", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameNotEqualTo(String value) {
            addCriterion("highSchool_name <>", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameGreaterThan(String value) {
            addCriterion("highSchool_name >", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("highSchool_name >=", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameLessThan(String value) {
            addCriterion("highSchool_name <", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameLessThanOrEqualTo(String value) {
            addCriterion("highSchool_name <=", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameLike(String value) {
            addCriterion("highSchool_name like", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameNotLike(String value) {
            addCriterion("highSchool_name not like", value, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameIn(List<String> values) {
            addCriterion("highSchool_name in", values, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameNotIn(List<String> values) {
            addCriterion("highSchool_name not in", values, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameBetween(String value1, String value2) {
            addCriterion("highSchool_name between", value1, value2, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolNameNotBetween(String value1, String value2) {
            addCriterion("highSchool_name not between", value1, value2, "highschoolName");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownIsNull() {
            addCriterion("highSchool_town is null");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownIsNotNull() {
            addCriterion("highSchool_town is not null");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownEqualTo(Integer value) {
            addCriterion("highSchool_town =", value, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownNotEqualTo(Integer value) {
            addCriterion("highSchool_town <>", value, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownGreaterThan(Integer value) {
            addCriterion("highSchool_town >", value, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownGreaterThanOrEqualTo(Integer value) {
            addCriterion("highSchool_town >=", value, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownLessThan(Integer value) {
            addCriterion("highSchool_town <", value, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownLessThanOrEqualTo(Integer value) {
            addCriterion("highSchool_town <=", value, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownIn(List<Integer> values) {
            addCriterion("highSchool_town in", values, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownNotIn(List<Integer> values) {
            addCriterion("highSchool_town not in", values, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownBetween(Integer value1, Integer value2) {
            addCriterion("highSchool_town between", value1, value2, "highschoolTown");
            return (Criteria) this;
        }

        public Criteria andHighschoolTownNotBetween(Integer value1, Integer value2) {
            addCriterion("highSchool_town not between", value1, value2, "highschoolTown");
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