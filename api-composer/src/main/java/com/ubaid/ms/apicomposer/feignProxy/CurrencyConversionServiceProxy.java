package com.ubaid.ms.apicomposer.feignProxy;

import com.ubaid.ms.ccdto.ConvertedCurrency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static com.ubaid.ms.common.Constants.API_GATEWAY;


@FeignClient(name = API_GATEWAY)
public interface CurrencyConversionServiceProxy {

    @GetMapping("currency-conversion/currency/{currency}/rate/{conversion-rate}")
    ConvertedCurrency convert(
            @RequestHeader(value = AUTHORIZATION) String token,
            @PathVariable("currency") Double currency,
            @PathVariable("conversion-rate") Double rate);
}
