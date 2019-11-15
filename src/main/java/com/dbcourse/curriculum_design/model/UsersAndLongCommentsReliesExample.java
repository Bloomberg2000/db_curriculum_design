package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersAndLongCommentsReliesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersAndLongCommentsReliesExample() {
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

        public Criteria andLongcommentsreplyidIsNull() {
            addCriterion("LongCommentsReplyId is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidIsNotNull() {
            addCriterion("LongCommentsReplyId is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidEqualTo(Integer value) {
            addCriterion("LongCommentsReplyId =", value, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidNotEqualTo(Integer value) {
            addCriterion("LongCommentsReplyId <>", value, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidGreaterThan(Integer value) {
            addCriterion("LongCommentsReplyId >", value, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsReplyId >=", value, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidLessThan(Integer value) {
            addCriterion("LongCommentsReplyId <", value, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidLessThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsReplyId <=", value, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidIn(List<Integer> values) {
            addCriterion("LongCommentsReplyId in", values, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidNotIn(List<Integer> values) {
            addCriterion("LongCommentsReplyId not in", values, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsReplyId between", value1, value2, "longcommentsreplyid");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsReplyId not between", value1, value2, "longcommentsreplyid");
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

        public Criteria andLongcommentsreplycreatetimeIsNull() {
            addCriterion("LongCommentsReplyCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeIsNotNull() {
            addCriterion("LongCommentsReplyCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeEqualTo(Date value) {
            addCriterion("LongCommentsReplyCreateTime =", value, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeNotEqualTo(Date value) {
            addCriterion("LongCommentsReplyCreateTime <>", value, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeGreaterThan(Date value) {
            addCriterion("LongCommentsReplyCreateTime >", value, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LongCommentsReplyCreateTime >=", value, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeLessThan(Date value) {
            addCriterion("LongCommentsReplyCreateTime <", value, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("LongCommentsReplyCreateTime <=", value, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeIn(List<Date> values) {
            addCriterion("LongCommentsReplyCreateTime in", values, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeNotIn(List<Date> values) {
            addCriterion("LongCommentsReplyCreateTime not in", values, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeBetween(Date value1, Date value2) {
            addCriterion("LongCommentsReplyCreateTime between", value1, value2, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("LongCommentsReplyCreateTime not between", value1, value2, "longcommentsreplycreatetime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeIsNull() {
            addCriterion("LongCommentsReplyEditTime is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeIsNotNull() {
            addCriterion("LongCommentsReplyEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeEqualTo(Date value) {
            addCriterion("LongCommentsReplyEditTime =", value, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeNotEqualTo(Date value) {
            addCriterion("LongCommentsReplyEditTime <>", value, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeGreaterThan(Date value) {
            addCriterion("LongCommentsReplyEditTime >", value, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LongCommentsReplyEditTime >=", value, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeLessThan(Date value) {
            addCriterion("LongCommentsReplyEditTime <", value, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeLessThanOrEqualTo(Date value) {
            addCriterion("LongCommentsReplyEditTime <=", value, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeIn(List<Date> values) {
            addCriterion("LongCommentsReplyEditTime in", values, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeNotIn(List<Date> values) {
            addCriterion("LongCommentsReplyEditTime not in", values, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeBetween(Date value1, Date value2) {
            addCriterion("LongCommentsReplyEditTime between", value1, value2, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyedittimeNotBetween(Date value1, Date value2) {
            addCriterion("LongCommentsReplyEditTime not between", value1, value2, "longcommentsreplyedittime");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentIsNull() {
            addCriterion("LongCommentsReplyContent is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentIsNotNull() {
            addCriterion("LongCommentsReplyContent is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentEqualTo(String value) {
            addCriterion("LongCommentsReplyContent =", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentNotEqualTo(String value) {
            addCriterion("LongCommentsReplyContent <>", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentGreaterThan(String value) {
            addCriterion("LongCommentsReplyContent >", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("LongCommentsReplyContent >=", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentLessThan(String value) {
            addCriterion("LongCommentsReplyContent <", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentLessThanOrEqualTo(String value) {
            addCriterion("LongCommentsReplyContent <=", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentLike(String value) {
            addCriterion("LongCommentsReplyContent like", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentNotLike(String value) {
            addCriterion("LongCommentsReplyContent not like", value, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentIn(List<String> values) {
            addCriterion("LongCommentsReplyContent in", values, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentNotIn(List<String> values) {
            addCriterion("LongCommentsReplyContent not in", values, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentBetween(String value1, String value2) {
            addCriterion("LongCommentsReplyContent between", value1, value2, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplycontentNotBetween(String value1, String value2) {
            addCriterion("LongCommentsReplyContent not between", value1, value2, "longcommentsreplycontent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentIsNull() {
            addCriterion("LongCommentsReplyParent is null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentIsNotNull() {
            addCriterion("LongCommentsReplyParent is not null");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentEqualTo(Integer value) {
            addCriterion("LongCommentsReplyParent =", value, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentNotEqualTo(Integer value) {
            addCriterion("LongCommentsReplyParent <>", value, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentGreaterThan(Integer value) {
            addCriterion("LongCommentsReplyParent >", value, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentGreaterThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsReplyParent >=", value, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentLessThan(Integer value) {
            addCriterion("LongCommentsReplyParent <", value, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentLessThanOrEqualTo(Integer value) {
            addCriterion("LongCommentsReplyParent <=", value, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentIn(List<Integer> values) {
            addCriterion("LongCommentsReplyParent in", values, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentNotIn(List<Integer> values) {
            addCriterion("LongCommentsReplyParent not in", values, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsReplyParent between", value1, value2, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andLongcommentsreplyparentNotBetween(Integer value1, Integer value2) {
            addCriterion("LongCommentsReplyParent not between", value1, value2, "longcommentsreplyparent");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("Username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("Username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("Username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("Username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("Username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("Username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("Username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("Username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("Username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("Username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("Username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("Username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("Username not between", value1, value2, "username");
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