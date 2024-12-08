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
*  aliexpress.choice.product.post
*/
public class AliexpressChoiceProductPostResponse extends IopResponse {

    /** 成功，返回商品id */
        @ApiField("product_id")
        private Long productId;
    /** 返回结果：成功，失败 */
        @ApiField("success")
        private Boolean success;

public Long getProductId(){
return this.productId;
}
public void setProductId(Long productId){
    this.productId = productId;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}

}