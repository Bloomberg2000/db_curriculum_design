package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AwardsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardsExample() {
        oredCriteria = new ArrayList<>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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
            criteria = new ArrayList<>();
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andDStartDateIsNull() {
            addCriterion("d_start_date is null");
            return (Criteria) this;
        }

        public Criteria andDStartDateIsNotNull() {
            addCriterion("d_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andDStartDateEqualTo(Date value) {
            addCriterion("d_start_date =", value, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateNotEqualTo(Date value) {
            addCriterion("d_start_date <>", value, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateGreaterThan(Date value) {
            addCriterion("d_start_date >", value, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("d_start_date >=", value, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateLessThan(Date value) {
            addCriterion("d_start_date <", value, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateLessThanOrEqualTo(Date value) {
            addCriterion("d_start_date <=", value, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateIn(List<Date> values) {
            addCriterion("d_start_date in", values, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateNotIn(List<Date> values) {
            addCriterion("d_start_date not in", values, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateBetween(Date value1, Date value2) {
            addCriterion("d_start_date between", value1, value2, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDStartDateNotBetween(Date value1, Date value2) {
            addCriterion("d_start_date not between", value1, value2, "dStartDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateIsNull() {
            addCriterion("d_end_date is null");
            return (Criteria) this;
        }

        public Criteria andDEndDateIsNotNull() {
            addCriterion("d_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andDEndDateEqualTo(Date value) {
            addCriterion("d_end_date =", value, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateNotEqualTo(Date value) {
            addCriterion("d_end_date <>", value, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateGreaterThan(Date value) {
            addCriterion("d_end_date >", value, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("d_end_date >=", value, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateLessThan(Date value) {
            addCriterion("d_end_date <", value, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateLessThanOrEqualTo(Date value) {
            addCriterion("d_end_date <=", value, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateIn(List<Date> values) {
            addCriterion("d_end_date in", values, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateNotIn(List<Date> values) {
            addCriterion("d_end_date not in", values, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateBetween(Date value1, Date value2) {
            addCriterion("d_end_date between", value1, value2, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andDEndDateNotBetween(Date value1, Date value2) {
            addCriterion("d_end_date not between", value1, value2, "dEndDate");
            return (Criteria) this;
        }

        public Criteria andCLocationIsNull() {
            addCriterion("c_location is null");
            return (Criteria) this;
        }

        public Criteria andCLocationIsNotNull() {
            addCriterion("c_location is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationEqualTo(String value) {
            addCriterion("c_location =", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotEqualTo(String value) {
            addCriterion("c_location <>", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationGreaterThan(String value) {
            addCriterion("c_location >", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationGreaterThanOrEqualTo(String value) {
            addCriterion("c_location >=", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationLessThan(String value) {
            addCriterion("c_location <", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationLessThanOrEqualTo(String value) {
            addCriterion("c_location <=", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationLike(String value) {
            addCriterion("c_location like", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotLike(String value) {
            addCriterion("c_location not like", value, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationIn(List<String> values) {
            addCriterion("c_location in", values, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotIn(List<String> values) {
            addCriterion("c_location not in", values, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationBetween(String value1, String value2) {
            addCriterion("c_location between", value1, value2, "cLocation");
            return (Criteria) this;
        }

        public Criteria andCLocationNotBetween(String value1, String value2) {
            addCriterion("c_location not between", value1, value2, "cLocation");
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
    }
}