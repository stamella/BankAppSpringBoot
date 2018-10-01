package com.capgemini.bankappspring.service;

import com.capgemini.bankappspring.entities.Customer;

public interface CustomerService {

	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) ;

}