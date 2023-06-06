package br.com.alura.application.enroll;

import br.com.alura.domain.student.Student;
import br.com.alura.domain.student.StudentFactory;

public class EnrollStudentDTO {
    private final String name;
    private final String cpf;
    private final String email;

    public EnrollStudentDTO(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public Student build() {
        return new StudentFactory()
                .withNameCPFEmail(name, cpf, email)
                .build();
    }
}
