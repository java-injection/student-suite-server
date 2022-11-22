package it.ji.server.repositories;

import it.ji.server.models.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone,Long> {
    
}
