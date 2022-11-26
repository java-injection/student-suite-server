package it.ji.server.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDtoTest {

    @Test
    void getId() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "email@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        Long id = s1.getId();
        assertEquals(1L, id);
    }

    @Test
    void getName() {
    }

    @Test
    void getSurname() {
    }

    @Test
    void getBirthDate() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void getTelephones() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}