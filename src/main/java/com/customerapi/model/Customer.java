package com.customerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {    
        
    private String firstName;
    private String lastName;
    private Integer id;

}
