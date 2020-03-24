package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableScheduling
@EnableTransactionManagement//开启事务管理
@SpringBootApplication
@MapperScan("com.cazl.business.dao")//Mybatis的DAO所在包
public class SpringbootIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootIntegrationApplication.class, args);
    }

}
