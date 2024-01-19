package com.example.catalogue.gamecatalogueservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Game {
    @NotNull
    private Long id;
    @NotNull
    private String game;
    @NotNull
    private String studio;
    @NotNull
    private List<String> genres;
}
