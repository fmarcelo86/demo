package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "systemId",
    "messageId",
    "timestamp"
})
public class MetaRequest {

    @JsonProperty("systemId")
    private String systemId;
   
    @JsonProperty("messageId")
    private String messageId;
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    @JsonProperty("systemId")
    public String getSystemId() {
        return systemId;
    }

    @JsonProperty("systemId")
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}