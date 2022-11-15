package it.ji.server;

import it.ji.server.controllers.StudentController;
import it.ji.server.models.Student;
import it.ji.server.repositories.StudentRepository;
import it.ji.server.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StudentSuiteServerApplication {


    //testing git guardian
    public final static String API_KEY_FARLOCCA = "REDATTO";
    public final static String API_KEY_FARLOCCA_2 = "REDATTO";
    public static void main(String[] args) {
        SpringApplication.run(StudentSuiteServerApplication.class, args);

    }


}

