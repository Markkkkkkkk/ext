package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class ShuoshuopictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShuoshuopictureExample() {
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

        public Criteria andShuoshuopictureIdIsNull() {
            addCriterion("shuoshuoPicture_id is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdIsNotNull() {
            addCriterion("shuoshuoPicture_id is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_id =", value, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdNotEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_id <>", value, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdGreaterThan(Integer value) {
            addCriterion("shuoshuoPicture_id >", value, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_id >=", value, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdLessThan(Integer value) {
            addCriterion("shuoshuoPicture_id <", value, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_id <=", value, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdIn(List<Integer> values) {
            addCriterion("shuoshuoPicture_id in", values, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdNotIn(List<Integer> values) {
            addCriterion("shuoshuoPicture_id not in", values, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoPicture_id between", value1, value2, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoPicture_id not between", value1, value2, "shuoshuopictureId");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameIsNull() {
            addCriterion("shuoshuoPicture_name is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameIsNotNull() {
            addCriterion("shuoshuoPicture_name is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameEqualTo(String value) {
            addCriterion("shuoshuoPicture_name =", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameNotEqualTo(String value) {
            addCriterion("shuoshuoPicture_name <>", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameGreaterThan(String value) {
            addCriterion("shuoshuoPicture_name >", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameGreaterThanOrEqualTo(String value) {
            addCriterion("shuoshuoPicture_name >=", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameLessThan(String value) {
            addCriterion("shuoshuoPicture_name <", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameLessThanOrEqualTo(String value) {
            addCriterion("shuoshuoPicture_name <=", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameLike(String value) {
            addCriterion("shuoshuoPicture_name like", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameNotLike(String value) {
            addCriterion("shuoshuoPicture_name not like", value, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameIn(List<String> values) {
            addCriterion("shuoshuoPicture_name in", values, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameNotIn(List<String> values) {
            addCriterion("shuoshuoPicture_name not in", values, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameBetween(String value1, String value2) {
            addCriterion("shuoshuoPicture_name between", value1, value2, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureNameNotBetween(String value1, String value2) {
            addCriterion("shuoshuoPicture_name not between", value1, value2, "shuoshuopictureName");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoIsNull() {
            addCriterion("shuoshuoPicture_shuoshuo is null");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoIsNotNull() {
            addCriterion("shuoshuoPicture_shuoshuo is not null");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_shuoshuo =", value, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoNotEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_shuoshuo <>", value, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoGreaterThan(Integer value) {
            addCriterion("shuoshuoPicture_shuoshuo >", value, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_shuoshuo >=", value, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoLessThan(Integer value) {
            addCriterion("shuoshuoPicture_shuoshuo <", value, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoLessThanOrEqualTo(Integer value) {
            addCriterion("shuoshuoPicture_shuoshuo <=", value, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoIn(List<Integer> values) {
            addCriterion("shuoshuoPicture_shuoshuo in", values, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoNotIn(List<Integer> values) {
            addCriterion("shuoshuoPicture_shuoshuo not in", values, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoPicture_shuoshuo between", value1, value2, "shuoshuopictureShuoshuo");
            return (Criteria) this;
        }

        public Criteria andShuoshuopictureShuoshuoNotBetween(Integer value1, Integer value2) {
            addCriterion("shuoshuoPicture_shuoshuo not between", value1, value2, "shuoshuopictureShuoshuo");
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