package cn.jinelei.aligenie.devicegateway.po;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.xml.internal.bind.v2.model.core.ReferencePropertyInfo;

public class AliGenireResponse {
    @JsonProperty(required = true)
    private Header header;
    @JsonProperty(required = true)
    private PayLoad payLoad;
}
