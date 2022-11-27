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
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "gino.rossi@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        String name = s1.getName();
        assertEquals("Gino", name);

    }

    @Test
    void getSurname() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "gino@yahoo.it",
                List.of(new TelephoneDto(1L, "123")));
        String surname = s1.getSurname();
        assertEquals("Rossi", surname);
    }

    @Test
    void getBirthDate() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "emaio.@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        LocalDate birthDate = s1.getBirthDate();
        assertEquals(LocalDate.of(1984, Month.SEPTEMBER, 13), birthDate);

    }


    @Test
    void getEmail() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "lulu@libero.it",
                List.of(new TelephoneDto(1L, "123")));
        String email = s1.getEmail();
        assertEquals("lulu@libero.it", email);
    }


    @Test
    void getTelephones() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "email@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        List<TelephoneDto> telephones = s1.getTelephones();
        assertEquals(List.of(new TelephoneDto(1L, "123")), telephones);
    }


    @Test
    void testEquals() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "amico@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        StudentDto s2 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "amico@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        StudentDto s3 = new StudentDto(
                2L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "amico@gmail.com",
                List.of(new TelephoneDto(1L, "124"))); //numero diverso

        assertEquals(s1, s2);
        assertNotEquals(s1, s3);
    }

    @Test
    void testHashCode() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "amico@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        StudentDto s2 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "amico@gmail.com",
                List.of(new TelephoneDto(1L, "123")));

        assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    void testToString() {
        StudentDto s1 = new StudentDto(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "gino.rossi@gmail.com",
                List.of(new TelephoneDto(1L, "123")));
        String s = s1.toString();
        assertEquals("StudentDto(id = 1, name = Gino, surname = Rossi, birthDate = 1984-09-13, email = gino.rossi@gmail.com, telephones = [TelephoneDto(id = 1, number = 123)])", s);

    }
}