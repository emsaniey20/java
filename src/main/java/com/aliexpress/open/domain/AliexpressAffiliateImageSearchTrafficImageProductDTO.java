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

public class AliexpressAffiliateImageSearchTrafficImageProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sale price (Non-APP Sale price) */
                @ApiField("sale_price")
            private String salePrice;
        /** currency of Non-APP sale price */
                @ApiField("sale_price_currency")
            private String salePriceCurrency;
        /** Original price */
                @ApiField("original_price")
            private String originalPrice;
        /** currency of original price */
                @ApiField("original_price_currency")
            private String originalPriceCurrency;
        /** sale price on App */
                @ApiField("app_sale_price")
            private String appSalePrice;
        /** currency of sale price on App */
                @ApiField("app_sale_price_currency")
            private String appSalePriceCurrency;
        /** Non-App sale price in target currency */
                @ApiField("target_sale_price")
            private String targetSalePrice;
        /** currency of target Non-App sale price */
                @ApiField("target_sale_price_currency")
            private String targetSalePriceCurrency;
        /** Original price in target currency */
                @ApiField("target_original_price")
            private String targetOriginalPrice;
        /** currency of target Original price */
                @ApiField("target_original_price_currency")
            private String targetOriginalPriceCurrency;
        /** App sale price in target currency */
                @ApiField("target_app_sale_price")
            private String targetAppSalePrice;
        /** target currency of sale price on App */
                @ApiField("target_app_sale_price_currency")
            private String targetAppSalePriceCurrency;
        /** Discount rate */
                @ApiField("discount")
            private String discount;
        /** product Evaluate rate */
                @ApiField("evaluate_rate")
            private String evaluateRate;
        /** First level category ID */
                @ApiField("first_level_category_id")
            private String firstLevelCategoryId;
        /** First level category Name */
                @ApiField("first_level_category_name")
            private String firstLevelCategoryName;
        /** Second level category ID */
                @ApiField("second_level_category_id")
            private String secondLevelCategoryId;
        /** Second level category Name */
                @ApiField("second_level_category_name")
            private String secondLevelCategoryName;
        /** Sales volume in the last 30 days */
                @ApiField("lastest_volume")
            private String lastestVolume;
        /** url link of Product detail, not promotion link */
                @ApiField("product_detail_url")
            private String productDetailUrl;
        /** Product ID */
                @ApiField("product_id")
            private String productId;
        /** Main image url of product */
                @ApiField("product_main_image_url")
            private String productMainImageUrl;
        /** Small image urls of product */
                @ApiListField("product_small_image_urls")
            private List<String> productSmallImageUrls;
        /** store ID */
                @ApiField("shop_id")
            private Long shopId;
        /** store URL */
                @ApiField("shop_url")
            private String shopUrl;
        /** Promotion link */
                @ApiField("promotion_link")
            private String promotionLink;
        /** Commission rate is applicable to non-relevant market countries and non hot product promolinks. For relevant market countries commission please use relevant_market_commission_rate; For hot product promolinks please use hot_product_commission. */
                @ApiField("commision_rate")
            private String commisionRate;
        /** Hot product commission rate */
                @ApiField("hot_product_commission_rate")
            private String hotProductCommissionRate;
        /** product Type：ALL, PLAZA,TMALL */
                @ApiField("platform_product_type")
            private String platformProductType;
        /** commission rate for relevant market(only for relevant market countries: RU, AM, AZ, BY, GE, KG, KZ, MD, TJ, TM, UZ) */
                @ApiField("relevant_market_commission_rate")
            private String relevantMarketCommissionRate;
        /** code */
                @ApiField("promo_code_info")
            private AliexpressAffiliateImageSearchPromoCodeDTO promoCodeInfo;
        /** Product title */
                @ApiField("product_title")
            private String productTitle;
        /** Video url of product */
                @ApiField("product_video_url")
            private String productVideoUrl;
    
        public String getSalePrice() {
    return this.salePrice;
    }
    public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
    }
        public String getSalePriceCurrency() {
    return this.salePriceCurrency;
    }
    public void setSalePriceCurrency(String salePriceCurrency) {
    this.salePriceCurrency = salePriceCurrency;
    }
        public String getOriginalPrice() {
    return this.originalPrice;
    }
    public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
    }
        public String getOriginalPriceCurrency() {
    return this.originalPriceCurrency;
    }
    public void setOriginalPriceCurrency(String originalPriceCurrency) {
    this.originalPriceCurrency = originalPriceCurrency;
    }
        public String getAppSalePrice() {
    return this.appSalePrice;
    }
    public void setAppSalePrice(String appSalePrice) {
    this.appSalePrice = appSalePrice;
    }
        public String getAppSalePriceCurrency() {
    return this.appSalePriceCurrency;
    }
    public void setAppSalePriceCurrency(String appSalePriceCurrency) {
    this.appSalePriceCurrency = appSalePriceCurrency;
    }
        public String getTargetSalePrice() {
    return this.targetSalePrice;
    }
    public void setTargetSalePrice(String targetSalePrice) {
    this.targetSalePrice = targetSalePrice;
    }
        public String getTargetSalePriceCurrency() {
    return this.targetSalePriceCurrency;
    }
    public void setTargetSalePriceCurrency(String targetSalePriceCurrency) {
    this.targetSalePriceCurrency = targetSalePriceCurrency;
    }
        public String getTargetOriginalPrice() {
    return this.targetOriginalPrice;
    }
    public void setTargetOriginalPrice(String targetOriginalPrice) {
    this.targetOriginalPrice = targetOriginalPrice;
    }
        public String getTargetOriginalPriceCurrency() {
    return this.targetOriginalPriceCurrency;
    }
    public void setTargetOriginalPriceCurrency(String targetOriginalPriceCurrency) {
    this.targetOriginalPriceCurrency = targetOriginalPriceCurrency;
    }
        public String getTargetAppSalePrice() {
    return this.targetAppSalePrice;
    }
    public void setTargetAppSalePrice(String targetAppSalePrice) {
    this.targetAppSalePrice = targetAppSalePrice;
    }
        public String getTargetAppSalePriceCurrency() {
    return this.targetAppSalePriceCurrency;
    }
    public void setTargetAppSalePriceCurrency(String targetAppSalePriceCurrency) {
    this.targetAppSalePriceCurrency = targetAppSalePriceCurrency;
    }
        public String getDiscount() {
    return this.discount;
    }
    public void setDiscount(String discount) {
    this.discount = discount;
    }
        public String getEvaluateRate() {
    return this.evaluateRate;
    }
    public void setEvaluateRate(String evaluateRate) {
    this.evaluateRate = evaluateRate;
    }
        public String getFirstLevelCategoryId() {
    return this.firstLevelCategoryId;
    }
    public void setFirstLevelCategoryId(String firstLevelCategoryId) {
    this.firstLevelCategoryId = firstLevelCategoryId;
    }
        public String getFirstLevelCategoryName() {
    return this.firstLevelCategoryName;
    }
    public void setFirstLevelCategoryName(String firstLevelCategoryName) {
    this.firstLevelCategoryName = firstLevelCategoryName;
    }
        public String getSecondLevelCategoryId() {
    return this.secondLevelCategoryId;
    }
    public void setSecondLevelCategoryId(String secondLevelCategoryId) {
    this.secondLevelCategoryId = secondLevelCategoryId;
    }
        public String getSecondLevelCategoryName() {
    return this.secondLevelCategoryName;
    }
    public void setSecondLevelCategoryName(String secondLevelCategoryName) {
    this.secondLevelCategoryName = secondLevelCategoryName;
    }
        public String getLastestVolume() {
    return this.lastestVolume;
    }
    public void setLastestVolume(String lastestVolume) {
    this.lastestVolume = lastestVolume;
    }
        public String getProductDetailUrl() {
    return this.productDetailUrl;
    }
    public void setProductDetailUrl(String productDetailUrl) {
    this.productDetailUrl = productDetailUrl;
    }
        public String getProductId() {
    return this.productId;
    }
    public void setProductId(String productId) {
    this.productId = productId;
    }
        public String getProductMainImageUrl() {
    return this.productMainImageUrl;
    }
    public void setProductMainImageUrl(String productMainImageUrl) {
    this.productMainImageUrl = productMainImageUrl;
    }
        public List<String> getProductSmallImageUrls() {
    return this.productSmallImageUrls;
    }
    public void setProductSmallImageUrls(List<String> productSmallImageUrls) {
    this.productSmallImageUrls = productSmallImageUrls;
    }
        public Long getShopId() {
    return this.shopId;
    }
    public void setShopId(Long shopId) {
    this.shopId = shopId;
    }
        public String getShopUrl() {
    return this.shopUrl;
    }
    public void setShopUrl(String shopUrl) {
    this.shopUrl = shopUrl;
    }
        public String getPromotionLink() {
    return this.promotionLink;
    }
    public void setPromotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
    }
        public String getCommisionRate() {
    return this.commisionRate;
    }
    public void setCommisionRate(String commisionRate) {
    this.commisionRate = commisionRate;
    }
        public String getHotProductCommissionRate() {
    return this.hotProductCommissionRate;
    }
    public void setHotProductCommissionRate(String hotProductCommissionRate) {
    this.hotProductCommissionRate = hotProductCommissionRate;
    }
        public String getPlatformProductType() {
    return this.platformProductType;
    }
    public void setPlatformProductType(String platformProductType) {
    this.platformProductType = platformProductType;
    }
        public String getRelevantMarketCommissionRate() {
    return this.relevantMarketCommissionRate;
    }
    public void setRelevantMarketCommissionRate(String relevantMarketCommissionRate) {
    this.relevantMarketCommissionRate = relevantMarketCommissionRate;
    }
        public AliexpressAffiliateImageSearchPromoCodeDTO getPromoCodeInfo() {
    return this.promoCodeInfo;
    }
    public void setPromoCodeInfo(AliexpressAffiliateImageSearchPromoCodeDTO promoCodeInfo) {
    this.promoCodeInfo = promoCodeInfo;
    }
        public String getProductTitle() {
    return this.productTitle;
    }
    public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
    }
        public String getProductVideoUrl() {
    return this.productVideoUrl;
    }
    public void setProductVideoUrl(String productVideoUrl) {
    this.productVideoUrl = productVideoUrl;
    }
    }