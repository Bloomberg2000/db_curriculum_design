package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesStaffsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoviesStaffsExample() {
        oredCriteria = new ArrayList<>();
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

        public Criteria andNMovieIdIsNull() {
            addCriterion("n_movie_id is null");
            return (Criteria) this;
        }

        public Criteria andNMovieIdIsNotNull() {
            addCriterion("n_movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andNMovieIdEqualTo(Integer value) {
            addCriterion("n_movie_id =", value, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdNotEqualTo(Integer value) {
            addCriterion("n_movie_id <>", value, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdGreaterThan(Integer value) {
            addCriterion("n_movie_id >", value, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_movie_id >=", value, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdLessThan(Integer value) {
            addCriterion("n_movie_id <", value, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_movie_id <=", value, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdIn(List<Integer> values) {
            addCriterion("n_movie_id in", values, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdNotIn(List<Integer> values) {
            addCriterion("n_movie_id not in", values, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("n_movie_id between", value1, value2, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_movie_id not between", value1, value2, "nMovieId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdIsNull() {
            addCriterion("n_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andNStaffIdIsNotNull() {
            addCriterion("n_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andNStaffIdEqualTo(Integer value) {
            addCriterion("n_staff_id =", value, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdNotEqualTo(Integer value) {
            addCriterion("n_staff_id <>", value, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdGreaterThan(Integer value) {
            addCriterion("n_staff_id >", value, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_staff_id >=", value, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdLessThan(Integer value) {
            addCriterion("n_staff_id <", value, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_staff_id <=", value, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdIn(List<Integer> values) {
            addCriterion("n_staff_id in", values, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdNotIn(List<Integer> values) {
            addCriterion("n_staff_id not in", values, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("n_staff_id between", value1, value2, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_staff_id not between", value1, value2, "nStaffId");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNull() {
            addCriterion("n_type is null");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNotNull() {
            addCriterion("n_type is not null");
            return (Criteria) this;
        }

        public Criteria andNTypeEqualTo(Integer value) {
            addCriterion("n_type =", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotEqualTo(Integer value) {
            addCriterion("n_type <>", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThan(Integer value) {
            addCriterion("n_type >", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_type >=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThan(Integer value) {
            addCriterion("n_type <", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThanOrEqualTo(Integer value) {
            addCriterion("n_type <=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeIn(List<Integer> values) {
            addCriterion("n_type in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotIn(List<Integer> values) {
            addCriterion("n_type not in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeBetween(Integer value1, Integer value2) {
            addCriterion("n_type between", value1, value2, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_type not between", value1, value2, "nType");
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