package com.kodilla.good.patterns.challenges;

import java.util.*;

public class MovieStore {
    private static final String IRONMAN_PL = "Żelazny Człowiek";
    private static final String IRONMAN_EN = "Iron Man";
    private static final String AVENGERS_PL = "Mściciele";
    private static final String AVENGERS_EN = "Avengers";
    private static final String FLASH_PL = "Błyskawica";
    private static final String FLASH_EN = "Flash";
    private static final String IRONMAN_KEY = "IM";
    private static final String AVENGERS_KEY = "AV";
    private static final String FLASH_KEY = "FL";


    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(IRONMAN_PL);
        ironManTranslations.add(IRONMAN_EN);

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(AVENGERS_PL);
        avengersTranslations.add(AVENGERS_EN);

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add(FLASH_PL);
        flashTranslations.add(FLASH_EN);

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put(IRONMAN_KEY, ironManTranslations);
        booksTitlesWithTranslations.put(AVENGERS_KEY, avengersTranslations);
        booksTitlesWithTranslations.put(FLASH_KEY, flashTranslations);

        return booksTitlesWithTranslations;
    }
}

