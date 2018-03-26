package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String finalListOfMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(movies -> movies.getValue().stream())
                .collect(Collectors.joining("!", "", ""));

        System.out.println(finalListOfMovies);
    }
}
