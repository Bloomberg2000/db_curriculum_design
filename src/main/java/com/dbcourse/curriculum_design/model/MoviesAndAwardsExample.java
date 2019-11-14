package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andMoivefilmlengthIsNull() {
            addCriterion("MoiveFilmLength is null");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthIsNotNull() {
            addCriterion("MoiveFilmLength is not null");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthEqualTo(Integer value) {
            addCriterion("MoiveFilmLength =", value, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthNotEqualTo(Integer value) {
            addCriterion("MoiveFilmLength <>", value, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthGreaterThan(Integer value) {
            addCriterion("MoiveFilmLength >", value, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoiveFilmLength >=", value, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthLessThan(Integer value) {
            addCriterion("MoiveFilmLength <", value, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthLessThanOrEqualTo(Integer value) {
            addCriterion("MoiveFilmLength <=", value, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthIn(List<Integer> values) {
            addCriterion("MoiveFilmLength in", values, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthNotIn(List<Integer> values) {
            addCriterion("MoiveFilmLength not in", values, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthBetween(Integer value1, Integer value2) {
            addCriterion("MoiveFilmLength between", value1, value2, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivefilmlengthNotBetween(Integer value1, Integer value2) {
            addCriterion("MoiveFilmLength not between", value1, value2, "moivefilmlength");
            return (Criteria) this;
        }

        public Criteria andMoivealiasIsNull() {
            addCriterion("MoiveAlias is null");
            return (Criteria) this;
        }

        public Criteria andMoivealiasIsNotNull() {
            addCriterion("MoiveAlias is not null");
            return (Criteria) this;
        }

        public Criteria andMoivealiasEqualTo(String value) {
            addCriterion("MoiveAlias =", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasNotEqualTo(String value) {
            addCriterion("MoiveAlias <>", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasGreaterThan(String value) {
            addCriterion("MoiveAlias >", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveAlias >=", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasLessThan(String value) {
            addCriterion("MoiveAlias <", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasLessThanOrEqualTo(String value) {
            addCriterion("MoiveAlias <=", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasLike(String value) {
            addCriterion("MoiveAlias like", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasNotLike(String value) {
            addCriterion("MoiveAlias not like", value, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasIn(List<String> values) {
            addCriterion("MoiveAlias in", values, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasNotIn(List<String> values) {
            addCriterion("MoiveAlias not in", values, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasBetween(String value1, String value2) {
            addCriterion("MoiveAlias between", value1, value2, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivealiasNotBetween(String value1, String value2) {
            addCriterion("MoiveAlias not between", value1, value2, "moivealias");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateIsNull() {
            addCriterion("MoiveReleaseDate is null");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateIsNotNull() {
            addCriterion("MoiveReleaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateEqualTo(Date value) {
            addCriterionForJDBCDate("MoiveReleaseDate =", value, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MoiveReleaseDate <>", value, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateGreaterThan(Date value) {
            addCriterionForJDBCDate("MoiveReleaseDate >", value, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MoiveReleaseDate >=", value, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateLessThan(Date value) {
            addCriterionForJDBCDate("MoiveReleaseDate <", value, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MoiveReleaseDate <=", value, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateIn(List<Date> values) {
            addCriterionForJDBCDate("MoiveReleaseDate in", values, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MoiveReleaseDate not in", values, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MoiveReleaseDate between", value1, value2, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivereleasedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MoiveReleaseDate not between", value1, value2, "moivereleasedate");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrIsNull() {
            addCriterion("MoiveDateStr is null");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrIsNotNull() {
            addCriterion("MoiveDateStr is not null");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrEqualTo(String value) {
            addCriterion("MoiveDateStr =", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrNotEqualTo(String value) {
            addCriterion("MoiveDateStr <>", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrGreaterThan(String value) {
            addCriterion("MoiveDateStr >", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveDateStr >=", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrLessThan(String value) {
            addCriterion("MoiveDateStr <", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrLessThanOrEqualTo(String value) {
            addCriterion("MoiveDateStr <=", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrLike(String value) {
            addCriterion("MoiveDateStr like", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrNotLike(String value) {
            addCriterion("MoiveDateStr not like", value, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrIn(List<String> values) {
            addCriterion("MoiveDateStr in", values, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrNotIn(List<String> values) {
            addCriterion("MoiveDateStr not in", values, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrBetween(String value1, String value2) {
            addCriterion("MoiveDateStr between", value1, value2, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoivedatestrNotBetween(String value1, String value2) {
            addCriterion("MoiveDateStr not between", value1, value2, "moivedatestr");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoIsNull() {
            addCriterion("MoiveInfo is null");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoIsNotNull() {
            addCriterion("MoiveInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoEqualTo(String value) {
            addCriterion("MoiveInfo =", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoNotEqualTo(String value) {
            addCriterion("MoiveInfo <>", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoGreaterThan(String value) {
            addCriterion("MoiveInfo >", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveInfo >=", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoLessThan(String value) {
            addCriterion("MoiveInfo <", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoLessThanOrEqualTo(String value) {
            addCriterion("MoiveInfo <=", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoLike(String value) {
            addCriterion("MoiveInfo like", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoNotLike(String value) {
            addCriterion("MoiveInfo not like", value, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoIn(List<String> values) {
            addCriterion("MoiveInfo in", values, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoNotIn(List<String> values) {
            addCriterion("MoiveInfo not in", values, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoBetween(String value1, String value2) {
            addCriterion("MoiveInfo between", value1, value2, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoiveinfoNotBetween(String value1, String value2) {
            addCriterion("MoiveInfo not between", value1, value2, "moiveinfo");
            return (Criteria) this;
        }

        public Criteria andMoivetypeIsNull() {
            addCriterion("MoiveType is null");
            return (Criteria) this;
        }

        public Criteria andMoivetypeIsNotNull() {
            addCriterion("MoiveType is not null");
            return (Criteria) this;
        }

        public Criteria andMoivetypeEqualTo(String value) {
            addCriterion("MoiveType =", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeNotEqualTo(String value) {
            addCriterion("MoiveType <>", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeGreaterThan(String value) {
            addCriterion("MoiveType >", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveType >=", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeLessThan(String value) {
            addCriterion("MoiveType <", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeLessThanOrEqualTo(String value) {
            addCriterion("MoiveType <=", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeLike(String value) {
            addCriterion("MoiveType like", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeNotLike(String value) {
            addCriterion("MoiveType not like", value, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeIn(List<String> values) {
            addCriterion("MoiveType in", values, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeNotIn(List<String> values) {
            addCriterion("MoiveType not in", values, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeBetween(String value1, String value2) {
            addCriterion("MoiveType between", value1, value2, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoivetypeNotBetween(String value1, String value2) {
            addCriterion("MoiveType not between", value1, value2, "moivetype");
            return (Criteria) this;
        }

        public Criteria andMoiveareaIsNull() {
            addCriterion("MoiveArea is null");
            return (Criteria) this;
        }

        public Criteria andMoiveareaIsNotNull() {
            addCriterion("MoiveArea is not null");
            return (Criteria) this;
        }

        public Criteria andMoiveareaEqualTo(String value) {
            addCriterion("MoiveArea =", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaNotEqualTo(String value) {
            addCriterion("MoiveArea <>", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaGreaterThan(String value) {
            addCriterion("MoiveArea >", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveArea >=", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaLessThan(String value) {
            addCriterion("MoiveArea <", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaLessThanOrEqualTo(String value) {
            addCriterion("MoiveArea <=", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaLike(String value) {
            addCriterion("MoiveArea like", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaNotLike(String value) {
            addCriterion("MoiveArea not like", value, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaIn(List<String> values) {
            addCriterion("MoiveArea in", values, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaNotIn(List<String> values) {
            addCriterion("MoiveArea not in", values, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaBetween(String value1, String value2) {
            addCriterion("MoiveArea between", value1, value2, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoiveareaNotBetween(String value1, String value2) {
            addCriterion("MoiveArea not between", value1, value2, "moivearea");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageIsNull() {
            addCriterion("MoiveLanguage is null");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageIsNotNull() {
            addCriterion("MoiveLanguage is not null");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageEqualTo(String value) {
            addCriterion("MoiveLanguage =", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageNotEqualTo(String value) {
            addCriterion("MoiveLanguage <>", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageGreaterThan(String value) {
            addCriterion("MoiveLanguage >", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageGreaterThanOrEqualTo(String value) {
            addCriterion("MoiveLanguage >=", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageLessThan(String value) {
            addCriterion("MoiveLanguage <", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageLessThanOrEqualTo(String value) {
            addCriterion("MoiveLanguage <=", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageLike(String value) {
            addCriterion("MoiveLanguage like", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageNotLike(String value) {
            addCriterion("MoiveLanguage not like", value, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageIn(List<String> values) {
            addCriterion("MoiveLanguage in", values, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageNotIn(List<String> values) {
            addCriterion("MoiveLanguage not in", values, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageBetween(String value1, String value2) {
            addCriterion("MoiveLanguage between", value1, value2, "moivelanguage");
            return (Criteria) this;
        }

        public Criteria andMoivelanguageNotBetween(String value1, String value2) {
            addCriterion("MoiveLanguage not between", value1, value2, "moivelanguage");
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