package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscussesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscussesExample() {
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

        public Criteria andNUserIdIsNull() {
            addCriterion("n_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNUserIdIsNotNull() {
            addCriterion("n_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNUserIdEqualTo(Integer value) {
            addCriterion("n_user_id =", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotEqualTo(Integer value) {
            addCriterion("n_user_id <>", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdGreaterThan(Integer value) {
            addCriterion("n_user_id >", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_user_id >=", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdLessThan(Integer value) {
            addCriterion("n_user_id <", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_user_id <=", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdIn(List<Integer> values) {
            addCriterion("n_user_id in", values, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotIn(List<Integer> values) {
            addCriterion("n_user_id not in", values, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdBetween(Integer value1, Integer value2) {
            addCriterion("n_user_id between", value1, value2, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_user_id not between", value1, value2, "nUserId");
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

        public Criteria andDCreateTimeIsNull() {
            addCriterion("d_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNotNull() {
            addCriterion("d_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeEqualTo(Date value) {
            addCriterion("d_create_time =", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotEqualTo(Date value) {
            addCriterion("d_create_time <>", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThan(Date value) {
            addCriterion("d_create_time >", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_create_time >=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThan(Date value) {
            addCriterion("d_create_time <", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_create_time <=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIn(List<Date> values) {
            addCriterion("d_create_time in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotIn(List<Date> values) {
            addCriterion("d_create_time not in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeBetween(Date value1, Date value2) {
            addCriterion("d_create_time between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_create_time not between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeIsNull() {
            addCriterion("d_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andDEditTimeIsNotNull() {
            addCriterion("d_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andDEditTimeEqualTo(Date value) {
            addCriterion("d_edit_time =", value, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeNotEqualTo(Date value) {
            addCriterion("d_edit_time <>", value, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeGreaterThan(Date value) {
            addCriterion("d_edit_time >", value, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_edit_time >=", value, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeLessThan(Date value) {
            addCriterion("d_edit_time <", value, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_edit_time <=", value, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeIn(List<Date> values) {
            addCriterion("d_edit_time in", values, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeNotIn(List<Date> values) {
            addCriterion("d_edit_time not in", values, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeBetween(Date value1, Date value2) {
            addCriterion("d_edit_time between", value1, value2, "dEditTime");
            return (Criteria) this;
        }

        public Criteria andDEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_edit_time not between", value1, value2, "dEditTime");
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