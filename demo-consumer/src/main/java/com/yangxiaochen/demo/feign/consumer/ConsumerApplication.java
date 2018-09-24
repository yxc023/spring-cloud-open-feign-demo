package com.yangxiaochen.demo.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yangxiaochen
 * @Date 2018-09-24
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        FeignController feignClient = context.getBean("feignController", FeignController.class);
        String result = feignClient.demoApi.getFoo("222");
        System.out.println(result);
    }



}
