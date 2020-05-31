package com.example.springjpa.exampleonjpa.sql.repository;

import com.example.springjpa.exampleonjpa.sql.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    //List<Customer> findAll();
    Customer findByCustomerId(String id);
}
