package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.List;

public class TagIdAndMovieInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TagIdAndMovieInfoExample() {
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

        public Criteria andTagidIsNull() {
            addCriterion("TagId is null");
            return (Criteria) this;
        }

        public Criteria andTagidIsNotNull() {
            addCriterion("TagId is not null");
            return (Criteria) this;
        }

        public Criteria andTagidEqualTo(Integer value) {
            addCriterion("TagId =", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidNotEqualTo(Integer value) {
            addCriterion("TagId <>", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidGreaterThan(Integer value) {
            addCriterion("TagId >", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TagId >=", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidLessThan(Integer value) {
            addCriterion("TagId <", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidLessThanOrEqualTo(Integer value) {
            addCriterion("TagId <=", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidIn(List<Integer> values) {
            addCriterion("TagId in", values, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidNotIn(List<Integer> values) {
            addCriterion("TagId not in", values, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidBetween(Integer value1, Integer value2) {
            addCriterion("TagId between", value1, value2, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidNotBetween(Integer value1, Integer value2) {
            addCriterion("TagId not between", value1, value2, "tagid");
            return (Criteria) this;
        }

        public Criteria andMoiveidIsNull() {
            addCriterion("MoiveId is null");
            return (Criteria) this;
        }

        public Criteria andMoiveidIsNotNull() {
            addCriterion("MoiveId is not null");
            return (Criteria) this;
        }

        public Criteria andMoiveidEqualTo(Integer value) {
            addCriterion("MoiveId =", value, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidNotEqualTo(Integer value) {
            addCriterion("MoiveId <>", value, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidGreaterThan(Integer value) {
            addCriterion("MoiveId >", value, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoiveId >=", value, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidLessThan(Integer value) {
            addCriterion("MoiveId <", value, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidLessThanOrEqualTo(Integer value) {
            addCriterion("MoiveId <=", value, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidIn(List<Integer> values) {
            addCriterion("MoiveId in", values, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidNotIn(List<Integer> values) {
            addCriterion("MoiveId not in", values, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidBetween(Integer value1, Integer value2) {
            addCriterion("MoiveId between", value1, value2, "moiveid");
            return (Criteria) this;
        }

        public Criteria andMoiveidNotBetween(Integer value1, Integer value2) {
            addCriterion("MoiveId not between", value1, value2, "moiveid");
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