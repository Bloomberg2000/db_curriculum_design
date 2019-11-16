package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesAndAwardsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoviesAndAwardsExample() {
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

        public Criteria andAwardidIsNull() {
            addCriterion("AwardID is null");
            return (Criteria) this;
        }

        public Criteria andAwardidIsNotNull() {
            addCriterion("AwardID is not null");
            return (Criteria) this;
        }

        public Criteria andAwardidEqualTo(Integer value) {
            addCriterion("AwardID =", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotEqualTo(Integer value) {
            addCriterion("AwardID <>", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidGreaterThan(Integer value) {
            addCriterion("AwardID >", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AwardID >=", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidLessThan(Integer value) {
            addCriterion("AwardID <", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidLessThanOrEqualTo(Integer value) {
            addCriterion("AwardID <=", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidIn(List<Integer> values) {
            addCriterion("AwardID in", values, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotIn(List<Integer> values) {
            addCriterion("AwardID not in", values, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidBetween(Integer value1, Integer value2) {
            addCriterion("AwardID between", value1, value2, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotBetween(Integer value1, Integer value2) {
            addCriterion("AwardID not between", value1, value2, "awardid");
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

        public Criteria andMoivenameIsNull() {
            addCriterion("MoiveName is null");
            return (Criteria) this;
        }

        public Criteria andMoivenameIsNotNull() {
            addCriterion("MoiveName is not null");
            return (Criteria) this;
        }

        public Criteria andMoivenameEqualTo(String value) {
            addCriterion("MoiveName =", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameNotEqualTo(String value) {
            addCriterion("MoiveName <>", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameGreaterThan(String value) {
            addCriterion("MoiveName >", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveName >=", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameLessThan(String value) {
            addCriterion("MoiveName <", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameLessThanOrEqualTo(String value) {
            addCriterion("MoiveName <=", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameLike(String value) {
            addCriterion("MoiveName like", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameNotLike(String value) {
            addCriterion("MoiveName not like", value, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameIn(List<String> values) {
            addCriterion("MoiveName in", values, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameNotIn(List<String> values) {
            addCriterion("MoiveName not in", values, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameBetween(String value1, String value2) {
            addCriterion("MoiveName between", value1, value2, "moivename");
            return (Criteria) this;
        }

        public Criteria andMoivenameNotBetween(String value1, String value2) {
            addCriterion("MoiveName not between", value1, value2, "moivename");
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

        public Criteria andMoivecoverIsNull() {
            addCriterion("MoiveCover is null");
            return (Criteria) this;
        }

        public Criteria andMoivecoverIsNotNull() {
            addCriterion("MoiveCover is not null");
            return (Criteria) this;
        }

        public Criteria andMoivecoverEqualTo(String value) {
            addCriterion("MoiveCover =", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverNotEqualTo(String value) {
            addCriterion("MoiveCover <>", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverGreaterThan(String value) {
            addCriterion("MoiveCover >", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveCover >=", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverLessThan(String value) {
            addCriterion("MoiveCover <", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverLessThanOrEqualTo(String value) {
            addCriterion("MoiveCover <=", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverLike(String value) {
            addCriterion("MoiveCover like", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverNotLike(String value) {
            addCriterion("MoiveCover not like", value, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverIn(List<String> values) {
            addCriterion("MoiveCover in", values, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverNotIn(List<String> values) {
            addCriterion("MoiveCover not in", values, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverBetween(String value1, String value2) {
            addCriterion("MoiveCover between", value1, value2, "moivecover");
            return (Criteria) this;
        }

        public Criteria andMoivecoverNotBetween(String value1, String value2) {
            addCriterion("MoiveCover not between", value1, value2, "moivecover");
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