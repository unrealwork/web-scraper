package com.unrealwork.webscraper.scraper;

import jdk.nashorn.internal.runtime.regexp.RegExp;

public interface Option<T> {
    OptionsDescription getDescription();
    T getValue();
}
