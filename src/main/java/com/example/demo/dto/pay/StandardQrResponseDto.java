package com.example.demo.dto.pay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "data"
})
public class StandardQrResponseDto {

    @JsonProperty("meta")
    private MetaResponse metaResponse;
   
    @JsonProperty("data")
    private List<DataResponse> dataResponse = null;
   
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
}
