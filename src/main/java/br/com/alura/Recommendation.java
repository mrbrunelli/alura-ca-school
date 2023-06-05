package br.com.alura;

import java.time.LocalDateTime;

public class Recommendation {
    private Student recommender;
    private Student recommended;
    private LocalDateTime recommendationDate;

    public Recommendation(Student recommender, Student recommended) {
        this.recommender = recommender;
        this.recommended = recommended;
        this.recommendationDate = LocalDateTime.now();
    }

    public Student getRecommender() {
        return recommender;
    }

    public Student getRecommended() {
        return recommended;
    }

    public LocalDateTime getRecommendationDate() {
        return recommendationDate;
    }
}
