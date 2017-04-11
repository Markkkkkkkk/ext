package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentIdentityIsNull() {
            addCriterion("student_identity is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityIsNotNull() {
            addCriterion("student_identity is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityEqualTo(String value) {
            addCriterion("student_identity =", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotEqualTo(String value) {
            addCriterion("student_identity <>", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityGreaterThan(String value) {
            addCriterion("student_identity >", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("student_identity >=", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityLessThan(String value) {
            addCriterion("student_identity <", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityLessThanOrEqualTo(String value) {
            addCriterion("student_identity <=", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityLike(String value) {
            addCriterion("student_identity like", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotLike(String value) {
            addCriterion("student_identity not like", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityIn(List<String> values) {
            addCriterion("student_identity in", values, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotIn(List<String> values) {
            addCriterion("student_identity not in", values, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityBetween(String value1, String value2) {
            addCriterion("student_identity between", value1, value2, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotBetween(String value1, String value2) {
            addCriterion("student_identity not between", value1, value2, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(Integer value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(Integer value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(Integer value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(Integer value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(Integer value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<Integer> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<Integer> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(Integer value1, Integer value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(Integer value1, Integer value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(Integer value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(Integer value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(Integer value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(Integer value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(Integer value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<Integer> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<Integer> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(Integer value1, Integer value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(Integer value1, Integer value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentNationIsNull() {
            addCriterion("student_nation is null");
            return (Criteria) this;
        }

        public Criteria andStudentNationIsNotNull() {
            addCriterion("student_nation is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNationEqualTo(Integer value) {
            addCriterion("student_nation =", value, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationNotEqualTo(Integer value) {
            addCriterion("student_nation <>", value, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationGreaterThan(Integer value) {
            addCriterion("student_nation >", value, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_nation >=", value, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationLessThan(Integer value) {
            addCriterion("student_nation <", value, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationLessThanOrEqualTo(Integer value) {
            addCriterion("student_nation <=", value, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationIn(List<Integer> values) {
            addCriterion("student_nation in", values, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationNotIn(List<Integer> values) {
            addCriterion("student_nation not in", values, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationBetween(Integer value1, Integer value2) {
            addCriterion("student_nation between", value1, value2, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentNationNotBetween(Integer value1, Integer value2) {
            addCriterion("student_nation not between", value1, value2, "studentNation");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmIsNull() {
            addCriterion("student_zzmm is null");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmIsNotNull() {
            addCriterion("student_zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmEqualTo(Integer value) {
            addCriterion("student_zzmm =", value, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmNotEqualTo(Integer value) {
            addCriterion("student_zzmm <>", value, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmGreaterThan(Integer value) {
            addCriterion("student_zzmm >", value, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_zzmm >=", value, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmLessThan(Integer value) {
            addCriterion("student_zzmm <", value, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmLessThanOrEqualTo(Integer value) {
            addCriterion("student_zzmm <=", value, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmIn(List<Integer> values) {
            addCriterion("student_zzmm in", values, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmNotIn(List<Integer> values) {
            addCriterion("student_zzmm not in", values, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmBetween(Integer value1, Integer value2) {
            addCriterion("student_zzmm between", value1, value2, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZzmmNotBetween(Integer value1, Integer value2) {
            addCriterion("student_zzmm not between", value1, value2, "studentZzmm");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeIsNull() {
            addCriterion("student_zipCode is null");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeIsNotNull() {
            addCriterion("student_zipCode is not null");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeEqualTo(Integer value) {
            addCriterion("student_zipCode =", value, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeNotEqualTo(Integer value) {
            addCriterion("student_zipCode <>", value, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeGreaterThan(Integer value) {
            addCriterion("student_zipCode >", value, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_zipCode >=", value, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeLessThan(Integer value) {
            addCriterion("student_zipCode <", value, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeLessThanOrEqualTo(Integer value) {
            addCriterion("student_zipCode <=", value, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeIn(List<Integer> values) {
            addCriterion("student_zipCode in", values, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeNotIn(List<Integer> values) {
            addCriterion("student_zipCode not in", values, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeBetween(Integer value1, Integer value2) {
            addCriterion("student_zipCode between", value1, value2, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentZipcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_zipCode not between", value1, value2, "studentZipcode");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("student_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("student_phone =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("student_phone <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("student_phone >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_phone >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("student_phone <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_phone <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("student_phone like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("student_phone not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("student_phone in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("student_phone not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("student_phone between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_phone not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentXzIsNull() {
            addCriterion("student_xz is null");
            return (Criteria) this;
        }

        public Criteria andStudentXzIsNotNull() {
            addCriterion("student_xz is not null");
            return (Criteria) this;
        }

        public Criteria andStudentXzEqualTo(String value) {
            addCriterion("student_xz =", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzNotEqualTo(String value) {
            addCriterion("student_xz <>", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzGreaterThan(String value) {
            addCriterion("student_xz >", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzGreaterThanOrEqualTo(String value) {
            addCriterion("student_xz >=", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzLessThan(String value) {
            addCriterion("student_xz <", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzLessThanOrEqualTo(String value) {
            addCriterion("student_xz <=", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzLike(String value) {
            addCriterion("student_xz like", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzNotLike(String value) {
            addCriterion("student_xz not like", value, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzIn(List<String> values) {
            addCriterion("student_xz in", values, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzNotIn(List<String> values) {
            addCriterion("student_xz not in", values, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzBetween(String value1, String value2) {
            addCriterion("student_xz between", value1, value2, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentXzNotBetween(String value1, String value2) {
            addCriterion("student_xz not between", value1, value2, "studentXz");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNull() {
            addCriterion("student_class is null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNotNull() {
            addCriterion("student_class is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClassEqualTo(Integer value) {
            addCriterion("student_class =", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotEqualTo(Integer value) {
            addCriterion("student_class <>", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThan(Integer value) {
            addCriterion("student_class >", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_class >=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThan(Integer value) {
            addCriterion("student_class <", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThanOrEqualTo(Integer value) {
            addCriterion("student_class <=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassIn(List<Integer> values) {
            addCriterion("student_class in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotIn(List<Integer> values) {
            addCriterion("student_class not in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassBetween(Integer value1, Integer value2) {
            addCriterion("student_class between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotBetween(Integer value1, Integer value2) {
            addCriterion("student_class not between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyIsNull() {
            addCriterion("student_lqzy is null");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyIsNotNull() {
            addCriterion("student_lqzy is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyEqualTo(Integer value) {
            addCriterion("student_lqzy =", value, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyNotEqualTo(Integer value) {
            addCriterion("student_lqzy <>", value, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyGreaterThan(Integer value) {
            addCriterion("student_lqzy >", value, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_lqzy >=", value, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyLessThan(Integer value) {
            addCriterion("student_lqzy <", value, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyLessThanOrEqualTo(Integer value) {
            addCriterion("student_lqzy <=", value, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyIn(List<Integer> values) {
            addCriterion("student_lqzy in", values, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyNotIn(List<Integer> values) {
            addCriterion("student_lqzy not in", values, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyBetween(Integer value1, Integer value2) {
            addCriterion("student_lqzy between", value1, value2, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentLqzyNotBetween(Integer value1, Integer value2) {
            addCriterion("student_lqzy not between", value1, value2, "studentLqzy");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeIsNull() {
            addCriterion("student_relative is null");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeIsNotNull() {
            addCriterion("student_relative is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeEqualTo(Integer value) {
            addCriterion("student_relative =", value, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeNotEqualTo(Integer value) {
            addCriterion("student_relative <>", value, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeGreaterThan(Integer value) {
            addCriterion("student_relative >", value, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_relative >=", value, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeLessThan(Integer value) {
            addCriterion("student_relative <", value, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeLessThanOrEqualTo(Integer value) {
            addCriterion("student_relative <=", value, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeIn(List<Integer> values) {
            addCriterion("student_relative in", values, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeNotIn(List<Integer> values) {
            addCriterion("student_relative not in", values, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeBetween(Integer value1, Integer value2) {
            addCriterion("student_relative between", value1, value2, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentRelativeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_relative not between", value1, value2, "studentRelative");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNull() {
            addCriterion("student_QQ is null");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNotNull() {
            addCriterion("student_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andStudentQqEqualTo(String value) {
            addCriterion("student_QQ =", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotEqualTo(String value) {
            addCriterion("student_QQ <>", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThan(String value) {
            addCriterion("student_QQ >", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("student_QQ >=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThan(String value) {
            addCriterion("student_QQ <", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThanOrEqualTo(String value) {
            addCriterion("student_QQ <=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLike(String value) {
            addCriterion("student_QQ like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotLike(String value) {
            addCriterion("student_QQ not like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqIn(List<String> values) {
            addCriterion("student_QQ in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotIn(List<String> values) {
            addCriterion("student_QQ not in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqBetween(String value1, String value2) {
            addCriterion("student_QQ between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotBetween(String value1, String value2) {
            addCriterion("student_QQ not between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryIsNull() {
            addCriterion("student_dormitory is null");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryIsNotNull() {
            addCriterion("student_dormitory is not null");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryEqualTo(Integer value) {
            addCriterion("student_dormitory =", value, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryNotEqualTo(Integer value) {
            addCriterion("student_dormitory <>", value, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryGreaterThan(Integer value) {
            addCriterion("student_dormitory >", value, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_dormitory >=", value, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryLessThan(Integer value) {
            addCriterion("student_dormitory <", value, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryLessThanOrEqualTo(Integer value) {
            addCriterion("student_dormitory <=", value, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryIn(List<Integer> values) {
            addCriterion("student_dormitory in", values, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryNotIn(List<Integer> values) {
            addCriterion("student_dormitory not in", values, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryBetween(Integer value1, Integer value2) {
            addCriterion("student_dormitory between", value1, value2, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentDormitoryNotBetween(Integer value1, Integer value2) {
            addCriterion("student_dormitory not between", value1, value2, "studentDormitory");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionIsNull() {
            addCriterion("student_personalDescription is null");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionIsNotNull() {
            addCriterion("student_personalDescription is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionEqualTo(Integer value) {
            addCriterion("student_personalDescription =", value, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionNotEqualTo(Integer value) {
            addCriterion("student_personalDescription <>", value, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionGreaterThan(Integer value) {
            addCriterion("student_personalDescription >", value, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_personalDescription >=", value, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionLessThan(Integer value) {
            addCriterion("student_personalDescription <", value, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionLessThanOrEqualTo(Integer value) {
            addCriterion("student_personalDescription <=", value, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionIn(List<Integer> values) {
            addCriterion("student_personalDescription in", values, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionNotIn(List<Integer> values) {
            addCriterion("student_personalDescription not in", values, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionBetween(Integer value1, Integer value2) {
            addCriterion("student_personalDescription between", value1, value2, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentPersonaldescriptionNotBetween(Integer value1, Integer value2) {
            addCriterion("student_personalDescription not between", value1, value2, "studentPersonaldescription");
            return (Criteria) this;
        }

        public Criteria andStudentReligionIsNull() {
            addCriterion("student_religion is null");
            return (Criteria) this;
        }

        public Criteria andStudentReligionIsNotNull() {
            addCriterion("student_religion is not null");
            return (Criteria) this;
        }

        public Criteria andStudentReligionEqualTo(Integer value) {
            addCriterion("student_religion =", value, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionNotEqualTo(Integer value) {
            addCriterion("student_religion <>", value, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionGreaterThan(Integer value) {
            addCriterion("student_religion >", value, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_religion >=", value, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionLessThan(Integer value) {
            addCriterion("student_religion <", value, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionLessThanOrEqualTo(Integer value) {
            addCriterion("student_religion <=", value, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionIn(List<Integer> values) {
            addCriterion("student_religion in", values, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionNotIn(List<Integer> values) {
            addCriterion("student_religion not in", values, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionBetween(Integer value1, Integer value2) {
            addCriterion("student_religion between", value1, value2, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentReligionNotBetween(Integer value1, Integer value2) {
            addCriterion("student_religion not between", value1, value2, "studentReligion");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("student_address is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("student_address is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(Integer value) {
            addCriterion("student_address =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(Integer value) {
            addCriterion("student_address <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(Integer value) {
            addCriterion("student_address >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_address >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(Integer value) {
            addCriterion("student_address <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(Integer value) {
            addCriterion("student_address <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<Integer> values) {
            addCriterion("student_address in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<Integer> values) {
            addCriterion("student_address not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(Integer value1, Integer value2) {
            addCriterion("student_address between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("student_address not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentTimeIsNull() {
            addCriterion("student_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentTimeIsNotNull() {
            addCriterion("student_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTimeEqualTo(Integer value) {
            addCriterion("student_time =", value, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeNotEqualTo(Integer value) {
            addCriterion("student_time <>", value, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeGreaterThan(Integer value) {
            addCriterion("student_time >", value, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_time >=", value, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeLessThan(Integer value) {
            addCriterion("student_time <", value, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeLessThanOrEqualTo(Integer value) {
            addCriterion("student_time <=", value, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeIn(List<Integer> values) {
            addCriterion("student_time in", values, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeNotIn(List<Integer> values) {
            addCriterion("student_time not in", values, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeBetween(Integer value1, Integer value2) {
            addCriterion("student_time between", value1, value2, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_time not between", value1, value2, "studentTime");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicIsNull() {
            addCriterion("student_diadic is null");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicIsNotNull() {
            addCriterion("student_diadic is not null");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicEqualTo(Integer value) {
            addCriterion("student_diadic =", value, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicNotEqualTo(Integer value) {
            addCriterion("student_diadic <>", value, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicGreaterThan(Integer value) {
            addCriterion("student_diadic >", value, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_diadic >=", value, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicLessThan(Integer value) {
            addCriterion("student_diadic <", value, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicLessThanOrEqualTo(Integer value) {
            addCriterion("student_diadic <=", value, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicIn(List<Integer> values) {
            addCriterion("student_diadic in", values, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicNotIn(List<Integer> values) {
            addCriterion("student_diadic not in", values, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicBetween(Integer value1, Integer value2) {
            addCriterion("student_diadic between", value1, value2, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentDiadicNotBetween(Integer value1, Integer value2) {
            addCriterion("student_diadic not between", value1, value2, "studentDiadic");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxIsNull() {
            addCriterion("student_gkxx is null");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxIsNotNull() {
            addCriterion("student_gkxx is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxEqualTo(Integer value) {
            addCriterion("student_gkxx =", value, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxNotEqualTo(Integer value) {
            addCriterion("student_gkxx <>", value, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxGreaterThan(Integer value) {
            addCriterion("student_gkxx >", value, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_gkxx >=", value, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxLessThan(Integer value) {
            addCriterion("student_gkxx <", value, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxLessThanOrEqualTo(Integer value) {
            addCriterion("student_gkxx <=", value, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxIn(List<Integer> values) {
            addCriterion("student_gkxx in", values, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxNotIn(List<Integer> values) {
            addCriterion("student_gkxx not in", values, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxBetween(Integer value1, Integer value2) {
            addCriterion("student_gkxx between", value1, value2, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentGkxxNotBetween(Integer value1, Integer value2) {
            addCriterion("student_gkxx not between", value1, value2, "studentGkxx");
            return (Criteria) this;
        }

        public Criteria andStudentXfIsNull() {
            addCriterion("student_xf is null");
            return (Criteria) this;
        }

        public Criteria andStudentXfIsNotNull() {
            addCriterion("student_xf is not null");
            return (Criteria) this;
        }

        public Criteria andStudentXfEqualTo(Integer value) {
            addCriterion("student_xf =", value, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfNotEqualTo(Integer value) {
            addCriterion("student_xf <>", value, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfGreaterThan(Integer value) {
            addCriterion("student_xf >", value, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_xf >=", value, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfLessThan(Integer value) {
            addCriterion("student_xf <", value, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfLessThanOrEqualTo(Integer value) {
            addCriterion("student_xf <=", value, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfIn(List<Integer> values) {
            addCriterion("student_xf in", values, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfNotIn(List<Integer> values) {
            addCriterion("student_xf not in", values, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfBetween(Integer value1, Integer value2) {
            addCriterion("student_xf between", value1, value2, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentXfNotBetween(Integer value1, Integer value2) {
            addCriterion("student_xf not between", value1, value2, "studentXf");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIsNull() {
            addCriterion("student_idCard is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIsNotNull() {
            addCriterion("student_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardEqualTo(Integer value) {
            addCriterion("student_idCard =", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotEqualTo(Integer value) {
            addCriterion("student_idCard <>", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardGreaterThan(Integer value) {
            addCriterion("student_idCard >", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_idCard >=", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLessThan(Integer value) {
            addCriterion("student_idCard <", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardLessThanOrEqualTo(Integer value) {
            addCriterion("student_idCard <=", value, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardIn(List<Integer> values) {
            addCriterion("student_idCard in", values, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotIn(List<Integer> values) {
            addCriterion("student_idCard not in", values, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardBetween(Integer value1, Integer value2) {
            addCriterion("student_idCard between", value1, value2, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentIdcardNotBetween(Integer value1, Integer value2) {
            addCriterion("student_idCard not between", value1, value2, "studentIdcard");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeIsNull() {
            addCriterion("student_bloodType is null");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeIsNotNull() {
            addCriterion("student_bloodType is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeEqualTo(Integer value) {
            addCriterion("student_bloodType =", value, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeNotEqualTo(Integer value) {
            addCriterion("student_bloodType <>", value, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeGreaterThan(Integer value) {
            addCriterion("student_bloodType >", value, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_bloodType >=", value, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeLessThan(Integer value) {
            addCriterion("student_bloodType <", value, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeLessThanOrEqualTo(Integer value) {
            addCriterion("student_bloodType <=", value, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeIn(List<Integer> values) {
            addCriterion("student_bloodType in", values, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeNotIn(List<Integer> values) {
            addCriterion("student_bloodType not in", values, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeBetween(Integer value1, Integer value2) {
            addCriterion("student_bloodType between", value1, value2, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentBloodtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_bloodType not between", value1, value2, "studentBloodtype");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusIsNull() {
            addCriterion("student_healthStatus is null");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusIsNotNull() {
            addCriterion("student_healthStatus is not null");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusEqualTo(Integer value) {
            addCriterion("student_healthStatus =", value, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusNotEqualTo(Integer value) {
            addCriterion("student_healthStatus <>", value, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusGreaterThan(Integer value) {
            addCriterion("student_healthStatus >", value, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_healthStatus >=", value, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusLessThan(Integer value) {
            addCriterion("student_healthStatus <", value, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusLessThanOrEqualTo(Integer value) {
            addCriterion("student_healthStatus <=", value, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusIn(List<Integer> values) {
            addCriterion("student_healthStatus in", values, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusNotIn(List<Integer> values) {
            addCriterion("student_healthStatus not in", values, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusBetween(Integer value1, Integer value2) {
            addCriterion("student_healthStatus between", value1, value2, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentHealthstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("student_healthStatus not between", value1, value2, "studentHealthstatus");
            return (Criteria) this;
        }

        public Criteria andStudentLoanIsNull() {
            addCriterion("student_loan is null");
            return (Criteria) this;
        }

        public Criteria andStudentLoanIsNotNull() {
            addCriterion("student_loan is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLoanEqualTo(Integer value) {
            addCriterion("student_loan =", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanNotEqualTo(Integer value) {
            addCriterion("student_loan <>", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanGreaterThan(Integer value) {
            addCriterion("student_loan >", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_loan >=", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanLessThan(Integer value) {
            addCriterion("student_loan <", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanLessThanOrEqualTo(Integer value) {
            addCriterion("student_loan <=", value, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanIn(List<Integer> values) {
            addCriterion("student_loan in", values, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanNotIn(List<Integer> values) {
            addCriterion("student_loan not in", values, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanBetween(Integer value1, Integer value2) {
            addCriterion("student_loan between", value1, value2, "studentLoan");
            return (Criteria) this;
        }

        public Criteria andStudentLoanNotBetween(Integer value1, Integer value2) {
            addCriterion("student_loan not between", value1, value2, "studentLoan");
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