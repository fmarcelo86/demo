package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "data"
})
public class PaymentStandardQrRequest {

    @JsonProperty("meta")
    @SerializedName("meta")
    @Expose
    private MetaRequest metaRequest;
    
    @JsonProperty("data")
    @SerializedName("data")
    @Expose
    private DataPayRequest dataPayRequest;
   
    @JsonProperty("meta")
    public MetaRequest getMetaRequest() {
        return metaRequest;
    }

    @JsonProperty("meta")
    public void setMetaRequest(MetaRequest metaRequest) {
        this.metaRequest = metaRequest;
    }

    @JsonProperty("data")
    public DataPayRequest getDataPayRequest() {
        return dataPayRequest;
    }

    @JsonProperty("data")
    public void setDataPayRequest(DataPayRequest dataPayRequest) {
        this.dataPayRequest = dataPayRequest;
    }
}