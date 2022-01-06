package com.darrius.austin.database.generated.model;

import java.util.ArrayList;
import java.util.List;

public class SmsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * Sms record example.
     * 
     */
    public SmsRecordExample() {
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
     * This class corresponds to the database table sms_record
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

        public Criteria andMessageTemplateIdIsNull() {
            addCriterion("message_template_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdIsNotNull() {
            addCriterion("message_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdEqualTo(Long value) {
            addCriterion("message_template_id =", value, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdNotEqualTo(Long value) {
            addCriterion("message_template_id <>", value, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdGreaterThan(Long value) {
            addCriterion("message_template_id >", value, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("message_template_id >=", value, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdLessThan(Long value) {
            addCriterion("message_template_id <", value, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("message_template_id <=", value, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdIn(List<Long> values) {
            addCriterion("message_template_id in", values, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdNotIn(List<Long> values) {
            addCriterion("message_template_id not in", values, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdBetween(Long value1, Long value2) {
            addCriterion("message_template_id between", value1, value2, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andMessageTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("message_template_id not between", value1, value2, "messageTemplateId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Long value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Long value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Long value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Long value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Long value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Long> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Long> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Long value1, Long value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Long value1, Long value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Byte value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Byte value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Byte value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Byte value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Byte value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Byte> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Byte> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Byte value1, Byte value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Byte value1, Byte value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
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

        public Criteria andSeriesIdIsNull() {
            addCriterion("series_id is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("series_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(String value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(String value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(String value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(String value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(String value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(String value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLike(String value) {
            addCriterion("series_id like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotLike(String value) {
            addCriterion("series_id not like", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<String> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<String> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(String value1, String value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(String value1, String value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andChargingNumIsNull() {
            addCriterion("charging_num is null");
            return (Criteria) this;
        }

        public Criteria andChargingNumIsNotNull() {
            addCriterion("charging_num is not null");
            return (Criteria) this;
        }

        public Criteria andChargingNumEqualTo(Byte value) {
            addCriterion("charging_num =", value, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumNotEqualTo(Byte value) {
            addCriterion("charging_num <>", value, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumGreaterThan(Byte value) {
            addCriterion("charging_num >", value, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("charging_num >=", value, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumLessThan(Byte value) {
            addCriterion("charging_num <", value, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumLessThanOrEqualTo(Byte value) {
            addCriterion("charging_num <=", value, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumIn(List<Byte> values) {
            addCriterion("charging_num in", values, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumNotIn(List<Byte> values) {
            addCriterion("charging_num not in", values, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumBetween(Byte value1, Byte value2) {
            addCriterion("charging_num between", value1, value2, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andChargingNumNotBetween(Byte value1, Byte value2) {
            addCriterion("charging_num not between", value1, value2, "chargingNum");
            return (Criteria) this;
        }

        public Criteria andReportContentIsNull() {
            addCriterion("report_content is null");
            return (Criteria) this;
        }

        public Criteria andReportContentIsNotNull() {
            addCriterion("report_content is not null");
            return (Criteria) this;
        }

        public Criteria andReportContentEqualTo(String value) {
            addCriterion("report_content =", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotEqualTo(String value) {
            addCriterion("report_content <>", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentGreaterThan(String value) {
            addCriterion("report_content >", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentGreaterThanOrEqualTo(String value) {
            addCriterion("report_content >=", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLessThan(String value) {
            addCriterion("report_content <", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLessThanOrEqualTo(String value) {
            addCriterion("report_content <=", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLike(String value) {
            addCriterion("report_content like", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotLike(String value) {
            addCriterion("report_content not like", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentIn(List<String> values) {
            addCriterion("report_content in", values, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotIn(List<String> values) {
            addCriterion("report_content not in", values, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentBetween(String value1, String value2) {
            addCriterion("report_content between", value1, value2, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotBetween(String value1, String value2) {
            addCriterion("report_content not between", value1, value2, "reportContent");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Integer value) {
            addCriterion("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Integer value) {
            addCriterion("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Integer value) {
            addCriterion("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Integer value) {
            addCriterion("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Integer value) {
            addCriterion("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Integer> values) {
            addCriterion("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Integer> values) {
            addCriterion("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Integer value1, Integer value2) {
            addCriterion("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Integer value1, Integer value2) {
            addCriterion("send_date not between", value1, value2, "sendDate");
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
    }

    /**
    sms_record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table sms_record
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