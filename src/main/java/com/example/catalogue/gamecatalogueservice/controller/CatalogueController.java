package com.example.catalogue.gamecatalogueservice.controller;

import com.example.catalogue.gamecatalogueservice.dto.Game;
import com.example.catalogue.gamecatalogueservice.proxy.GameProxy;
import com.example.catalogue.gamecatalogueservice.proxy.ReviewProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
