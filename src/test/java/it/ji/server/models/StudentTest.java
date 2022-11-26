package it.ji.server.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "gino.rossi@gmail.com"
        );
        String name = s1.getName();
        assertEquals("Gino", name);
    }

    @Test
    void setName() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "gino.rossi@gmail.com"
        );
        String name = s1.getName();
        assertEquals("Gino", name);
        s1.setName("Marco");
        String updatedName = s1.getName();
        assertEquals("Marco", updatedName);
    }


    @Test
    void getSurname() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                " luca@gmai.com");

        String surname = s1.getSurname();
        assertEquals("Rossi", surname);
    }

    @Test
    void setSurname() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "luca@gmail.com");
        s1.setSurname("Verdi");
        String surname = s1.getSurname();
        assertEquals("Verdi", surname);
    }

}