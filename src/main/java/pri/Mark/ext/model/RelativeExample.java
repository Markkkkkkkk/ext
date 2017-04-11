package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class RelativeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelativeExample() {
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

        public Criteria andRelativeIdIsNull() {
            addCriterion("relative_id is null");
            return (Criteria) this;
        }

        public Criteria andRelativeIdIsNotNull() {
            addCriterion("relative_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeIdEqualTo(Integer value) {
            addCriterion("relative_id =", value, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdNotEqualTo(Integer value) {
            addCriterion("relative_id <>", value, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdGreaterThan(Integer value) {
            addCriterion("relative_id >", value, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_id >=", value, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdLessThan(Integer value) {
            addCriterion("relative_id <", value, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdLessThanOrEqualTo(Integer value) {
            addCriterion("relative_id <=", value, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdIn(List<Integer> values) {
            addCriterion("relative_id in", values, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdNotIn(List<Integer> values) {
            addCriterion("relative_id not in", values, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdBetween(Integer value1, Integer value2) {
            addCriterion("relative_id between", value1, value2, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_id not between", value1, value2, "relativeId");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationIsNull() {
            addCriterion("relative_relation is null");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationIsNotNull() {
            addCriterion("relative_relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationEqualTo(String value) {
            addCriterion("relative_relation =", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationNotEqualTo(String value) {
            addCriterion("relative_relation <>", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationGreaterThan(String value) {
            addCriterion("relative_relation >", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relative_relation >=", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationLessThan(String value) {
            addCriterion("relative_relation <", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationLessThanOrEqualTo(String value) {
            addCriterion("relative_relation <=", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationLike(String value) {
            addCriterion("relative_relation like", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationNotLike(String value) {
            addCriterion("relative_relation not like", value, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationIn(List<String> values) {
            addCriterion("relative_relation in", values, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationNotIn(List<String> values) {
            addCriterion("relative_relation not in", values, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationBetween(String value1, String value2) {
            addCriterion("relative_relation between", value1, value2, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeRelationNotBetween(String value1, String value2) {
            addCriterion("relative_relation not between", value1, value2, "relativeRelation");
            return (Criteria) this;
        }

        public Criteria andRelativeNameIsNull() {
            addCriterion("relative_name is null");
            return (Criteria) this;
        }

        public Criteria andRelativeNameIsNotNull() {
            addCriterion("relative_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeNameEqualTo(String value) {
            addCriterion("relative_name =", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameNotEqualTo(String value) {
            addCriterion("relative_name <>", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameGreaterThan(String value) {
            addCriterion("relative_name >", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameGreaterThanOrEqualTo(String value) {
            addCriterion("relative_name >=", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameLessThan(String value) {
            addCriterion("relative_name <", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameLessThanOrEqualTo(String value) {
            addCriterion("relative_name <=", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameLike(String value) {
            addCriterion("relative_name like", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameNotLike(String value) {
            addCriterion("relative_name not like", value, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameIn(List<String> values) {
            addCriterion("relative_name in", values, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameNotIn(List<String> values) {
            addCriterion("relative_name not in", values, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameBetween(String value1, String value2) {
            addCriterion("relative_name between", value1, value2, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeNameNotBetween(String value1, String value2) {
            addCriterion("relative_name not between", value1, value2, "relativeName");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionIsNull() {
            addCriterion("relative_description is null");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionIsNotNull() {
            addCriterion("relative_description is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionEqualTo(Integer value) {
            addCriterion("relative_description =", value, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionNotEqualTo(Integer value) {
            addCriterion("relative_description <>", value, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionGreaterThan(Integer value) {
            addCriterion("relative_description >", value, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_description >=", value, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionLessThan(Integer value) {
            addCriterion("relative_description <", value, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionLessThanOrEqualTo(Integer value) {
            addCriterion("relative_description <=", value, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionIn(List<Integer> values) {
            addCriterion("relative_description in", values, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionNotIn(List<Integer> values) {
            addCriterion("relative_description not in", values, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionBetween(Integer value1, Integer value2) {
            addCriterion("relative_description between", value1, value2, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeDescriptionNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_description not between", value1, value2, "relativeDescription");
            return (Criteria) this;
        }

        public Criteria andRelativeNationIsNull() {
            addCriterion("relative_nation is null");
            return (Criteria) this;
        }

        public Criteria andRelativeNationIsNotNull() {
            addCriterion("relative_nation is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeNationEqualTo(Integer value) {
            addCriterion("relative_nation =", value, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationNotEqualTo(Integer value) {
            addCriterion("relative_nation <>", value, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationGreaterThan(Integer value) {
            addCriterion("relative_nation >", value, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_nation >=", value, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationLessThan(Integer value) {
            addCriterion("relative_nation <", value, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationLessThanOrEqualTo(Integer value) {
            addCriterion("relative_nation <=", value, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationIn(List<Integer> values) {
            addCriterion("relative_nation in", values, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationNotIn(List<Integer> values) {
            addCriterion("relative_nation not in", values, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationBetween(Integer value1, Integer value2) {
            addCriterion("relative_nation between", value1, value2, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeNationNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_nation not between", value1, value2, "relativeNation");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwIsNull() {
            addCriterion("relative_gzdw is null");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwIsNotNull() {
            addCriterion("relative_gzdw is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwEqualTo(String value) {
            addCriterion("relative_gzdw =", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwNotEqualTo(String value) {
            addCriterion("relative_gzdw <>", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwGreaterThan(String value) {
            addCriterion("relative_gzdw >", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwGreaterThanOrEqualTo(String value) {
            addCriterion("relative_gzdw >=", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwLessThan(String value) {
            addCriterion("relative_gzdw <", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwLessThanOrEqualTo(String value) {
            addCriterion("relative_gzdw <=", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwLike(String value) {
            addCriterion("relative_gzdw like", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwNotLike(String value) {
            addCriterion("relative_gzdw not like", value, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwIn(List<String> values) {
            addCriterion("relative_gzdw in", values, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwNotIn(List<String> values) {
            addCriterion("relative_gzdw not in", values, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwBetween(String value1, String value2) {
            addCriterion("relative_gzdw between", value1, value2, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeGzdwNotBetween(String value1, String value2) {
            addCriterion("relative_gzdw not between", value1, value2, "relativeGzdw");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressIsNull() {
            addCriterion("relative_address is null");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressIsNotNull() {
            addCriterion("relative_address is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressEqualTo(Integer value) {
            addCriterion("relative_address =", value, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressNotEqualTo(Integer value) {
            addCriterion("relative_address <>", value, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressGreaterThan(Integer value) {
            addCriterion("relative_address >", value, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_address >=", value, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressLessThan(Integer value) {
            addCriterion("relative_address <", value, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressLessThanOrEqualTo(Integer value) {
            addCriterion("relative_address <=", value, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressIn(List<Integer> values) {
            addCriterion("relative_address in", values, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressNotIn(List<Integer> values) {
            addCriterion("relative_address not in", values, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressBetween(Integer value1, Integer value2) {
            addCriterion("relative_address between", value1, value2, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativeAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_address not between", value1, value2, "relativeAddress");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneIsNull() {
            addCriterion("relative_phone is null");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneIsNotNull() {
            addCriterion("relative_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneEqualTo(String value) {
            addCriterion("relative_phone =", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneNotEqualTo(String value) {
            addCriterion("relative_phone <>", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneGreaterThan(String value) {
            addCriterion("relative_phone >", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("relative_phone >=", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneLessThan(String value) {
            addCriterion("relative_phone <", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneLessThanOrEqualTo(String value) {
            addCriterion("relative_phone <=", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneLike(String value) {
            addCriterion("relative_phone like", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneNotLike(String value) {
            addCriterion("relative_phone not like", value, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneIn(List<String> values) {
            addCriterion("relative_phone in", values, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneNotIn(List<String> values) {
            addCriterion("relative_phone not in", values, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneBetween(String value1, String value2) {
            addCriterion("relative_phone between", value1, value2, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativePhoneNotBetween(String value1, String value2) {
            addCriterion("relative_phone not between", value1, value2, "relativePhone");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityIsNull() {
            addCriterion("relative_identity is null");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityIsNotNull() {
            addCriterion("relative_identity is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityEqualTo(String value) {
            addCriterion("relative_identity =", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityNotEqualTo(String value) {
            addCriterion("relative_identity <>", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityGreaterThan(String value) {
            addCriterion("relative_identity >", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("relative_identity >=", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityLessThan(String value) {
            addCriterion("relative_identity <", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityLessThanOrEqualTo(String value) {
            addCriterion("relative_identity <=", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityLike(String value) {
            addCriterion("relative_identity like", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityNotLike(String value) {
            addCriterion("relative_identity not like", value, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityIn(List<String> values) {
            addCriterion("relative_identity in", values, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityNotIn(List<String> values) {
            addCriterion("relative_identity not in", values, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityBetween(String value1, String value2) {
            addCriterion("relative_identity between", value1, value2, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeIdentityNotBetween(String value1, String value2) {
            addCriterion("relative_identity not between", value1, value2, "relativeIdentity");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyIsNull() {
            addCriterion("relative_duty is null");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyIsNotNull() {
            addCriterion("relative_duty is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyEqualTo(String value) {
            addCriterion("relative_duty =", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyNotEqualTo(String value) {
            addCriterion("relative_duty <>", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyGreaterThan(String value) {
            addCriterion("relative_duty >", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyGreaterThanOrEqualTo(String value) {
            addCriterion("relative_duty >=", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyLessThan(String value) {
            addCriterion("relative_duty <", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyLessThanOrEqualTo(String value) {
            addCriterion("relative_duty <=", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyLike(String value) {
            addCriterion("relative_duty like", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyNotLike(String value) {
            addCriterion("relative_duty not like", value, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyIn(List<String> values) {
            addCriterion("relative_duty in", values, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyNotIn(List<String> values) {
            addCriterion("relative_duty not in", values, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyBetween(String value1, String value2) {
            addCriterion("relative_duty between", value1, value2, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeDutyNotBetween(String value1, String value2) {
            addCriterion("relative_duty not between", value1, value2, "relativeDuty");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeIsNull() {
            addCriterion("relative_bloodType is null");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeIsNotNull() {
            addCriterion("relative_bloodType is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeEqualTo(Integer value) {
            addCriterion("relative_bloodType =", value, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeNotEqualTo(Integer value) {
            addCriterion("relative_bloodType <>", value, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeGreaterThan(Integer value) {
            addCriterion("relative_bloodType >", value, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_bloodType >=", value, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeLessThan(Integer value) {
            addCriterion("relative_bloodType <", value, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeLessThanOrEqualTo(Integer value) {
            addCriterion("relative_bloodType <=", value, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeIn(List<Integer> values) {
            addCriterion("relative_bloodType in", values, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeNotIn(List<Integer> values) {
            addCriterion("relative_bloodType not in", values, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeBetween(Integer value1, Integer value2) {
            addCriterion("relative_bloodType between", value1, value2, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeBloodtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_bloodType not between", value1, value2, "relativeBloodtype");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusIsNull() {
            addCriterion("relative_healthStatus is null");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusIsNotNull() {
            addCriterion("relative_healthStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusEqualTo(Integer value) {
            addCriterion("relative_healthStatus =", value, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusNotEqualTo(Integer value) {
            addCriterion("relative_healthStatus <>", value, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusGreaterThan(Integer value) {
            addCriterion("relative_healthStatus >", value, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_healthStatus >=", value, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusLessThan(Integer value) {
            addCriterion("relative_healthStatus <", value, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusLessThanOrEqualTo(Integer value) {
            addCriterion("relative_healthStatus <=", value, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusIn(List<Integer> values) {
            addCriterion("relative_healthStatus in", values, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusNotIn(List<Integer> values) {
            addCriterion("relative_healthStatus not in", values, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusBetween(Integer value1, Integer value2) {
            addCriterion("relative_healthStatus between", value1, value2, "relativeHealthstatus");
            return (Criteria) this;
        }

        public Criteria andRelativeHealthstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_healthStatus not between", value1, value2, "relativeHealthstatus");
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