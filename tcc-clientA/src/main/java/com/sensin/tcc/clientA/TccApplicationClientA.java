package com.sensin.tcc.clientA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages = {"com.sensin.tcc.mapper"})
@SpringBootApplication(scanBasePackages = {"com.sensin"})
public class TccApplicationClientA {

    public static void main(String[] args) {
        SpringApplication.run(TccApplicationClientA.class, args);
    }

}
