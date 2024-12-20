package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  aliexpress/message/sync/rebase
*/
public class AliexpressMessageSyncRebaseRequest extends BaseGopRequest<AliexpressMessageSyncRebaseResponse> {

    /** 请求dto */
    private String imSyncDataDto;

    public String getImSyncDataDto(){
        return this.imSyncDataDto;
    }
    public void setImSyncDataDto(String imSyncDataDto){
        this.imSyncDataDto = imSyncDataDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress/message/sync/rebase";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imSyncDataDto != null) {
                        super.addApiParameter("im_sync_data_dto", imSyncDataDto.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMessageSyncRebaseResponse> getResponseClass() {
        return AliexpressMessageSyncRebaseResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}