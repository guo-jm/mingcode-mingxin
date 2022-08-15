package com.mingcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication(scanBasePackages = {"com/mingcode","org/n3r/idworker"})
@MapperScan(basePackages = "com/mingcode/mapper")
public class Application {

    @Bean
    public SpringUtil getSpingUtil() {
        return new SpringUtil();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

