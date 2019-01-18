package com.coderqian.dubboapi.service;

/**
 * @author qianliqing
 * @date 2018/11/29 1:55 PM
 * email: qianlq0824@gmail.com
 */

public interface TestService {

    /**
     * 测试接口
     *
     * @param text 测试数据
     * @return String
     */
    String test(String text);

    /**
     * 测试接口
     *
     * @param text 测试数据
     * @return String
     */
    String testMybatis(String text);
}
