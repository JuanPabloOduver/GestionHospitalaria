module co.edu.uniquindio.poo.gestionhospitalaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.poo.gestionhospitalaria to javafx.fxml;
    exports co.edu.uniquindio.poo.gestionhospitalaria.viewController;
    exports co.edu.uniquindio.poo.gestionhospitalaria.controller;
    exports co.edu.uniquindio.poo.gestionhospitalaria.model;
    opens co.edu.uniquindio.poo.gestionhospitalaria.viewController to javafx.fxml;
    exports co.edu.uniquindio.poo.gestionhospitalaria;
    opens co.edu.uniquindio.poo.gestionhospitalaria.model to javafx.fxml;
}