package com.binance.api.client.domain.event;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceUpdateEvent {

    @JsonProperty("e")
    private String eventType;

    @JsonProperty("E")
    private Long eventTime;

    @JsonProperty("a")
    private String asset;

    @JsonProperty("d")
    private String balanceDelta;

    @JsonProperty("T")
    private Long clearTime;
    
    @Override
    public String toString() {
      return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("asset", asset)
        .append("balanceDelta", balanceDelta)
        .append("clearTime", clearTime)
        .toString();
    }
}
