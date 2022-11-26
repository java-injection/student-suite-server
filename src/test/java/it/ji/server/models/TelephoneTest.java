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
        Telephone t1 = new Telephone(1L,"123");
        t1.setId(2L);
        assertEquals(2L, t1.getId());
    }

    @Test
    void getNumber() {
        Telephone t1 = new Telephone(1L,"123");
        String number = t1.getNumber();
        assertEquals("123", number);
        Telephone t2 = new Telephone(7L,"456");
        String number2 = t2.getNumber();
        assertEquals("456", number2);
    }

    @Test
    void setNumber() {
        Telephone t1 = new Telephone(1L,"123");
        t1.setNumber("456");
        assertEquals("456", t1.getNumber());
    }

    @Test
    void testEquals() {
        Telephone t1 = new Telephone(1L,"123");
        Telephone t2 = new Telephone(1L,"123");
        assertEquals(t1, t2);
    }
}