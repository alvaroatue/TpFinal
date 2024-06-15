module org.example.TpFinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    opens org.example.TableTracker to javafx.fxml;
    exports org.example.TableTracker;
    exports org.example.TableTracker.Controllers;
    exports org.example.TableTracker.Controllers.Admin;
    exports org.example.TableTracker.Controllers.Mesero;
    exports org.example.TableTracker.Models;
    exports org.example.TableTracker.Views;
}