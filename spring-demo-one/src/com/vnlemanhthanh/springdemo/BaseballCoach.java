package com.vnlemanhthanh.springdemo;

public class BaseballCoach implements Coach {
private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices";
	}

	@Override
	public String getDailyFortune() {
		return this + fortuneService.getFortune();
	}
}
