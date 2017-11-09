package com.unrealwork.webscraper.scraper;

import java.util.regex.Pattern;

/**
 * Describes options of web scraper
 *
 */
public enum OptionsDescription {
    SOURCE(true, "([a-zA-Z]:)?(\\\\[a-zA-Z0-9_.-]+)+\\\\?"),
    WORDS(true, ""),
    WORD_COUNT(false, "-w"),
    EXPRESSION_EXTRACTOR(false, "-e"),
    VERBOSITY(false, "-w"),
    WEBPAGE_COUNT(false, "-c");

    private Boolean required;
    private Pattern pattern;

    OptionsDescription(Boolean required, String pattern) {
        this.required = required;
        this.pattern = Pattern.compile(pattern);
    }

    public Boolean isRequired() {
        return required;
    }

    public Pattern getPattern() {
        return pattern;
    }
}
