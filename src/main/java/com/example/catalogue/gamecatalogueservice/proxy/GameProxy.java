package com.example.catalogue.gamecatalogueservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "localhost:8080", name = "game-service")
public class GameProxy {

}
