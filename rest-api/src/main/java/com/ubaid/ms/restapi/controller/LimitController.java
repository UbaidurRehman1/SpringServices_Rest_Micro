package com.ubaid.ms.restapi.controller;


import com.ubaid.ms.restapi.config.Config;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;

@RestController
@RequestMapping(value = "/api/config")
@Slf4j
@CrossOrigin(value = CorsConfiguration.ALL)
@RequiredArgsConstructor
public class LimitController {

    private final Config config;

    @GetMapping("/limits")
    public Config getCurrencyConversion() {
        log.debug("Config: {}", config);
        return config;
    }
}
