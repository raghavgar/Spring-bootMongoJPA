package com.example.springjpa.exampleonjpa;

import com.example.springjpa.exampleonjpa.sql.model.Customer;
import com.example.springjpa.exampleonjpa.sql.repository.CustomerRepository;
import com.example.springjpa.exampleonjpa.sql.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collection;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class ExampleonjpaApplication implements CommandLineRunner {
    @Autowired
    CustomerRepository repository;

    @Autowired
    PurchaseRepository purchaseRepository;

    @Autowired
    MongoTemplate template;


    public static void main(String[] args) {
        SpringApplication.run(ExampleonjpaApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        // Customer c = repository.findByCustomerId("Bill");
        // System.out.println(c);
         purchaseRepository.findAll();
         repository.findAll().forEach(System.out::println);
       List<Customer> customers = (List<Customer>) repository.findAll();



/*
         Customer customer = new Customer("1001", "Name", "purchase1",
                 Arrays.asList(new Purchase("p001", "random text"),
                         new Purchase("p002", "random text") ));*/

        // repository.save(customer);
         System.out.println("Customer saved ...");
      //  repository.findAll().forEach(System.out::println);

       // template.insert(customers.get(2));

        template.insertAll((Collection<Customer>) repository.findAll());


    }
}
