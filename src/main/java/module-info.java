module edu.voiciehb.yetanothercalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.voiciehb.yetanothercalculator to javafx.fxml;
    exports edu.voiciehb.yetanothercalculator;
}