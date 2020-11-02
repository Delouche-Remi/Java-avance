package com.cesi.javamaven.repository;

import com.cesi.javamaven.model.CompteCourant;
import com.cesi.javamaven.model.CompteEpargne;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteEpargneRepository extends CrudRepository<CompteEpargne, Integer> {
    @Query(value = "SELECT * FROM compte_epargne WHERE id_client = ?1", nativeQuery = true)
    List<CompteEpargne> getComptesEpargnes(int clientId);
    
    @Query(value = "SELECT SUM(solde) FROM compte_epargne WHERE id_client = ?1", nativeQuery = true)
    int getComptesSolde(int clientId);
}
