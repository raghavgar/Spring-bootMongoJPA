package com.example.springjpa.exampleonjpa.sql.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Purchase {
    @Id
    @NotNull
    String purchaseId;
    String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @org.springframework.data.annotation.Transient
    @JoinColumn(name = "customerId")
    Customer customer;

    public Purchase(String purchaseId, String description) {
        this.purchaseId = purchaseId;
        this.description = description;
    }

    public Purchase(String purchaseId, String description, Customer customer) {
        this.purchaseId = purchaseId;
        this.description = description;
        this.customer = customer;
    }

    public Purchase() {
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseId='" + purchaseId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
