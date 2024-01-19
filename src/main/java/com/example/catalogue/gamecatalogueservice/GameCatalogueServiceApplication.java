package com.example.catalogue.gamecatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.catalogue.gamecatalogueservice.proxy")
public class GameCatalogueServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameCatalogueServiceApplication.class, args);
    }

}
