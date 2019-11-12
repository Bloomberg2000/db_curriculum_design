package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
        oredCriteria = new ArrayList<>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andCUsernameIsNull() {
            addCriterion("c_username is null");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNotNull() {
            addCriterion("c_username is not null");
            return (Criteria) this;
        }

        public Criteria andCUsernameEqualTo(String value) {
            addCriterion("c_username =", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotEqualTo(String value) {
            addCriterion("c_username <>", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThan(String value) {
            addCriterion("c_username >", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("c_username >=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThan(String value) {
            addCriterion("c_username <", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThanOrEqualTo(String value) {
            addCriterion("c_username <=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLike(String value) {
            addCriterion("c_username like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotLike(String value) {
            addCriterion("c_username not like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameIn(List<String> values) {
            addCriterion("c_username in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotIn(List<String> values) {
            addCriterion("c_username not in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameBetween(String value1, String value2) {
            addCriterion("c_username between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotBetween(String value1, String value2) {
            addCriterion("c_username not between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCPhonenumIsNull() {
            addCriterion("c_phonenum is null");
            return (Criteria) this;
        }

        public Criteria andCPhonenumIsNotNull() {
            addCriterion("c_phonenum is not null");
            return (Criteria) this;
        }

        public Criteria andCPhonenumEqualTo(String value) {
            addCriterion("c_phonenum =", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumNotEqualTo(String value) {
            addCriterion("c_phonenum <>", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumGreaterThan(String value) {
            addCriterion("c_phonenum >", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("c_phonenum >=", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumLessThan(String value) {
            addCriterion("c_phonenum <", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumLessThanOrEqualTo(String value) {
            addCriterion("c_phonenum <=", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumLike(String value) {
            addCriterion("c_phonenum like", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumNotLike(String value) {
            addCriterion("c_phonenum not like", value, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumIn(List<String> values) {
            addCriterion("c_phonenum in", values, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumNotIn(List<String> values) {
            addCriterion("c_phonenum not in", values, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumBetween(String value1, String value2) {
            addCriterion("c_phonenum between", value1, value2, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCPhonenumNotBetween(String value1, String value2) {
            addCriterion("c_phonenum not between", value1, value2, "cPhonenum");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNull() {
            addCriterion("c_email is null");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNotNull() {
            addCriterion("c_email is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailEqualTo(String value) {
            addCriterion("c_email =", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotEqualTo(String value) {
            addCriterion("c_email <>", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThan(String value) {
            addCriterion("c_email >", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThanOrEqualTo(String value) {
            addCriterion("c_email >=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThan(String value) {
            addCriterion("c_email <", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThanOrEqualTo(String value) {
            addCriterion("c_email <=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLike(String value) {
            addCriterion("c_email like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotLike(String value) {
            addCriterion("c_email not like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailIn(List<String> values) {
            addCriterion("c_email in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotIn(List<String> values) {
            addCriterion("c_email not in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailBetween(String value1, String value2) {
            addCriterion("c_email between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotBetween(String value1, String value2) {
            addCriterion("c_email not between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("c_password is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("c_password is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("c_password =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("c_password <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("c_password >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_password >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("c_password <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_password <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("c_password like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("c_password not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("c_password in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("c_password not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("c_password between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("c_password not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidIsNull() {
            addCriterion("c_wechat_openid is null");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidIsNotNull() {
            addCriterion("c_wechat_openid is not null");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidEqualTo(String value) {
            addCriterion("c_wechat_openid =", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidNotEqualTo(String value) {
            addCriterion("c_wechat_openid <>", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidGreaterThan(String value) {
            addCriterion("c_wechat_openid >", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("c_wechat_openid >=", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidLessThan(String value) {
            addCriterion("c_wechat_openid <", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidLessThanOrEqualTo(String value) {
            addCriterion("c_wechat_openid <=", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidLike(String value) {
            addCriterion("c_wechat_openid like", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidNotLike(String value) {
            addCriterion("c_wechat_openid not like", value, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidIn(List<String> values) {
            addCriterion("c_wechat_openid in", values, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidNotIn(List<String> values) {
            addCriterion("c_wechat_openid not in", values, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidBetween(String value1, String value2) {
            addCriterion("c_wechat_openid between", value1, value2, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCWechatOpenidNotBetween(String value1, String value2) {
            addCriterion("c_wechat_openid not between", value1, value2, "cWechatOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidIsNull() {
            addCriterion("c_qq_openid is null");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidIsNotNull() {
            addCriterion("c_qq_openid is not null");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidEqualTo(String value) {
            addCriterion("c_qq_openid =", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidNotEqualTo(String value) {
            addCriterion("c_qq_openid <>", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidGreaterThan(String value) {
            addCriterion("c_qq_openid >", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("c_qq_openid >=", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidLessThan(String value) {
            addCriterion("c_qq_openid <", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidLessThanOrEqualTo(String value) {
            addCriterion("c_qq_openid <=", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidLike(String value) {
            addCriterion("c_qq_openid like", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidNotLike(String value) {
            addCriterion("c_qq_openid not like", value, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidIn(List<String> values) {
            addCriterion("c_qq_openid in", values, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidNotIn(List<String> values) {
            addCriterion("c_qq_openid not in", values, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidBetween(String value1, String value2) {
            addCriterion("c_qq_openid between", value1, value2, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCQqOpenidNotBetween(String value1, String value2) {
            addCriterion("c_qq_openid not between", value1, value2, "cQqOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidIsNull() {
            addCriterion("c_weibo_openid is null");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidIsNotNull() {
            addCriterion("c_weibo_openid is not null");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidEqualTo(String value) {
            addCriterion("c_weibo_openid =", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidNotEqualTo(String value) {
            addCriterion("c_weibo_openid <>", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidGreaterThan(String value) {
            addCriterion("c_weibo_openid >", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("c_weibo_openid >=", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidLessThan(String value) {
            addCriterion("c_weibo_openid <", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidLessThanOrEqualTo(String value) {
            addCriterion("c_weibo_openid <=", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidLike(String value) {
            addCriterion("c_weibo_openid like", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidNotLike(String value) {
            addCriterion("c_weibo_openid not like", value, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidIn(List<String> values) {
            addCriterion("c_weibo_openid in", values, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidNotIn(List<String> values) {
            addCriterion("c_weibo_openid not in", values, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidBetween(String value1, String value2) {
            addCriterion("c_weibo_openid between", value1, value2, "cWeiboOpenid");
            return (Criteria) this;
        }

        public Criteria andCWeiboOpenidNotBetween(String value1, String value2) {
            addCriterion("c_weibo_openid not between", value1, value2, "cWeiboOpenid");
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
    }
}