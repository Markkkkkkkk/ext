package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HjExample() {
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

        public Criteria andHjIdIsNull() {
            addCriterion("hj_id is null");
            return (Criteria) this;
        }

        public Criteria andHjIdIsNotNull() {
            addCriterion("hj_id is not null");
            return (Criteria) this;
        }

        public Criteria andHjIdEqualTo(Integer value) {
            addCriterion("hj_id =", value, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdNotEqualTo(Integer value) {
            addCriterion("hj_id <>", value, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdGreaterThan(Integer value) {
            addCriterion("hj_id >", value, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hj_id >=", value, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdLessThan(Integer value) {
            addCriterion("hj_id <", value, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdLessThanOrEqualTo(Integer value) {
            addCriterion("hj_id <=", value, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdIn(List<Integer> values) {
            addCriterion("hj_id in", values, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdNotIn(List<Integer> values) {
            addCriterion("hj_id not in", values, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdBetween(Integer value1, Integer value2) {
            addCriterion("hj_id between", value1, value2, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hj_id not between", value1, value2, "hjId");
            return (Criteria) this;
        }

        public Criteria andHjTownIsNull() {
            addCriterion("hj_town is null");
            return (Criteria) this;
        }

        public Criteria andHjTownIsNotNull() {
            addCriterion("hj_town is not null");
            return (Criteria) this;
        }

        public Criteria andHjTownEqualTo(Integer value) {
            addCriterion("hj_town =", value, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownNotEqualTo(Integer value) {
            addCriterion("hj_town <>", value, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownGreaterThan(Integer value) {
            addCriterion("hj_town >", value, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownGreaterThanOrEqualTo(Integer value) {
            addCriterion("hj_town >=", value, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownLessThan(Integer value) {
            addCriterion("hj_town <", value, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownLessThanOrEqualTo(Integer value) {
            addCriterion("hj_town <=", value, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownIn(List<Integer> values) {
            addCriterion("hj_town in", values, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownNotIn(List<Integer> values) {
            addCriterion("hj_town not in", values, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownBetween(Integer value1, Integer value2) {
            addCriterion("hj_town between", value1, value2, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjTownNotBetween(Integer value1, Integer value2) {
            addCriterion("hj_town not between", value1, value2, "hjTown");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeIsNull() {
            addCriterion("hj_inputTime is null");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeIsNotNull() {
            addCriterion("hj_inputTime is not null");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeEqualTo(Date value) {
            addCriterion("hj_inputTime =", value, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeNotEqualTo(Date value) {
            addCriterion("hj_inputTime <>", value, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeGreaterThan(Date value) {
            addCriterion("hj_inputTime >", value, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hj_inputTime >=", value, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeLessThan(Date value) {
            addCriterion("hj_inputTime <", value, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeLessThanOrEqualTo(Date value) {
            addCriterion("hj_inputTime <=", value, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeIn(List<Date> values) {
            addCriterion("hj_inputTime in", values, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeNotIn(List<Date> values) {
            addCriterion("hj_inputTime not in", values, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeBetween(Date value1, Date value2) {
            addCriterion("hj_inputTime between", value1, value2, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjInputtimeNotBetween(Date value1, Date value2) {
            addCriterion("hj_inputTime not between", value1, value2, "hjInputtime");
            return (Criteria) this;
        }

        public Criteria andHjTypeIsNull() {
            addCriterion("hj_type is null");
            return (Criteria) this;
        }

        public Criteria andHjTypeIsNotNull() {
            addCriterion("hj_type is not null");
            return (Criteria) this;
        }

        public Criteria andHjTypeEqualTo(String value) {
            addCriterion("hj_type =", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeNotEqualTo(String value) {
            addCriterion("hj_type <>", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeGreaterThan(String value) {
            addCriterion("hj_type >", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hj_type >=", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeLessThan(String value) {
            addCriterion("hj_type <", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeLessThanOrEqualTo(String value) {
            addCriterion("hj_type <=", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeLike(String value) {
            addCriterion("hj_type like", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeNotLike(String value) {
            addCriterion("hj_type not like", value, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeIn(List<String> values) {
            addCriterion("hj_type in", values, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeNotIn(List<String> values) {
            addCriterion("hj_type not in", values, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeBetween(String value1, String value2) {
            addCriterion("hj_type between", value1, value2, "hjType");
            return (Criteria) this;
        }

        public Criteria andHjTypeNotBetween(String value1, String value2) {
            addCriterion("hj_type not between", value1, value2, "hjType");
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