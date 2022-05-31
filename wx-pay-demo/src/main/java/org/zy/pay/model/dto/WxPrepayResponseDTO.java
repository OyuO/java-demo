package org.zy.pay.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WxPrepayResponseDTO {

    @JsonProperty("prepay_id")
    private String prepayId;
}
