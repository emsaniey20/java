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
*  /auth/token/refresh
*/
public class AuthTokenRefreshResponse extends IopResponse {

    /** The expiring time of the access token, in seconds,Relative Time */
        @ApiField("expires_in")
        private Long expiresIn;
    /** Account Allow null. if(account_platform=seller_center) account_id=null */
        @ApiField("account_id")
        private String accountId;
    /** seller id */
        @ApiField("seller_id")
        private String sellerId;
    /** user id */
        @ApiField("user_id")
        private String userId;
    /** user nick */
        @ApiField("user_nick")
        private String userNick;
    /** havana id */
        @ApiField("havana_id")
        private String havanaId;
    /** Account platform */
        @ApiField("account_platform")
        private String accountPlatform;
    /** Access token */
        @ApiField("access_token")
        private String accessToken;
    /** User account(login user) */
        @ApiField("account")
        private String account;
    /** Refresh token, used to refresh the token when ârefresh_expires_inâ>0. */
        @ApiField("refresh_token")
        private String refreshToken;
    /** The expiring time of the refresh token,Relative Time */
        @ApiField("refresh_expires_in")
        private Long refreshExpiresIn;
    /** Expired time of access token, absolute time */
        @ApiField("expire_time")
        private Long expireTime;
    /** Expired time of refresh token,absolute time */
        @ApiField("refresh_token_valid_time")
        private Long refreshTokenValidTime;
    /** authorization platform */
        @ApiField("sp")
        private String sp;
    /** language */
        @ApiField("locale")
        private String locale;

public Long getExpiresIn(){
return this.expiresIn;
}
public void setExpiresIn(Long expiresIn){
    this.expiresIn = expiresIn;
}
public String getAccountId(){
return this.accountId;
}
public void setAccountId(String accountId){
    this.accountId = accountId;
}
public String getSellerId(){
return this.sellerId;
}
public void setSellerId(String sellerId){
    this.sellerId = sellerId;
}
public String getUserId(){
return this.userId;
}
public void setUserId(String userId){
    this.userId = userId;
}
public String getUserNick(){
return this.userNick;
}
public void setUserNick(String userNick){
    this.userNick = userNick;
}
public String getHavanaId(){
return this.havanaId;
}
public void setHavanaId(String havanaId){
    this.havanaId = havanaId;
}
public String getAccountPlatform(){
return this.accountPlatform;
}
public void setAccountPlatform(String accountPlatform){
    this.accountPlatform = accountPlatform;
}
public String getAccessToken(){
return this.accessToken;
}
public void setAccessToken(String accessToken){
    this.accessToken = accessToken;
}
public String getAccount(){
return this.account;
}
public void setAccount(String account){
    this.account = account;
}
public String getRefreshToken(){
return this.refreshToken;
}
public void setRefreshToken(String refreshToken){
    this.refreshToken = refreshToken;
}
public Long getRefreshExpiresIn(){
return this.refreshExpiresIn;
}
public void setRefreshExpiresIn(Long refreshExpiresIn){
    this.refreshExpiresIn = refreshExpiresIn;
}
public Long getExpireTime(){
return this.expireTime;
}
public void setExpireTime(Long expireTime){
    this.expireTime = expireTime;
}
public Long getRefreshTokenValidTime(){
return this.refreshTokenValidTime;
}
public void setRefreshTokenValidTime(Long refreshTokenValidTime){
    this.refreshTokenValidTime = refreshTokenValidTime;
}
public String getSp(){
return this.sp;
}
public void setSp(String sp){
    this.sp = sp;
}
public String getLocale(){
return this.locale;
}
public void setLocale(String locale){
    this.locale = locale;
}

}