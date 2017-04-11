package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShuoshuocommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShuoshuocommentExample() {
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

        public Criteria andShuoshuocommentIdIsNull() {
            addCriterion("shuoshuoComment_id is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdIsNotNull() {
            addCriterion("shuoshuoComment_id is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdEqualTo(Integer value) {
            addCriterion("shuoshuoComment_id =", value, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdNotEqualTo(Integer value) {
            addCriterion("shuoshuoComment_id <>", value, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdGreaterThan(Integer value) {
            addCriterion("shuoshuoComment_id >", value, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoComment_id >=", value, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdLessThan(Integer value) {
            addCriterion("shuoshuoComment_id <", value, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoComment_id <=", value, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdIn(List<Integer> values) {
            addCriterion("shuoshuoComment_id in", values, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdNotIn(List<Integer> values) {
            addCriterion("shuoshuoComment_id not in", values, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoComment_id between", value1, value2, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoComment_id not between", value1, value2, "shuoshuocommentId");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeIsNull() {
            addCriterion("shuoshuoComment_releaseTime is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeIsNotNull() {
            addCriterion("shuoshuoComment_releaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeEqualTo(Date value) {
            addCriterion("shuoshuoComment_releaseTime =", value, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeNotEqualTo(Date value) {
            addCriterion("shuoshuoComment_releaseTime <>", value, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeGreaterThan(Date value) {
            addCriterion("shuoshuoComment_releaseTime >", value, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shuoshuoComment_releaseTime >=", value, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeLessThan(Date value) {
            addCriterion("shuoshuoComment_releaseTime <", value, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("shuoshuoComment_releaseTime <=", value, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeIn(List<Date> values) {
            addCriterion("shuoshuoComment_releaseTime in", values, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeNotIn(List<Date> values) {
            addCriterion("shuoshuoComment_releaseTime not in", values, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeBetween(Date value1, Date value2) {
            addCriterion("shuoshuoComment_releaseTime between", value1, value2, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("shuoshuoComment_releaseTime not between", value1, value2, "shuoshuocommentReleasetime");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorIsNull() {
            addCriterion("shuoshuoComment_promulgator is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorIsNotNull() {
            addCriterion("shuoshuoComment_promulgator is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorEqualTo(Integer value) {
            addCriterion("shuoshuoComment_promulgator =", value, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorNotEqualTo(Integer value) {
            addCriterion("shuoshuoComment_promulgator <>", value, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorGreaterThan(Integer value) {
            addCriterion("shuoshuoComment_promulgator >", value, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoComment_promulgator >=", value, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorLessThan(Integer value) {
            addCriterion("shuoshuoComment_promulgator <", value, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoComment_promulgator <=", value, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorIn(List<Integer> values) {
            addCriterion("shuoshuoComment_promulgator in", values, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorNotIn(List<Integer> values) {
            addCriterion("shuoshuoComment_promulgator not in", values, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoComment_promulgator between", value1, value2, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentPromulgatorNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoComment_promulgator not between", value1, value2, "shuoshuocommentPromulgator");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentIsNull() {
            addCriterion("shuoshuoCommentcol_previousComment is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentIsNotNull() {
            addCriterion("shuoshuoCommentcol_previousComment is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentEqualTo(Integer value) {
            addCriterion("shuoshuoCommentcol_previousComment =", value, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentNotEqualTo(Integer value) {
            addCriterion("shuoshuoCommentcol_previousComment <>", value, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentGreaterThan(Integer value) {
            addCriterion("shuoshuoCommentcol_previousComment >", value, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoCommentcol_previousComment >=", value, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentLessThan(Integer value) {
            addCriterion("shuoshuoCommentcol_previousComment <", value, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoCommentcol_previousComment <=", value, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentIn(List<Integer> values) {
            addCriterion("shuoshuoCommentcol_previousComment in", values, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentNotIn(List<Integer> values) {
            addCriterion("shuoshuoCommentcol_previousComment not in", values, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoCommentcol_previousComment between", value1, value2, "shuoshuocommentcolPreviouscomment");
            return (Criteria) this;
        }

        public Criteria andShuoshuocommentcolPreviouscommentNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoCommentcol_previousComment not between", value1, value2, "shuoshuocommentcolPreviouscomment");
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