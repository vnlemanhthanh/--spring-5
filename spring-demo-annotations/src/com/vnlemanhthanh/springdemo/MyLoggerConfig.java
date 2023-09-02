package com.vnlemanhthanh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * The type My logger config.
 */
public class MyLoggerConfig {
	private String rootLoggerLevel;
	private String printedLoggerLevel;

	/**
	 * Sets root logger level.
	 *
	 * @param rootLoggerLevel the root logger level
	 */
	public void setRootLoggerLevel(String rootLoggerLevel) {
		this.rootLoggerLevel = rootLoggerLevel;
	}

	/**
	 * Sets printed logger level.
	 *
	 * @param printedLoggerLevel the printed logger level
	 */
	public void setPrintedLoggerLevel(String printedLoggerLevel) {
		this.printedLoggerLevel = printedLoggerLevel;
	}

	/**
	 * Init logger.
	 */
	public void initLogger() {

		// parse levels
		Level rootLevel = Level.parse(rootLoggerLevel);
		Level printedLevel = Level.parse(printedLoggerLevel);

		// get logger for app context
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

		// get parent logger
		Logger loggerParent = applicationContextLogger.getParent();

		// set root logging level
		loggerParent.setLevel(rootLevel);

		// set up console handler
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(printedLevel);
		consoleHandler.setFormatter(new SimpleFormatter());

		// add handler to the logger
		loggerParent.addHandler(consoleHandler);
	}

}
