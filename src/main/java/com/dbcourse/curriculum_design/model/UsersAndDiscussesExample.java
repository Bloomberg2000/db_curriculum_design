package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersAndDiscussesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersAndDiscussesExample() {
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

        public Criteria andDiscussescreatetimeIsNull() {
            addCriterion("DiscussesCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeIsNotNull() {
            addCriterion("DiscussesCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeEqualTo(Date value) {
            addCriterion("DiscussesCreateTime =", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeNotEqualTo(Date value) {
            addCriterion("DiscussesCreateTime <>", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeGreaterThan(Date value) {
            addCriterion("DiscussesCreateTime >", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DiscussesCreateTime >=", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeLessThan(Date value) {
            addCriterion("DiscussesCreateTime <", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DiscussesCreateTime <=", value, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeIn(List<Date> values) {
            addCriterion("DiscussesCreateTime in", values, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeNotIn(List<Date> values) {
            addCriterion("DiscussesCreateTime not in", values, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeBetween(Date value1, Date value2) {
            addCriterion("DiscussesCreateTime between", value1, value2, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussescreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DiscussesCreateTime not between", value1, value2, "discussescreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeIsNull() {
            addCriterion("DiscussesEditTime is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeIsNotNull() {
            addCriterion("DiscussesEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeEqualTo(Date value) {
            addCriterion("DiscussesEditTime =", value, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeNotEqualTo(Date value) {
            addCriterion("DiscussesEditTime <>", value, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeGreaterThan(Date value) {
            addCriterion("DiscussesEditTime >", value, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DiscussesEditTime >=", value, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeLessThan(Date value) {
            addCriterion("DiscussesEditTime <", value, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeLessThanOrEqualTo(Date value) {
            addCriterion("DiscussesEditTime <=", value, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeIn(List<Date> values) {
            addCriterion("DiscussesEditTime in", values, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeNotIn(List<Date> values) {
            addCriterion("DiscussesEditTime not in", values, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeBetween(Date value1, Date value2) {
            addCriterion("DiscussesEditTime between", value1, value2, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesedittimeNotBetween(Date value1, Date value2) {
            addCriterion("DiscussesEditTime not between", value1, value2, "discussesedittime");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameIsNull() {
            addCriterion("DiscussesName is null");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameIsNotNull() {
            addCriterion("DiscussesName is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameEqualTo(String value) {
            addCriterion("DiscussesName =", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotEqualTo(String value) {
            addCriterion("DiscussesName <>", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameGreaterThan(String value) {
            addCriterion("DiscussesName >", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameGreaterThanOrEqualTo(String value) {
            addCriterion("DiscussesName >=", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameLessThan(String value) {
            addCriterion("DiscussesName <", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameLessThanOrEqualTo(String value) {
            addCriterion("DiscussesName <=", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameLike(String value) {
            addCriterion("DiscussesName like", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotLike(String value) {
            addCriterion("DiscussesName not like", value, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameIn(List<String> values) {
            addCriterion("DiscussesName in", values, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotIn(List<String> values) {
            addCriterion("DiscussesName not in", values, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameBetween(String value1, String value2) {
            addCriterion("DiscussesName between", value1, value2, "discussesname");
            return (Criteria) this;
        }

        public Criteria andDiscussesnameNotBetween(String value1, String value2) {
            addCriterion("DiscussesName not between", value1, value2, "discussesname");
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