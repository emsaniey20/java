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

public class AliexpressOfferProductPostAeopAEMultimedia implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 主图视频，只允许一个 */
                @ApiListField("aeop_a_e_videos")
            private List<AliexpressOfferProductPostAeopAEVideo> aeopAEVideos;
    
        public List<AliexpressOfferProductPostAeopAEVideo> getAeopAEVideos() {
    return this.aeopAEVideos;
    }
    public void setAeopAEVideos(List<AliexpressOfferProductPostAeopAEVideo> aeopAEVideos) {
    this.aeopAEVideos = aeopAEVideos;
    }
    }