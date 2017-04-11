package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordIsNull() {
            addCriterion("user_saltPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordIsNotNull() {
            addCriterion("user_saltPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordEqualTo(String value) {
            addCriterion("user_saltPassword =", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordNotEqualTo(String value) {
            addCriterion("user_saltPassword <>", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordGreaterThan(String value) {
            addCriterion("user_saltPassword >", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_saltPassword >=", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordLessThan(String value) {
            addCriterion("user_saltPassword <", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordLessThanOrEqualTo(String value) {
            addCriterion("user_saltPassword <=", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordLike(String value) {
            addCriterion("user_saltPassword like", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordNotLike(String value) {
            addCriterion("user_saltPassword not like", value, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordIn(List<String> values) {
            addCriterion("user_saltPassword in", values, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordNotIn(List<String> values) {
            addCriterion("user_saltPassword not in", values, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordBetween(String value1, String value2) {
            addCriterion("user_saltPassword between", value1, value2, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserSaltpasswordNotBetween(String value1, String value2) {
            addCriterion("user_saltPassword not between", value1, value2, "userSaltpassword");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("user_role is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("user_role is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(Integer value) {
            addCriterion("user_role =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(Integer value) {
            addCriterion("user_role <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(Integer value) {
            addCriterion("user_role >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_role >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(Integer value) {
            addCriterion("user_role <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(Integer value) {
            addCriterion("user_role <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<Integer> values) {
            addCriterion("user_role in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<Integer> values) {
            addCriterion("user_role not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(Integer value1, Integer value2) {
            addCriterion("user_role between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("user_role not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserLogIsNull() {
            addCriterion("user_log is null");
            return (Criteria) this;
        }

        public Criteria andUserLogIsNotNull() {
            addCriterion("user_log is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogEqualTo(Integer value) {
            addCriterion("user_log =", value, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogNotEqualTo(Integer value) {
            addCriterion("user_log <>", value, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogGreaterThan(Integer value) {
            addCriterion("user_log >", value, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_log >=", value, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogLessThan(Integer value) {
            addCriterion("user_log <", value, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogLessThanOrEqualTo(Integer value) {
            addCriterion("user_log <=", value, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogIn(List<Integer> values) {
            addCriterion("user_log in", values, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogNotIn(List<Integer> values) {
            addCriterion("user_log not in", values, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogBetween(Integer value1, Integer value2) {
            addCriterion("user_log between", value1, value2, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserLogNotBetween(Integer value1, Integer value2) {
            addCriterion("user_log not between", value1, value2, "userLog");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNull() {
            addCriterion("user_salt is null");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNotNull() {
            addCriterion("user_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUserSaltEqualTo(String value) {
            addCriterion("user_salt =", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotEqualTo(String value) {
            addCriterion("user_salt <>", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThan(String value) {
            addCriterion("user_salt >", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThanOrEqualTo(String value) {
            addCriterion("user_salt >=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThan(String value) {
            addCriterion("user_salt <", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThanOrEqualTo(String value) {
            addCriterion("user_salt <=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLike(String value) {
            addCriterion("user_salt like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotLike(String value) {
            addCriterion("user_salt not like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltIn(List<String> values) {
            addCriterion("user_salt in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotIn(List<String> values) {
            addCriterion("user_salt not in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltBetween(String value1, String value2) {
            addCriterion("user_salt between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotBetween(String value1, String value2) {
            addCriterion("user_salt not between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenIsNull() {
            addCriterion("user_loginToken is null");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenIsNotNull() {
            addCriterion("user_loginToken is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenEqualTo(String value) {
            addCriterion("user_loginToken =", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenNotEqualTo(String value) {
            addCriterion("user_loginToken <>", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenGreaterThan(String value) {
            addCriterion("user_loginToken >", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginToken >=", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenLessThan(String value) {
            addCriterion("user_loginToken <", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenLessThanOrEqualTo(String value) {
            addCriterion("user_loginToken <=", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenLike(String value) {
            addCriterion("user_loginToken like", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenNotLike(String value) {
            addCriterion("user_loginToken not like", value, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenIn(List<String> values) {
            addCriterion("user_loginToken in", values, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenNotIn(List<String> values) {
            addCriterion("user_loginToken not in", values, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenBetween(String value1, String value2) {
            addCriterion("user_loginToken between", value1, value2, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserLogintokenNotBetween(String value1, String value2) {
            addCriterion("user_loginToken not between", value1, value2, "userLogintoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenIsNull() {
            addCriterion("user_alterPasswordToken is null");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenIsNotNull() {
            addCriterion("user_alterPasswordToken is not null");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenEqualTo(String value) {
            addCriterion("user_alterPasswordToken =", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenNotEqualTo(String value) {
            addCriterion("user_alterPasswordToken <>", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenGreaterThan(String value) {
            addCriterion("user_alterPasswordToken >", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenGreaterThanOrEqualTo(String value) {
            addCriterion("user_alterPasswordToken >=", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenLessThan(String value) {
            addCriterion("user_alterPasswordToken <", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenLessThanOrEqualTo(String value) {
            addCriterion("user_alterPasswordToken <=", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenLike(String value) {
            addCriterion("user_alterPasswordToken like", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenNotLike(String value) {
            addCriterion("user_alterPasswordToken not like", value, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenIn(List<String> values) {
            addCriterion("user_alterPasswordToken in", values, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenNotIn(List<String> values) {
            addCriterion("user_alterPasswordToken not in", values, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenBetween(String value1, String value2) {
            addCriterion("user_alterPasswordToken between", value1, value2, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserAlterpasswordtokenNotBetween(String value1, String value2) {
            addCriterion("user_alterPasswordToken not between", value1, value2, "userAlterpasswordtoken");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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