package edu.bsu.cs222.gradeevaluator;

public class GradeFormatter {
    public String formatLetterGrade(int numberGrade) {
        String letterGrade;
        if (numberGrade == 5) {
            letterGrade = "A";
        }
        else if (numberGrade == 4) {
            letterGrade = "B";
        }
        else if (numberGrade == 3) {
            letterGrade = "C";
        }
        else if (numberGrade == 2) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }
        return letterGrade;
    }

    public Integer formatNumberGrade(String letterGrade) {
        int numberGrade;
        if (letterGrade == "A") {
            numberGrade = 5;
        }
        else if (letterGrade == "B") {
            numberGrade = 4;
        }
        else if (letterGrade == "C") {
            numberGrade = 3;
        }
        else if (letterGrade == "D") {
            numberGrade = 2;
        }
        else {
            numberGrade = 1;
        }
        return numberGrade;
    }
    public String formatFinalGrade() {
        String finalGrade;
        if (Grades.finalGrade >= .90) {
            finalGrade = "A";
        }
        else if (Grades.finalGrade >= .80) {
            finalGrade = "B";
        }
        else if (Grades.finalGrade >= .70) {
            finalGrade = "C";
        }
        else if (Grades.finalGrade >= .60) {
            finalGrade = "D";
        }
        else {
            finalGrade = "F";
        }
        return finalGrade;
    }
}
