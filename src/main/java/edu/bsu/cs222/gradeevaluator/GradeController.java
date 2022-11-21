package edu.bsu.cs222.gradeevaluator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class GradeController {
    @FXML
    private ChoiceBox assignments_cb;
    @FXML
    private ChoiceBox selfAssesment_cb;
    @FXML
    private ChoiceBox engagement_cb;
    @FXML
    private ChoiceBox achievements_cb;
    @FXML
    private ChoiceBox finalExam_cb;
    @FXML
    private ChoiceBox projectOneFirst_cb;
    @FXML
    private ChoiceBox projectOneSecond_cb;
    @FXML
    private ChoiceBox finalProjectFirst_cb;
    @FXML
    private ChoiceBox finalProjectSecond_cb;
    @FXML
    private ChoiceBox finalProjectThird_cb;

    @FXML
    private Label assignmentsGrade_lb;
    @FXML
    private Label selfAssesmentGrade_lb;
    @FXML
    private Label engagementGrade_lb;
    @FXML
    private Label finalExamGrade_lb;
    @FXML
    private Label achievementsGrade_lb;
    @FXML
    private Label projectsGrade_lb;
    @FXML
    private Label finalGrade_lb;



    @FXML
    protected void buttonClick() {
        checkChoiceBoxes();
    }

    @FXML
    protected void checkChoiceBoxes(){
        if (assignments_cb.getValue() != null && selfAssesment_cb.getValue() != null && engagement_cb.getValue() != null
        && achievements_cb.getValue() != null && finalExam_cb.getValue() != null && projectOneFirst_cb.getValue() != null
        && projectOneSecond_cb.getValue() != null && finalProjectFirst_cb.getValue() != null
        && finalProjectSecond_cb.getValue() != null && finalProjectThird_cb.getValue() !=null) {
            setGrades();
        }
        else {
            choiceBoxError();
        }
    }

    @FXML
    protected void setGrades() {
        Grades grades = new Grades();
        GradeCalculator gradeCalculator = new GradeCalculator();
        grades.setAssignmentsGrade((Integer) assignments_cb.getValue());
        grades.setSelfAssesmentGrade((Integer) selfAssesment_cb.getValue());
        grades.setEngagementGrade((Integer) engagement_cb.getValue());
        grades.setAchievementsGrade((Integer) achievements_cb.getValue());
        grades.setFinalExamGrade((String) finalExam_cb.getValue());

        grades.setProjectLetterGrade(setProjectGradesList());
        grades.setProjectNumberGrade();

        grades.removeLowestProjectGrade();
        gradeCalculator.projectsGradeCalculator();
        gradeCalculator.finalGradeCalculator();

        setGradeLabels();
    }

    @FXML
    protected ArrayList setProjectGradesList() {
        ArrayList<String> projectGradesList = new ArrayList<>();
        projectGradesList.add((String) projectOneFirst_cb.getValue());
        projectGradesList.add((String) projectOneSecond_cb.getValue());
        projectGradesList.add((String) finalProjectFirst_cb.getValue());
        projectGradesList.add((String) finalProjectSecond_cb.getValue());
        projectGradesList.add((String) finalProjectThird_cb.getValue());
        return projectGradesList;
    }

    @FXML
    protected void setGradeLabels() {
        Grades grades = new Grades();
        GradeFormatter gradeFormatter = new GradeFormatter();
        assignmentsGrade_lb.setText(gradeFormatter.formatLetterGrade(grades.assignmentGrade));
        selfAssesmentGrade_lb.setText(gradeFormatter.formatLetterGrade(grades.selfAssesmentGrade));
        engagementGrade_lb.setText(gradeFormatter.formatLetterGrade(grades.engagementGrade));
        achievementsGrade_lb.setText(gradeFormatter.formatLetterGrade(grades.achievementsGrade));
        finalExamGrade_lb.setText(Grades.finalExamGrade);
        projectsGrade_lb.setText(gradeFormatter.formatLetterGrade(Grades.finalProjectsGrade));
        finalGrade_lb.setText(gradeFormatter.formatFinalGrade());
    }

    @FXML
    protected void choiceBoxError() {
        Alert choiceBoxErrorAlert= new Alert(Alert.AlertType.ERROR);
        choiceBoxErrorAlert.setTitle("ChoiceBox Error");
        choiceBoxErrorAlert.setContentText("Please Fill in ALL Choice Boxes!");
        choiceBoxErrorAlert.show();
    }


    @FXML
    protected void initialize() {
        ChoiceBoxes choiceBoxes = new ChoiceBoxes();
        assignments_cb.getItems().addAll(choiceBoxes.addAssignmentsChoices());
        selfAssesment_cb.getItems().addAll(choiceBoxes.addSelfAssignmentChoices());
        engagement_cb.getItems().addAll(choiceBoxes.addEngagementChoices());
        achievements_cb.getItems().addAll(choiceBoxes.addAchievementsChoices());
        finalExam_cb.getItems().addAll(choiceBoxes.addLetterGradeChoices());
        projectOneFirst_cb.getItems().addAll(choiceBoxes.addLetterGradeChoices());
        projectOneSecond_cb.getItems().addAll(choiceBoxes.addLetterGradeChoices());
        finalProjectFirst_cb.getItems().addAll(choiceBoxes.addLetterGradeChoices());
        finalProjectSecond_cb.getItems().addAll(choiceBoxes.addLetterGradeChoices());
        finalProjectThird_cb.getItems().addAll(choiceBoxes.addLetterGradeChoices());

    }

}