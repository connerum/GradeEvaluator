package edu.bsu.cs222.gradeevaluator;

import java.util.ArrayList;
import java.util.Collections;

public class GradeCalculator {
    public void projectsGradeCalculator() {
        ArrayList<Integer> projectsGrade = Grades.projectsNumberGrade;
        System.out.println(projectsGrade);
        int iterationGradeLast = projectsGrade.get(3);
        int iterationGradeOne = projectsGrade.get(0);
        int iterationGradeTwo = projectsGrade.get(1);
        int iterationGradeThree = projectsGrade.get(2);
        int totalRemainingGrade = iterationGradeOne + iterationGradeTwo + iterationGradeThree;

        if(iterationGradeLast == 5) {
            if(totalRemainingGrade >= 9) {
                Grades.finalProjectsGrade = 5;
            }
            else {
                Grades.finalProjectsGrade = 4;
            }
        }
        else if(iterationGradeLast == 4) {
            if(totalRemainingGrade >= 6) {
                Grades.finalProjectsGrade = 4;
            }
            else {
                Grades.finalProjectsGrade = 3;
            }
        }
        else if(iterationGradeLast == 3) {
            if(totalRemainingGrade >= 6) {
                Grades.finalProjectsGrade = 3;
            }
            else {
                Grades.finalProjectsGrade = 2;
            }
        }
        else if(iterationGradeLast == 2) {
            if(totalRemainingGrade >= 5) {
                Grades.finalProjectsGrade = 2;
            }
            else {
                Grades.finalProjectsGrade = 1;
            }
        }
        else {
            Grades.finalProjectsGrade = 1;
        }
    }
    public void finalGradeCalculator() {
        GradeFormatter gradeFormatter = new GradeFormatter();
        float totalGrade = Grades.assignmentGrade + Grades.selfAssesmentGrade +
                Grades.engagementGrade + Grades.achievementsGrade +
                gradeFormatter.formatNumberGrade(Grades.finalExamGrade) + Grades.finalProjectsGrade;

        float finalGrade = totalGrade/30;
        Grades.finalGrade = finalGrade;
    }


}
