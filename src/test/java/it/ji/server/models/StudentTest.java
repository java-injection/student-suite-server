package it.ji.server.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        Student s1 = new Student("Gino","Coraci",null);
        String name = s1.getName();
        assertEquals("Gino",name);
    }

    @Test
    void setName() {
        Student s1 = new Student("Gino","Coraci",null);
        String name = s1.getName();
        assertEquals("Gino",name);
        s1.setName("Marco");
        String updatedName = s1.getName();
        assertEquals("Marco",updatedName);
    }
}