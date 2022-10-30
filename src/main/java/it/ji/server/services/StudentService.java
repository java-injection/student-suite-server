package it.ji.server.services;

import it.ji.server.models.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student("Luca", "Coraci", 13),
                new Student("Mario", "Trapano", 15)
                );
    }
}
