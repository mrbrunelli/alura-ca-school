package br.com.alura.infra.student;

import br.com.alura.domain.student.CPF;
import br.com.alura.domain.student.Phone;
import br.com.alura.domain.student.Student;
import br.com.alura.domain.student.StudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JDBCStudentRepository implements StudentRepository {
    private final Connection connection;

    public JDBCStudentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void enroll(Student student) {
        try {
            String sql = "INSERT INTO STUDENT VALUES(?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getCpf());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.execute();

            sql = "INSERT INTO PHONE VALUES(?, ?)";
            ps = connection.prepareStatement(sql);
            for (Phone phone : student.getPhones()) {
               ps.setString(1, phone.getDdd());
               ps.setString(2, phone.getNumber());
               ps.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Student> findAllEnrolled() {
        return null;
    }
}
