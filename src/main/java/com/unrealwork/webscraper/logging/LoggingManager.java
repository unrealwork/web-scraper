package com.unrealwork.webscraper.logging;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Class responsible for initialization and configuration of logger.
 */
public final class LoggingManager {

  /**
   * Default logging config name.
   */
  private static final String LOG_CONFIG = "logging.properties";
  /**
   * Logger for this class.
   */
  private static final Logger LOGGER =
      Logger.getLogger(LoggingManager.class.getName());


  /**
   * Hidden default constructor for safety.
   */
  private LoggingManager() {
  }

  /**
   * Init logger from default configuration file stored as resource.
   */
  public static void init() {
    try {
      LogManager.getLogManager()
          .readConfiguration(ClassLoader.getSystemResourceAsStream(LOG_CONFIG));
      LOGGER.info(() -> "Logger was successfully initialized.");
    } catch (IOException e) {
      LOGGER.severe(() -> "Failed to read logger's configuration.");
    }
  }
}
