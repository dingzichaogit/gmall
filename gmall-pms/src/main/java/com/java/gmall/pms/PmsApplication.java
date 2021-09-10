package com.java.gmall.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dzc
 * @version 1.0
 * @date 2021/9/7 15:20
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class,args);
    }
}
