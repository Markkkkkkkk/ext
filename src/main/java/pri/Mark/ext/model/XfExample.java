package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XfExample() {
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

        public Criteria andXfIdIsNull() {
            addCriterion("xf_id is null");
            return (Criteria) this;
        }

        public Criteria andXfIdIsNotNull() {
            addCriterion("xf_id is not null");
            return (Criteria) this;
        }

        public Criteria andXfIdEqualTo(Integer value) {
            addCriterion("xf_id =", value, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdNotEqualTo(Integer value) {
            addCriterion("xf_id <>", value, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdGreaterThan(Integer value) {
            addCriterion("xf_id >", value, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xf_id >=", value, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdLessThan(Integer value) {
            addCriterion("xf_id <", value, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdLessThanOrEqualTo(Integer value) {
            addCriterion("xf_id <=", value, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdIn(List<Integer> values) {
            addCriterion("xf_id in", values, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdNotIn(List<Integer> values) {
            addCriterion("xf_id not in", values, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdBetween(Integer value1, Integer value2) {
            addCriterion("xf_id between", value1, value2, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xf_id not between", value1, value2, "xfId");
            return (Criteria) this;
        }

        public Criteria andXfYhkhIsNull() {
            addCriterion("xf_yhkh is null");
            return (Criteria) this;
        }

        public Criteria andXfYhkhIsNotNull() {
            addCriterion("xf_yhkh is not null");
            return (Criteria) this;
        }

        public Criteria andXfYhkhEqualTo(String value) {
            addCriterion("xf_yhkh =", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhNotEqualTo(String value) {
            addCriterion("xf_yhkh <>", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhGreaterThan(String value) {
            addCriterion("xf_yhkh >", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhGreaterThanOrEqualTo(String value) {
            addCriterion("xf_yhkh >=", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhLessThan(String value) {
            addCriterion("xf_yhkh <", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhLessThanOrEqualTo(String value) {
            addCriterion("xf_yhkh <=", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhLike(String value) {
            addCriterion("xf_yhkh like", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhNotLike(String value) {
            addCriterion("xf_yhkh not like", value, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhIn(List<String> values) {
            addCriterion("xf_yhkh in", values, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhNotIn(List<String> values) {
            addCriterion("xf_yhkh not in", values, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhBetween(String value1, String value2) {
            addCriterion("xf_yhkh between", value1, value2, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfYhkhNotBetween(String value1, String value2) {
            addCriterion("xf_yhkh not between", value1, value2, "xfYhkh");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeIsNull() {
            addCriterion("xf_submitTime is null");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeIsNotNull() {
            addCriterion("xf_submitTime is not null");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeEqualTo(Date value) {
            addCriterion("xf_submitTime =", value, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeNotEqualTo(Date value) {
            addCriterion("xf_submitTime <>", value, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeGreaterThan(Date value) {
            addCriterion("xf_submitTime >", value, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("xf_submitTime >=", value, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeLessThan(Date value) {
            addCriterion("xf_submitTime <", value, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeLessThanOrEqualTo(Date value) {
            addCriterion("xf_submitTime <=", value, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeIn(List<Date> values) {
            addCriterion("xf_submitTime in", values, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeNotIn(List<Date> values) {
            addCriterion("xf_submitTime not in", values, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeBetween(Date value1, Date value2) {
            addCriterion("xf_submitTime between", value1, value2, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfSubmittimeNotBetween(Date value1, Date value2) {
            addCriterion("xf_submitTime not between", value1, value2, "xfSubmittime");
            return (Criteria) this;
        }

        public Criteria andXfAmountIsNull() {
            addCriterion("xf_amount is null");
            return (Criteria) this;
        }

        public Criteria andXfAmountIsNotNull() {
            addCriterion("xf_amount is not null");
            return (Criteria) this;
        }

        public Criteria andXfAmountEqualTo(String value) {
            addCriterion("xf_amount =", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountNotEqualTo(String value) {
            addCriterion("xf_amount <>", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountGreaterThan(String value) {
            addCriterion("xf_amount >", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountGreaterThanOrEqualTo(String value) {
            addCriterion("xf_amount >=", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountLessThan(String value) {
            addCriterion("xf_amount <", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountLessThanOrEqualTo(String value) {
            addCriterion("xf_amount <=", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountLike(String value) {
            addCriterion("xf_amount like", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountNotLike(String value) {
            addCriterion("xf_amount not like", value, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountIn(List<String> values) {
            addCriterion("xf_amount in", values, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountNotIn(List<String> values) {
            addCriterion("xf_amount not in", values, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountBetween(String value1, String value2) {
            addCriterion("xf_amount between", value1, value2, "xfAmount");
            return (Criteria) this;
        }

        public Criteria andXfAmountNotBetween(String value1, String value2) {
            addCriterion("xf_amount not between", value1, value2, "xfAmount");
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