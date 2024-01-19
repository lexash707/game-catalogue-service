package com.example.catalogue.gamecatalogueservice.proxy;

import com.example.catalogue.gamecatalogueservice.dto.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "localhost:8081", name = "game-review-service")
public interface ReviewProxy {
    @GetMapping("/game/{gameID}/reviews")
    List<Review> allReviewsOfGame(@PathVariable Long gameID);

}
