package com.higgs.trust.consensus.p2pvalid.dao.po;import com.higgs.trust.common.mybatis.BaseEntity;import java.util.Date;public class QueuedReceiveGcPO extends BaseEntity<QueuedReceiveGcPO> {    private static final long serialVersionUID = 1L;            private Long id;//   id    private String messageDigest;//   message digest    private Long gcTime;//   gc time    private Date createTime;//   create time    public Long getId() {        return this.id;    }    public void setId(Long id) {        this.id = id;    }    public String getMessageDigest() {        return this.messageDigest;    }    public void setMessageDigest(String messageDigest) {        this.messageDigest = messageDigest;    }    public Long getGcTime() {        return this.gcTime;    }    public void setGcTime(Long gcTime) {        this.gcTime = gcTime;    }    public Date getCreateTime() {        return this.createTime;    }    public void setCreateTime(Date createTime) {        this.createTime = createTime;    }    @Override    public String toString() {        StringBuilder builder = new StringBuilder();        builder.append("QueuedReceiveGcPO [");           builder.append("id=");        builder.append(id);        builder.append(", messageDigest=");        builder.append(messageDigest);        builder.append(", gcTime=");        builder.append(gcTime);        builder.append(", createTime=");        builder.append(createTime);        builder.append("]");        return builder.toString();    }}