package com.dbcourse.curriculum_design.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andNSenderIdIsNull() {
            addCriterion("n_sender_id is null");
            return (Criteria) this;
        }

        public Criteria andNSenderIdIsNotNull() {
            addCriterion("n_sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andNSenderIdEqualTo(Integer value) {
            addCriterion("n_sender_id =", value, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdNotEqualTo(Integer value) {
            addCriterion("n_sender_id <>", value, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdGreaterThan(Integer value) {
            addCriterion("n_sender_id >", value, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_sender_id >=", value, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdLessThan(Integer value) {
            addCriterion("n_sender_id <", value, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_sender_id <=", value, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdIn(List<Integer> values) {
            addCriterion("n_sender_id in", values, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdNotIn(List<Integer> values) {
            addCriterion("n_sender_id not in", values, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdBetween(Integer value1, Integer value2) {
            addCriterion("n_sender_id between", value1, value2, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNSenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_sender_id not between", value1, value2, "nSenderId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdIsNull() {
            addCriterion("n_receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdIsNotNull() {
            addCriterion("n_receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdEqualTo(Integer value) {
            addCriterion("n_receiver_id =", value, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdNotEqualTo(Integer value) {
            addCriterion("n_receiver_id <>", value, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdGreaterThan(Integer value) {
            addCriterion("n_receiver_id >", value, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_receiver_id >=", value, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdLessThan(Integer value) {
            addCriterion("n_receiver_id <", value, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_receiver_id <=", value, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdIn(List<Integer> values) {
            addCriterion("n_receiver_id in", values, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdNotIn(List<Integer> values) {
            addCriterion("n_receiver_id not in", values, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdBetween(Integer value1, Integer value2) {
            addCriterion("n_receiver_id between", value1, value2, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andNReceiverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_receiver_id not between", value1, value2, "nReceiverId");
            return (Criteria) this;
        }

        public Criteria andDSendTimeIsNull() {
            addCriterion("d_send_time is null");
            return (Criteria) this;
        }

        public Criteria andDSendTimeIsNotNull() {
            addCriterion("d_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andDSendTimeEqualTo(Date value) {
            addCriterion("d_send_time =", value, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeNotEqualTo(Date value) {
            addCriterion("d_send_time <>", value, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeGreaterThan(Date value) {
            addCriterion("d_send_time >", value, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_send_time >=", value, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeLessThan(Date value) {
            addCriterion("d_send_time <", value, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_send_time <=", value, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeIn(List<Date> values) {
            addCriterion("d_send_time in", values, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeNotIn(List<Date> values) {
            addCriterion("d_send_time not in", values, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeBetween(Date value1, Date value2) {
            addCriterion("d_send_time between", value1, value2, "dSendTime");
            return (Criteria) this;
        }

        public Criteria andDSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_send_time not between", value1, value2, "dSendTime");
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