package br.com.alura.application.recommendation;

import br.com.alura.domain.student.Student;

public interface RecommendationEmailSender {
    void sendTo(Student recommended);
}
