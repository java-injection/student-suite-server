package it.ji.server.configurations;

import it.ji.server.models.Student;
import it.ji.server.models.Telephone;
import it.ji.server.repositories.StudentRepository;
import it.ji.server.repositories.TelephoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository, TelephoneRepository telephoneRepository){
        return args -> {
            Telephone t1 = new Telephone("123");
            telephoneRepository.save(t1);
            Student gino = new Student("Gino", "Rossi", LocalDate.of(1984, Month.SEPTEMBER, 13));
            gino.addTelephone(t1);
            Student simone = new Student("Simone", "Verdi", LocalDate.of(2001, Month.JANUARY, 29));
            Telephone t2 = new Telephone("11111");
            Telephone t3 = new Telephone("22222");
            telephoneRepository.save(t2);
            telephoneRepository.save(t3);

            simone.addTelephone(t2);
            simone.addTelephone(t3);
            studentRepository.saveAll(List.of(gino,simone));
        };
    }


}
