package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesAndStaffsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoviesAndStaffsExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("StaffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("StaffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("StaffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("StaffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("StaffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StaffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("StaffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("StaffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("StaffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("StaffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("StaffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("StaffId not between", value1, value2, "staffid");
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

        public Criteria andStafftypeIsNull() {
            addCriterion("StaffType is null");
            return (Criteria) this;
        }

        public Criteria andStafftypeIsNotNull() {
            addCriterion("StaffType is not null");
            return (Criteria) this;
        }

        public Criteria andStafftypeEqualTo(Integer value) {
            addCriterion("StaffType =", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeNotEqualTo(Integer value) {
            addCriterion("StaffType <>", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeGreaterThan(Integer value) {
            addCriterion("StaffType >", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("StaffType >=", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeLessThan(Integer value) {
            addCriterion("StaffType <", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeLessThanOrEqualTo(Integer value) {
            addCriterion("StaffType <=", value, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeIn(List<Integer> values) {
            addCriterion("StaffType in", values, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeNotIn(List<Integer> values) {
            addCriterion("StaffType not in", values, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeBetween(Integer value1, Integer value2) {
            addCriterion("StaffType between", value1, value2, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStafftypeNotBetween(Integer value1, Integer value2) {
            addCriterion("StaffType not between", value1, value2, "stafftype");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("StaffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("StaffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("StaffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("StaffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("StaffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("StaffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("StaffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("StaffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("StaffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("StaffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("StaffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("StaffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("StaffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("StaffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffgenderIsNull() {
            addCriterion("StaffGender is null");
            return (Criteria) this;
        }

        public Criteria andStaffgenderIsNotNull() {
            addCriterion("StaffGender is not null");
            return (Criteria) this;
        }

        public Criteria andStaffgenderEqualTo(Short value) {
            addCriterion("StaffGender =", value, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderNotEqualTo(Short value) {
            addCriterion("StaffGender <>", value, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderGreaterThan(Short value) {
            addCriterion("StaffGender >", value, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderGreaterThanOrEqualTo(Short value) {
            addCriterion("StaffGender >=", value, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderLessThan(Short value) {
            addCriterion("StaffGender <", value, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderLessThanOrEqualTo(Short value) {
            addCriterion("StaffGender <=", value, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderIn(List<Short> values) {
            addCriterion("StaffGender in", values, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderNotIn(List<Short> values) {
            addCriterion("StaffGender not in", values, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderBetween(Short value1, Short value2) {
            addCriterion("StaffGender between", value1, value2, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffgenderNotBetween(Short value1, Short value2) {
            addCriterion("StaffGender not between", value1, value2, "staffgender");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayIsNull() {
            addCriterion("StaffBirthday is null");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayIsNotNull() {
            addCriterion("StaffBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayEqualTo(String value) {
            addCriterion("StaffBirthday =", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayNotEqualTo(String value) {
            addCriterion("StaffBirthday <>", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayGreaterThan(String value) {
            addCriterion("StaffBirthday >", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("StaffBirthday >=", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayLessThan(String value) {
            addCriterion("StaffBirthday <", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayLessThanOrEqualTo(String value) {
            addCriterion("StaffBirthday <=", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayLike(String value) {
            addCriterion("StaffBirthday like", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayNotLike(String value) {
            addCriterion("StaffBirthday not like", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayIn(List<String> values) {
            addCriterion("StaffBirthday in", values, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayNotIn(List<String> values) {
            addCriterion("StaffBirthday not in", values, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayBetween(String value1, String value2) {
            addCriterion("StaffBirthday between", value1, value2, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayNotBetween(String value1, String value2) {
            addCriterion("StaffBirthday not between", value1, value2, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationIsNull() {
            addCriterion("StaffOccupation is null");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationIsNotNull() {
            addCriterion("StaffOccupation is not null");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationEqualTo(String value) {
            addCriterion("StaffOccupation =", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationNotEqualTo(String value) {
            addCriterion("StaffOccupation <>", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationGreaterThan(String value) {
            addCriterion("StaffOccupation >", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationGreaterThanOrEqualTo(String value) {
            addCriterion("StaffOccupation >=", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationLessThan(String value) {
            addCriterion("StaffOccupation <", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationLessThanOrEqualTo(String value) {
            addCriterion("StaffOccupation <=", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationLike(String value) {
            addCriterion("StaffOccupation like", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationNotLike(String value) {
            addCriterion("StaffOccupation not like", value, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationIn(List<String> values) {
            addCriterion("StaffOccupation in", values, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationNotIn(List<String> values) {
            addCriterion("StaffOccupation not in", values, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationBetween(String value1, String value2) {
            addCriterion("StaffOccupation between", value1, value2, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffoccupationNotBetween(String value1, String value2) {
            addCriterion("StaffOccupation not between", value1, value2, "staffoccupation");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameIsNull() {
            addCriterion("StaffForeignName is null");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameIsNotNull() {
            addCriterion("StaffForeignName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameEqualTo(String value) {
            addCriterion("StaffForeignName =", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameNotEqualTo(String value) {
            addCriterion("StaffForeignName <>", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameGreaterThan(String value) {
            addCriterion("StaffForeignName >", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameGreaterThanOrEqualTo(String value) {
            addCriterion("StaffForeignName >=", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameLessThan(String value) {
            addCriterion("StaffForeignName <", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameLessThanOrEqualTo(String value) {
            addCriterion("StaffForeignName <=", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameLike(String value) {
            addCriterion("StaffForeignName like", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameNotLike(String value) {
            addCriterion("StaffForeignName not like", value, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameIn(List<String> values) {
            addCriterion("StaffForeignName in", values, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameNotIn(List<String> values) {
            addCriterion("StaffForeignName not in", values, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameBetween(String value1, String value2) {
            addCriterion("StaffForeignName between", value1, value2, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffforeignnameNotBetween(String value1, String value2) {
            addCriterion("StaffForeignName not between", value1, value2, "staffforeignname");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceIsNull() {
            addCriterion("StaffBirthPlace is null");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceIsNotNull() {
            addCriterion("StaffBirthPlace is not null");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceEqualTo(String value) {
            addCriterion("StaffBirthPlace =", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceNotEqualTo(String value) {
            addCriterion("StaffBirthPlace <>", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceGreaterThan(String value) {
            addCriterion("StaffBirthPlace >", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("StaffBirthPlace >=", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceLessThan(String value) {
            addCriterion("StaffBirthPlace <", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceLessThanOrEqualTo(String value) {
            addCriterion("StaffBirthPlace <=", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceLike(String value) {
            addCriterion("StaffBirthPlace like", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceNotLike(String value) {
            addCriterion("StaffBirthPlace not like", value, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceIn(List<String> values) {
            addCriterion("StaffBirthPlace in", values, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceNotIn(List<String> values) {
            addCriterion("StaffBirthPlace not in", values, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceBetween(String value1, String value2) {
            addCriterion("StaffBirthPlace between", value1, value2, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffbirthplaceNotBetween(String value1, String value2) {
            addCriterion("StaffBirthPlace not between", value1, value2, "staffbirthplace");
            return (Criteria) this;
        }

        public Criteria andStaffphotoIsNull() {
            addCriterion("StaffPhoto is null");
            return (Criteria) this;
        }

        public Criteria andStaffphotoIsNotNull() {
            addCriterion("StaffPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andStaffphotoEqualTo(String value) {
            addCriterion("StaffPhoto =", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoNotEqualTo(String value) {
            addCriterion("StaffPhoto <>", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoGreaterThan(String value) {
            addCriterion("StaffPhoto >", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoGreaterThanOrEqualTo(String value) {
            addCriterion("StaffPhoto >=", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoLessThan(String value) {
            addCriterion("StaffPhoto <", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoLessThanOrEqualTo(String value) {
            addCriterion("StaffPhoto <=", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoLike(String value) {
            addCriterion("StaffPhoto like", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoNotLike(String value) {
            addCriterion("StaffPhoto not like", value, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoIn(List<String> values) {
            addCriterion("StaffPhoto in", values, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoNotIn(List<String> values) {
            addCriterion("StaffPhoto not in", values, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoBetween(String value1, String value2) {
            addCriterion("StaffPhoto between", value1, value2, "staffphoto");
            return (Criteria) this;
        }

        public Criteria andStaffphotoNotBetween(String value1, String value2) {
            addCriterion("StaffPhoto not between", value1, value2, "staffphoto");
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