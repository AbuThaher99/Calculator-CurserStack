module com.example.datastructureprojecttwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastructureprojecttwo to javafx.fxml;
    exports com.example.datastructureprojecttwo;
}