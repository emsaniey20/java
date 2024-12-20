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

public class AliexpressSocialProductFulldetailQueryOpenApiResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Error code */
                @ApiField("error_code")
            private String errorCode;
        /** error message */
                @ApiField("error_message")
            private String errorMessage;
        /** DTO result */
                @ApiField("result")
            private AliexpressSocialProductFulldetailQueryFullDetailOpenApiVO result;
        /** success */
                @ApiField("success")
            private Boolean success;
    
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public AliexpressSocialProductFulldetailQueryFullDetailOpenApiVO getResult() {
    return this.result;
    }
    public void setResult(AliexpressSocialProductFulldetailQueryFullDetailOpenApiVO result) {
    this.result = result;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
    }