module com.project.uaspbo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.uaspbo to javafx.fxml;
    exports com.project.uaspbo;
}