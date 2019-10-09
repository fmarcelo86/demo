package com.example.demo.dto.pay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "data"
})
public class StandardQrResponse {

    @JsonProperty("meta")
    private MetaResponse metaResponse;
    
    @JsonProperty("data")
    private List<DataResponse> dataResponse = null;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meta")
    public MetaResponse getMetaResponse() {
        return metaResponse;
    }

    @JsonProperty("meta")
    public void setMetaResponse(MetaResponse metaResponse) {
        this.metaResponse = metaResponse;
    }

    @JsonProperty("data")
    public List<DataResponse> getDataResponse() {
        return dataResponse;
    }

    @JsonProperty("data")
    public void setDataResponse(List<DataResponse> dataResponse) {
        this.dataResponse = dataResponse;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}