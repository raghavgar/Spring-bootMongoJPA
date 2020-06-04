package com.example.springjpa.exampleonjpa.sql.repository;

import com.example.springjpa.exampleonjpa.sql.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

    //List<Customer> findAll();
    Customer findByCustomerId(String id);

    @Query("select c from Customer c")
    Stream<Customer> findCustomerAll();
}
