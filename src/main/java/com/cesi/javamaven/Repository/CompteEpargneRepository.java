package com.cesi.javamaven.Repository;

import com.cesi.javamaven.model.CompteEpargne;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteEpargneRepository extends CrudRepository<CompteEpargne, Integer> {
    
}