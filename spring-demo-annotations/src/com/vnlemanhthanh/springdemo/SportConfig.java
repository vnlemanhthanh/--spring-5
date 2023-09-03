package com.vnlemanhthanh.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * The type Sport config.
 */
@Configuration
//@ComponentScan("com.vnlemanhthanh.springdemo")
@PropertySource("sport.properties")
public class SportConfig {

	/**
	 * Sad fortune service fortune service.
	 *
	 * @return the fortune service
	 */
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	/**
	 * Swim coach coach.
	 *
	 * @return the coach
	 */
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
