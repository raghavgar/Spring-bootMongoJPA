package com.example.springjpa.exampleonjpa;

import com.example.springjpa.exampleonjpa.service.SqlNoSqlPersistService;
import com.example.springjpa.exampleonjpa.sql.model.Customer;
import com.example.springjpa.exampleonjpa.sql.repository.CustomerRepository;
import com.example.springjpa.exampleonjpa.sql.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class ExampleonjpaApplication{



    public static void main(String[] args) {
        SpringApplication.run(ExampleonjpaApplication.class, args);




    }



}
