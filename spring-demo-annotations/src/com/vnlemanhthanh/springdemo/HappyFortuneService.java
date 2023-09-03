package com.vnlemanhthanh.springdemo;

import org.springframework.stereotype.Component;

/**
 * The type Happy fortune service.
 */
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
