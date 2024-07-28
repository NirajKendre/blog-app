package org.springbatch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMERS_INFO")
public class Customer {

    @Id
    private Integer id;
    private String customerId;
    private String firstName;
    private String lastName;
    private String company;
    private String city;
    private String country;
    private String phone1;
    private String phone2;
    private String Email;
    private String subscriptionDate;
    private String website;

}
