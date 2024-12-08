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

public class GlobalProductsListProductSearchApiSingleBaseResultDTO$SkuInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku价格 */
                @ApiField("price")
            private String price;
        /** 卖家SKU，sellerSku，outSkuId。 */
                @ApiField("seller_sku")
            private String sellerSku;
        /** suk_id */
                @ApiField("sku_id")
            private Integer skuId;
    
        public String getPrice() {
    return this.price;
    }
    public void setPrice(String price) {
    this.price = price;
    }
        public String getSellerSku() {
    return this.sellerSku;
    }
    public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    }
        public Integer getSkuId() {
    return this.skuId;
    }
    public void setSkuId(Integer skuId) {
    this.skuId = skuId;
    }
    }