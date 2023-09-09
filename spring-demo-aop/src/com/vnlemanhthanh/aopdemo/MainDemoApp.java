package com.vnlemanhthanh.aopdemo;

import com.vnlemanhthanh.aopdemo.dao.AccountDAO;
import com.vnlemanhthanh.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        theAccountDAO.addAccount(new Account());
        System.out.println("\n");
        theMembershipDAO.addMember();

        context.close();
    }
}
