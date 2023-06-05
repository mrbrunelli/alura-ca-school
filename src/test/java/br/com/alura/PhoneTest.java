package br.com.alura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {
    @Test
    void shouldNotCreateWithInvalidDDD() {
        assertThrows(IllegalArgumentException.class, () -> new Phone(null, "999999999"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("", "999999999"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("1", "999999999"));
        assertThrows(IllegalArgumentException.class, () -> new Phone("222", "999999999"));
    }

    @Test
    void shouldNotCreateWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Phone("44", null));
        assertThrows(IllegalArgumentException.class, () -> new Phone("44", ""));
        assertThrows(IllegalArgumentException.class, () -> new Phone("44", "9999999999"));
    }

    @Test
    void shouldCreateIfDDDIsValid() {
        assertEquals("44", new Phone("44", "999999999").getDdd());
    }

    @Test
    void shouldCreateIfNumberIsValid() {
        assertEquals("99999999", new Phone("44", "99999999").getNumber());
        assertEquals("999999999", new Phone("44", "999999999").getNumber());
    }
}