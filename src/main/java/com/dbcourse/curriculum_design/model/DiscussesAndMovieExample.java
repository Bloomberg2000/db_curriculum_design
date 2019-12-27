package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscussesAndMovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscussesAndMovieExample() {
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

        public Criteria andDiscussesidIsNull() {
            addCriterion("DiscussesId is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesidIsNotNull() {
            addCriterion("DiscussesId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesidEqualTo(Integer value) {
            addCriterion("DiscussesId =", value, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidNotEqualTo(Integer value) {
            addCriterion("DiscussesId <>", value, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidGreaterThan(Integer value) {
            addCriterion("DiscussesId >", value, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscussesId >=", value, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidLessThan(Integer value) {
            addCriterion("DiscussesId <", value, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidLessThanOrEqualTo(Integer value) {
            addCriterion("DiscussesId <=", value, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidIn(List<Integer> values) {
            addCriterion("DiscussesId in", values, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidNotIn(List<Integer> values) {
            addCriterion("DiscussesId not in", values, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesId between", value1, value2, "discussesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesidNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesId not between", value1, value2, "discussesid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeIsNull() {
            addCriterion("DiscussesCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeIsNotNull() {
            addCriterion("DiscussesCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeEqualTo(Date value) {
            addCriterion("DiscussesCreateTime =", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeNotEqualTo(Date value) {
            addCriterion("DiscussesCreateTime <>", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeGreaterThan(Date value) {
            addCriterion("DiscussesCreateTime >", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DiscussesCreateTime >=", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeLessThan(Date value) {
            addCriterion("DiscussesCreateTime <", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DiscussesCreateTime <=", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeIn(List<Date> values) {
            addCriterion("DiscussesCreateTime in", values, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeNotIn(List<Date> values) {
            addCriterion("DiscussesCreateTime not in", values, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeBetween(Date value1, Date value2) {
            addCriterion("DiscussesCreateTime between", value1, value2, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DiscussesCreateTime not between", value1, value2, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameIsNull() {
            addCriterion("DiscussesName is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameIsNotNull() {
            addCriterion("DiscussesName is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameEqualTo(String value) {
            addCriterion("DiscussesName =", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotEqualTo(String value) {
            addCriterion("DiscussesName <>", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameGreaterThan(String value) {
            addCriterion("DiscussesName >", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameGreaterThanOrEqualTo(String value) {
            addCriterion("DiscussesName >=", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameLessThan(String value) {
            addCriterion("DiscussesName <", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameLessThanOrEqualTo(String value) {
            addCriterion("DiscussesName <=", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameLike(String value) {
            addCriterion("DiscussesName like", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotLike(String value) {
            addCriterion("DiscussesName not like", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameIn(List<String> values) {
            addCriterion("DiscussesName in", values, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotIn(List<String> values) {
            addCriterion("DiscussesName not in", values, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameBetween(String value1, String value2) {
            addCriterion("DiscussesName between", value1, value2, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotBetween(String value1, String value2) {
            addCriterion("DiscussesName not between", value1, value2, "discussesname");
            return (Criteria) this;
        }

        public Criteria andMovieidIsNull() {
            addCriterion("MovieId is null");
            return (Criteria) this;
        }

        public Criteria andMovieidIsNotNull() {
            addCriterion("MovieId is not null");
            return (Criteria) this;
        }

        public Criteria andMovieidEqualTo(Integer value) {
            addCriterion("MovieId =", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotEqualTo(Integer value) {
            addCriterion("MovieId <>", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThan(Integer value) {
            addCriterion("MovieId >", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MovieId >=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThan(Integer value) {
            addCriterion("MovieId <", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidLessThanOrEqualTo(Integer value) {
            addCriterion("MovieId <=", value, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidIn(List<Integer> values) {
            addCriterion("MovieId in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotIn(List<Integer> values) {
            addCriterion("MovieId not in", values, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidBetween(Integer value1, Integer value2) {
            addCriterion("MovieId between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovieidNotBetween(Integer value1, Integer value2) {
            addCriterion("MovieId not between", value1, value2, "movieid");
            return (Criteria) this;
        }

        public Criteria andMovienameIsNull() {
            addCriterion("MovieName is null");
            return (Criteria) this;
        }

        public Criteria andMovienameIsNotNull() {
            addCriterion("MovieName is not null");
            return (Criteria) this;
        }

        public Criteria andMovienameEqualTo(String value) {
            addCriterion("MovieName =", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotEqualTo(String value) {
            addCriterion("MovieName <>", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameGreaterThan(String value) {
            addCriterion("MovieName >", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameGreaterThanOrEqualTo(String value) {
            addCriterion("MovieName >=", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameLessThan(String value) {
            addCriterion("MovieName <", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameLessThanOrEqualTo(String value) {
            addCriterion("MovieName <=", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameLike(String value) {
            addCriterion("MovieName like", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotLike(String value) {
            addCriterion("MovieName not like", value, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameIn(List<String> values) {
            addCriterion("MovieName in", values, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotIn(List<String> values) {
            addCriterion("MovieName not in", values, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameBetween(String value1, String value2) {
            addCriterion("MovieName between", value1, value2, "moviename");
            return (Criteria) this;
        }

        public Criteria andMovienameNotBetween(String value1, String value2) {
            addCriterion("MovieName not between", value1, value2, "moviename");
            return (Criteria) this;
        }

        public Criteria andMoviecoverIsNull() {
            addCriterion("MovieCover is null");
            return (Criteria) this;
        }

        public Criteria andMoviecoverIsNotNull() {
            addCriterion("MovieCover is not null");
            return (Criteria) this;
        }

        public Criteria andMoviecoverEqualTo(String value) {
            addCriterion("MovieCover =", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverNotEqualTo(String value) {
            addCriterion("MovieCover <>", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverGreaterThan(String value) {
            addCriterion("MovieCover >", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverGreaterThanOrEqualTo(String value) {
            addCriterion("MovieCover >=", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverLessThan(String value) {
            addCriterion("MovieCover <", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverLessThanOrEqualTo(String value) {
            addCriterion("MovieCover <=", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverLike(String value) {
            addCriterion("MovieCover like", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverNotLike(String value) {
            addCriterion("MovieCover not like", value, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverIn(List<String> values) {
            addCriterion("MovieCover in", values, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverNotIn(List<String> values) {
            addCriterion("MovieCover not in", values, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverBetween(String value1, String value2) {
            addCriterion("MovieCover between", value1, value2, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviecoverNotBetween(String value1, String value2) {
            addCriterion("MovieCover not between", value1, value2, "moviecover");
            return (Criteria) this;
        }

        public Criteria andMoviescoreIsNull() {
            addCriterion("MovieScore is null");
            return (Criteria) this;
        }

        public Criteria andMoviescoreIsNotNull() {
            addCriterion("MovieScore is not null");
            return (Criteria) this;
        }

        public Criteria andMoviescoreEqualTo(Float value) {
            addCriterion("MovieScore =", value, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreNotEqualTo(Float value) {
            addCriterion("MovieScore <>", value, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreGreaterThan(Float value) {
            addCriterion("MovieScore >", value, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreGreaterThanOrEqualTo(Float value) {
            addCriterion("MovieScore >=", value, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreLessThan(Float value) {
            addCriterion("MovieScore <", value, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreLessThanOrEqualTo(Float value) {
            addCriterion("MovieScore <=", value, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreIn(List<Float> values) {
            addCriterion("MovieScore in", values, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreNotIn(List<Float> values) {
            addCriterion("MovieScore not in", values, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreBetween(Float value1, Float value2) {
            addCriterion("MovieScore between", value1, value2, "moviescore");
            return (Criteria) this;
        }

        public Criteria andMoviescoreNotBetween(Float value1, Float value2) {
            addCriterion("MovieScore not between", value1, value2, "moviescore");
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