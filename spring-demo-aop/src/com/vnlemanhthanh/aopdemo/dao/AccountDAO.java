package com.vnlemanhthanh.aopdemo.dao;

import com.vnlemanhthanh.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(this + "\n: DOING MY DB WORK: ADDING AN ACCOUNT()");
    }

    public void addAccount(Account theAccount) {
        System.out.println(this + "\n: DOING MY DB WORK: ADDING AN ACCOUNT(theAccount)");
    }
}
