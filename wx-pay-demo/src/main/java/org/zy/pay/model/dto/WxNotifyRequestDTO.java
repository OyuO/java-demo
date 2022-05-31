package org.zy.pay.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class WxNotifyRequestDTO implements Serializable {

    private String id;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("event_type")
    private String eventType;

    private String summary;

    @JsonProperty("resource_type")
    private String resourceType;

    /**
     * 资源数据
     */
    private Resource resource;

    @Data
    public static class Resource {
        /**
         * 加密算法类型
         */
        private String algorithm;

        /**
         * 数据密文(associatedDate + key + nonce可以解密出密文)
         */
        private String ciphertext;

        /**
         * 随机串
         */
        private String nonce;

        /**
         * 原始类型
         */
        @JsonProperty("original_type")
        private String originalType;

        /**
         * 附加数据
         */
        @JsonProperty("associated_data")
        private String associatedData;

    }
}
