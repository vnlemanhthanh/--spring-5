package com.vnlemanhthanh.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println(this + " :inside no-arg constructor");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println(this + " :inside setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println(this + " :inside setTeam()");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(this + " :inside setFortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
