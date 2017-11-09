package com.unrealwork.webscraper.scraper;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class OptionsValidator {

    public static <T> Boolean isValid(String[] args) {
        Set<Option<T>> options = new HashSet<>();
        if (args.length > OptionsDescription.values().length) {
            throw new IllegalArgumentException();
        }
        return IntStream.range(0, args.length).allMatch(index -> {
                    return true;
                }
        );

    }
}
