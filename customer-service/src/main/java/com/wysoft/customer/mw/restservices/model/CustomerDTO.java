package com.wysoft.customer.mw.restservices.model;

import lombok.Data;

@Data
public class CustomerDTO {

    private Integer customerId;
    private String firstName;
    private String lastName;
    private String city;
    private String country;
}
