package edu.bsu.cs222.gradeevaluator;

import java.util.ArrayList;
import java.util.Collections;

public class Grades {
    public static int assignmentGrade;
    public static int selfAssesmentGrade;
    public static int engagementGrade;
    public static int achievementsGrade;
    public static String finalExamGrade;
    public static ArrayList<String> projectsLetterGrade;
    public static ArrayList<Integer> projectsNumberGrade;
    public static int finalProjectsGrade;
    public static float finalGrade;

    public void setAssignmentsGrade(int userEntry) {
        if (userEntry == 7) {assignmentGrade = 5;}
        else if (userEntry == 6) {assignmentGrade = 4;}
        else if (userEntry == 5) {assignmentGrade = 3;}
        else if (userEntry == 4) {assignmentGrade = 2;}
        else {assignmentGrade = 1;}
    }
    public void setSelfAssesmentGrade(int userEntry) {
        if (userEntry == 1) {selfAssesmentGrade = 5;}
        else {selfAssesmentGrade = 1;}
    }
    public void setEngagementGrade(int userEntry) {
        if (userEntry >= 38) {engagementGrade = 5;}
        else if (userEntry >= 35) {engagementGrade = 4;}
        else if (userEntry >= 32) {engagementGrade = 3;}
        else if (userEntry >=29) {engagementGrade = 2;}
        else {engagementGrade = 1;}
    }
    public void setAchievementsGrade(int userEntry) {
        if (userEntry == 6) {achievementsGrade = 5;}
        else if (userEntry == 5) {achievementsGrade = 4;}
        else if (userEntry >=3) {achievementsGrade = 3;}
        else if (userEntry >= 1) {achievementsGrade = 2;}
        else {achievementsGrade = 1;}
    }
    public void setFinalExamGrade(String userEntry) {
        this.finalExamGrade = userEntry;
    }

    public void setProjectLetterGrade(ArrayList<String> projectsGradeList) {
       this.projectsLetterGrade = projectsGradeList;

    }
    public void setProjectNumberGrade() {
        GradeFormatter gradeFormatter = new GradeFormatter();
        ArrayList<Integer> projectsNumberGrade= new ArrayList<>();
        for (String letterGrade : projectsLetterGrade) {
            projectsNumberGrade.add(gradeFormatter.formatNumberGrade(letterGrade));
        }
        this.projectsNumberGrade = projectsNumberGrade;
    }

    public void removeLowestProjectGrade() {
        ArrayList<Integer> projectsGradeList = projectsNumberGrade;
        int lowestProjectGrade = Collections.min(projectsGradeList.subList(0, 3));
        int lowestGradeIndex = projectsGradeList.subList(0, 3).indexOf(lowestProjectGrade);
        projectsNumberGrade.remove(lowestGradeIndex);
    }

}
