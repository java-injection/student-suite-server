package it.ji.server.services;

import it.ji.server.models.Student;
import it.ji.server.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public void registerStudent(Student student) {
        this.studentRepository.save(student);
        System.out.println("SALVA TUTTO DELONGHI");
    }
}
