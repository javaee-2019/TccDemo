package com.sensin.tcc.txmanager;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDistributedTransaction
public class TXManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TXManagerApplication.class, args);
    }

}
