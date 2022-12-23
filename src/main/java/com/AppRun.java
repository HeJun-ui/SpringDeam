package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

/**
 *
 */
@EnableJpaAuditing
@SpringBootApplication
public class AppRun  {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);

    }

}
