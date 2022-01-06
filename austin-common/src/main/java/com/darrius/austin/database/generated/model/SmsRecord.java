package com.darrius.austin.database.generated.model;

import java.io.Serializable;


/**
 * The bean for table sms_record.
 * 
 * @author Darrius
 * @since 06/01/2022
 */
public class SmsRecord implements Serializable {
    /**
     * This field corresponds to the database column sms_record.id.
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   消息模板ID
     * This field corresponds to the database column sms_record.message_template_id.
     */
    private Long messageTemplateId;

    /**
     * Database Column Remarks:
     *   手机号
     * This field corresponds to the database column sms_record.phone.
     */
    private Long phone;

    /**
     * Database Column Remarks:
     *   发送短信渠道商的ID
     * This field corresponds to the database column sms_record.supplier_id.
     */
    private Byte supplierId;

    /**
     * Database Column Remarks:
     *   发送短信渠道商的名称
     * This field corresponds to the database column sms_record.supplier_name.
     */
    private String supplierName;

    /**
     * Database Column Remarks:
     *   短信发送的内容
     * This field corresponds to the database column sms_record.msg_content.
     */
    private String msgContent;

    /**
     * Database Column Remarks:
     *   下发批次的ID
     * This field corresponds to the database column sms_record.series_id.
     */
    private String seriesId;

    /**
     * Database Column Remarks:
     *   计费条数
     * This field corresponds to the database column sms_record.charging_num.
     */
    private Byte chargingNum;

    /**
     * Database Column Remarks:
     *   回执内容
     * This field corresponds to the database column sms_record.report_content.
     */
    private String reportContent;

    /**
     * Database Column Remarks:
     *   短信状态： 10.发送 20.成功 30.失败
     * This field corresponds to the database column sms_record.status.
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   发送日期：20211112
     * This field corresponds to the database column sms_record.send_date.
     */
    private Integer sendDate;

    /**
     * Database Column Remarks:
     *   创建时间
     * This field corresponds to the database column sms_record.created.
     */
    private Integer created;

    /**
     * Database Column Remarks:
     *   更新时间
     * This field corresponds to the database column sms_record.updated.
     */
    private Integer updated;

    private static final long serialVersionUID = 1L;

    /**
     * Get sms_record.id.
     *
     * @return The value of sms_record.id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set sms_record.id.
     *
     * @param id The value for sms_record.id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get sms_record.message_template_id.
     *
     * @return The value of sms_record.message_template_id.
     */
    public Long getMessageTemplateId() {
        return messageTemplateId;
    }

    /**
     * Set sms_record.message_template_id.
     *
     * @param messageTemplateId The value for sms_record.message_template_id.
     */
    public void setMessageTemplateId(Long messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
    }

    /**
     * Get sms_record.phone.
     *
     * @return The value of sms_record.phone.
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * Set sms_record.phone.
     *
     * @param phone The value for sms_record.phone.
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * Get sms_record.supplier_id.
     *
     * @return The value of sms_record.supplier_id.
     */
    public Byte getSupplierId() {
        return supplierId;
    }

    /**
     * Set sms_record.supplier_id.
     *
     * @param supplierId The value for sms_record.supplier_id.
     */
    public void setSupplierId(Byte supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * Get sms_record.supplier_name.
     *
     * @return The value of sms_record.supplier_name.
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Set sms_record.supplier_name.
     *
     * @param supplierName The value for sms_record.supplier_name.
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * Get sms_record.msg_content.
     *
     * @return The value of sms_record.msg_content.
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * Set sms_record.msg_content.
     *
     * @param msgContent The value for sms_record.msg_content.
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    /**
     * Get sms_record.series_id.
     *
     * @return The value of sms_record.series_id.
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * Set sms_record.series_id.
     *
     * @param seriesId The value for sms_record.series_id.
     */
    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * Get sms_record.charging_num.
     *
     * @return The value of sms_record.charging_num.
     */
    public Byte getChargingNum() {
        return chargingNum;
    }

    /**
     * Set sms_record.charging_num.
     *
     * @param chargingNum The value for sms_record.charging_num.
     */
    public void setChargingNum(Byte chargingNum) {
        this.chargingNum = chargingNum;
    }

    /**
     * Get sms_record.report_content.
     *
     * @return The value of sms_record.report_content.
     */
    public String getReportContent() {
        return reportContent;
    }

    /**
     * Set sms_record.report_content.
     *
     * @param reportContent The value for sms_record.report_content.
     */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    /**
     * Get sms_record.status.
     *
     * @return The value of sms_record.status.
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * Set sms_record.status.
     *
     * @param status The value for sms_record.status.
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * Get sms_record.send_date.
     *
     * @return The value of sms_record.send_date.
     */
    public Integer getSendDate() {
        return sendDate;
    }

    /**
     * Set sms_record.send_date.
     *
     * @param sendDate The value for sms_record.send_date.
     */
    public void setSendDate(Integer sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * Get sms_record.created.
     *
     * @return The value of sms_record.created.
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * Set sms_record.created.
     *
     * @param created The value for sms_record.created.
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * Get sms_record.updated.
     *
     * @return The value of sms_record.updated.
     */
    public Integer getUpdated() {
        return updated;
    }

    /**
     * Set sms_record.updated.
     *
     * @param updated The value for sms_record.updated.
     */
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    /**
     * To string.
     * 
     * @return The java.lang.String.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messageTemplateId=").append(messageTemplateId);
        sb.append(", phone=").append(phone);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", msgContent=").append(msgContent);
        sb.append(", seriesId=").append(seriesId);
        sb.append(", chargingNum=").append(chargingNum);
        sb.append(", reportContent=").append(reportContent);
        sb.append(", status=").append(status);
        sb.append(", sendDate=").append(sendDate);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}