package it.ji.server.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {



    private final String eemail = "gino.rossi@gmail.com";

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
    void testSetSurname() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                "luca@gmail.com");
        s1.setSurname("Verdi");
        String surname = s1.getSurname();
        assertEquals("Verdi", surname);
    }

    @Test
    void getId() {
        Student s1 = new Student(
                1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        Long id = s1.getId();
        assertEquals(1L, id);
    }

    @Test
    void setId() {
        Student s1 = new Student
                (1L,
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        Long id = s1.getId();
        assertEquals(1L, id);
        s1.setId(2L);
        Long updatedId = s1.getId();
        assertEquals(2L, updatedId);
    }


    @Test
    void getAge() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        int age = s1.getAge();
        int expectedAge = Period.between(LocalDate.of(1984, Month.SEPTEMBER, 13), LocalDate.now()).getYears();
        assertEquals(expectedAge, age);
    }


    @Test
    void getBirthDate() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        LocalDate birthDate = s1.getBirthDate();
        assertEquals(LocalDate.of(1984, Month.SEPTEMBER, 13), birthDate);

    }

    @Test
    void setBirthDate() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        LocalDate birthDate = s1.getBirthDate();
        assertEquals(LocalDate.of(1984, Month.SEPTEMBER, 13), birthDate);
        s1.setBirthDate(LocalDate.of(1985, Month.SEPTEMBER, 13));
        LocalDate updatedBirthDate = s1.getBirthDate();
        assertEquals(LocalDate.of(1985, Month.SEPTEMBER, 13), updatedBirthDate);
    }


    @Test
    void getTelephones() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        s1.addTelephone(new Telephone(1L,"1234567890"));
        s1.addTelephone(new Telephone(2L,"1234567999"));
        List<Telephone> telephones = s1.getTelephones();
        assertEquals(2, telephones.size());
        assertEquals("1234567890", telephones.get(0).getNumber());
        assertEquals("1234567999", telephones.get(1).getNumber());
    }

    @Test
    void setTelephones() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        s1.addTelephone(new Telephone(1L,"1234567890"));
        s1.addTelephone(new Telephone(2L,"1234567999"));
        List<Telephone> telephones = s1.getTelephones();
        assertEquals(2, telephones.size());
        assertEquals("1234567890", telephones.get(0).getNumber());
        assertEquals("1234567999", telephones.get(1).getNumber());
        s1.setTelephones(List.of(new Telephone(3L,"1234567891"), new Telephone(4L,"1234567998")));
        List<Telephone> updatedTelephones = s1.getTelephones();
        assertEquals(2, updatedTelephones.size());
        assertEquals("1234567891", updatedTelephones.get(0).getNumber());
        assertEquals("1234567998", updatedTelephones.get(1).getNumber());
        assertEquals(3L, updatedTelephones.get(0).getId());
        assertEquals(4L, updatedTelephones.get(1).getId());
    }

    @Test
    void getEmail() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        String email = s1.getEmail();
        assertEquals(eemail, email);
    }

    @Test
    void setEmail() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        String email = s1.getEmail();
        assertEquals(eemail, email);
        s1.setEmail("amicofrizzo@gmail.com");
        String updatedEmail = s1.getEmail();
        assertEquals("amicofrizzo@gmail.com", updatedEmail);
    }

    @Test
    void addTelephone() {
        Student s1 = new Student(
                "Gino",
                "Rossi",
                LocalDate.of(1984, Month.SEPTEMBER, 13),
                eemail);
        s1.addTelephone(new Telephone(1L,"1234567890"));
        s1.addTelephone(new Telephone(2L,"1234567999"));
        List<Telephone> telephones = s1.getTelephones();
        assertEquals(2, telephones.size());
        assertEquals("1234567890", telephones.get(0).getNumber());
        assertEquals("1234567999", telephones.get(1).getNumber());
    }
}