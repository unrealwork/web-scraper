package com.unrealwork.webscraper;

import java.util.logging.Logger;

/**
 * Main executable class.
 */
public final class WebScraper {

  /**
   * Hide constructor for safety.
   */
  private WebScraper() {
  }

  /**
   * Main entry point to program.
   *
   * @param args program arguments described in readme file.
   */
  public static void main(final String[] args) {
    Logger log = Logger.getLogger(WebScraper.class.getName());
    log.info("Hello I'm Web Scraper");
  }
}
