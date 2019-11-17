package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersAndDiscussesRepliesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersAndDiscussesRepliesExample() {
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

        public Criteria andDiscussesrepliesidIsNull() {
            addCriterion("DiscussesRepliesId is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidIsNotNull() {
            addCriterion("DiscussesRepliesId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidEqualTo(Integer value) {
            addCriterion("DiscussesRepliesId =", value, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidNotEqualTo(Integer value) {
            addCriterion("DiscussesRepliesId <>", value, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidGreaterThan(Integer value) {
            addCriterion("DiscussesRepliesId >", value, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscussesRepliesId >=", value, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidLessThan(Integer value) {
            addCriterion("DiscussesRepliesId <", value, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidLessThanOrEqualTo(Integer value) {
            addCriterion("DiscussesRepliesId <=", value, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidIn(List<Integer> values) {
            addCriterion("DiscussesRepliesId in", values, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidNotIn(List<Integer> values) {
            addCriterion("DiscussesRepliesId not in", values, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesRepliesId between", value1, value2, "discussesrepliesid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesidNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesRepliesId not between", value1, value2, "discussesrepliesid");
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

        public Criteria andDiscussesrepliescreatetimeIsNull() {
            addCriterion("DiscussesRepliesCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeIsNotNull() {
            addCriterion("DiscussesRepliesCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeEqualTo(Date value) {
            addCriterion("DiscussesRepliesCreateTime =", value, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeNotEqualTo(Date value) {
            addCriterion("DiscussesRepliesCreateTime <>", value, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeGreaterThan(Date value) {
            addCriterion("DiscussesRepliesCreateTime >", value, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DiscussesRepliesCreateTime >=", value, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeLessThan(Date value) {
            addCriterion("DiscussesRepliesCreateTime <", value, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DiscussesRepliesCreateTime <=", value, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeIn(List<Date> values) {
            addCriterion("DiscussesRepliesCreateTime in", values, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeNotIn(List<Date> values) {
            addCriterion("DiscussesRepliesCreateTime not in", values, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeBetween(Date value1, Date value2) {
            addCriterion("DiscussesRepliesCreateTime between", value1, value2, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DiscussesRepliesCreateTime not between", value1, value2, "discussesrepliescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeIsNull() {
            addCriterion("DiscussesRepliesEditTime is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeIsNotNull() {
            addCriterion("DiscussesRepliesEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeEqualTo(Date value) {
            addCriterion("DiscussesRepliesEditTime =", value, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeNotEqualTo(Date value) {
            addCriterion("DiscussesRepliesEditTime <>", value, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeGreaterThan(Date value) {
            addCriterion("DiscussesRepliesEditTime >", value, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DiscussesRepliesEditTime >=", value, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeLessThan(Date value) {
            addCriterion("DiscussesRepliesEditTime <", value, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeLessThanOrEqualTo(Date value) {
            addCriterion("DiscussesRepliesEditTime <=", value, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeIn(List<Date> values) {
            addCriterion("DiscussesRepliesEditTime in", values, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeNotIn(List<Date> values) {
            addCriterion("DiscussesRepliesEditTime not in", values, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeBetween(Date value1, Date value2) {
            addCriterion("DiscussesRepliesEditTime between", value1, value2, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesedittimeNotBetween(Date value1, Date value2) {
            addCriterion("DiscussesRepliesEditTime not between", value1, value2, "discussesrepliesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentIsNull() {
            addCriterion("DiscussesRepliesContent is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentIsNotNull() {
            addCriterion("DiscussesRepliesContent is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentEqualTo(String value) {
            addCriterion("DiscussesRepliesContent =", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentNotEqualTo(String value) {
            addCriterion("DiscussesRepliesContent <>", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentGreaterThan(String value) {
            addCriterion("DiscussesRepliesContent >", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentGreaterThanOrEqualTo(String value) {
            addCriterion("DiscussesRepliesContent >=", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentLessThan(String value) {
            addCriterion("DiscussesRepliesContent <", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentLessThanOrEqualTo(String value) {
            addCriterion("DiscussesRepliesContent <=", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentLike(String value) {
            addCriterion("DiscussesRepliesContent like", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentNotLike(String value) {
            addCriterion("DiscussesRepliesContent not like", value, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentIn(List<String> values) {
            addCriterion("DiscussesRepliesContent in", values, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentNotIn(List<String> values) {
            addCriterion("DiscussesRepliesContent not in", values, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentBetween(String value1, String value2) {
            addCriterion("DiscussesRepliesContent between", value1, value2, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliescontentNotBetween(String value1, String value2) {
            addCriterion("DiscussesRepliesContent not between", value1, value2, "discussesrepliescontent");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidIsNull() {
            addCriterion("DiscussesRepliesParentId is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidIsNotNull() {
            addCriterion("DiscussesRepliesParentId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidEqualTo(Integer value) {
            addCriterion("DiscussesRepliesParentId =", value, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidNotEqualTo(Integer value) {
            addCriterion("DiscussesRepliesParentId <>", value, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidGreaterThan(Integer value) {
            addCriterion("DiscussesRepliesParentId >", value, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscussesRepliesParentId >=", value, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidLessThan(Integer value) {
            addCriterion("DiscussesRepliesParentId <", value, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidLessThanOrEqualTo(Integer value) {
            addCriterion("DiscussesRepliesParentId <=", value, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidIn(List<Integer> values) {
            addCriterion("DiscussesRepliesParentId in", values, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidNotIn(List<Integer> values) {
            addCriterion("DiscussesRepliesParentId not in", values, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesRepliesParentId between", value1, value2, "discussesrepliesparentid");
            return (Criteria) this;
        }

        public Criteria andDiscussesrepliesparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesRepliesParentId not between", value1, value2, "discussesrepliesparentid");
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

        public Criteria andDiscussesreplieslikenumIsNull() {
            addCriterion("DiscussesRepliesLikeNum is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumIsNotNull() {
            addCriterion("DiscussesRepliesLikeNum is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumEqualTo(Integer value) {
            addCriterion("DiscussesRepliesLikeNum =", value, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumNotEqualTo(Integer value) {
            addCriterion("DiscussesRepliesLikeNum <>", value, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumGreaterThan(Integer value) {
            addCriterion("DiscussesRepliesLikeNum >", value, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiscussesRepliesLikeNum >=", value, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumLessThan(Integer value) {
            addCriterion("DiscussesRepliesLikeNum <", value, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumLessThanOrEqualTo(Integer value) {
            addCriterion("DiscussesRepliesLikeNum <=", value, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumIn(List<Integer> values) {
            addCriterion("DiscussesRepliesLikeNum in", values, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumNotIn(List<Integer> values) {
            addCriterion("DiscussesRepliesLikeNum not in", values, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesRepliesLikeNum between", value1, value2, "discussesreplieslikenum");
            return (Criteria) this;
        }

        public Criteria andDiscussesreplieslikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("DiscussesRepliesLikeNum not between", value1, value2, "discussesreplieslikenum");
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