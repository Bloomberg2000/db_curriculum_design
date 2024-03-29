package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LongCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LongCommentsExample() {
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

        public Criteria andNScoreIsNull() {
            addCriterion("n_score is null");
            return (Criteria) this;
        }

        public Criteria andNScoreIsNotNull() {
            addCriterion("n_score is not null");
            return (Criteria) this;
        }

        public Criteria andNScoreEqualTo(Short value) {
            addCriterion("n_score =", value, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreNotEqualTo(Short value) {
            addCriterion("n_score <>", value, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreGreaterThan(Short value) {
            addCriterion("n_score >", value, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("n_score >=", value, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreLessThan(Short value) {
            addCriterion("n_score <", value, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreLessThanOrEqualTo(Short value) {
            addCriterion("n_score <=", value, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreIn(List<Short> values) {
            addCriterion("n_score in", values, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreNotIn(List<Short> values) {
            addCriterion("n_score not in", values, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreBetween(Short value1, Short value2) {
            addCriterion("n_score between", value1, value2, "nScore");
            return (Criteria) this;
        }

        public Criteria andNScoreNotBetween(Short value1, Short value2) {
            addCriterion("n_score not between", value1, value2, "nScore");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNull() {
            addCriterion("c_title is null");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNotNull() {
            addCriterion("c_title is not null");
            return (Criteria) this;
        }

        public Criteria andCTitleEqualTo(String value) {
            addCriterion("c_title =", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotEqualTo(String value) {
            addCriterion("c_title <>", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThan(String value) {
            addCriterion("c_title >", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_title >=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThan(String value) {
            addCriterion("c_title <", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThanOrEqualTo(String value) {
            addCriterion("c_title <=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLike(String value) {
            addCriterion("c_title like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotLike(String value) {
            addCriterion("c_title not like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleIn(List<String> values) {
            addCriterion("c_title in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotIn(List<String> values) {
            addCriterion("c_title not in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleBetween(String value1, String value2) {
            addCriterion("c_title between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotBetween(String value1, String value2) {
            addCriterion("c_title not between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCContentIsNull() {
            addCriterion("c_content is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("c_content is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("c_content =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("c_content <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("c_content >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_content >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("c_content <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("c_content <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("c_content like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("c_content not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("c_content in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("c_content not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("c_content between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("c_content not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andNTopicIdIsNull() {
            addCriterion("n_topic_id is null");
            return (Criteria) this;
        }

        public Criteria andNTopicIdIsNotNull() {
            addCriterion("n_topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andNTopicIdEqualTo(Integer value) {
            addCriterion("n_topic_id =", value, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdNotEqualTo(Integer value) {
            addCriterion("n_topic_id <>", value, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdGreaterThan(Integer value) {
            addCriterion("n_topic_id >", value, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_topic_id >=", value, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdLessThan(Integer value) {
            addCriterion("n_topic_id <", value, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_topic_id <=", value, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdIn(List<Integer> values) {
            addCriterion("n_topic_id in", values, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdNotIn(List<Integer> values) {
            addCriterion("n_topic_id not in", values, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("n_topic_id between", value1, value2, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_topic_id not between", value1, value2, "nTopicId");
            return (Criteria) this;
        }

        public Criteria andNLikeNumIsNull() {
            addCriterion("n_like_num is null");
            return (Criteria) this;
        }

        public Criteria andNLikeNumIsNotNull() {
            addCriterion("n_like_num is not null");
            return (Criteria) this;
        }

        public Criteria andNLikeNumEqualTo(Integer value) {
            addCriterion("n_like_num =", value, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumNotEqualTo(Integer value) {
            addCriterion("n_like_num <>", value, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumGreaterThan(Integer value) {
            addCriterion("n_like_num >", value, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_like_num >=", value, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumLessThan(Integer value) {
            addCriterion("n_like_num <", value, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("n_like_num <=", value, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumIn(List<Integer> values) {
            addCriterion("n_like_num in", values, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumNotIn(List<Integer> values) {
            addCriterion("n_like_num not in", values, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("n_like_num between", value1, value2, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("n_like_num not between", value1, value2, "nLikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumIsNull() {
            addCriterion("n_unlike_num is null");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumIsNotNull() {
            addCriterion("n_unlike_num is not null");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumEqualTo(Integer value) {
            addCriterion("n_unlike_num =", value, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumNotEqualTo(Integer value) {
            addCriterion("n_unlike_num <>", value, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumGreaterThan(Integer value) {
            addCriterion("n_unlike_num >", value, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_unlike_num >=", value, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumLessThan(Integer value) {
            addCriterion("n_unlike_num <", value, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("n_unlike_num <=", value, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumIn(List<Integer> values) {
            addCriterion("n_unlike_num in", values, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumNotIn(List<Integer> values) {
            addCriterion("n_unlike_num not in", values, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumBetween(Integer value1, Integer value2) {
            addCriterion("n_unlike_num between", value1, value2, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andNUnlikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("n_unlike_num not between", value1, value2, "nUnlikeNum");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentIsNull() {
            addCriterion("c_plain_text_content is null");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentIsNotNull() {
            addCriterion("c_plain_text_content is not null");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentEqualTo(String value) {
            addCriterion("c_plain_text_content =", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentNotEqualTo(String value) {
            addCriterion("c_plain_text_content <>", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentGreaterThan(String value) {
            addCriterion("c_plain_text_content >", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_plain_text_content >=", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentLessThan(String value) {
            addCriterion("c_plain_text_content <", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentLessThanOrEqualTo(String value) {
            addCriterion("c_plain_text_content <=", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentLike(String value) {
            addCriterion("c_plain_text_content like", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentNotLike(String value) {
            addCriterion("c_plain_text_content not like", value, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentIn(List<String> values) {
            addCriterion("c_plain_text_content in", values, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentNotIn(List<String> values) {
            addCriterion("c_plain_text_content not in", values, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentBetween(String value1, String value2) {
            addCriterion("c_plain_text_content between", value1, value2, "cPlainTextContent");
            return (Criteria) this;
        }

        public Criteria andCPlainTextContentNotBetween(String value1, String value2) {
            addCriterion("c_plain_text_content not between", value1, value2, "cPlainTextContent");
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