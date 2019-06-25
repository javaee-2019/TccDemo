package com.sensin.tcc.clientA;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages = {"com.sensin.tcc.clientA.mapper"})
@SpringBootApplication(scanBasePackages = {"com.sensin"})
@EnableDistributedTransaction
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sensin.tcc.clientA.feign")
public class TccApplicationClientA {

    public static void main(String[] args) {
        SpringApplication.run(TccApplicationClientA.class, args);
    }

}
