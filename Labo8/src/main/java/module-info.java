module org.example.labo8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.labo8 to javafx.fxml;
    exports org.example.labo8;
}