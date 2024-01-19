package com.example.catalogue.gamecatalogueservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "localhost:8081", name = "game-review-service")
public class ReviewProxy {
}
