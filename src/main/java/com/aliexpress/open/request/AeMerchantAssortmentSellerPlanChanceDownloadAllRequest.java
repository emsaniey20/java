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
*  ae.merchant.assortment.seller.plan.chance.download.all
*/
public class AeMerchantAssortmentSellerPlanChanceDownloadAllRequest extends BaseGopRequest<AeMerchantAssortmentSellerPlanChanceDownloadAllResponse> {



    @Override
    public String getApiName() {
        return "ae.merchant.assortment.seller.plan.chance.download.all";
    }
    @Override
    public IopHashMap getApiParams() {
            return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
            return super.getFileParams();
    }

    @Override
    public Class<AeMerchantAssortmentSellerPlanChanceDownloadAllResponse> getResponseClass() {
        return AeMerchantAssortmentSellerPlanChanceDownloadAllResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}