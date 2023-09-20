package com.apientregas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.apientregas"})
//@EntityScan("com.apientregas")
//@EnableJpaRepositories("com.delivery.repository")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ApiEntregasApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiEntregasApplication.class, args);
    }

}
