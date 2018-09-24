package com.yangxiaochen.demo.spring.feigh;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yangxiaochen
 * @Date 2018-09-24
 */
public interface DemoApi {

    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/foo/{id}")
    String getFoo(@PathVariable("id") String id);
}
