package br.com.alura.infra.recommendation;

import br.com.alura.application.recommendation.RecommendationEmailSender;
import br.com.alura.domain.student.Student;

public class JavaMailRecommendationEmailSender implements RecommendationEmailSender {
    @Override
    public void sendTo(Student recommended) {
        // send email using JavaMail API
    }
}
