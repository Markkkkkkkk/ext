package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class DbdescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbdescriptionExample() {
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

        public Criteria andDbdescriptionIdIsNull() {
            addCriterion("DBdescription_id is null");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdIsNotNull() {
            addCriterion("DBdescription_id is not null");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdEqualTo(Integer value) {
            addCriterion("DBdescription_id =", value, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdNotEqualTo(Integer value) {
            addCriterion("DBdescription_id <>", value, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdGreaterThan(Integer value) {
            addCriterion("DBdescription_id >", value, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DBdescription_id >=", value, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdLessThan(Integer value) {
            addCriterion("DBdescription_id <", value, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("DBdescription_id <=", value, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdIn(List<Integer> values) {
            addCriterion("DBdescription_id in", values, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdNotIn(List<Integer> values) {
            addCriterion("DBdescription_id not in", values, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdBetween(Integer value1, Integer value2) {
            addCriterion("DBdescription_id between", value1, value2, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DBdescription_id not between", value1, value2, "dbdescriptionId");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdIsNull() {
            addCriterion("DBdescription_zd is null");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdIsNotNull() {
            addCriterion("DBdescription_zd is not null");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdEqualTo(Integer value) {
            addCriterion("DBdescription_zd =", value, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdNotEqualTo(Integer value) {
            addCriterion("DBdescription_zd <>", value, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdGreaterThan(Integer value) {
            addCriterion("DBdescription_zd >", value, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DBdescription_zd >=", value, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdLessThan(Integer value) {
            addCriterion("DBdescription_zd <", value, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdLessThanOrEqualTo(Integer value) {
            addCriterion("DBdescription_zd <=", value, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdIn(List<Integer> values) {
            addCriterion("DBdescription_zd in", values, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdNotIn(List<Integer> values) {
            addCriterion("DBdescription_zd not in", values, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdBetween(Integer value1, Integer value2) {
            addCriterion("DBdescription_zd between", value1, value2, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionZdNotBetween(Integer value1, Integer value2) {
            addCriterion("DBdescription_zd not between", value1, value2, "dbdescriptionZd");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameIsNull() {
            addCriterion("DBdescription_tableName is null");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameIsNotNull() {
            addCriterion("DBdescription_tableName is not null");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameEqualTo(String value) {
            addCriterion("DBdescription_tableName =", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameNotEqualTo(String value) {
            addCriterion("DBdescription_tableName <>", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameGreaterThan(String value) {
            addCriterion("DBdescription_tableName >", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("DBdescription_tableName >=", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameLessThan(String value) {
            addCriterion("DBdescription_tableName <", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameLessThanOrEqualTo(String value) {
            addCriterion("DBdescription_tableName <=", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameLike(String value) {
            addCriterion("DBdescription_tableName like", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameNotLike(String value) {
            addCriterion("DBdescription_tableName not like", value, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameIn(List<String> values) {
            addCriterion("DBdescription_tableName in", values, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameNotIn(List<String> values) {
            addCriterion("DBdescription_tableName not in", values, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameBetween(String value1, String value2) {
            addCriterion("DBdescription_tableName between", value1, value2, "dbdescriptionTablename");
            return (Criteria) this;
        }

        public Criteria andDbdescriptionTablenameNotBetween(String value1, String value2) {
            addCriterion("DBdescription_tableName not between", value1, value2, "dbdescriptionTablename");
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