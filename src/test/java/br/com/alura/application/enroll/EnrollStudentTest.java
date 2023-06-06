package br.com.alura.application.enroll;

import br.com.alura.domain.student.CPF;
import br.com.alura.domain.student.Student;
import br.com.alura.infra.student.InMemoryStudentRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnrollStudentTest {
    @Test
    void shouldBePersisted() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();
        EnrollStudent sut = new EnrollStudent(repository);
        EnrollStudentDTO dto = new EnrollStudentDTO("John", "012.345.678-10", "validmail@gmail.com");
        sut.execute(dto);
        Student student = repository.findByCPF(new CPF("012.345.678-10"));
        assertEquals("012.345.678-10", student.getCpf());
        assertEquals("John", student.getName());
        assertEquals("validmail@gmail.com", student.getEmail());
    }
}
