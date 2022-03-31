package com.customerapi.repository;

import com.customerapi.model.Customer;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository {
    
    private static final Map<Integer, Customer> CUSTOMERS = new HashMap<>();
    
    static {
        CUSTOMERS.put(1, new Customer("Jane", "Doe", 1));
        CUSTOMERS.put(2, new Customer("John", "Doe", 2));
        CUSTOMERS.put(3, new Customer("Adam", "Smith", 3));
    }
    
    public Customer findById(Integer id) {
        if (CUSTOMERS.get(id) == null) {
//            throw new CustomerNotFoundException("No customer found for id " + id);
        }
        return CUSTOMERS.get(id);
    }
    
}
