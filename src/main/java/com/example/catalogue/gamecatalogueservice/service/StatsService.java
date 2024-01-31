package com.example.catalogue.gamecatalogueservice.service;

import com.example.catalogue.gamecatalogueservice.dto.GameStat;
import com.example.catalogue.gamecatalogueservice.dto.Review;
import com.example.catalogue.gamecatalogueservice.proxy.GameProxy;
import com.example.catalogue.gamecatalogueservice.proxy.ReviewProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatsService {

    @Autowired
    private GameProxy gameProxy;

    @Autowired
    private ReviewProxy reviewProxy;

    public List<GameStat> stats(){

        return gameProxy.allGames().stream()
                .map(game -> {
                    List<Review> reviews = reviewProxy.allReviewsOfGame(game.getId());
                    int reviewCount = reviews.size();
                    double sum = reviews.stream()
                            .map(review -> review.getScore())
                            .reduce((aDouble, aDouble2) -> aDouble + aDouble2).orElse(0.0);

                    int commentCount = (int) reviews.stream().filter(review -> review.getComment() != null).count();

                    return GameStat.builder()
                            .name(game.getGame())
                            .averageScore(sum / reviewCount)
                            .reviewCount(reviewCount)
                            .commentCount(commentCount)
                            .build();
                })
                .toList();
    }
}
