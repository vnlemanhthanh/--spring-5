package com.vnlemanhthanh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * The type Tennis coach.
 */
@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/**
	 * Instantiates a new Tennis coach.
	 */
	public TennisCoach() {
		System.out.println(this + " inside default constructor()");
	}

	/**
	 * Sets fortune service.
	 *
	 * @param theFortuneService the the fortune service
	 */
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(this + " inside method setFortuneService()");
		fortuneService = theFortuneService;
	}


	/**
	 * Do some crazy stuff.
	 *
	 * @param theFortuneService the the fortune service
	 */
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(this + " inside method doSomeCrazyStuff()");
		fortuneService = theFortuneService;
	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(this + " inside method doMyStartupStuff()");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(this + " inside method doMyCleanupStuff()");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
