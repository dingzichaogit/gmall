package com.java.gmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dzc
 * @version 1.0
 * @date 2021/9/10 10:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayAppilcation {
    public static void main(String[] args) {
        SpringApplication.run(GatewayAppilcation.class,args);
    }
}
