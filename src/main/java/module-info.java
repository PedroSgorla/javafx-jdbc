module com.learning.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.learning.javafxjdbc to javafx.fxml;
    exports com.learning.javafxjdbc;
}