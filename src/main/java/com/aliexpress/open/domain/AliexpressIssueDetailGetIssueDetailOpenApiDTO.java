package com.aliexpress.open.domain;

import java.io.Serializable;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Long;
import java.lang.String;
import java.lang.Byte;
import java.lang.Object;
import java.math.BigDecimal;
import com.global.iop.api.*;
import com.global.iop.util.*;
import com.global.iop.util.json.*;
import com.aliexpress.open.domain.*;
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressIssueDetailGetIssueDetailOpenApiDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品id */
                @ApiField("product_id")
            private String productId;
        /** 纠纷详细状态： wait_for_seller_response ：等待卖家响应，wait_for_buyer_response：等待买家响应，wait_for_service_provider_response：买家退货处理中，wait_for_AE_feedback ：等待平台反馈， wait_for_your_response：等待卖家响应方案，wait_for_your_evidence ：等待提供证据， wait_for_final_solution：等待平台给出最终方案，wait_for_seller_set_return_address ：等待卖家提供退货地址， wait_for_buyer_return ：等待买家退货，wait_for_seller_confirmation：等待卖家确认收货，wait_for_warehouse_confirmation：等待仓库确认收货，wait_for_warehouse_quality_check ：买家已经退货，正在等待仓库质检 ，wait_ae_final_feedback ：等待平台反馈，return_success：纠纷已结束，退货成功，refund_success ：纠纷已结束，退款成功，refund_reject ：纠纷已结束，0退款，ae_feedback_finish：纠纷方案已达成 */
                @ApiField("reverse_detail_status")
            private String reverseDetailStatus;
        /** 纠纷超时类型：WAIT_SOLUTION_TIMEOUT：纠纷协商超时， WAIT_SELLER_FILL_ADDRESS_TIMEOUT：卖家补充退货地址超时， WAIT_RECEIVE_ITEM_TIMEOUT：卖家收货超时 */
                @ApiField("timeout_type")
            private String timeoutType;
        /** 超时触发时间美国西太平洋时间(America/Los_Angeles时区)： yyyy-MM-dd HH:mm:ss 格式 */
                @ApiField("timeout_trigger_time")
            private String timeoutTriggerTime;
        /** 是否售后宝纠纷 */
                @ApiField("after_sale_warranty")
            private Boolean afterSaleWarranty;
        /** 买家登录帐号 */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 买家退货物流公司 */
                @ApiField("buyer_return_logistics_company")
            private String buyerReturnLogisticsCompany;
        /** 退货物流订单LP单号 */
                @ApiField("buyer_return_logistics_lp_no")
            private String buyerReturnLogisticsLpNo;
        /** 买家退货单号 */
                @ApiField("buyer_return_no")
            private String buyerReturnNo;
        /** 买家协商方案 */
                @ApiListField("buyer_solution_list")
            private List<AliexpressIssueDetailGetSolutionApiDTO> buyerSolutionList;
        /** 纠纷创建时间 */
                @ApiField("gmt_create")
            private String gmtCreate;
        /** 纠纷id */
                @ApiField("id")
            private Long id;
        /** 纠纷原因 */
                @ApiField("issue_reason")
            private String issueReason;
        /** 纠纷原因id */
                @ApiField("issue_reason_id")
            private Long issueReasonId;
        /** 纠纷状态 处理中 processing、 纠纷取消canceled_issue、纠纷完结,退款处理完成finish */
                @ApiField("issue_status")
            private String issueStatus;
        /** 订单id */
                @ApiField("order_id")
            private Long orderId;
        /** 父订单id */
                @ApiField("parent_order_id")
            private Long parentOrderId;
        /** 平台方案集合 */
                @ApiListField("platform_solution_list")
            private List<AliexpressIssueDetailGetSolutionApiDTO> platformSolutionList;
        /** 产品名称 */
                @ApiField("product_name")
            private String productName;
        /** 产品价格 */
                @ApiField("product_price")
            private String productPrice;
        /** 产品价格币种 */
                @ApiField("product_price_currency")
            private String productPriceCurrency;
        /** 退款上限 */
                @ApiField("refund_money_max")
            private String refundMoneyMax;
        /** 退款上限币种 */
                @ApiField("refund_money_max_currency")
            private String refundMoneyMaxCurrency;
        /** 退款上限当地货币 */
                @ApiField("refund_money_max_local")
            private String refundMoneyMaxLocal;
        /** 退款上限当地货币币种 */
                @ApiField("refund_money_max_local_currency")
            private String refundMoneyMaxLocalCurrency;
        /** 卖家协商方案 */
                @ApiListField("seller_solution_list")
            private List<AliexpressIssueDetailGetSolutionApiDTO> sellerSolutionList;
        /** 操作记录 */
                @ApiListField("process_dto_list")
            private List<AliexpressIssueDetailGetApiIssueProcessDTO> processDtoList;
    
        public String getProductId() {
    return this.productId;
    }
    public void setProductId(String productId) {
    this.productId = productId;
    }
        public String getReverseDetailStatus() {
    return this.reverseDetailStatus;
    }
    public void setReverseDetailStatus(String reverseDetailStatus) {
    this.reverseDetailStatus = reverseDetailStatus;
    }
        public String getTimeoutType() {
    return this.timeoutType;
    }
    public void setTimeoutType(String timeoutType) {
    this.timeoutType = timeoutType;
    }
        public String getTimeoutTriggerTime() {
    return this.timeoutTriggerTime;
    }
    public void setTimeoutTriggerTime(String timeoutTriggerTime) {
    this.timeoutTriggerTime = timeoutTriggerTime;
    }
        public Boolean getAfterSaleWarranty() {
    return this.afterSaleWarranty;
    }
    public void setAfterSaleWarranty(Boolean afterSaleWarranty) {
    this.afterSaleWarranty = afterSaleWarranty;
    }
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public String getBuyerReturnLogisticsCompany() {
    return this.buyerReturnLogisticsCompany;
    }
    public void setBuyerReturnLogisticsCompany(String buyerReturnLogisticsCompany) {
    this.buyerReturnLogisticsCompany = buyerReturnLogisticsCompany;
    }
        public String getBuyerReturnLogisticsLpNo() {
    return this.buyerReturnLogisticsLpNo;
    }
    public void setBuyerReturnLogisticsLpNo(String buyerReturnLogisticsLpNo) {
    this.buyerReturnLogisticsLpNo = buyerReturnLogisticsLpNo;
    }
        public String getBuyerReturnNo() {
    return this.buyerReturnNo;
    }
    public void setBuyerReturnNo(String buyerReturnNo) {
    this.buyerReturnNo = buyerReturnNo;
    }
        public List<AliexpressIssueDetailGetSolutionApiDTO> getBuyerSolutionList() {
    return this.buyerSolutionList;
    }
    public void setBuyerSolutionList(List<AliexpressIssueDetailGetSolutionApiDTO> buyerSolutionList) {
    this.buyerSolutionList = buyerSolutionList;
    }
        public String getGmtCreate() {
    return this.gmtCreate;
    }
    public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public String getIssueReason() {
    return this.issueReason;
    }
    public void setIssueReason(String issueReason) {
    this.issueReason = issueReason;
    }
        public Long getIssueReasonId() {
    return this.issueReasonId;
    }
    public void setIssueReasonId(Long issueReasonId) {
    this.issueReasonId = issueReasonId;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public Long getParentOrderId() {
    return this.parentOrderId;
    }
    public void setParentOrderId(Long parentOrderId) {
    this.parentOrderId = parentOrderId;
    }
        public List<AliexpressIssueDetailGetSolutionApiDTO> getPlatformSolutionList() {
    return this.platformSolutionList;
    }
    public void setPlatformSolutionList(List<AliexpressIssueDetailGetSolutionApiDTO> platformSolutionList) {
    this.platformSolutionList = platformSolutionList;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public String getProductPrice() {
    return this.productPrice;
    }
    public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
    }
        public String getProductPriceCurrency() {
    return this.productPriceCurrency;
    }
    public void setProductPriceCurrency(String productPriceCurrency) {
    this.productPriceCurrency = productPriceCurrency;
    }
        public String getRefundMoneyMax() {
    return this.refundMoneyMax;
    }
    public void setRefundMoneyMax(String refundMoneyMax) {
    this.refundMoneyMax = refundMoneyMax;
    }
        public String getRefundMoneyMaxCurrency() {
    return this.refundMoneyMaxCurrency;
    }
    public void setRefundMoneyMaxCurrency(String refundMoneyMaxCurrency) {
    this.refundMoneyMaxCurrency = refundMoneyMaxCurrency;
    }
        public String getRefundMoneyMaxLocal() {
    return this.refundMoneyMaxLocal;
    }
    public void setRefundMoneyMaxLocal(String refundMoneyMaxLocal) {
    this.refundMoneyMaxLocal = refundMoneyMaxLocal;
    }
        public String getRefundMoneyMaxLocalCurrency() {
    return this.refundMoneyMaxLocalCurrency;
    }
    public void setRefundMoneyMaxLocalCurrency(String refundMoneyMaxLocalCurrency) {
    this.refundMoneyMaxLocalCurrency = refundMoneyMaxLocalCurrency;
    }
        public List<AliexpressIssueDetailGetSolutionApiDTO> getSellerSolutionList() {
    return this.sellerSolutionList;
    }
    public void setSellerSolutionList(List<AliexpressIssueDetailGetSolutionApiDTO> sellerSolutionList) {
    this.sellerSolutionList = sellerSolutionList;
    }
        public List<AliexpressIssueDetailGetApiIssueProcessDTO> getProcessDtoList() {
    return this.processDtoList;
    }
    public void setProcessDtoList(List<AliexpressIssueDetailGetApiIssueProcessDTO> processDtoList) {
    this.processDtoList = processDtoList;
    }
    }