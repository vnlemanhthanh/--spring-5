package com.vnlemanhthanh.springdemo;

public class SadFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return this + " SadFortuneService";
	}
}
