package com.customerapi.service;

import com.customerapi.model.Customer;
import com.customerapi.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
    public Customer findById(Integer id) {
        return customerRepository.findById(id);
    } 
}
