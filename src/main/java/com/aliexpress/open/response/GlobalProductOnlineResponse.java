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
*  global.product.online
*/
public class GlobalProductOnlineResponse extends IopResponse {

    /** 上架成功统一商品id */
        @ApiField("product_id")
        private Long productId;

public Long getProductId(){
return this.productId;
}
public void setProductId(Long productId){
    this.productId = productId;
}

}