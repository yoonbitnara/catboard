package com.king.king;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KingApplication.class, args);
    }

}
