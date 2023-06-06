package br.com.alura.application.enroll;

import br.com.alura.domain.student.Student;
import br.com.alura.domain.student.StudentRepository;

public class EnrollStudent {
    private final StudentRepository repository;

    public EnrollStudent(StudentRepository repository) {
        this.repository = repository;
    }

    public void execute(EnrollStudentDTO dto) {
        Student student = dto.build();
        repository.enroll(student);
    }
}
