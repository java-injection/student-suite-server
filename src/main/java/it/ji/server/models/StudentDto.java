package it.ji.server.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link Student} entity
 */
public class StudentDto implements Serializable {
    private final long id;
    private final String name;
    private final String surname;
    private final LocalDate birthDate;
    private final String email;
    private final List<TelephoneDto> telephones;

    public StudentDto(long id, String name, String surname, LocalDate birthDate, String email, List<TelephoneDto> telephones) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
        this.telephones = telephones;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public List<TelephoneDto> getTelephones() {
        return telephones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto entity = (StudentDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.surname, entity.surname) &&
                Objects.equals(this.birthDate, entity.birthDate) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.telephones, entity.telephones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthDate, email, telephones);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "surname = " + surname + ", " +
                "birthDate = " + birthDate + ", " +
                "email = " + email + ", " +
                "telephones = " + telephones + ")";
    }
}