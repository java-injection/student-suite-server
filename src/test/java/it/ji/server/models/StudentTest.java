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
        assertEquals("Gino",name);
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
        assertEquals("Gino",name);
        s1.setName("Marco");
        String updatedName = s1.getName();
        assertEquals("Marco",updatedName);
    }



}