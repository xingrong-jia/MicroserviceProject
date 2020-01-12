package com.stylefeng.guns.rest.alipay.demo.trade.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.stylefeng.guns.alipay.AliPayService;
import com.stylefeng.guns.rest.alipay.demo.trade.Main;
import org.springframework.stereotype.Component;

/**
 * @author Xingrong.Jia
 * @USER forever
 * @PROJECT_NAME: guns
 * @date 2020-01-11 19:13
 */
@Component
@Service(interfaceClass = AliPayService.class)
public class AliPayServiceImpl implements AliPayService {

    private Main main = new Main();


    @Override
    public String getPayQRCode(String orderId, String cinemaName, String price, String cinemaId) {
        String qrCodePath = main.getPayQRCode(orderId, cinemaName, price, cinemaId);
        return qrCodePath;
    }

    @Override
    public Integer getPayResult(String orderId){
        String payResult = main.queryPayResult(orderId);
        Integer integer = null;
        if ("TRADE_SUCCESS".equals(payResult)){
            integer = 1;
        }else if ("TRADE_CLOSED".equals(payResult)||"TRADE_FINISHED".equals(payResult)){
            integer = -1;
        }else {
            integer = 0;
        }
        return integer;
    }
}
