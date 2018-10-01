package com.capgemini.bankappspring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bankappspring.entities.Customer;
import com.capgemini.bankappspring.repository.CustomerRepository;
import com.capgemini.bankappspring.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer authenticate(Customer customer) {
		return customerRepository.authenticate(customer);
	}

	@Override
	public Customer updateProfile(Customer customer) {
	return customerRepository.updateProfile(customer);
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword){
	
		return customerRepository.updatePassword(customer, oldPassword, newPassword);
		
	}

}