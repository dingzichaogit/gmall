package com.java.gmall.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dzc
 * @version 1.0
 * @date 2021/9/7 16:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(UmsApplication.class,args);
    }
}
