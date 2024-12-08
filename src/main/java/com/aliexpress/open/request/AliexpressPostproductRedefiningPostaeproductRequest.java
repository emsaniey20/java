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
*  aliexpress.postproduct.redefining.postaeproduct
*/
public class AliexpressPostproductRedefiningPostaeproductRequest extends BaseGopRequest<AliexpressPostproductRedefiningPostaeproductResponse> {

    /** 扩展参数 json 格式 custom_image 分国家主图 vat_tags 含税标 */
    private String extParam;
    /** none */
    private AliexpressPostproductRedefiningPostaeproductAeopAEProduct aeopAEProduct;

    public String getExtParam(){
        return this.extParam;
    }
    public void setExtParam(String extParam){
        this.extParam = extParam;
        }
    public AliexpressPostproductRedefiningPostaeproductAeopAEProduct getAeopAEProduct(){
        return this.aeopAEProduct;
    }
    public void setAeopAEProduct(AliexpressPostproductRedefiningPostaeproductAeopAEProduct aeopAEProduct){
        this.aeopAEProduct = aeopAEProduct;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.postaeproduct";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (extParam != null) {
                        super.addApiParameter("ext_param", extParam.toString());
                    }
                            if (aeopAEProduct != null) {
                        super.addApiParameter("aeop_a_e_product", new JSONWriter(true, false).write(aeopAEProduct));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningPostaeproductResponse> getResponseClass() {
        return AliexpressPostproductRedefiningPostaeproductResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}