package com.example.catalogue.gamecatalogueservice.proxy;

import com.example.catalogue.gamecatalogueservice.dto.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "localhost:8081", name = "game-review-service")
public interface ReviewProxy {
    @GetMapping("/game/{gameID}/reviews")
    List<Review> allReviewsOfGame(@PathVariable Long gameID);

    @PostMapping("/game/reviews")
    ResponseEntity<HttpStatus> reviewGame(@RequestBody Review review);

}
