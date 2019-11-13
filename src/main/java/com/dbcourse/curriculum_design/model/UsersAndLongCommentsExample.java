package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersAndLongCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersAndLongCommentsExample() {
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

        public Criteria andLongcommentsidIsNull() {
            addCriterion("LongCommentsId is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidIsNotNull() {
            addCriterion("LongCommentsId is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidEqualTo(Integer value) {
            addCriterion("LongCommentsId =", value, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidNotEqualTo(Integer value) {
            addCriterion("LongCommentsId <>", value, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidGreaterThan(Integer value) {
            addCriterion("LongCommentsId >", value, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsId >=", value, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidLessThan(Integer value) {
            addCriterion("LongCommentsId <", value, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidLessThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsId <=", value, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidIn(List<Integer> values) {
            addCriterion("LongCommentsId in", values, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidNotIn(List<Integer> values) {
            addCriterion("LongCommentsId not in", values, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsId between", value1, value2, "longcommentsid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsidNotBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsId not between", value1, value2, "longcommentsid");
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

        public Criteria andLongcommentscreatetimeIsNull() {
            addCriterion("LongCommentsCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeIsNotNull() {
            addCriterion("LongCommentsCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeEqualTo(Date value) {
            addCriterion("LongCommentsCreateTime =", value, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeNotEqualTo(Date value) {
            addCriterion("LongCommentsCreateTime <>", value, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeGreaterThan(Date value) {
            addCriterion("LongCommentsCreateTime >", value, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LongCommentsCreateTime >=", value, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeLessThan(Date value) {
            addCriterion("LongCommentsCreateTime <", value, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("LongCommentsCreateTime <=", value, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeIn(List<Date> values) {
            addCriterion("LongCommentsCreateTime in", values, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeNotIn(List<Date> values) {
            addCriterion("LongCommentsCreateTime not in", values, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeBetween(Date value1, Date value2) {
            addCriterion("LongCommentsCreateTime between", value1, value2, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentscreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("LongCommentsCreateTime not between", value1, value2, "longcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeIsNull() {
            addCriterion("LongCommentsEditTime is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeIsNotNull() {
            addCriterion("LongCommentsEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeEqualTo(Date value) {
            addCriterion("LongCommentsEditTime =", value, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeNotEqualTo(Date value) {
            addCriterion("LongCommentsEditTime <>", value, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeGreaterThan(Date value) {
            addCriterion("LongCommentsEditTime >", value, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LongCommentsEditTime >=", value, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeLessThan(Date value) {
            addCriterion("LongCommentsEditTime <", value, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeLessThanOrEqualTo(Date value) {
            addCriterion("LongCommentsEditTime <=", value, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeIn(List<Date> values) {
            addCriterion("LongCommentsEditTime in", values, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeNotIn(List<Date> values) {
            addCriterion("LongCommentsEditTime not in", values, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeBetween(Date value1, Date value2) {
            addCriterion("LongCommentsEditTime between", value1, value2, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsedittimeNotBetween(Date value1, Date value2) {
            addCriterion("LongCommentsEditTime not between", value1, value2, "longcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreIsNull() {
            addCriterion("LongCommentsScore is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreIsNotNull() {
            addCriterion("LongCommentsScore is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreEqualTo(Short value) {
            addCriterion("LongCommentsScore =", value, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreNotEqualTo(Short value) {
            addCriterion("LongCommentsScore <>", value, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreGreaterThan(Short value) {
            addCriterion("LongCommentsScore >", value, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreGreaterThanOrEqualTo(Short value) {
            addCriterion("LongCommentsScore >=", value, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreLessThan(Short value) {
            addCriterion("LongCommentsScore <", value, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreLessThanOrEqualTo(Short value) {
            addCriterion("LongCommentsScore <=", value, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreIn(List<Short> values) {
            addCriterion("LongCommentsScore in", values, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreNotIn(List<Short> values) {
            addCriterion("LongCommentsScore not in", values, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreBetween(Short value1, Short value2) {
            addCriterion("LongCommentsScore between", value1, value2, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentsscoreNotBetween(Short value1, Short value2) {
            addCriterion("LongCommentsScore not between", value1, value2, "longcommentsscore");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleIsNull() {
            addCriterion("LongCommentsTitle is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleIsNotNull() {
            addCriterion("LongCommentsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleEqualTo(String value) {
            addCriterion("LongCommentsTitle =", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleNotEqualTo(String value) {
            addCriterion("LongCommentsTitle <>", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleGreaterThan(String value) {
            addCriterion("LongCommentsTitle >", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleGreaterThanOrEqualTo(String value) {
            addCriterion("LongCommentsTitle >=", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleLessThan(String value) {
            addCriterion("LongCommentsTitle <", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleLessThanOrEqualTo(String value) {
            addCriterion("LongCommentsTitle <=", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleLike(String value) {
            addCriterion("LongCommentsTitle like", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleNotLike(String value) {
            addCriterion("LongCommentsTitle not like", value, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleIn(List<String> values) {
            addCriterion("LongCommentsTitle in", values, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleNotIn(List<String> values) {
            addCriterion("LongCommentsTitle not in", values, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleBetween(String value1, String value2) {
            addCriterion("LongCommentsTitle between", value1, value2, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentstitleNotBetween(String value1, String value2) {
            addCriterion("LongCommentsTitle not between", value1, value2, "longcommentstitle");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentIsNull() {
            addCriterion("LongCommentsContent is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentIsNotNull() {
            addCriterion("LongCommentsContent is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentEqualTo(String value) {
            addCriterion("LongCommentsContent =", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentNotEqualTo(String value) {
            addCriterion("LongCommentsContent <>", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentGreaterThan(String value) {
            addCriterion("LongCommentsContent >", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentGreaterThanOrEqualTo(String value) {
            addCriterion("LongCommentsContent >=", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentLessThan(String value) {
            addCriterion("LongCommentsContent <", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentLessThanOrEqualTo(String value) {
            addCriterion("LongCommentsContent <=", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentLike(String value) {
            addCriterion("LongCommentsContent like", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentNotLike(String value) {
            addCriterion("LongCommentsContent not like", value, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentIn(List<String> values) {
            addCriterion("LongCommentsContent in", values, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentNotIn(List<String> values) {
            addCriterion("LongCommentsContent not in", values, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentBetween(String value1, String value2) {
            addCriterion("LongCommentsContent between", value1, value2, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentscontentNotBetween(String value1, String value2) {
            addCriterion("LongCommentsContent not between", value1, value2, "longcommentscontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidIsNull() {
            addCriterion("LongCommentsTopicId is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidIsNotNull() {
            addCriterion("LongCommentsTopicId is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidEqualTo(Integer value) {
            addCriterion("LongCommentsTopicId =", value, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidNotEqualTo(Integer value) {
            addCriterion("LongCommentsTopicId <>", value, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidGreaterThan(Integer value) {
            addCriterion("LongCommentsTopicId >", value, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsTopicId >=", value, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidLessThan(Integer value) {
            addCriterion("LongCommentsTopicId <", value, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidLessThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsTopicId <=", value, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidIn(List<Integer> values) {
            addCriterion("LongCommentsTopicId in", values, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidNotIn(List<Integer> values) {
            addCriterion("LongCommentsTopicId not in", values, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsTopicId between", value1, value2, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andLongcommentstopicidNotBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsTopicId not between", value1, value2, "longcommentstopicid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("Nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("Nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("Nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("Nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("Nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("Nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("Nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("Nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("Nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("Nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("Nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("Nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("Nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("Nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNull() {
            addCriterion("UserGender is null");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNotNull() {
            addCriterion("UserGender is not null");
            return (Criteria) this;
        }

        public Criteria andUsergenderEqualTo(Integer value) {
            addCriterion("UserGender =", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotEqualTo(Integer value) {
            addCriterion("UserGender <>", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThan(Integer value) {
            addCriterion("UserGender >", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserGender >=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThan(Integer value) {
            addCriterion("UserGender <", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThanOrEqualTo(Integer value) {
            addCriterion("UserGender <=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderIn(List<Integer> values) {
            addCriterion("UserGender in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotIn(List<Integer> values) {
            addCriterion("UserGender not in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderBetween(Integer value1, Integer value2) {
            addCriterion("UserGender between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotBetween(Integer value1, Integer value2) {
            addCriterion("UserGender not between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNull() {
            addCriterion("UserAvatar is null");
            return (Criteria) this;
        }

        public Criteria andUseravatarIsNotNull() {
            addCriterion("UserAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andUseravatarEqualTo(String value) {
            addCriterion("UserAvatar =", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotEqualTo(String value) {
            addCriterion("UserAvatar <>", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThan(String value) {
            addCriterion("UserAvatar >", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarGreaterThanOrEqualTo(String value) {
            addCriterion("UserAvatar >=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThan(String value) {
            addCriterion("UserAvatar <", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLessThanOrEqualTo(String value) {
            addCriterion("UserAvatar <=", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarLike(String value) {
            addCriterion("UserAvatar like", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotLike(String value) {
            addCriterion("UserAvatar not like", value, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarIn(List<String> values) {
            addCriterion("UserAvatar in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotIn(List<String> values) {
            addCriterion("UserAvatar not in", values, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarBetween(String value1, String value2) {
            addCriterion("UserAvatar between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andUseravatarNotBetween(String value1, String value2) {
            addCriterion("UserAvatar not between", value1, value2, "useravatar");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNull() {
            addCriterion("TopicId is null");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNotNull() {
            addCriterion("TopicId is not null");
            return (Criteria) this;
        }

        public Criteria andTopicidEqualTo(Integer value) {
            addCriterion("TopicId =", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotEqualTo(Integer value) {
            addCriterion("TopicId <>", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThan(Integer value) {
            addCriterion("TopicId >", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TopicId >=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThan(Integer value) {
            addCriterion("TopicId <", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThanOrEqualTo(Integer value) {
            addCriterion("TopicId <=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidIn(List<Integer> values) {
            addCriterion("TopicId in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotIn(List<Integer> values) {
            addCriterion("TopicId not in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidBetween(Integer value1, Integer value2) {
            addCriterion("TopicId between", value1, value2, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotBetween(Integer value1, Integer value2) {
            addCriterion("TopicId not between", value1, value2, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicnameIsNull() {
            addCriterion("TopicName is null");
            return (Criteria) this;
        }

        public Criteria andTopicnameIsNotNull() {
            addCriterion("TopicName is not null");
            return (Criteria) this;
        }

        public Criteria andTopicnameEqualTo(String value) {
            addCriterion("TopicName =", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotEqualTo(String value) {
            addCriterion("TopicName <>", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThan(String value) {
            addCriterion("TopicName >", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThanOrEqualTo(String value) {
            addCriterion("TopicName >=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThan(String value) {
            addCriterion("TopicName <", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThanOrEqualTo(String value) {
            addCriterion("TopicName <=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLike(String value) {
            addCriterion("TopicName like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotLike(String value) {
            addCriterion("TopicName not like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameIn(List<String> values) {
            addCriterion("TopicName in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotIn(List<String> values) {
            addCriterion("TopicName not in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameBetween(String value1, String value2) {
            addCriterion("TopicName between", value1, value2, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotBetween(String value1, String value2) {
            addCriterion("TopicName not between", value1, value2, "topicname");
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