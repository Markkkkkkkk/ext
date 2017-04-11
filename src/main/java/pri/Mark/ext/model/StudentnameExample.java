package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentnameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentnameExample() {
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

        public Criteria andStudentnameIdIsNull() {
            addCriterion("studentName_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdIsNotNull() {
            addCriterion("studentName_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdEqualTo(Integer value) {
            addCriterion("studentName_id =", value, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdNotEqualTo(Integer value) {
            addCriterion("studentName_id <>", value, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdGreaterThan(Integer value) {
            addCriterion("studentName_id >", value, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentName_id >=", value, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdLessThan(Integer value) {
            addCriterion("studentName_id <", value, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdLessThanOrEqualTo(Integer value) {
            addCriterion("studentName_id <=", value, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdIn(List<Integer> values) {
            addCriterion("studentName_id in", values, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdNotIn(List<Integer> values) {
            addCriterion("studentName_id not in", values, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdBetween(Integer value1, Integer value2) {
            addCriterion("studentName_id between", value1, value2, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("studentName_id not between", value1, value2, "studentnameId");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameIsNull() {
            addCriterion("studentName_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameIsNotNull() {
            addCriterion("studentName_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameEqualTo(String value) {
            addCriterion("studentName_name =", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameNotEqualTo(String value) {
            addCriterion("studentName_name <>", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameGreaterThan(String value) {
            addCriterion("studentName_name >", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName_name >=", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameLessThan(String value) {
            addCriterion("studentName_name <", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameLessThanOrEqualTo(String value) {
            addCriterion("studentName_name <=", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameLike(String value) {
            addCriterion("studentName_name like", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameNotLike(String value) {
            addCriterion("studentName_name not like", value, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameIn(List<String> values) {
            addCriterion("studentName_name in", values, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameNotIn(List<String> values) {
            addCriterion("studentName_name not in", values, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameBetween(String value1, String value2) {
            addCriterion("studentName_name between", value1, value2, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameNameNotBetween(String value1, String value2) {
            addCriterion("studentName_name not between", value1, value2, "studentnameName");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeIsNull() {
            addCriterion("studentName_inputTime is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeIsNotNull() {
            addCriterion("studentName_inputTime is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeEqualTo(Date value) {
            addCriterion("studentName_inputTime =", value, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeNotEqualTo(Date value) {
            addCriterion("studentName_inputTime <>", value, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeGreaterThan(Date value) {
            addCriterion("studentName_inputTime >", value, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("studentName_inputTime >=", value, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeLessThan(Date value) {
            addCriterion("studentName_inputTime <", value, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeLessThanOrEqualTo(Date value) {
            addCriterion("studentName_inputTime <=", value, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeIn(List<Date> values) {
            addCriterion("studentName_inputTime in", values, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeNotIn(List<Date> values) {
            addCriterion("studentName_inputTime not in", values, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeBetween(Date value1, Date value2) {
            addCriterion("studentName_inputTime between", value1, value2, "studentnameInputtime");
            return (Criteria) this;
        }

        public Criteria andStudentnameInputtimeNotBetween(Date value1, Date value2) {
            addCriterion("studentName_inputTime not between", value1, value2, "studentnameInputtime");
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