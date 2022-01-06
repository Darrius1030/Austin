package com.darrius.austin.database.generated.model;

import java.io.Serializable;


/**
 * The bean for table message_template.
 * 
 * @author Darrius
 * @since 06/01/2022
 */
public class MessageTemplate implements Serializable {
    /**
     * This field corresponds to the database column message_template.id.
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   标题
     * This field corresponds to the database column message_template.name.
     */
    private String name;

    /**
     * Database Column Remarks:
     *   当前消息审核状态： 10.待审核 20.审核成功 30.被拒绝
     * This field corresponds to the database column message_template.audit_status.
     */
    private Byte auditStatus;

    /**
     * Database Column Remarks:
     *   工单ID
     * This field corresponds to the database column message_template.flow_id.
     */
    private String flowId;

    /**
     * Database Column Remarks:
     *   当前消息状态：10.新建 20.停用 30.启用 40.等待发送 50.发送中 60.发送成功 70.发送失败
     * This field corresponds to the database column message_template.msg_status.
     */
    private Byte msgStatus;

    /**
     * Database Column Remarks:
     *   消息的发送ID类型：10. userId 20.did 30.手机号 40.openId 50.email
     * This field corresponds to the database column message_template.id_type.
     */
    private Byte idType;

    /**
     * Database Column Remarks:
     *   消息发送渠道：10.IM 20.Push 30.短信 40.Email 50.公众号 60.小程序
     * This field corresponds to the database column message_template.send_channel.
     */
    private Byte sendChannel;

    /**
     * Database Column Remarks:
     *   10.运营类 20.技术类接口调用
     * This field corresponds to the database column message_template.template_type.
     */
    private Byte templateType;

    /**
     * Database Column Remarks:
     *   10.通知类消息 20.营销类消息 30.验证码类消息
     * This field corresponds to the database column message_template.msg_type.
     */
    private Byte msgType;

    /**
     * Database Column Remarks:
     *   期望发送时间：立即发送.10 定时任务以及周期任务.cron表达式
     * This field corresponds to the database column message_template.expect_push_time.
     */
    private String expectPushTime;

    /**
     * Database Column Remarks:
     *   消息内容 占位符用{$var}表示
     * This field corresponds to the database column message_template.msg_content.
     */
    private String msgContent;

    /**
     * Database Column Remarks:
     *   发送账号 一个渠道下可存在多个账号
     * This field corresponds to the database column message_template.send_account.
     */
    private Byte sendAccount;

    /**
     * Database Column Remarks:
     *   创建者
     * This field corresponds to the database column message_template.creator.
     */
    private String creator;

    /**
     * Database Column Remarks:
     *   更新者
     * This field corresponds to the database column message_template.updator.
     */
    private String updator;

    /**
     * Database Column Remarks:
     *   审核人
     * This field corresponds to the database column message_template.auditor.
     */
    private String auditor;

    /**
     * Database Column Remarks:
     *   业务方团队
     * This field corresponds to the database column message_template.team.
     */
    private String team;

    /**
     * Database Column Remarks:
     *   业务方
     * This field corresponds to the database column message_template.proposer.
     */
    private String proposer;

    /**
     * Database Column Remarks:
     *   是否删除：0.不删除 1.删除
     * This field corresponds to the database column message_template.is_deleted.
     */
    private Byte isDeleted;

    /**
     * Database Column Remarks:
     *   创建时间
     * This field corresponds to the database column message_template.created.
     */
    private Integer created;

    /**
     * Database Column Remarks:
     *   更新时间
     * This field corresponds to the database column message_template.updated.
     */
    private Integer updated;

    /**
     * Database Column Remarks:
     *   去重时间 单位小时
     * This field corresponds to the database column message_template.deduplication_time.
     */
    private Byte deduplicationTime;

    /**
     * Database Column Remarks:
     *   是否夜间屏蔽：0.夜间不屏蔽 1.夜间屏蔽
     * This field corresponds to the database column message_template.is_night_shield.
     */
    private Byte isNightShield;

    private static final long serialVersionUID = 1L;

    /**
     * Get message_template.id.
     *
     * @return The value of message_template.id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set message_template.id.
     *
     * @param id The value for message_template.id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get message_template.name.
     *
     * @return The value of message_template.name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set message_template.name.
     *
     * @param name The value for message_template.name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get message_template.audit_status.
     *
     * @return The value of message_template.audit_status.
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * Set message_template.audit_status.
     *
     * @param auditStatus The value for message_template.audit_status.
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * Get message_template.flow_id.
     *
     * @return The value of message_template.flow_id.
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * Set message_template.flow_id.
     *
     * @param flowId The value for message_template.flow_id.
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * Get message_template.msg_status.
     *
     * @return The value of message_template.msg_status.
     */
    public Byte getMsgStatus() {
        return msgStatus;
    }

    /**
     * Set message_template.msg_status.
     *
     * @param msgStatus The value for message_template.msg_status.
     */
    public void setMsgStatus(Byte msgStatus) {
        this.msgStatus = msgStatus;
    }

    /**
     * Get message_template.id_type.
     *
     * @return The value of message_template.id_type.
     */
    public Byte getIdType() {
        return idType;
    }

    /**
     * Set message_template.id_type.
     *
     * @param idType The value for message_template.id_type.
     */
    public void setIdType(Byte idType) {
        this.idType = idType;
    }

