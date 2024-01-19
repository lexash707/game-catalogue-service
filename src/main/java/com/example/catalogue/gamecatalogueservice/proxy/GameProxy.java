package com.example.catalogue.gamecatalogueservice.proxy;

import com.example.catalogue.gamecatalogueservice.dto.Game;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "localhost:8080", name = "game-service")
public interface GameProxy {
    @GetMapping("/allGames")
    List<Game> allGames();
}
