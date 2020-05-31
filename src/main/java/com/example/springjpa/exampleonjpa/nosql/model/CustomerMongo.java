package com.example.springjpa.exampleonjpa.nosql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CustomerMongo {
    @Id
    private String customerId;
    private String name;
    private String description;



    public CustomerMongo(String customerId, String name, String description) {
        this.customerId = customerId;
        this.name = name;
        this.description = description;
    }

    public CustomerMongo() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CustomerMongo{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
