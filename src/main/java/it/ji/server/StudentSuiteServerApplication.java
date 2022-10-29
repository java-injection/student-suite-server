package it.ji.server;

import it.ji.server.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentSuiteServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentSuiteServerApplication.class, args);
    }

    @GetMapping
    public Student hello() {
        Student p = new Student("Luca", "Coraci", 12);
        p.addAnimale(new Animale("Gino", "Cane"));
        p.addAnimale(new Animale("Catto", "Gatto"));
        p.addAnimale(new Animale("Bob", "Pesce"));
        return p;
    }
}

