package com.vnlemanhthanh.springdemo;

public class TrackCoach implements Coach {
private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println(this + " inside method doMyStartupStuff()");
	}

	public void doMyCleanupStuffYoYo() {
		System.out.println(this + " inside method doMyCleanupStuffYoYo()");
	}
}
