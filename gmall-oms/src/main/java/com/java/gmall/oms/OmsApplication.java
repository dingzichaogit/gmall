package com.java.gmall.oms;

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
public class OmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(OmsApplication.class,args);
    }
}
