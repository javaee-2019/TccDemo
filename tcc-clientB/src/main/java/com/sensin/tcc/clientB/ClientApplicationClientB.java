package com.sensin.tcc.clientB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.sensin.tcc.clientB.mapper"})
@SpringBootApplication(scanBasePackages = {"com.sensin"})
public class ClientApplicationClientB {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplicationClientB.class, args);
    }

}
