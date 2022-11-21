package edu.bsu.cs222.gradeevaluator;

import java.util.ArrayList;

public class ChoiceBoxes {
    public ArrayList<Integer> addAssignmentsChoices() {
        ArrayList<Integer> assignmentChoices = new ArrayList<>();
        int assignmentListSize = assignmentChoices.size();
        while (assignmentListSize < 8) {
            assignmentChoices.add(assignmentListSize++);
        }
        return assignmentChoices;
    }
    public ArrayList<Integer> addSelfAssignmentChoices() {
        ArrayList<Integer> selfAssignmentChoices = new ArrayList<>();
        int selfAssignmentListSize = selfAssignmentChoices.size();
        while (selfAssignmentListSize < 2) {
            selfAssignmentChoices.add(selfAssignmentListSize++);
        }
        return selfAssignmentChoices;
    }
    public ArrayList<Integer> addEngagementChoices() {
        ArrayList<Integer> engagementChoices = new ArrayList<>();
        int engagementListSize = engagementChoices.size();
        while (engagementListSize < 46) {
            engagementChoices.add(engagementListSize++);
        }
        return engagementChoices;
    }
    public ArrayList<Integer> addAchievementsChoices() {
        ArrayList<Integer> achievementChoices = new ArrayList<>();
        int achievementListSize = achievementChoices.size();
        while (achievementListSize < 7) {
            achievementChoices.add(achievementListSize++);
        }
        return achievementChoices;
    }
    public ArrayList<String> addLetterGradeChoices() {
        ArrayList<String> finalExamChoices = new ArrayList<>();
        finalExamChoices.add("A");
        finalExamChoices.add("B");
        finalExamChoices.add("C");
        finalExamChoices.add("D");
        finalExamChoices.add("F");
        return finalExamChoices;
    }
}
