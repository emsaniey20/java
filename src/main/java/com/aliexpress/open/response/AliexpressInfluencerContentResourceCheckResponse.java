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
*  aliexpress.influencer.content.resource.check
*/
public class AliexpressInfluencerContentResourceCheckResponse extends IopResponse {

    /** 响应数据 */
        @ApiField("result")
        private AliexpressInfluencerContentResourceCheckUgcApiResponse result;

public AliexpressInfluencerContentResourceCheckUgcApiResponse getResult(){
return this.result;
}
public void setResult(AliexpressInfluencerContentResourceCheckUgcApiResponse result){
    this.result = result;
}

}