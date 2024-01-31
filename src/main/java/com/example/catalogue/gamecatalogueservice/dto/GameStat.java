package com.example.catalogue.gamecatalogueservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class GameStat {
    private String name;
    private int reviewCount;
    private double averageScore;
    private int commentCount;
}
