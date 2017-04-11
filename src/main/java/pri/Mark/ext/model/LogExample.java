package pri.Mark.ext.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTablenameIsNull() {
            addCriterion("log_tableName is null");
            return (Criteria) this;
        }

        public Criteria andLogTablenameIsNotNull() {
            addCriterion("log_tableName is not null");
            return (Criteria) this;
        }

        public Criteria andLogTablenameEqualTo(Integer value) {
            addCriterion("log_tableName =", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameNotEqualTo(Integer value) {
            addCriterion("log_tableName <>", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameGreaterThan(Integer value) {
            addCriterion("log_tableName >", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_tableName >=", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameLessThan(Integer value) {
            addCriterion("log_tableName <", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameLessThanOrEqualTo(Integer value) {
            addCriterion("log_tableName <=", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameIn(List<Integer> values) {
            addCriterion("log_tableName in", values, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameNotIn(List<Integer> values) {
            addCriterion("log_tableName not in", values, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameBetween(Integer value1, Integer value2) {
            addCriterion("log_tableName between", value1, value2, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameNotBetween(Integer value1, Integer value2) {
            addCriterion("log_tableName not between", value1, value2, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeIsNull() {
            addCriterion("log_landTime is null");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeIsNotNull() {
            addCriterion("log_landTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeEqualTo(Date value) {
            addCriterion("log_landTime =", value, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeNotEqualTo(Date value) {
            addCriterion("log_landTime <>", value, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeGreaterThan(Date value) {
            addCriterion("log_landTime >", value, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_landTime >=", value, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeLessThan(Date value) {
            addCriterion("log_landTime <", value, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeLessThanOrEqualTo(Date value) {
            addCriterion("log_landTime <=", value, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeIn(List<Date> values) {
            addCriterion("log_landTime in", values, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeNotIn(List<Date> values) {
            addCriterion("log_landTime not in", values, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeBetween(Date value1, Date value2) {
            addCriterion("log_landTime between", value1, value2, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogLandtimeNotBetween(Date value1, Date value2) {
            addCriterion("log_landTime not between", value1, value2, "logLandtime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeIsNull() {
            addCriterion("log_outTime is null");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeIsNotNull() {
            addCriterion("log_outTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeEqualTo(Date value) {
            addCriterion("log_outTime =", value, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeNotEqualTo(Date value) {
            addCriterion("log_outTime <>", value, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeGreaterThan(Date value) {
            addCriterion("log_outTime >", value, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_outTime >=", value, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeLessThan(Date value) {
            addCriterion("log_outTime <", value, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeLessThanOrEqualTo(Date value) {
            addCriterion("log_outTime <=", value, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeIn(List<Date> values) {
            addCriterion("log_outTime in", values, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeNotIn(List<Date> values) {
            addCriterion("log_outTime not in", values, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeBetween(Date value1, Date value2) {
            addCriterion("log_outTime between", value1, value2, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogOuttimeNotBetween(Date value1, Date value2) {
            addCriterion("log_outTime not between", value1, value2, "logOuttime");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNull() {
            addCriterion("log_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNotNull() {
            addCriterion("log_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogIpEqualTo(String value) {
            addCriterion("log_ip =", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotEqualTo(String value) {
            addCriterion("log_ip <>", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThan(String value) {
            addCriterion("log_ip >", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("log_ip >=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThan(String value) {
            addCriterion("log_ip <", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThanOrEqualTo(String value) {
            addCriterion("log_ip <=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLike(String value) {
            addCriterion("log_ip like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotLike(String value) {
            addCriterion("log_ip not like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpIn(List<String> values) {
            addCriterion("log_ip in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotIn(List<String> values) {
            addCriterion("log_ip not in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpBetween(String value1, String value2) {
            addCriterion("log_ip between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotBetween(String value1, String value2) {
            addCriterion("log_ip not between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeIsNull() {
            addCriterion("log_operateType is null");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeIsNotNull() {
            addCriterion("log_operateType is not null");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeEqualTo(String value) {
            addCriterion("log_operateType =", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeNotEqualTo(String value) {
            addCriterion("log_operateType <>", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeGreaterThan(String value) {
            addCriterion("log_operateType >", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_operateType >=", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeLessThan(String value) {
            addCriterion("log_operateType <", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeLessThanOrEqualTo(String value) {
            addCriterion("log_operateType <=", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeLike(String value) {
            addCriterion("log_operateType like", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeNotLike(String value) {
            addCriterion("log_operateType not like", value, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeIn(List<String> values) {
            addCriterion("log_operateType in", values, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeNotIn(List<String> values) {
            addCriterion("log_operateType not in", values, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeBetween(String value1, String value2) {
            addCriterion("log_operateType between", value1, value2, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogOperatetypeNotBetween(String value1, String value2) {
            addCriterion("log_operateType not between", value1, value2, "logOperatetype");
            return (Criteria) this;
        }

        public Criteria andLogBrowserIsNull() {
            addCriterion("log_browser is null");
            return (Criteria) this;
        }

        public Criteria andLogBrowserIsNotNull() {
            addCriterion("log_browser is not null");
            return (Criteria) this;
        }

        public Criteria andLogBrowserEqualTo(String value) {
            addCriterion("log_browser =", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserNotEqualTo(String value) {
            addCriterion("log_browser <>", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserGreaterThan(String value) {
            addCriterion("log_browser >", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("log_browser >=", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserLessThan(String value) {
            addCriterion("log_browser <", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserLessThanOrEqualTo(String value) {
            addCriterion("log_browser <=", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserLike(String value) {
            addCriterion("log_browser like", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserNotLike(String value) {
            addCriterion("log_browser not like", value, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserIn(List<String> values) {
            addCriterion("log_browser in", values, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserNotIn(List<String> values) {
            addCriterion("log_browser not in", values, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserBetween(String value1, String value2) {
            addCriterion("log_browser between", value1, value2, "logBrowser");
            return (Criteria) this;
        }

        public Criteria andLogBrowserNotBetween(String value1, String value2) {
            addCriterion("log_browser not between", value1, value2, "logBrowser");
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