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

public class AliexpressSolutionBatchProductPriceUpdateMultiCountryPriceConfigurationDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Price list for different countries */
                @ApiListField("country_price_list")
            private List<AliexpressSolutionBatchProductPriceUpdateSingleCountryPriceDTO> countryPriceList;
        /** Currently supporting only absolute. Please test carefully before uploading products. */
                @ApiField("price_type")
            private String priceType;
    
        public List<AliexpressSolutionBatchProductPriceUpdateSingleCountryPriceDTO> getCountryPriceList() {
    return this.countryPriceList;
    }
    public void setCountryPriceList(List<AliexpressSolutionBatchProductPriceUpdateSingleCountryPriceDTO> countryPriceList) {
    this.countryPriceList = countryPriceList;
    }
        public String getPriceType() {
    return this.priceType;
    }
    public void setPriceType(String priceType) {
    this.priceType = priceType;
    }
    }