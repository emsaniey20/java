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

public class AliexpressCategoryRedefiningGetchildrenpostcategorybyidAeopPostCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 发布类目ID */
                @ApiField("id")
            private Long id;
        /** 是否叶子发布类目 */
                @ApiField("isleaf")
            private Boolean isleaf;
        /** 发布类目层级 */
                @ApiField("level")
            private Long level;
        /** 类目多语言名称 */
                @ApiField("names")
            private String names;
        /** 类目特征的map。AE_FEATURE_CAR_TYPE ： 当前类目是否支持车型库API，value为 汽车："car" 、摩托车："motor"。AE_FEATURE_UserDefineSalesProperty ：分国家是否支持销售属性自定义，value为对应的国家。 */
                @ApiField("features")
            private String features;
    
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
        public Boolean getIsleaf() {
    return this.isleaf;
    }
    public void setIsleaf(Boolean isleaf) {
    this.isleaf = isleaf;
    }
        public Long getLevel() {
    return this.level;
    }
    public void setLevel(Long level) {
    this.level = level;
    }
        public String getNames() {
    return this.names;
    }
    public void setNames(String names) {
    this.names = names;
    }
        public String getFeatures() {
    return this.features;
    }
    public void setFeatures(String features) {
    this.features = features;
    }
    }