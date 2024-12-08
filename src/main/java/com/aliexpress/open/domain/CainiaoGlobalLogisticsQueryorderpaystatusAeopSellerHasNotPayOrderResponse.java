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

public class CainiaoGlobalLogisticsQueryorderpaystatusAeopSellerHasNotPayOrderResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 当前请求是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("error_msg")
            private String errorMsg;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 商家是否存在未支付订单 */
                @ApiField("has_not_pay_order")
            private Boolean hasNotPayOrder;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMsg() {
    return this.errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public Boolean getHasNotPayOrder() {
    return this.hasNotPayOrder;
    }
    public void setHasNotPayOrder(Boolean hasNotPayOrder) {
    this.hasNotPayOrder = hasNotPayOrder;
    }
    }