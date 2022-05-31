package org.zy.pay.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.zy.pay.common.constant.Constant;

@Accessors(chain = true)
@Data
public class WxRefundRequestDTO {

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("out_trade_no")
    private String outTradeNo;

    @JsonProperty("out_refund_no")
    private String outRefundNo;

    private String reason;

    @JsonProperty("notify_url")
    private String notifyUr = Constant.REFUND_NOTIFY_URL;

    @JsonProperty("funds_account")
    private String fundsAccount;

    private AmountDTO amount;

    @JsonProperty("goods_detail")
    private GoodsDetailDTO goodsDetail;


    @Data
    public static class AmountDTO {
        private Integer refund;

        private AccountDTO from;

        private Integer total;

        private String currency = "CNY";
    }

    @Data
    public static class AccountDTO {
        private String account;

        private Integer amount;
    }

    @Data
    public static class GoodsDetailDTO {

        @JsonProperty("merchant_goods_id")
        private String merchantGoodsId;

        @JsonProperty("wechatpay_goods_id")
        private String wechatpayGoodsId;

        @JsonProperty("goods_name")
        private String goodsName;

        @JsonProperty("unit_price")
        private Integer unitPrice;

        @JsonProperty("refund_amount")
        private Integer refundAmount;

        @JsonProperty("refund_quantity")
        private Integer refundQuantity;

    }
}
