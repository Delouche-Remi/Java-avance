package com.cesi.javamaven.repository;

import com.cesi.javamaven.model.CompteCourant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteCourantRepository extends CrudRepository<CompteCourant, Integer> {
    
}