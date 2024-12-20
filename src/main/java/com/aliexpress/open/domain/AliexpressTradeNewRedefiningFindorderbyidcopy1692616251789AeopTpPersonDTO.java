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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpPersonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 */
                @ApiField("first_name")
            private String firstName;
        /** 1 */
                @ApiField("last_name")
            private String lastName;
        /** 1 */
                @ApiField("country")
            private String country;
        /** 1 */
                @ApiField("login_id")
            private String loginId;
        /** 1 */
                @ApiField("email")
            private String email;
    
        public String getFirstName() {
    return this.firstName;
    }
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }
        public String getLastName() {
    return this.lastName;
    }
    public void setLastName(String lastName) {
    this.lastName = lastName;
    }
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getLoginId() {
    return this.loginId;
    }
    public void setLoginId(String loginId) {
    this.loginId = loginId;
    }
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    }