package com.vnlemanhthanh.springdemo;

import org.springframework.stereotype.Component;

/**
 * The type Tennis coach.
 */
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
}
