package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNull() {
            addCriterion("c_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("c_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(Integer value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(Integer value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(Integer value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(Integer value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<Integer> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<Integer> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andNGenderIsNull() {
            addCriterion("n_gender is null");
            return (Criteria) this;
        }

        public Criteria andNGenderIsNotNull() {
            addCriterion("n_gender is not null");
            return (Criteria) this;
        }

        public Criteria andNGenderEqualTo(Integer value) {
            addCriterion("n_gender =", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderNotEqualTo(Integer value) {
            addCriterion("n_gender <>", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderGreaterThan(Integer value) {
            addCriterion("n_gender >", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_gender >=", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderLessThan(Integer value) {
            addCriterion("n_gender <", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderLessThanOrEqualTo(Integer value) {
            addCriterion("n_gender <=", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderIn(List<Integer> values) {
            addCriterion("n_gender in", values, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderNotIn(List<Integer> values) {
            addCriterion("n_gender not in", values, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderBetween(Integer value1, Integer value2) {
            addCriterion("n_gender between", value1, value2, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("n_gender not between", value1, value2, "nGender");
            return (Criteria) this;
        }

        public Criteria andCAvatarIsNull() {
            addCriterion("c_avatar is null");
            return (Criteria) this;
        }

        public Criteria andCAvatarIsNotNull() {
            addCriterion("c_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andCAvatarEqualTo(String value) {
            addCriterion("c_avatar =", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarNotEqualTo(String value) {
            addCriterion("c_avatar <>", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarGreaterThan(String value) {
            addCriterion("c_avatar >", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("c_avatar >=", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarLessThan(String value) {
            addCriterion("c_avatar <", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarLessThanOrEqualTo(String value) {
            addCriterion("c_avatar <=", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarLike(String value) {
            addCriterion("c_avatar like", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarNotLike(String value) {
            addCriterion("c_avatar not like", value, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarIn(List<String> values) {
            addCriterion("c_avatar in", values, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarNotIn(List<String> values) {
            addCriterion("c_avatar not in", values, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarBetween(String value1, String value2) {
            addCriterion("c_avatar between", value1, value2, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAvatarNotBetween(String value1, String value2) {
            addCriterion("c_avatar not between", value1, value2, "cAvatar");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNull() {
            addCriterion("c_address is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("c_address is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("c_address =", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("c_address <>", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("c_address >", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_address >=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("c_address <", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("c_address <=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("c_address like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("c_address not like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("c_address in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("c_address not in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("c_address between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("c_address not between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCInfoIsNull() {
            addCriterion("c_info is null");
            return (Criteria) this;
        }

        public Criteria andCInfoIsNotNull() {
            addCriterion("c_info is not null");
            return (Criteria) this;
        }

        public Criteria andCInfoEqualTo(String value) {
            addCriterion("c_info =", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotEqualTo(String value) {
            addCriterion("c_info <>", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoGreaterThan(String value) {
            addCriterion("c_info >", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoGreaterThanOrEqualTo(String value) {
            addCriterion("c_info >=", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoLessThan(String value) {
            addCriterion("c_info <", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoLessThanOrEqualTo(String value) {
            addCriterion("c_info <=", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoLike(String value) {
            addCriterion("c_info like", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotLike(String value) {
            addCriterion("c_info not like", value, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoIn(List<String> values) {
            addCriterion("c_info in", values, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotIn(List<String> values) {
            addCriterion("c_info not in", values, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoBetween(String value1, String value2) {
            addCriterion("c_info between", value1, value2, "cInfo");
            return (Criteria) this;
        }

        public Criteria andCInfoNotBetween(String value1, String value2) {
            addCriterion("c_info not between", value1, value2, "cInfo");
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