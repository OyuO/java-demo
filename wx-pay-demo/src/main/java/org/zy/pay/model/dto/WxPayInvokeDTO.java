package org.zy.pay.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WxPayInvokeDTO {
    private String timeStamp;

    private String nonceStr;

    @JsonProperty("package")
    private String packageStr;

    private String signType = "RSA";

    private String paySign;

}
