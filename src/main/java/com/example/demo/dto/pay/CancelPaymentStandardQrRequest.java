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
public class CancelPaymentStandardQrRequest {

    @JsonProperty("meta")
    @SerializedName("meta")
    @Expose
    private MetaRequest MetaRequest;
    
    @JsonProperty("data")
    @SerializedName("data")
    @Expose
    private DataCancelPay dataCancelPay;
    
    @JsonProperty("meta")
    public MetaRequest getMetaRequest() {
        return MetaRequest;
    }

    @JsonProperty("meta")
    public void setMetaRequest(MetaRequest MetaRequest) {
        this.MetaRequest = MetaRequest;
    }

    @JsonProperty("data")
    public DataCancelPay getDataCancelPaya() {
        return dataCancelPay;
    }

    @JsonProperty("data")
    public void setDataCancelPay(DataCancelPay dataCancelPay) {
        this.dataCancelPay = dataCancelPay;
    }
}