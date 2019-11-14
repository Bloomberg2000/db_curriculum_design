package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.List;

public class StaffsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffsExample() {
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

        public Criteria andNGenderEqualTo(Short value) {
            addCriterion("n_gender =", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderNotEqualTo(Short value) {
            addCriterion("n_gender <>", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderGreaterThan(Short value) {
            addCriterion("n_gender >", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("n_gender >=", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderLessThan(Short value) {
            addCriterion("n_gender <", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderLessThanOrEqualTo(Short value) {
            addCriterion("n_gender <=", value, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderIn(List<Short> values) {
            addCriterion("n_gender in", values, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderNotIn(List<Short> values) {
            addCriterion("n_gender not in", values, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderBetween(Short value1, Short value2) {
            addCriterion("n_gender between", value1, value2, "nGender");
            return (Criteria) this;
        }

        public Criteria andNGenderNotBetween(Short value1, Short value2) {
            addCriterion("n_gender not between", value1, value2, "nGender");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIsNull() {
            addCriterion("c_birthday is null");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIsNotNull() {
            addCriterion("c_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andCBirthdayEqualTo(String value) {
            addCriterion("c_birthday =", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotEqualTo(String value) {
            addCriterion("c_birthday <>", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayGreaterThan(String value) {
            addCriterion("c_birthday >", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("c_birthday >=", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLessThan(String value) {
            addCriterion("c_birthday <", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLessThanOrEqualTo(String value) {
            addCriterion("c_birthday <=", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLike(String value) {
            addCriterion("c_birthday like", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotLike(String value) {
            addCriterion("c_birthday not like", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIn(List<String> values) {
            addCriterion("c_birthday in", values, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotIn(List<String> values) {
            addCriterion("c_birthday not in", values, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayBetween(String value1, String value2) {
            addCriterion("c_birthday between", value1, value2, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotBetween(String value1, String value2) {
            addCriterion("c_birthday not between", value1, value2, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCOccupationIsNull() {
            addCriterion("c_occupation is null");
            return (Criteria) this;
        }

        public Criteria andCOccupationIsNotNull() {
            addCriterion("c_occupation is not null");
            return (Criteria) this;
        }

        public Criteria andCOccupationEqualTo(String value) {
            addCriterion("c_occupation =", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationNotEqualTo(String value) {
            addCriterion("c_occupation <>", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationGreaterThan(String value) {
            addCriterion("c_occupation >", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("c_occupation >=", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationLessThan(String value) {
            addCriterion("c_occupation <", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationLessThanOrEqualTo(String value) {
            addCriterion("c_occupation <=", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationLike(String value) {
            addCriterion("c_occupation like", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationNotLike(String value) {
            addCriterion("c_occupation not like", value, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationIn(List<String> values) {
            addCriterion("c_occupation in", values, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationNotIn(List<String> values) {
            addCriterion("c_occupation not in", values, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationBetween(String value1, String value2) {
            addCriterion("c_occupation between", value1, value2, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCOccupationNotBetween(String value1, String value2) {
            addCriterion("c_occupation not between", value1, value2, "cOccupation");
            return (Criteria) this;
        }

        public Criteria andCForeignNameIsNull() {
            addCriterion("c_foreign_name is null");
            return (Criteria) this;
        }

        public Criteria andCForeignNameIsNotNull() {
            addCriterion("c_foreign_name is not null");
            return (Criteria) this;
        }

        public Criteria andCForeignNameEqualTo(String value) {
            addCriterion("c_foreign_name =", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameNotEqualTo(String value) {
            addCriterion("c_foreign_name <>", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameGreaterThan(String value) {
            addCriterion("c_foreign_name >", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_foreign_name >=", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameLessThan(String value) {
            addCriterion("c_foreign_name <", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameLessThanOrEqualTo(String value) {
            addCriterion("c_foreign_name <=", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameLike(String value) {
            addCriterion("c_foreign_name like", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameNotLike(String value) {
            addCriterion("c_foreign_name not like", value, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameIn(List<String> values) {
            addCriterion("c_foreign_name in", values, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameNotIn(List<String> values) {
            addCriterion("c_foreign_name not in", values, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameBetween(String value1, String value2) {
            addCriterion("c_foreign_name between", value1, value2, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCForeignNameNotBetween(String value1, String value2) {
            addCriterion("c_foreign_name not between", value1, value2, "cForeignName");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceIsNull() {
            addCriterion("c_birth_place is null");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceIsNotNull() {
            addCriterion("c_birth_place is not null");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceEqualTo(String value) {
            addCriterion("c_birth_place =", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceNotEqualTo(String value) {
            addCriterion("c_birth_place <>", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceGreaterThan(String value) {
            addCriterion("c_birth_place >", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("c_birth_place >=", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceLessThan(String value) {
            addCriterion("c_birth_place <", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceLessThanOrEqualTo(String value) {
            addCriterion("c_birth_place <=", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceLike(String value) {
            addCriterion("c_birth_place like", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceNotLike(String value) {
            addCriterion("c_birth_place not like", value, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceIn(List<String> values) {
            addCriterion("c_birth_place in", values, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceNotIn(List<String> values) {
            addCriterion("c_birth_place not in", values, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceBetween(String value1, String value2) {
            addCriterion("c_birth_place between", value1, value2, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCBirthPlaceNotBetween(String value1, String value2) {
            addCriterion("c_birth_place not between", value1, value2, "cBirthPlace");
            return (Criteria) this;
        }

        public Criteria andCPhotoIsNull() {
            addCriterion("c_photo is null");
            return (Criteria) this;
        }

        public Criteria andCPhotoIsNotNull() {
            addCriterion("c_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCPhotoEqualTo(String value) {
            addCriterion("c_photo =", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoNotEqualTo(String value) {
            addCriterion("c_photo <>", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoGreaterThan(String value) {
            addCriterion("c_photo >", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("c_photo >=", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoLessThan(String value) {
            addCriterion("c_photo <", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoLessThanOrEqualTo(String value) {
            addCriterion("c_photo <=", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoLike(String value) {
            addCriterion("c_photo like", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoNotLike(String value) {
            addCriterion("c_photo not like", value, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoIn(List<String> values) {
            addCriterion("c_photo in", values, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoNotIn(List<String> values) {
            addCriterion("c_photo not in", values, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoBetween(String value1, String value2) {
            addCriterion("c_photo between", value1, value2, "cPhoto");
            return (Criteria) this;
        }

        public Criteria andCPhotoNotBetween(String value1, String value2) {
            addCriterion("c_photo not between", value1, value2, "cPhoto");
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