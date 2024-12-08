package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  /gsp/order/shipmentcancel
*/
public class GspOrderShipmentcancelResponse extends IopResponse {

    /** true */
        @ApiField("success")
        private Boolean success;
    /** 错误编码  B-12-01-032 请求非法 B-12-01-033 未知原因取消失败 */
        @ApiField("error_message")
        private String errorMessage;
    /** 错误编码  B-12-01-032 请求非法 B-12-01-033 未知原因取消失败 */
        @ApiField("error_code")
        private String errorCode;

public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
}

}