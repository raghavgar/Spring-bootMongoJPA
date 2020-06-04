package com.example.springjpa.exampleonjpa.service;

import com.example.springjpa.exampleonjpa.CustomerDTO;
import com.example.springjpa.exampleonjpa.sql.model.Customer;
import com.example.springjpa.exampleonjpa.sql.repository.CustomerRepository;
import com.example.springjpa.exampleonjpa.sql.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@Service
public class SqlNoSqlPersistService {

    @Autowired
    CustomerRepository repository;

    @Autowired
    PurchaseRepository purchaseRepository;

    @Autowired
    MongoTemplate template;

    @Transactional
    public void getCustomers() {
        //purchaseRepository.findAll();
        repository.findAll().forEach(System.out::println);
        List<Customer> customers = (List<Customer>) repository.findAll();

        Stream<Customer> customerSteamsList = repository.findCustomerAll();
        List<CustomerDTO> mongoCustomerList = new ArrayList<>();
        AtomicInteger count = new AtomicInteger();

        customerSteamsList.forEach(customer -> {

                    int dtoCount = count.getAndIncrement();

                    CustomerDTO dto = new CustomerDTO();
                    dto.setCustomerId(customer.getCustomerId());

                    mongoCustomerList.add(dto);
                    if (dtoCount % 1000 == 0) {
                        template.insertAll(mongoCustomerList);
                        mongoCustomerList.clear();
                    }

                }

        );


        System.out.println();

    }
}
