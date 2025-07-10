package com.aurionpro.model;

public class PracticalExam implements ExamEvaluator {
    int practicalMarks;
    int vivaMarks;
    int totalMarks = 0;
    double percentage = 0.0;

    public PracticalExam(int practicalMarks, int vivaMarks) {
        this.practicalMarks = practicalMarks;
        this.vivaMarks = vivaMarks;
    }

    @Override
    public void evaluateMarks() {
        totalMarks = practicalMarks + vivaMarks;
        percentage = (totalMarks / 100.0) * 100;
        System.out.println("Your total Marks of Practical Exam: " + totalMarks + " out of 100");
        System.out.printf("Percentage: %.2f%%\n", percentage);
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
