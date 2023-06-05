package br.com.alura.domain.student;

import java.util.List;

public interface StudentRepository {
    void enroll(Student student);
    Student findByCPF(CPF cpf);
    List<Student> findAllEnrolled();
}
