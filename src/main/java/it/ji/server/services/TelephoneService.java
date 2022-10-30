package it.ji.server.services;

import it.ji.server.models.Telephone;
import it.ji.server.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelephoneService {

    private TelephoneRepository telephoneRepository;

    @Autowired
    public TelephoneService(TelephoneRepository telephoneRepository) {
        this.telephoneRepository = telephoneRepository;
    }

    public List<Telephone> getAllTelephones(){
        return this.telephoneRepository.findAll();
    }
}
