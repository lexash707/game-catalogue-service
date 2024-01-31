package com.example.catalogue.gamecatalogueservice.controller;

import com.example.catalogue.gamecatalogueservice.dto.Game;
import com.example.catalogue.gamecatalogueservice.dto.Review;
import com.example.catalogue.gamecatalogueservice.proxy.GameProxy;
import com.example.catalogue.gamecatalogueservice.proxy.ReviewProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatalogueController {

    @Autowired
    private GameProxy gameProxy;

    @Autowired
    private ReviewProxy reviewProxy;

    @GetMapping("/get-games")
    public List<Game> allGames() {
        return gameProxy.allGames();
    }
    @GetMapping("/get-game-review/{gameId}")
    private List<Review> gameReviwe(@PathVariable Long gameId){
        return reviewProxy.allReviewsOfGame(gameId);
    }

    @PostMapping("/review-game")
    public ResponseEntity<HttpStatus> reviewGame(@RequestBody Review review){
        return reviewProxy.reviewGame(review);
    }
}
