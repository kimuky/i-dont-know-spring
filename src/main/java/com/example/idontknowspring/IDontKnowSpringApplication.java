package com.example.idontknowspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IDontKnowSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(IDontKnowSpringApplication.class, args);
    }

}
