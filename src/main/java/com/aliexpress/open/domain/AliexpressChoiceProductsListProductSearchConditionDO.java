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

public class AliexpressChoiceProductsListProductSearchConditionDO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 更新时间范围（指定时间之前） case：2022-07-14 16:41:00 */
                @ApiField("update_before")
            private String updateBefore;
        /** 创建时间范围（指定时间之前） case：2022-07-14 16:41:00 */
                @ApiField("create_before")
            private String createBefore;
        /** 商品id */
                @ApiField("product_id")
            private Long productId;
        /** 创建时间范围（指定时间之后） case：2022-07-13 16:41:00 */
                @ApiField("create_after")
            private String createAfter;
        /** 更新时间范围（指定时间之后） case：2022-07-13 16:41:00 */
                @ApiField("update_after")
            private String updateAfter;
        /** product_status 商品状态: ONLINE  在线；PENDING_LAUNCH  待上架；PENDING_APPROVAL  审核中；VIOLATION_QC_FAILED   审核不通过；OFFLINE  已下架； */
                @ApiField("product_status")
            private String productStatus;
        /** 类目id */
                @ApiField("leaf_category_id")
            private Long leafCategoryId;
    
        public String getUpdateBefore() {
    return this.updateBefore;
    }
    public void setUpdateBefore(String updateBefore) {
    this.updateBefore = updateBefore;
    }
        public String getCreateBefore() {
    return this.createBefore;
    }
    public void setCreateBefore(String createBefore) {
    this.createBefore = createBefore;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getCreateAfter() {
    return this.createAfter;
    }
    public void setCreateAfter(String createAfter) {
    this.createAfter = createAfter;
    }
        public String getUpdateAfter() {
    return this.updateAfter;
    }
    public void setUpdateAfter(String updateAfter) {
    this.updateAfter = updateAfter;
    }
        public String getProductStatus() {
    return this.productStatus;
    }
    public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
    }
        public Long getLeafCategoryId() {
    return this.leafCategoryId;
    }
    public void setLeafCategoryId(Long leafCategoryId) {
    this.leafCategoryId = leafCategoryId;
    }
    }