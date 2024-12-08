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
*  cainiao.global.redelivery.commit
*/
public class CainiaoGlobalRedeliveryCommitResponse extends IopResponse {

    /** 返回值 */
        @ApiField("response")
        private CainiaoGlobalRedeliveryCommitAeopReRouteCommitResponse response;

public CainiaoGlobalRedeliveryCommitAeopReRouteCommitResponse getResponse(){
return this.response;
}
public void setResponse(CainiaoGlobalRedeliveryCommitAeopReRouteCommitResponse response){
    this.response = response;
}

}