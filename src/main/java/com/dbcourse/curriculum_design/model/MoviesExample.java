package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MoviesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoviesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCFilmLengthIsNull() {
            addCriterion("c_film_length is null");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthIsNotNull() {
            addCriterion("c_film_length is not null");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthEqualTo(Integer value) {
            addCriterion("c_film_length =", value, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthNotEqualTo(Integer value) {
            addCriterion("c_film_length <>", value, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthGreaterThan(Integer value) {
            addCriterion("c_film_length >", value, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_film_length >=", value, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthLessThan(Integer value) {
            addCriterion("c_film_length <", value, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthLessThanOrEqualTo(Integer value) {
            addCriterion("c_film_length <=", value, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthIn(List<Integer> values) {
            addCriterion("c_film_length in", values, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthNotIn(List<Integer> values) {
            addCriterion("c_film_length not in", values, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthBetween(Integer value1, Integer value2) {
            addCriterion("c_film_length between", value1, value2, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCFilmLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("c_film_length not between", value1, value2, "cFilmLength");
            return (Criteria) this;
        }

        public Criteria andCAliasIsNull() {
            addCriterion("c_alias is null");
            return (Criteria) this;
        }

        public Criteria andCAliasIsNotNull() {
            addCriterion("c_alias is not null");
            return (Criteria) this;
        }

        public Criteria andCAliasEqualTo(String value) {
            addCriterion("c_alias =", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasNotEqualTo(String value) {
            addCriterion("c_alias <>", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasGreaterThan(String value) {
            addCriterion("c_alias >", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasGreaterThanOrEqualTo(String value) {
            addCriterion("c_alias >=", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasLessThan(String value) {
            addCriterion("c_alias <", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasLessThanOrEqualTo(String value) {
            addCriterion("c_alias <=", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasLike(String value) {
            addCriterion("c_alias like", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasNotLike(String value) {
            addCriterion("c_alias not like", value, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasIn(List<String> values) {
            addCriterion("c_alias in", values, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasNotIn(List<String> values) {
            addCriterion("c_alias not in", values, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasBetween(String value1, String value2) {
            addCriterion("c_alias between", value1, value2, "cAlias");
            return (Criteria) this;
        }

        public Criteria andCAliasNotBetween(String value1, String value2) {
            addCriterion("c_alias not between", value1, value2, "cAlias");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateIsNull() {
            addCriterion("d_release_date is null");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateIsNotNull() {
            addCriterion("d_release_date is not null");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("d_release_date =", value, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("d_release_date <>", value, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("d_release_date >", value, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_release_date >=", value, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("d_release_date <", value, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_release_date <=", value, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("d_release_date in", values, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("d_release_date not in", values, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_release_date between", value1, value2, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andDReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_release_date not between", value1, value2, "dReleaseDate");
            return (Criteria) this;
        }

        public Criteria andCDateStrIsNull() {
            addCriterion("c_date_str is null");
            return (Criteria) this;
        }

        public Criteria andCDateStrIsNotNull() {
            addCriterion("c_date_str is not null");
            return (Criteria) this;
        }

        public Criteria andCDateStrEqualTo(String value) {
            addCriterion("c_date_str =", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrNotEqualTo(String value) {
            addCriterion("c_date_str <>", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrGreaterThan(String value) {
            addCriterion("c_date_str >", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrGreaterThanOrEqualTo(String value) {
            addCriterion("c_date_str >=", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrLessThan(String value) {
            addCriterion("c_date_str <", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrLessThanOrEqualTo(String value) {
            addCriterion("c_date_str <=", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrLike(String value) {
            addCriterion("c_date_str like", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrNotLike(String value) {
            addCriterion("c_date_str not like", value, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrIn(List<String> values) {
            addCriterion("c_date_str in", values, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrNotIn(List<String> values) {
            addCriterion("c_date_str not in", values, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrBetween(String value1, String value2) {
            addCriterion("c_date_str between", value1, value2, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCDateStrNotBetween(String value1, String value2) {
            addCriterion("c_date_str not between", value1, value2, "cDateStr");
            return (Criteria) this;
        }

        public Criteria andCInfoIsNull() {
            addCriterion("c_info is null");
            return (Criteria) this;
        }

        public Criteria andCInfoIsNotNull() {
            addCriterion("c_info is not null");
            return (Criteria) this;
        }

        public Criteria andCInfoEqualTo(String value) {
            addCriterion("c_info =", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotEqualTo(String value) {
            addCriterion("c_info <>", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoGreaterThan(String value) {
            addCriterion("c_info >", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoGreaterThanOrEqualTo(String value) {
            addCriterion("c_info >=", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoLessThan(String value) {
            addCriterion("c_info <", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoLessThanOrEqualTo(String value) {
            addCriterion("c_info <=", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoLike(String value) {
            addCriterion("c_info like", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotLike(String value) {
            addCriterion("c_info not like", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoIn(List<String> values) {
            addCriterion("c_info in", values, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotIn(List<String> values) {
            addCriterion("c_info not in", values, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoBetween(String value1, String value2) {
            addCriterion("c_info between", value1, value2, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotBetween(String value1, String value2) {
            addCriterion("c_info not between", value1, value2, "cInfo");
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