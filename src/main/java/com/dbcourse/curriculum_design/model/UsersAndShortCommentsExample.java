package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersAndShortCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersAndShortCommentsExample() {
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

        public Criteria andShortcommentsidIsNull() {
            addCriterion("ShortCommentsId is null");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidIsNotNull() {
            addCriterion("ShortCommentsId is not null");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidEqualTo(Integer value) {
            addCriterion("ShortCommentsId =", value, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidNotEqualTo(Integer value) {
            addCriterion("ShortCommentsId <>", value, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidGreaterThan(Integer value) {
            addCriterion("ShortCommentsId >", value, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShortCommentsId >=", value, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidLessThan(Integer value) {
            addCriterion("ShortCommentsId <", value, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidLessThanOrEqualTo(Integer value) {
            addCriterion("ShortCommentsId <=", value, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidIn(List<Integer> values) {
            addCriterion("ShortCommentsId in", values, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidNotIn(List<Integer> values) {
            addCriterion("ShortCommentsId not in", values, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidBetween(Integer value1, Integer value2) {
            addCriterion("ShortCommentsId between", value1, value2, "shortcommentsid");
            return (Criteria) this;
        }

        public Criteria andShortcommentsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShortCommentsId not between", value1, value2, "shortcommentsid");
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

        public Criteria andShortcommentscreatetimeIsNull() {
            addCriterion("ShortCommentsCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeIsNotNull() {
            addCriterion("ShortCommentsCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeEqualTo(Date value) {
            addCriterion("ShortCommentsCreateTime =", value, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeNotEqualTo(Date value) {
            addCriterion("ShortCommentsCreateTime <>", value, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeGreaterThan(Date value) {
            addCriterion("ShortCommentsCreateTime >", value, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ShortCommentsCreateTime >=", value, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeLessThan(Date value) {
            addCriterion("ShortCommentsCreateTime <", value, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ShortCommentsCreateTime <=", value, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeIn(List<Date> values) {
            addCriterion("ShortCommentsCreateTime in", values, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeNotIn(List<Date> values) {
            addCriterion("ShortCommentsCreateTime not in", values, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeBetween(Date value1, Date value2) {
            addCriterion("ShortCommentsCreateTime between", value1, value2, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentscreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ShortCommentsCreateTime not between", value1, value2, "shortcommentscreatetime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeIsNull() {
            addCriterion("ShortCommentsEditTime is null");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeIsNotNull() {
            addCriterion("ShortCommentsEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeEqualTo(Date value) {
            addCriterion("ShortCommentsEditTime =", value, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeNotEqualTo(Date value) {
            addCriterion("ShortCommentsEditTime <>", value, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeGreaterThan(Date value) {
            addCriterion("ShortCommentsEditTime >", value, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ShortCommentsEditTime >=", value, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeLessThan(Date value) {
            addCriterion("ShortCommentsEditTime <", value, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeLessThanOrEqualTo(Date value) {
            addCriterion("ShortCommentsEditTime <=", value, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeIn(List<Date> values) {
            addCriterion("ShortCommentsEditTime in", values, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeNotIn(List<Date> values) {
            addCriterion("ShortCommentsEditTime not in", values, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeBetween(Date value1, Date value2) {
            addCriterion("ShortCommentsEditTime between", value1, value2, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsedittimeNotBetween(Date value1, Date value2) {
            addCriterion("ShortCommentsEditTime not between", value1, value2, "shortcommentsedittime");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreIsNull() {
            addCriterion("ShortCommentsScore is null");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreIsNotNull() {
            addCriterion("ShortCommentsScore is not null");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreEqualTo(Short value) {
            addCriterion("ShortCommentsScore =", value, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreNotEqualTo(Short value) {
            addCriterion("ShortCommentsScore <>", value, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreGreaterThan(Short value) {
            addCriterion("ShortCommentsScore >", value, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreGreaterThanOrEqualTo(Short value) {
            addCriterion("ShortCommentsScore >=", value, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreLessThan(Short value) {
            addCriterion("ShortCommentsScore <", value, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreLessThanOrEqualTo(Short value) {
            addCriterion("ShortCommentsScore <=", value, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreIn(List<Short> values) {
            addCriterion("ShortCommentsScore in", values, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreNotIn(List<Short> values) {
            addCriterion("ShortCommentsScore not in", values, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreBetween(Short value1, Short value2) {
            addCriterion("ShortCommentsScore between", value1, value2, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentsscoreNotBetween(Short value1, Short value2) {
            addCriterion("ShortCommentsScore not between", value1, value2, "shortcommentsscore");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentIsNull() {
            addCriterion("ShortCommentsContent is null");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentIsNotNull() {
            addCriterion("ShortCommentsContent is not null");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentEqualTo(String value) {
            addCriterion("ShortCommentsContent =", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentNotEqualTo(String value) {
            addCriterion("ShortCommentsContent <>", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentGreaterThan(String value) {
            addCriterion("ShortCommentsContent >", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentGreaterThanOrEqualTo(String value) {
            addCriterion("ShortCommentsContent >=", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentLessThan(String value) {
            addCriterion("ShortCommentsContent <", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentLessThanOrEqualTo(String value) {
            addCriterion("ShortCommentsContent <=", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentLike(String value) {
            addCriterion("ShortCommentsContent like", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentNotLike(String value) {
            addCriterion("ShortCommentsContent not like", value, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentIn(List<String> values) {
            addCriterion("ShortCommentsContent in", values, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentNotIn(List<String> values) {
            addCriterion("ShortCommentsContent not in", values, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentBetween(String value1, String value2) {
            addCriterion("ShortCommentsContent between", value1, value2, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentscontentNotBetween(String value1, String value2) {
            addCriterion("ShortCommentsContent not between", value1, value2, "shortcommentscontent");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeIsNull() {
            addCriterion("ShortCommentsType is null");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeIsNotNull() {
            addCriterion("ShortCommentsType is not null");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeEqualTo(Integer value) {
            addCriterion("ShortCommentsType =", value, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeNotEqualTo(Integer value) {
            addCriterion("ShortCommentsType <>", value, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeGreaterThan(Integer value) {
            addCriterion("ShortCommentsType >", value, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShortCommentsType >=", value, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeLessThan(Integer value) {
            addCriterion("ShortCommentsType <", value, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeLessThanOrEqualTo(Integer value) {
            addCriterion("ShortCommentsType <=", value, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeIn(List<Integer> values) {
            addCriterion("ShortCommentsType in", values, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeNotIn(List<Integer> values) {
            addCriterion("ShortCommentsType not in", values, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeBetween(Integer value1, Integer value2) {
            addCriterion("ShortCommentsType between", value1, value2, "shortcommentstype");
            return (Criteria) this;
        }

        public Criteria andShortcommentstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ShortCommentsType not between", value1, value2, "shortcommentstype");
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

        public Criteria andShortcommentslikenumIsNull() {
            addCriterion("ShortCommentsLikeNum is null");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumIsNotNull() {
            addCriterion("ShortCommentsLikeNum is not null");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumEqualTo(Integer value) {
            addCriterion("ShortCommentsLikeNum =", value, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumNotEqualTo(Integer value) {
            addCriterion("ShortCommentsLikeNum <>", value, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumGreaterThan(Integer value) {
            addCriterion("ShortCommentsLikeNum >", value, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShortCommentsLikeNum >=", value, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumLessThan(Integer value) {
            addCriterion("ShortCommentsLikeNum <", value, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumLessThanOrEqualTo(Integer value) {
            addCriterion("ShortCommentsLikeNum <=", value, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumIn(List<Integer> values) {
            addCriterion("ShortCommentsLikeNum in", values, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumNotIn(List<Integer> values) {
            addCriterion("ShortCommentsLikeNum not in", values, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumBetween(Integer value1, Integer value2) {
            addCriterion("ShortCommentsLikeNum between", value1, value2, "shortcommentslikenum");
            return (Criteria) this;
        }

        public Criteria andShortcommentslikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("ShortCommentsLikeNum not between", value1, value2, "shortcommentslikenum");
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