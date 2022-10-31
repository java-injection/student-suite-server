package it.ji.server.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;

    private LocalDate birthDate;
    private String email;

    @OneToMany
    private List<Telephone> telephones;
    @Transient
    private int age;


    public Student() {
    }


    public Student(long id, String name, String surname, LocalDate birthDate, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Student(String name, String surname, LocalDate birthDate, String email) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addTelephone(Telephone telephone){
        if(this.telephones == null){
            this.telephones = new LinkedList<>();
        }
        this.telephones.add(telephone);
    }
}
