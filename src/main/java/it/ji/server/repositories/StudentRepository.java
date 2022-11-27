package it.ji.server.repositories;

import it.ji.server.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //@Query("SELECT s FROM Student s WHERE s.email = ?1")
    public Optional<Student> findStudentByEmail(String email);

    public Optional<Student> findStudentById(Long id);



}
