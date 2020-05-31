package com.example.springjpa.exampleonjpa.sql.repository;

import com.example.springjpa.exampleonjpa.sql.model.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, String> {
}