    /**
     * Get message_template.send_channel.
     *
     * @return The value of message_template.send_channel.
     */
    public Byte getSendChannel() {
        return sendChannel;
    }

    /**
     * Set message_template.send_channel.
     *
     * @param sendChannel The value for message_template.send_channel.
     */
    public void setSendChannel(Byte sendChannel) {
        this.sendChannel = sendChannel;
    }

    /**
     * Get message_template.template_type.
     *
     * @return The value of message_template.template_type.
     */
    public Byte getTemplateType() {
        return templateType;
    }

    /**
     * Set message_template.template_type.
     *
     * @param templateType The value for message_template.template_type.
     */
    public void setTemplateType(Byte templateType) {
        this.templateType = templateType;
    }

    /**
     * Get message_template.msg_type.
     *
     * @return The value of message_template.msg_type.
     */
    public Byte getMsgType() {
        return msgType;
    }

    /**
     * Set message_template.msg_type.
     *
     * @param msgType The value for message_template.msg_type.
     */
    public void setMsgType(Byte msgType) {
        this.msgType = msgType;
    }

    /**
     * Get message_template.expect_push_time.
     *
     * @return The value of message_template.expect_push_time.
     */
    public String getExpectPushTime() {
        return expectPushTime;
    }

    /**
     * Set message_template.expect_push_time.
     *
     * @param expectPushTime The value for message_template.expect_push_time.
     */
    public void setExpectPushTime(String expectPushTime) {
        this.expectPushTime = expectPushTime;
    }

    /**
     * Get message_template.msg_content.
     *
     * @return The value of message_template.msg_content.
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * Set message_template.msg_content.
     *
     * @param msgContent The value for message_template.msg_content.
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    /**
     * Get message_template.send_account.
     *
     * @return The value of message_template.send_account.
     */
    public Byte getSendAccount() {
        return sendAccount;
    }

    /**
     * Set message_template.send_account.
     *
     * @param sendAccount The value for message_template.send_account.
     */
    public void setSendAccount(Byte sendAccount) {
        this.sendAccount = sendAccount;
    }

    /**
     * Get message_template.creator.
     *
     * @return The value of message_template.creator.
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Set message_template.creator.
     *
     * @param creator The value for message_template.creator.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Get message_template.updator.
     *
     * @return The value of message_template.updator.
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * Set message_template.updator.
     *
     * @param updator The value for message_template.updator.
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }

    /**
     * Get message_template.auditor.
     *
     * @return The value of message_template.auditor.
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * Set message_template.auditor.
     *
     * @param auditor The value for message_template.auditor.
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    /**
     * Get message_template.team.
     *
     * @return The value of message_template.team.
     */
    public String getTeam() {
        return team;
    }

    /**
     * Set message_template.team.
     *
     * @param team The value for message_template.team.
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * Get message_template.proposer.
     *
     * @return The value of message_template.proposer.
     */
    public String getProposer() {
        return proposer;
    }

    /**
     * Set message_template.proposer.
     *
     * @param proposer The value for message_template.proposer.
     */
    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    /**
     * Get message_template.is_deleted.
     *
     * @return The value of message_template.is_deleted.
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * Set message_template.is_deleted.
     *
     * @param isDeleted The value for message_template.is_deleted.
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Get message_template.created.
     *
     * @return The value of message_template.created.
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * Set message_template.created.
     *
     * @param created The value for message_template.created.
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * Get message_template.updated.
     *
     * @return The value of message_template.updated.
     */
    public Integer getUpdated() {
        return updated;
    }

    /**
     * Set message_template.updated.
     *
     * @param updated The value for message_template.updated.
     */
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    /**
     * Get message_template.deduplication_time.
     *
     * @return The value of message_template.deduplication_time.
     */
    public Byte getDeduplicationTime() {
        return deduplicationTime;
    }

    /**
     * Set message_template.deduplication_time.
     *
     * @param deduplicationTime The value for message_template.deduplication_time.
     */
    public void setDeduplicationTime(Byte deduplicationTime) {
        this.deduplicationTime = deduplicationTime;
    }

    /**
     * Get message_template.is_night_shield.
     *
     * @return The value of message_template.is_night_shield.
     */
    public Byte getIsNightShield() {
        return isNightShield;
    }

    /**
     * Set message_template.is_night_shield.
     *
     * @param isNightShield The value for message_template.is_night_shield.
     */
    public void setIsNightShield(Byte isNightShield) {
        this.isNightShield = isNightShield;
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
        sb.append(", name=").append(name);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", flowId=").append(flowId);
        sb.append(", msgStatus=").append(msgStatus);
        sb.append(", idType=").append(idType);
        sb.append(", sendChannel=").append(sendChannel);
        sb.append(", templateType=").append(templateType);
        sb.append(", msgType=").append(msgType);
        sb.append(", expectPushTime=").append(expectPushTime);
        sb.append(", msgContent=").append(msgContent);
        sb.append(", sendAccount=").append(sendAccount);
        sb.append(", creator=").append(creator);
        sb.append(", updator=").append(updator);
        sb.append(", auditor=").append(auditor);
        sb.append(", team=").append(team);
        sb.append(", proposer=").append(proposer);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", deduplicationTime=").append(deduplicationTime);
        sb.append(", isNightShield=").append(isNightShield);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}