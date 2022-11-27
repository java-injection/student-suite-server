package it.ji.server.repositories;

import it.ji.server.models.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone,Long> {

}
