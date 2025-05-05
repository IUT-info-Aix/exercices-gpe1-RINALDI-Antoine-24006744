open module tp.intro.javafx {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;
    exports com.example.partiel;
    exports com.example.partie2;
    //opens com.example.partie3 to javafx.fxml;
    exports com.example.partie3;
}
