package com.atguigu.gmall.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dzc
 * @version 1.0
 * @date 2021/9/7 15:20
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableDiscoveryClient
public class PmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class,args);
    }
}
