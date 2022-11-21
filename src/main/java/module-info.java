module edu.bsu.cs222.gradeevaluator {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.bsu.cs222.gradeevaluator to javafx.fxml;
    exports edu.bsu.cs222.gradeevaluator;
}