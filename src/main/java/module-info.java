module org.example.tpfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
   /// requires java.sql;
    requires org.xerial.sqlitejdbc;
    opens org.example.TableTracker to javafx.fxml;
    exports org.example.TableTracker;
    exports org.example.TableTracker.Controllers;
    exports org.example.TableTracker.Controllers.Admin;
    exports org.example.TableTracker.Controllers.Mesero;
    exports org.example.TableTracker.Models;
    exports org.example.TableTracker.Views;
}