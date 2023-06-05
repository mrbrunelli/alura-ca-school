package br.com.alura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    void shouldNotCreateWithInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("invalid"));
    }

    @Test
    void shouldCreateIfIsValidEmail() {
        assertEquals("valid@gmail.com", new Email("valid@gmail.com").getValue());
    }
}