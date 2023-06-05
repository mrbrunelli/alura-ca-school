package br.com.alura.domain.student;

public class Email {
    private String value;

    public Email(String value) {
        if (value == null || !value.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid e-mail");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
