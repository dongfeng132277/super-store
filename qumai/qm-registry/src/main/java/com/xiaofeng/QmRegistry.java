package com.xiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dong feng
 * @date 2019/01/24
 */
@SpringBootApplication
@EnableEurekaServer
public class QmRegistry {
    public static void main(String[] args) {
        SpringApplication.run(QmRegistry.class,args);
    }
}
