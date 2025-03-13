package co.edu.uniquindio.poo.gestionhospitalaria;

import co.edu.uniquindio.poo.gestionhospitalaria.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import co.edu.uniquindio.poo.gestionhospitalaria.model.Doctor;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.AdministradorViewController;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.CitasViewController;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.CrudDoctorViewController;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.CrudPacienteViewController;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.InicioAdministradorViewController;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.InicioPacienteViewController;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.PacienteViewController;
import co.edu.uniquindio.poo.gestionhospitalaria.viewController.UsuariosViewController;


public class App extends Application {

    private Stage primaryStage;
    @SuppressWarnings("exports")
    public static Hospital hospital = Hospital.getInstancia();

    private Stack<Scene> sceneHistory = new Stack<>();

    @SuppressWarnings("exports")
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("The Covenant Clinic");
        openUsuarios();
    }

    public static void main(String[] args) {
        launch();
    }

    public void openUsuarios() {
        inicializarData();
        try {
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(App.class.getResource("Usuarios.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader1.load(); // Cambiado de VBox a AnchorPane
            UsuariosViewController usuariosViewController = loader1.getController();
            usuariosViewController.setApp(this);

            Scene scene1 = new Scene(rootLayout);
            primaryStage.setScene(scene1);
            primaryStage.show();

        } catch (IOException e) {
            System.err.println("Error al cargar usuarios.fxml");
            e.printStackTrace();
        }
    }

    public void volver() {
        if (!sceneHistory.isEmpty()) {
            Scene previousScene = sceneHistory.pop();
            primaryStage.setScene(previousScene);
            primaryStage.show();
        }
    }

    public void openInicioAdministrador() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("InicioAdministrador.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            InicioAdministradorViewController inicioAdministradorViewController = loader2.getController();
            inicioAdministradorViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openInicioPaciente() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("InicioPaciente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            InicioPacienteViewController inicioPacienteViewController = loader2.getController();
            inicioPacienteViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openPaciente() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("Paciente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            PacienteViewController pacienteViewController = loader2.getController();
            pacienteViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCrudPaciente() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("CRUD-Paciente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            CrudPacienteViewController crudPacienteViewController = loader2.getController();
            crudPacienteViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCrudDoctor() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("CRUD-Doctor.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            CrudDoctorViewController crudDoctorViewController = loader2.getController();
            crudDoctorViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCitas() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("Citas.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            CitasViewController citasViewController = loader2.getController();
            citasViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openAdministrador() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(App.class.getResource("Administrador.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader2.load();
            AdministradorViewController administradorViewController = loader2.getController();
            administradorViewController.setApp(this);

            Scene scene2 = new Scene(rootLayout);
            primaryStage.setScene(scene2);
            primaryStage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void inicializarData() {

        Administrador administrador1 = new Administrador("Andres", "12345");
        /**
        Paciente pacienteOriginal = new Paciente("Juan", "Oduver", "123456789", 30, historial, listaCitas);
        Paciente pacienteOriginal2 = new Paciente("Esteban", "Pérez", "1234567", 19, historial, listaCitas);
        listaPacientes.add(pacienteOriginal);
        listaPacientes.add(pacienteOriginal2);

        Doctor doctor = new Doctor("Ana", "Gómez", "987654321", 40, listaPacientes, listaCitas);

        Cita cita = new Cita("abcd", LocalDate.now(), LocalTime.now(), doctor, pacienteOriginal);
        */
    }
}