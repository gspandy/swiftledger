package com.higgs.trust.consensus.p2pvalid.dao.po;import com.higgs.trust.common.mybatis.BaseEntity;import java.util.Date;public class ReceiveCommandPO extends BaseEntity<ReceiveCommandPO> {    private static final long serialVersionUID = 1L;            private Long id;//   id    private String messageDigest;//   message digest    private String validCommand;//   valid command    private String commandClass;//   command class    private String nodeName;//   node name    private Integer receiveNodeNum;//   num of receive node    private Integer applyThreshold;//   threshold to apply    private Integer gcThreshold;//   threshold to gc    private Integer status;//   0-normal，1-add to apply queue，2-add to gc queue    private Integer retryApplyNum;//   count of retry apply    private Date createTime;//   create time    private Date updateTime;//   update time    public Long getId() {        return this.id;    }    public void setId(Long id) {        this.id = id;    }    public String getMessageDigest() {        return this.messageDigest;    }    public void setMessageDigest(String messageDigest) {        this.messageDigest = messageDigest;    }    public String getValidCommand() {        return this.validCommand;    }    public void setValidCommand(String validCommand) {        this.validCommand = validCommand;    }    public String getCommandClass() {        return this.commandClass;    }    public void setCommandClass(String commandClass) {        this.commandClass = commandClass;    }    public String getNodeName() {        return this.nodeName;    }    public void setNodeName(String nodeName) {        this.nodeName = nodeName;    }    public Integer getReceiveNodeNum() {        return this.receiveNodeNum;    }    public void setReceiveNodeNum(Integer receiveNodeNum) {        this.receiveNodeNum = receiveNodeNum;    }    public Integer getApplyThreshold() {        return this.applyThreshold;    }    public void setApplyThreshold(Integer applyThreshold) {        this.applyThreshold = applyThreshold;    }    public Integer getGcThreshold() {        return this.gcThreshold;    }    public void setGcThreshold(Integer gcThreshold) {        this.gcThreshold = gcThreshold;    }    public Integer getStatus() {        return this.status;    }    public void setStatus(Integer status) {        this.status = status;    }    public Integer getRetryApplyNum() {        return this.retryApplyNum;    }    public void setRetryApplyNum(Integer retryApplyNum) {        this.retryApplyNum = retryApplyNum;    }    public Date getCreateTime() {        return this.createTime;    }    public void setCreateTime(Date createTime) {        this.createTime = createTime;    }    public Date getUpdateTime() {        return this.updateTime;    }    public void setUpdateTime(Date updateTime) {        this.updateTime = updateTime;    }    @Override    public String toString() {        StringBuilder builder = new StringBuilder();        builder.append("ReceiveCommandPO [");           builder.append("id=");        builder.append(id);        builder.append(", messageDigest=");        builder.append(messageDigest);        builder.append(", validCommand=");        builder.append(validCommand);        builder.append(", commandClass=");        builder.append(commandClass);        builder.append(", nodeName=");        builder.append(nodeName);        builder.append(", receiveNodeNum=");        builder.append(receiveNodeNum);        builder.append(", applyThreshold=");        builder.append(applyThreshold);        builder.append(", gcThreshold=");        builder.append(gcThreshold);        builder.append(", status=");        builder.append(status);        builder.append(", retryApplyNum=");        builder.append(retryApplyNum);        builder.append(", createTime=");        builder.append(createTime);        builder.append(", updateTime=");        builder.append(updateTime);        builder.append("]");        return builder.toString();    }}