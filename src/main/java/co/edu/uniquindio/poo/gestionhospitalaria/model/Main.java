package co.edu.uniquindio.poo.gestionhospitalaria;

import co.edu.uniquindio.poo.gestionhospitalaria.model.*;
import javafx.application.Application;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        Hospital hospital = Hospital.getInstancia();

        HistorialMedico historial = new HistorialMedico();
        LinkedList<Cita> listaCitas = new LinkedList<>();

        Paciente pacienteOriginal = new Paciente("Juan", "Pérez", "123456789", 30, historial, listaCitas);
        Doctor doctor = new Doctor("Ana", "Gómez", "987654321", 40, "Cardiología");

        Cita cita = new Cita(LocalDateTime.now(), doctor, pacienteOriginal);
        pacienteOriginal.getListaCitas().add(cita);
        Paciente pacienteClon = pacienteOriginal.clone();

        System.out.println("Paciente Original: " + pacienteOriginal);
        System.out.println("Paciente Clon: " + pacienteClon);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
