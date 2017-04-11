package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andPictureIdIsNull() {
            addCriterion("picture_id is null");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNotNull() {
            addCriterion("picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andPictureIdEqualTo(Integer value) {
            addCriterion("picture_id =", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotEqualTo(Integer value) {
            addCriterion("picture_id <>", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThan(Integer value) {
            addCriterion("picture_id >", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("picture_id >=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThan(Integer value) {
            addCriterion("picture_id <", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("picture_id <=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdIn(List<Integer> values) {
            addCriterion("picture_id in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotIn(List<Integer> values) {
            addCriterion("picture_id not in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("picture_id between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("picture_id not between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeIsNull() {
            addCriterion("picture_inputTime is null");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeIsNotNull() {
            addCriterion("picture_inputTime is not null");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeEqualTo(Date value) {
            addCriterion("picture_inputTime =", value, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeNotEqualTo(Date value) {
            addCriterion("picture_inputTime <>", value, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeGreaterThan(Date value) {
            addCriterion("picture_inputTime >", value, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("picture_inputTime >=", value, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeLessThan(Date value) {
            addCriterion("picture_inputTime <", value, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeLessThanOrEqualTo(Date value) {
            addCriterion("picture_inputTime <=", value, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeIn(List<Date> values) {
            addCriterion("picture_inputTime in", values, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeNotIn(List<Date> values) {
            addCriterion("picture_inputTime not in", values, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeBetween(Date value1, Date value2) {
            addCriterion("picture_inputTime between", value1, value2, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureInputtimeNotBetween(Date value1, Date value2) {
            addCriterion("picture_inputTime not between", value1, value2, "pictureInputtime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeIsNull() {
            addCriterion("picture_deleteTime is null");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeIsNotNull() {
            addCriterion("picture_deleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeEqualTo(Date value) {
            addCriterion("picture_deleteTime =", value, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeNotEqualTo(Date value) {
            addCriterion("picture_deleteTime <>", value, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeGreaterThan(Date value) {
            addCriterion("picture_deleteTime >", value, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("picture_deleteTime >=", value, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeLessThan(Date value) {
            addCriterion("picture_deleteTime <", value, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("picture_deleteTime <=", value, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeIn(List<Date> values) {
            addCriterion("picture_deleteTime in", values, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeNotIn(List<Date> values) {
            addCriterion("picture_deleteTime not in", values, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeBetween(Date value1, Date value2) {
            addCriterion("picture_deleteTime between", value1, value2, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("picture_deleteTime not between", value1, value2, "pictureDeletetime");
            return (Criteria) this;
        }

        public Criteria andPictureNameIsNull() {
            addCriterion("picture_name is null");
            return (Criteria) this;
        }

        public Criteria andPictureNameIsNotNull() {
            addCriterion("picture_name is not null");
            return (Criteria) this;
        }

        public Criteria andPictureNameEqualTo(String value) {
            addCriterion("picture_name =", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotEqualTo(String value) {
            addCriterion("picture_name <>", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameGreaterThan(String value) {
            addCriterion("picture_name >", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameGreaterThanOrEqualTo(String value) {
            addCriterion("picture_name >=", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLessThan(String value) {
            addCriterion("picture_name <", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLessThanOrEqualTo(String value) {
            addCriterion("picture_name <=", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameLike(String value) {
            addCriterion("picture_name like", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotLike(String value) {
            addCriterion("picture_name not like", value, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameIn(List<String> values) {
            addCriterion("picture_name in", values, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotIn(List<String> values) {
            addCriterion("picture_name not in", values, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameBetween(String value1, String value2) {
            addCriterion("picture_name between", value1, value2, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureNameNotBetween(String value1, String value2) {
            addCriterion("picture_name not between", value1, value2, "pictureName");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerIsNull() {
            addCriterion("picture_owner is null");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerIsNotNull() {
            addCriterion("picture_owner is not null");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerEqualTo(String value) {
            addCriterion("picture_owner =", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerNotEqualTo(String value) {
            addCriterion("picture_owner <>", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerGreaterThan(String value) {
            addCriterion("picture_owner >", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("picture_owner >=", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerLessThan(String value) {
            addCriterion("picture_owner <", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerLessThanOrEqualTo(String value) {
            addCriterion("picture_owner <=", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerLike(String value) {
            addCriterion("picture_owner like", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerNotLike(String value) {
            addCriterion("picture_owner not like", value, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerIn(List<String> values) {
            addCriterion("picture_owner in", values, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerNotIn(List<String> values) {
            addCriterion("picture_owner not in", values, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerBetween(String value1, String value2) {
            addCriterion("picture_owner between", value1, value2, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureOwnerNotBetween(String value1, String value2) {
            addCriterion("picture_owner not between", value1, value2, "pictureOwner");
            return (Criteria) this;
        }

        public Criteria andPictureTypeIsNull() {
            addCriterion("picture_type is null");
            return (Criteria) this;
        }

        public Criteria andPictureTypeIsNotNull() {
            addCriterion("picture_type is not null");
            return (Criteria) this;
        }

        public Criteria andPictureTypeEqualTo(Integer value) {
            addCriterion("picture_type =", value, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeNotEqualTo(Integer value) {
            addCriterion("picture_type <>", value, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeGreaterThan(Integer value) {
            addCriterion("picture_type >", value, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("picture_type >=", value, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeLessThan(Integer value) {
            addCriterion("picture_type <", value, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeLessThanOrEqualTo(Integer value) {
            addCriterion("picture_type <=", value, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeIn(List<Integer> values) {
            addCriterion("picture_type in", values, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeNotIn(List<Integer> values) {
            addCriterion("picture_type not in", values, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeBetween(Integer value1, Integer value2) {
            addCriterion("picture_type between", value1, value2, "pictureType");
            return (Criteria) this;
        }

        public Criteria andPictureTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("picture_type not between", value1, value2, "pictureType");
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