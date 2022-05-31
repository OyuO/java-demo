package org.zy.pay.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import org.zy.pay.common.constant.Constant;

import java.util.List;
import java.util.UUID;


@Data
public class WxPrepayRequestDTO {
    /**
     * 应用id
     */
    @JsonProperty("appid")
    private String appId = Constant.appId;

    /**
     * 直连商户号
     */
    @JsonProperty("mchid")
    private String mchId = Constant.mchId;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品订单号
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo = "874a557a-d20d-4332-842a-95cc1851";

    /**
     * 交易结束时间
     */
    private String timeExpire;

    /**
     * 附加数据
     * 在查询api和支付通知中原样返回
     * 可作为自定义参数使用
     */
    private String attach;

    /**
     * 通知地址
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 订单优惠标记
     */
    private String goodsTag;

    /**
     * 订单金额信息
     */
    private AmountDTO amount;

    /**
     * 支付者信息
     */
    private PayerDTO payer;

    /**
     * 场景信息
     */
    private SceneInfoDTO sceneInfo;

    /**
     * 结算信息
     */
    private SettleInfoDTO settleInfo;


    /******************************************************************************** inner class ********************************************************************************/


    @Builder
    @Data
    public static class AmountDTO {

        /**
         * 订单总金额,单位为分
         */
        private Integer total;

        /**
         * 货币类型
         */
        private String currency = "CNY";

        @JsonProperty("payer_total")
        private Integer payerTotal;

        @JsonProperty("payer_currency")
        private String payerCurrency;

    }

    @Builder
    @Data
    public static class PayerDTO {
        /**
         * 用户标志id
         */
        @JsonProperty("openid")
        private String openId;
    }

    @Data
    public static class DetailDTO {
        /**
         * 订单原价
         */
        private Integer costPrice;

        /**
         * 商品小票id
         */
        private String invoiceId;

        /**
         * 单品列表信息
         */
        private List<GoodsDetailDTO> goodsDetailDTOS;
    }

    @Data
    public static class GoodsDetailDTO {

        /**
         * 商品侧商品编码
         */
        private String merchantGoodsId;

        /**
         * 微信支付定义的统一商品编号(没有可以不传)
         */
        private String wechatPayGoodsId;

        /**
         * 商品的实际名称
         */
        private String goodsName;

        /**
         * 用户购买的数量
         */
        private Integer quantity;

        /**
         * 商品单价,单位为分
         */
        private Integer unitPrice;
    }

    @Data
    public static class SceneInfoDTO {
        /**
         * 用户的客户端ip,支持ipv4和ipv6两种格式的ip地址
         */
        private String payerClientIp;

        /**
         * 商户端设备号
         */
        private String deviceId;

        /**
         * 商户门店信息
         */
        private StoreInfoDTO storeInfoDTO;


    }

    @Data
    public static class StoreInfoDTO {

        /**
         * 门店编号
         */
        private String id;

        /**
         * 门店名称
         */
        private String name;

        /**
         * 地区编码
         */
        private String areaCode;

        /**
         * 详细地址
         */
        private String address;
    }

    @Data
    public static class SettleInfoDTO {

        /**
         * 是否指定分账
         */
        private Boolean profitSharding;
    }
}
