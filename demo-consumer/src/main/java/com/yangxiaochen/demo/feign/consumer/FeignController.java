package com.yangxiaochen.demo.feign.consumer;

import com.yangxiaochen.demo.spring.feigh.DemoApi;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yangxiaochen
 * @Date 2018-09-24
 */
@Configuration
@Import(FeignClientsConfiguration.class)
public class FeignController {

    DemoApi demoApi;

    public FeignController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.demoApi = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
                .target(DemoApi.class, "http://127.0.0.1:8080");
    }

}
