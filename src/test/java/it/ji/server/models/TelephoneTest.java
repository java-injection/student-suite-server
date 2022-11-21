package it.ji.server.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneTest {

    @Test
    void getId() {
        Telephone t1 = new Telephone(1L,"123");
        Long id = t1.getId();
        assertEquals(1L, id);
        Telephone t2 = new Telephone(7L,"123");
        Long id2 = t2.getId();
        assertEquals(7L, id2);
    }

    @Test
    void setId() {
    }

    @Test
    void getNumber() {
    }

    @Test
    void setNumber() {
    }

    @Test
    void testEquals() {
    }
}