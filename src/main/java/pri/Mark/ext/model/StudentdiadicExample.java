package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.List;

public class StudentdiadicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentdiadicExample() {
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

        public Criteria andStudentdiadicIdIsNull() {
            addCriterion("studentDiadic_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdIsNotNull() {
            addCriterion("studentDiadic_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdEqualTo(Integer value) {
            addCriterion("studentDiadic_id =", value, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdNotEqualTo(Integer value) {
            addCriterion("studentDiadic_id <>", value, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdGreaterThan(Integer value) {
            addCriterion("studentDiadic_id >", value, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_id >=", value, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdLessThan(Integer value) {
            addCriterion("studentDiadic_id <", value, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdLessThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_id <=", value, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdIn(List<Integer> values) {
            addCriterion("studentDiadic_id in", values, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdNotIn(List<Integer> values) {
            addCriterion("studentDiadic_id not in", values, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_id between", value1, value2, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_id not between", value1, value2, "studentdiadicId");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildIsNull() {
            addCriterion("studentDiadic_onlyChild is null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildIsNotNull() {
            addCriterion("studentDiadic_onlyChild is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildEqualTo(Integer value) {
            addCriterion("studentDiadic_onlyChild =", value, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildNotEqualTo(Integer value) {
            addCriterion("studentDiadic_onlyChild <>", value, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildGreaterThan(Integer value) {
            addCriterion("studentDiadic_onlyChild >", value, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_onlyChild >=", value, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildLessThan(Integer value) {
            addCriterion("studentDiadic_onlyChild <", value, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildLessThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_onlyChild <=", value, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildIn(List<Integer> values) {
            addCriterion("studentDiadic_onlyChild in", values, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildNotIn(List<Integer> values) {
            addCriterion("studentDiadic_onlyChild not in", values, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_onlyChild between", value1, value2, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOnlychildNotBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_onlyChild not between", value1, value2, "studentdiadicOnlychild");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryIsNull() {
            addCriterion("studentDiadic_preprimary is null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryIsNotNull() {
            addCriterion("studentDiadic_preprimary is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryEqualTo(Integer value) {
            addCriterion("studentDiadic_preprimary =", value, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryNotEqualTo(Integer value) {
            addCriterion("studentDiadic_preprimary <>", value, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryGreaterThan(Integer value) {
            addCriterion("studentDiadic_preprimary >", value, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_preprimary >=", value, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryLessThan(Integer value) {
            addCriterion("studentDiadic_preprimary <", value, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryLessThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_preprimary <=", value, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryIn(List<Integer> values) {
            addCriterion("studentDiadic_preprimary in", values, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryNotIn(List<Integer> values) {
            addCriterion("studentDiadic_preprimary not in", values, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_preprimary between", value1, value2, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicPreprimaryNotBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_preprimary not between", value1, value2, "studentdiadicPreprimary");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenIsNull() {
            addCriterion("studentDiadic_leftBehindChildren is null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenIsNotNull() {
            addCriterion("studentDiadic_leftBehindChildren is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenEqualTo(Integer value) {
            addCriterion("studentDiadic_leftBehindChildren =", value, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenNotEqualTo(Integer value) {
            addCriterion("studentDiadic_leftBehindChildren <>", value, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenGreaterThan(Integer value) {
            addCriterion("studentDiadic_leftBehindChildren >", value, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_leftBehindChildren >=", value, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenLessThan(Integer value) {
            addCriterion("studentDiadic_leftBehindChildren <", value, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenLessThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_leftBehindChildren <=", value, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenIn(List<Integer> values) {
            addCriterion("studentDiadic_leftBehindChildren in", values, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenNotIn(List<Integer> values) {
            addCriterion("studentDiadic_leftBehindChildren not in", values, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_leftBehindChildren between", value1, value2, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLeftbehindchildrenNotBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_leftBehindChildren not between", value1, value2, "studentdiadicLeftbehindchildren");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznIsNull() {
            addCriterion("studentDiadic_jcwgrysqzn is null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznIsNotNull() {
            addCriterion("studentDiadic_jcwgrysqzn is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznEqualTo(Integer value) {
            addCriterion("studentDiadic_jcwgrysqzn =", value, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznNotEqualTo(Integer value) {
            addCriterion("studentDiadic_jcwgrysqzn <>", value, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznGreaterThan(Integer value) {
            addCriterion("studentDiadic_jcwgrysqzn >", value, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_jcwgrysqzn >=", value, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznLessThan(Integer value) {
            addCriterion("studentDiadic_jcwgrysqzn <", value, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznLessThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_jcwgrysqzn <=", value, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznIn(List<Integer> values) {
            addCriterion("studentDiadic_jcwgrysqzn in", values, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznNotIn(List<Integer> values) {
            addCriterion("studentDiadic_jcwgrysqzn not in", values, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_jcwgrysqzn between", value1, value2, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicJcwgrysqznNotBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_jcwgrysqzn not between", value1, value2, "studentdiadicJcwgrysqzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanIsNull() {
            addCriterion("studentDiadic_orphan is null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanIsNotNull() {
            addCriterion("studentDiadic_orphan is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanEqualTo(Integer value) {
            addCriterion("studentDiadic_orphan =", value, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanNotEqualTo(Integer value) {
            addCriterion("studentDiadic_orphan <>", value, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanGreaterThan(Integer value) {
            addCriterion("studentDiadic_orphan >", value, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_orphan >=", value, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanLessThan(Integer value) {
            addCriterion("studentDiadic_orphan <", value, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanLessThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_orphan <=", value, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanIn(List<Integer> values) {
            addCriterion("studentDiadic_orphan in", values, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanNotIn(List<Integer> values) {
            addCriterion("studentDiadic_orphan not in", values, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_orphan between", value1, value2, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicOrphanNotBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_orphan not between", value1, value2, "studentdiadicOrphan");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznIsNull() {
            addCriterion("studentDiadic_lshyfzn is null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznIsNotNull() {
            addCriterion("studentDiadic_lshyfzn is not null");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznEqualTo(Integer value) {
            addCriterion("studentDiadic_lshyfzn =", value, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznNotEqualTo(Integer value) {
            addCriterion("studentDiadic_lshyfzn <>", value, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznGreaterThan(Integer value) {
            addCriterion("studentDiadic_lshyfzn >", value, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_lshyfzn >=", value, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznLessThan(Integer value) {
            addCriterion("studentDiadic_lshyfzn <", value, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznLessThanOrEqualTo(Integer value) {
            addCriterion("studentDiadic_lshyfzn <=", value, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznIn(List<Integer> values) {
            addCriterion("studentDiadic_lshyfzn in", values, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznNotIn(List<Integer> values) {
            addCriterion("studentDiadic_lshyfzn not in", values, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_lshyfzn between", value1, value2, "studentdiadicLshyfzn");
            return (Criteria) this;
        }

        public Criteria andStudentdiadicLshyfznNotBetween(Integer value1, Integer value2) {
            addCriterion("studentDiadic_lshyfzn not between", value1, value2, "studentdiadicLshyfzn");
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