package com.example.nf.newfine_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class NewfineBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewfineBackendApplication.class, args);
    }

}
