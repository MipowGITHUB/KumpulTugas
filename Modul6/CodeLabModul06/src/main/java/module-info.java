module com.main.codelabmodul06 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.codelabmodul06 to javafx.fxml;
    exports com.main.codelabmodul06;
}