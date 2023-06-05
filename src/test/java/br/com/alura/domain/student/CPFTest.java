package br.com.alura.domain.student;

import br.com.alura.domain.student.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {
    @Test
    void shouldNotCreateWithInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("000"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("00000000000"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("000.000.000-000"));
    }

    @Test
    void shouldCreateIfValueIsValid() {
        assertEquals("000.000.000-00", new CPF("000.000.000-00").getValue());
    }
}