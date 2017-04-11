package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudenttimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudenttimeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStudenttimeIdIsNull() {
            addCriterion("studentTime_id is null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdIsNotNull() {
            addCriterion("studentTime_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdEqualTo(Integer value) {
            addCriterion("studentTime_id =", value, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdNotEqualTo(Integer value) {
            addCriterion("studentTime_id <>", value, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdGreaterThan(Integer value) {
            addCriterion("studentTime_id >", value, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentTime_id >=", value, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdLessThan(Integer value) {
            addCriterion("studentTime_id <", value, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("studentTime_id <=", value, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdIn(List<Integer> values) {
            addCriterion("studentTime_id in", values, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdNotIn(List<Integer> values) {
            addCriterion("studentTime_id not in", values, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdBetween(Integer value1, Integer value2) {
            addCriterion("studentTime_id between", value1, value2, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("studentTime_id not between", value1, value2, "studenttimeId");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayIsNull() {
            addCriterion("studentTime_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayIsNotNull() {
            addCriterion("studentTime_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_birthday =", value, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_birthday <>", value, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("studentTime_birthday >", value, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_birthday >=", value, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("studentTime_birthday <", value, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_birthday <=", value, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("studentTime_birthday in", values, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("studentTime_birthday not in", values, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studentTime_birthday between", value1, value2, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studentTime_birthday not between", value1, value2, "studenttimeBirthday");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjIsNull() {
            addCriterion("studentTime_rxsj is null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjIsNotNull() {
            addCriterion("studentTime_rxsj is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjEqualTo(String value) {
            addCriterion("studentTime_rxsj =", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjNotEqualTo(String value) {
            addCriterion("studentTime_rxsj <>", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjGreaterThan(String value) {
            addCriterion("studentTime_rxsj >", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjGreaterThanOrEqualTo(String value) {
            addCriterion("studentTime_rxsj >=", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjLessThan(String value) {
            addCriterion("studentTime_rxsj <", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjLessThanOrEqualTo(String value) {
            addCriterion("studentTime_rxsj <=", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjLike(String value) {
            addCriterion("studentTime_rxsj like", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjNotLike(String value) {
            addCriterion("studentTime_rxsj not like", value, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjIn(List<String> values) {
            addCriterion("studentTime_rxsj in", values, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjNotIn(List<String> values) {
            addCriterion("studentTime_rxsj not in", values, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjBetween(String value1, String value2) {
            addCriterion("studentTime_rxsj between", value1, value2, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRxsjNotBetween(String value1, String value2) {
            addCriterion("studentTime_rxsj not between", value1, value2, "studenttimeRxsj");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterIsNull() {
            addCriterion("studentTime_register is null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterIsNotNull() {
            addCriterion("studentTime_register is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterEqualTo(Date value) {
            addCriterion("studentTime_register =", value, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterNotEqualTo(Date value) {
            addCriterion("studentTime_register <>", value, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterGreaterThan(Date value) {
            addCriterion("studentTime_register >", value, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterGreaterThanOrEqualTo(Date value) {
            addCriterion("studentTime_register >=", value, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterLessThan(Date value) {
            addCriterion("studentTime_register <", value, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterLessThanOrEqualTo(Date value) {
            addCriterion("studentTime_register <=", value, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterIn(List<Date> values) {
            addCriterion("studentTime_register in", values, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterNotIn(List<Date> values) {
            addCriterion("studentTime_register not in", values, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterBetween(Date value1, Date value2) {
            addCriterion("studentTime_register between", value1, value2, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeRegisterNotBetween(Date value1, Date value2) {
            addCriterion("studentTime_register not between", value1, value2, "studenttimeRegister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterIsNull() {
            addCriterion("studentTime_expectRegister is null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterIsNotNull() {
            addCriterion("studentTime_expectRegister is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_expectRegister =", value, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterNotEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_expectRegister <>", value, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterGreaterThan(Date value) {
            addCriterionForJDBCDate("studentTime_expectRegister >", value, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_expectRegister >=", value, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterLessThan(Date value) {
            addCriterionForJDBCDate("studentTime_expectRegister <", value, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studentTime_expectRegister <=", value, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterIn(List<Date> values) {
            addCriterionForJDBCDate("studentTime_expectRegister in", values, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterNotIn(List<Date> values) {
            addCriterionForJDBCDate("studentTime_expectRegister not in", values, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studentTime_expectRegister between", value1, value2, "studenttimeExpectregister");
            return (Criteria) this;
        }

        public Criteria andStudenttimeExpectregisterNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studentTime_expectRegister not between", value1, value2, "studenttimeExpectregister");
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