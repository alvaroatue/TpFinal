module org.example.tpfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.TableTracker to javafx.fxml;
    exports org.example.TableTracker;
}