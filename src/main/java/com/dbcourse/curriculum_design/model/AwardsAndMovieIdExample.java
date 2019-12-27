package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AwardsAndMovieIdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardsAndMovieIdExample() {
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
            addCriterion("AwardId is null");
            return (Criteria) this;
        }

        public Criteria andAwardidIsNotNull() {
            addCriterion("AwardId is not null");
            return (Criteria) this;
        }

        public Criteria andAwardidEqualTo(Integer value) {
            addCriterion("AwardId =", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotEqualTo(Integer value) {
            addCriterion("AwardId <>", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidGreaterThan(Integer value) {
            addCriterion("AwardId >", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AwardId >=", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidLessThan(Integer value) {
            addCriterion("AwardId <", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidLessThanOrEqualTo(Integer value) {
            addCriterion("AwardId <=", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidIn(List<Integer> values) {
            addCriterion("AwardId in", values, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotIn(List<Integer> values) {
            addCriterion("AwardId not in", values, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidBetween(Integer value1, Integer value2) {
            addCriterion("AwardId between", value1, value2, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotBetween(Integer value1, Integer value2) {
            addCriterion("AwardId not between", value1, value2, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardnameIsNull() {
            addCriterion("AwardName is null");
            return (Criteria) this;
        }

        public Criteria andAwardnameIsNotNull() {
            addCriterion("AwardName is not null");
            return (Criteria) this;
        }

        public Criteria andAwardnameEqualTo(String value) {
            addCriterion("AwardName =", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotEqualTo(String value) {
            addCriterion("AwardName <>", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameGreaterThan(String value) {
            addCriterion("AwardName >", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameGreaterThanOrEqualTo(String value) {
            addCriterion("AwardName >=", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameLessThan(String value) {
            addCriterion("AwardName <", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameLessThanOrEqualTo(String value) {
            addCriterion("AwardName <=", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameLike(String value) {
            addCriterion("AwardName like", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotLike(String value) {
            addCriterion("AwardName not like", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameIn(List<String> values) {
            addCriterion("AwardName in", values, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotIn(List<String> values) {
            addCriterion("AwardName not in", values, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameBetween(String value1, String value2) {
            addCriterion("AwardName between", value1, value2, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotBetween(String value1, String value2) {
            addCriterion("AwardName not between", value1, value2, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeIsNull() {
            addCriterion("AwardStartTime is null");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeIsNotNull() {
            addCriterion("AwardStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeEqualTo(Date value) {
            addCriterion("AwardStartTime =", value, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeNotEqualTo(Date value) {
            addCriterion("AwardStartTime <>", value, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeGreaterThan(Date value) {
            addCriterion("AwardStartTime >", value, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AwardStartTime >=", value, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeLessThan(Date value) {
            addCriterion("AwardStartTime <", value, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("AwardStartTime <=", value, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeIn(List<Date> values) {
            addCriterion("AwardStartTime in", values, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeNotIn(List<Date> values) {
            addCriterion("AwardStartTime not in", values, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeBetween(Date value1, Date value2) {
            addCriterion("AwardStartTime between", value1, value2, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("AwardStartTime not between", value1, value2, "awardstarttime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeIsNull() {
            addCriterion("AwardEndTime is null");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeIsNotNull() {
            addCriterion("AwardEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeEqualTo(Date value) {
            addCriterion("AwardEndTime =", value, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeNotEqualTo(Date value) {
            addCriterion("AwardEndTime <>", value, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeGreaterThan(Date value) {
            addCriterion("AwardEndTime >", value, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AwardEndTime >=", value, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeLessThan(Date value) {
            addCriterion("AwardEndTime <", value, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeLessThanOrEqualTo(Date value) {
            addCriterion("AwardEndTime <=", value, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeIn(List<Date> values) {
            addCriterion("AwardEndTime in", values, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeNotIn(List<Date> values) {
            addCriterion("AwardEndTime not in", values, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeBetween(Date value1, Date value2) {
            addCriterion("AwardEndTime between", value1, value2, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardendtimeNotBetween(Date value1, Date value2) {
            addCriterion("AwardEndTime not between", value1, value2, "awardendtime");
            return (Criteria) this;
        }

        public Criteria andAwardlocationIsNull() {
            addCriterion("AwardLocation is null");
            return (Criteria) this;
        }

        public Criteria andAwardlocationIsNotNull() {
            addCriterion("AwardLocation is not null");
            return (Criteria) this;
        }

        public Criteria andAwardlocationEqualTo(String value) {
            addCriterion("AwardLocation =", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationNotEqualTo(String value) {
            addCriterion("AwardLocation <>", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationGreaterThan(String value) {
            addCriterion("AwardLocation >", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationGreaterThanOrEqualTo(String value) {
            addCriterion("AwardLocation >=", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationLessThan(String value) {
            addCriterion("AwardLocation <", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationLessThanOrEqualTo(String value) {
            addCriterion("AwardLocation <=", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationLike(String value) {
            addCriterion("AwardLocation like", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationNotLike(String value) {
            addCriterion("AwardLocation not like", value, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationIn(List<String> values) {
            addCriterion("AwardLocation in", values, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationNotIn(List<String> values) {
            addCriterion("AwardLocation not in", values, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationBetween(String value1, String value2) {
            addCriterion("AwardLocation between", value1, value2, "awardlocation");
            return (Criteria) this;
        }

        public Criteria andAwardlocationNotBetween(String value1, String value2) {
            addCriterion("AwardLocation not between", value1, value2, "awardlocation");
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