module be.exercice.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;

    opens be.exercice.calculatrice to javafx.fxml;
    exports be.exercice.calculatrice;
}
