package it.ji.server.configurations;

import it.ji.server.models.Student;
import it.ji.server.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student gino = new Student("Gino", "Rossi", 22);
            Student simone = new Student("Simone", "Verdi", 27);
            studentRepository.saveAll(List.of(gino,simone));
        };
    }


}
