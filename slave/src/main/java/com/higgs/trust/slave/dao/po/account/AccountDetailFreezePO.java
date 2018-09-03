package com.higgs.trust.slave.dao.po.account;import com.higgs.trust.common.mybatis.BaseEntity;import lombok.Getter;import lombok.Setter;import java.math.BigDecimal;import java.util.Date;/** * @author liuyu * @description account freeze detail * @date 2018-03-27 */@Getter @Setter public class AccountDetailFreezePO extends BaseEntity<AccountDetailFreezePO> {    /**     * id     */    private Long id;    /**     * business flow number     */    private String bizFlowNo;    /**     * number of account     */    private String accountNo;    /**     * block height     */    private Long blockHeight;    /**     * detail number for freeze     */    private Long freezeDetailNo;    /**     * freeze type-FREEZE,UNFREEZE     */    private String freezeType;    /**     * happen amount     */    private BigDecimal amount;    /**     * before amount     */    private BigDecimal beforeAmount;    /**     * freeze amount     */    private BigDecimal afterAmount;    /**     * remark     */    private String remark;    /**     * create time     */    private Date createTime;}