package com.vnlemanhthanh.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
	private String[] data = {
			"to day is hfd",
			"line 2",
			"happy random"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);

		return data[index];
	}
}
