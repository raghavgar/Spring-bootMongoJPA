package com.example.springjpa.exampleonjpa.sql.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static sun.misc.Version.print;

//https://stackoverflow.com/questions/25283198/spring-boot-jpa-column-name-annotation-ignored
@Entity
@Document
public class Customer {
    @Id
    @Column(name="customerId")
    private  String customerId;
    @Column(name="name")
    private String name;


    public Customer(String customerId, String name, String testingNewFieldWithoutInDB, Collection<Purchase> purchases) {
        this.customerId = customerId;
        this.name = name;
        this.purchases = purchases;
    }



    public void setPurchases(Collection<Purchase> purchases) {
        this.purchases = purchases;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
    private Collection<Purchase> purchases = new ArrayList<>();

    public List<Purchase> getPurchases() {
        return (List<Purchase>) purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }



    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", purchases=" + purchases +
                '}';
    }
}
