package com.aurionpro.model;

public class OnlineQuiz implements ExamEvaluator {
    int correctAnswers;
    int totalQuestions;

    public OnlineQuiz(int correctAnswers, int totalQuestions) {
        this.correctAnswers = correctAnswers;
        this.totalQuestions = totalQuestions;
    }

    int percentage;

    @Override
    public void evaluateMarks() {
        percentage = (int) ((correctAnswers * 100.0) / totalQuestions);
        System.out.println("You answered " + correctAnswers + " out of " + totalQuestions + " correctly.");
        System.out.println("Score Percentage: " + percentage + "%");
    }

    @Override
    public void calculateGrade() {
        if (percentage >= 90) {
            System.out.println("Grade is: A");
        } else if (percentage >= 70) {
            System.out.println("Grade is: B");
        } else if (percentage >= 60) {
            System.out.println("Grade is: C");
        } else {
            System.out.println("Grade is: D");
        }
    }
}
