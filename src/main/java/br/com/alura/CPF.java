package br.com.alura;

public class CPF {
    private String value;

    public CPF(String value) {
        if (value == null || !value.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
            throw new IllegalArgumentException("Invalid CPF");
        }
        this.value = value;
    }
}
