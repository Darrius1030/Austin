package com.darrius.austin.database.generated.model;

import java.util.ArrayList;
import java.util.List;

public class MessageTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * Message template example.
     * 
     */
    public MessageTemplateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * Set order by clause.
     * 
     * @param orderByClause  The {@link String}.
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * Get order by clause.
     * 
     * @return The java.lang.String.
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * Set distinct.
     * 
     * @param distinct  The {@link boolean}.
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Is distinct.
     * 
     * @return The boolean.
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Get ored criteria.
     * 
     * @return The java.util.List<Criteria>.
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * Or.
     * 
     * @param criteria  The {@link Criteria}.
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * Or.
     * 
     * @return The Criteria.
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Create criteria.
     * 
     * @return The Criteria.
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Create criteria internal.
     * 
     * @return The Criteria.
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Clear.
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table message_template
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Byte value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Byte value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Byte value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Byte value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Byte> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Byte> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Byte value1, Byte value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("flow_id like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("flow_id not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNull() {
            addCriterion("msg_status is null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNotNull() {
            addCriterion("msg_status is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusEqualTo(Byte value) {
            addCriterion("msg_status =", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotEqualTo(Byte value) {
            addCriterion("msg_status <>", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThan(Byte value) {
            addCriterion("msg_status >", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("msg_status >=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThan(Byte value) {
            addCriterion("msg_status <", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThanOrEqualTo(Byte value) {
            addCriterion("msg_status <=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIn(List<Byte> values) {
            addCriterion("msg_status in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotIn(List<Byte> values) {
            addCriterion("msg_status not in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusBetween(Byte value1, Byte value2) {
            addCriterion("msg_status between", value1, value2, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("msg_status not between", value1, value2, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(Byte value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(Byte value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(Byte value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(Byte value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(Byte value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<Byte> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<Byte> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(Byte value1, Byte value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andSendChannelIsNull() {
            addCriterion("send_channel is null");
            return (Criteria) this;
        }

        public Criteria andSendChannelIsNotNull() {
            addCriterion("send_channel is not null");
            return (Criteria) this;
        }

        public Criteria andSendChannelEqualTo(Byte value) {
            addCriterion("send_channel =", value, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelNotEqualTo(Byte value) {
            addCriterion("send_channel <>", value, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelGreaterThan(Byte value) {
            addCriterion("send_channel >", value, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("send_channel >=", value, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelLessThan(Byte value) {
            addCriterion("send_channel <", value, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelLessThanOrEqualTo(Byte value) {
            addCriterion("send_channel <=", value, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelIn(List<Byte> values) {
            addCriterion("send_channel in", values, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelNotIn(List<Byte> values) {
            addCriterion("send_channel not in", values, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelBetween(Byte value1, Byte value2) {
            addCriterion("send_channel between", value1, value2, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andSendChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("send_channel not between", value1, value2, "sendChannel");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNull() {
            addCriterion("template_type is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNotNull() {
            addCriterion("template_type is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeEqualTo(Byte value) {
            addCriterion("template_type =", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotEqualTo(Byte value) {
            addCriterion("template_type <>", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThan(Byte value) {
            addCriterion("template_type >", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("template_type >=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThan(Byte value) {
            addCriterion("template_type <", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("template_type <=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIn(List<Byte> values) {
            addCriterion("template_type in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotIn(List<Byte> values) {
            addCriterion("template_type not in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeBetween(Byte value1, Byte value2) {
            addCriterion("template_type between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("template_type not between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(Byte value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(Byte value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(Byte value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(Byte value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(Byte value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<Byte> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<Byte> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(Byte value1, Byte value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeIsNull() {
            addCriterion("expect_push_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeIsNotNull() {
            addCriterion("expect_push_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeEqualTo(String value) {
            addCriterion("expect_push_time =", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeNotEqualTo(String value) {
            addCriterion("expect_push_time <>", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeGreaterThan(String value) {
            addCriterion("expect_push_time >", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeGreaterThanOrEqualTo(String value) {
            addCriterion("expect_push_time >=", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeLessThan(String value) {
            addCriterion("expect_push_time <", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeLessThanOrEqualTo(String value) {
            addCriterion("expect_push_time <=", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeLike(String value) {
            addCriterion("expect_push_time like", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeNotLike(String value) {
            addCriterion("expect_push_time not like", value, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeIn(List<String> values) {
            addCriterion("expect_push_time in", values, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeNotIn(List<String> values) {
            addCriterion("expect_push_time not in", values, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeBetween(String value1, String value2) {
            addCriterion("expect_push_time between", value1, value2, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andExpectPushTimeNotBetween(String value1, String value2) {
            addCriterion("expect_push_time not between", value1, value2, "expectPushTime");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("msg_content is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("msg_content =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("msg_content <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("msg_content >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_content >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("msg_content <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("msg_content <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("msg_content like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("msg_content not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("msg_content in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("msg_content not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("msg_content not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andSendAccountIsNull() {
            addCriterion("send_account is null");
            return (Criteria) this;
        }

        public Criteria andSendAccountIsNotNull() {
            addCriterion("send_account is not null");
            return (Criteria) this;
        }

        public Criteria andSendAccountEqualTo(Byte value) {
            addCriterion("send_account =", value, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountNotEqualTo(Byte value) {
            addCriterion("send_account <>", value, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountGreaterThan(Byte value) {
            addCriterion("send_account >", value, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountGreaterThanOrEqualTo(Byte value) {
            addCriterion("send_account >=", value, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountLessThan(Byte value) {
            addCriterion("send_account <", value, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountLessThanOrEqualTo(Byte value) {
            addCriterion("send_account <=", value, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountIn(List<Byte> values) {
            addCriterion("send_account in", values, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountNotIn(List<Byte> values) {
            addCriterion("send_account not in", values, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountBetween(Byte value1, Byte value2) {
            addCriterion("send_account between", value1, value2, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andSendAccountNotBetween(Byte value1, Byte value2) {
            addCriterion("send_account not between", value1, value2, "sendAccount");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("updator is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("updator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("updator =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("updator <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("updator >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("updator >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("updator <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("updator <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("updator like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("updator not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("updator in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("updator not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("updator between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("updator not between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("team like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("team not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Integer value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Integer value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Integer value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Integer value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Integer value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Integer> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Integer> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Integer value1, Integer value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Integer value1, Integer value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeIsNull() {
            addCriterion("deduplication_time is null");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeIsNotNull() {
            addCriterion("deduplication_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeEqualTo(Byte value) {
            addCriterion("deduplication_time =", value, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeNotEqualTo(Byte value) {
            addCriterion("deduplication_time <>", value, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeGreaterThan(Byte value) {
            addCriterion("deduplication_time >", value, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("deduplication_time >=", value, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeLessThan(Byte value) {
            addCriterion("deduplication_time <", value, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeLessThanOrEqualTo(Byte value) {
            addCriterion("deduplication_time <=", value, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeIn(List<Byte> values) {
            addCriterion("deduplication_time in", values, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeNotIn(List<Byte> values) {
            addCriterion("deduplication_time not in", values, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeBetween(Byte value1, Byte value2) {
            addCriterion("deduplication_time between", value1, value2, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andDeduplicationTimeNotBetween(Byte value1, Byte value2) {
            addCriterion("deduplication_time not between", value1, value2, "deduplicationTime");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldIsNull() {
            addCriterion("is_night_shield is null");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldIsNotNull() {
            addCriterion("is_night_shield is not null");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldEqualTo(Byte value) {
            addCriterion("is_night_shield =", value, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldNotEqualTo(Byte value) {
            addCriterion("is_night_shield <>", value, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldGreaterThan(Byte value) {
            addCriterion("is_night_shield >", value, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_night_shield >=", value, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldLessThan(Byte value) {
            addCriterion("is_night_shield <", value, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldLessThanOrEqualTo(Byte value) {
            addCriterion("is_night_shield <=", value, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldIn(List<Byte> values) {
            addCriterion("is_night_shield in", values, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldNotIn(List<Byte> values) {
            addCriterion("is_night_shield not in", values, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldBetween(Byte value1, Byte value2) {
            addCriterion("is_night_shield between", value1, value2, "isNightShield");
            return (Criteria) this;
        }

        public Criteria andIsNightShieldNotBetween(Byte value1, Byte value2) {
            addCriterion("is_night_shield not between", value1, value2, "isNightShield");
            return (Criteria) this;
        }
    }

    /**
    message_template
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table message_template
     */
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