package com.xiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author dong feng
 * @date 2019/01/25
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class QmApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(QmApiGateway.class,args);
    }
}
