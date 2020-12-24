package com.nju.ar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class ThreeXMouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreeXMouseApplication.class, args);
    }

}
