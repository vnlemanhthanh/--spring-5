package com.vnlemanhthanh.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(this + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
