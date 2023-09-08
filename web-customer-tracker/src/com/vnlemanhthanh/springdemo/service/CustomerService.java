package com.vnlemanhthanh.springdemo.service;

import com.vnlemanhthanh.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);
}
