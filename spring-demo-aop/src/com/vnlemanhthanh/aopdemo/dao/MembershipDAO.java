package com.vnlemanhthanh.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public int addAccount() {
        System.out.println(this + "\n: DOING MY DB WORK: ADDING AN ACCOUNT");
        return 0;
    }

    public void addMember() {
        System.out.println(this + "\n: DOING MY DB WORK: ADDING AN ACCOUNT");

    }
}
