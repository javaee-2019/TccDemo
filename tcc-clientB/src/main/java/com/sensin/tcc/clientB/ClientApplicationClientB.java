package com.sensin.tcc.clientB;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.sensin.tcc.clientB.mapper"})
@SpringBootApplication(scanBasePackages = {"com.sensin"})
@EnableDistributedTransaction
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sensin.tcc.clientB.feign")
public class ClientApplicationClientB {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplicationClientB.class, args);
    }

}
