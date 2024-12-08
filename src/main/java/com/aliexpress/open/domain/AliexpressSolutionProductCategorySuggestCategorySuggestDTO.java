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

public class AliexpressSolutionProductCategorySuggestCategorySuggestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /**  */
                @ApiListField("id_path")
            private List<Long> idPath;
        /**  */
                @ApiListField("name_path")
            private List<String> namePath;
        /**  */
                @ApiField("name")
            private String name;
        /**  */
                @ApiField("id")
            private Long id;
    
        public List<Long> getIdPath() {
    return this.idPath;
    }
    public void setIdPath(List<Long> idPath) {
    this.idPath = idPath;
    }
        public List<String> getNamePath() {
    return this.namePath;
    }
    public void setNamePath(List<String> namePath) {
    this.namePath = namePath;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    }