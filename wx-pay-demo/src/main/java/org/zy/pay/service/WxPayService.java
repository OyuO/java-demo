package org.zy.pay.service;

import com.qhx.common.support.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zy.pay.client.WxClient;
import org.zy.pay.common.constant.Constant;
import org.zy.pay.common.util.WxUtil;
import org.zy.pay.model.dto.WxPayInvokeDTO;
import org.zy.pay.model.dto.WxPrepayRequestDTO;
import org.zy.pay.model.dto.WxRefundRequestDTO;

import java.util.UUID;

@Slf4j
@Service
public class WxPayService {

    @Autowired
    private WxClient wxClient;

    public WxPayInvokeDTO prepay() {
        var wxPrepayRequestDTO = this.getWxPrepayRequestDTO();
        log.info(JsonUtil.toJson(wxPrepayRequestDTO));
        var prepayId = wxClient.prepay(wxPrepayRequestDTO);
        log.info("prepayId: {}", prepayId);
        return WxUtil.buildWxPayInvokeRequest(prepayId);
    }

    public Object refund() {
        wxClient.refund(this.getWxRefundsRequestDTO());
        return null;
    }

    private WxRefundRequestDTO getWxRefundsRequestDTO() {
        var amountDTO = new WxRefundRequestDTO.AmountDTO();
        amountDTO.setRefund(1);
        amountDTO.setTotal(1);

        var wxRefundsRequestDTO = new WxRefundRequestDTO();
        wxRefundsRequestDTO.setOutTradeNo("89a1dce4-9c75-4363-a3b6-fe8165bf");
        wxRefundsRequestDTO.setReason("wx-pay-demo-refund");
        wxRefundsRequestDTO.setFundsAccount("AVAILABLE");
        wxRefundsRequestDTO.setAmount(amountDTO);
        wxRefundsRequestDTO.setOutRefundNo(UUID.randomUUID().toString().substring(0, 32));
        return wxRefundsRequestDTO;
    }


    private WxPrepayRequestDTO getWxPrepayRequestDTO() {
        var amountDTO = WxPrepayRequestDTO.AmountDTO.builder().total(1).currency("CNY").build();
        var payerDTO = WxPrepayRequestDTO.PayerDTO.builder().openId(Constant.openId).build();

        var wxPrepayRequestDTO = new WxPrepayRequestDTO();
        wxPrepayRequestDTO.setAmount(amountDTO);
        wxPrepayRequestDTO.setPayer(payerDTO);
        wxPrepayRequestDTO.setNotifyUrl(Constant.PAY_NOTIFY_URL);
        wxPrepayRequestDTO.setDescription("wx-pay-demo");
        return wxPrepayRequestDTO;
    }

}
