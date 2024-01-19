package com.example.catalogue.gamecatalogueservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
@Getter
@Setter
@ToString
public class Review {
    private Long id;
    private double score;
    private String comment;
    private Timestamp time;
    private Long gameId;
}
