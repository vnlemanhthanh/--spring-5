package com.vnlemanhthanh.springdemo;

import org.springframework.stereotype.Component;

@Component("foo")
public class RESTFortuneService implements FortuneService{
	@Override
	public String getFortune() {
		return null;
	}
}
