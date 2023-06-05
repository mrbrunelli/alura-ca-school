package br.com.alura.infra.student;

import br.com.alura.domain.student.CPF;
import br.com.alura.domain.student.Student;
import br.com.alura.domain.student.StudentNotFound;
import br.com.alura.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {
    private List<Student> enrolled = new ArrayList<>();

    @Override
    public void enroll(Student student) {
        this.enrolled.add(student);
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return this.enrolled.stream()
                .filter(student -> student.getCpf().equals(cpf.getValue()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> findAllEnrolled() {
        return this.enrolled;
    }
}
