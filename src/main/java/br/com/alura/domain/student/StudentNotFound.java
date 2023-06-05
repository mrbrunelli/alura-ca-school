package br.com.alura.domain.student;

public class StudentNotFound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public StudentNotFound(CPF cpf) {
        super("Student not found with CPF: " + cpf.getValue());
    }
}
