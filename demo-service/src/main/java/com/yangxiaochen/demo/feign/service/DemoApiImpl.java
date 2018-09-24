package com.yangxiaochen.demo.feign.service;

import com.yangxiaochen.demo.spring.feigh.DemoApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangxiaochen
 * @Date 2018-09-24
 */
@RestController
public class DemoApiImpl implements DemoApi {
    @Override
    public String getFoo(@PathVariable("id") String id) {
        return "hehe_" + id;
    }
}
