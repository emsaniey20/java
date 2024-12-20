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

public class AliexpressLogisticsBuyerFreightGetMoney implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 运费对象值 */
                @ApiField("cent")
            private Long cent;
        /** 运费对象值 */
                @ApiField("currency")
            private String currency;
        /** 运费对象值 */
                @ApiField("currency_code")
            private String currencyCode;
    
        public Long getCent() {
    return this.cent;
    }
    public void setCent(Long cent) {
    this.cent = cent;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getCurrencyCode() {
    return this.currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }
    }