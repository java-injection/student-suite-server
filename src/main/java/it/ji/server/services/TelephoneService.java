package it.ji.server.services;

import it.ji.server.models.Telephone;
import it.ji.server.repositories.StudentRepository;
import it.ji.server.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelephoneService {

    private TelephoneRepository telephoneRepository;
    private StudentRepository studentRepository;

    @Autowired
    public TelephoneService(TelephoneRepository telephoneRepository, StudentRepository studentRepository) {
        this.telephoneRepository = telephoneRepository;
        this.studentRepository = studentRepository;

    }

    public List<Telephone> getAllTelephones(){
        return this.telephoneRepository.findAll();
    }

    //retrieve telephone by student id
    public List<Telephone> getTelephonesByStudentId(Long id){
        return this.studentRepository.findStudentById(id).orElseThrow().getTelephones();
    }
}
