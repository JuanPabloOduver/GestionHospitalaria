package co.edu.uniquindio.poo.gestionhospitalaria.model;

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
        LinkedList<Paciente> listaPacientes = new LinkedList<>();

        Paciente pacienteOriginal = new Paciente("Juan", "Oduver", "123456789", 30, historial, listaCitas);
        Paciente pacienteOriginal2 = new Paciente("Esteban", "Pérez", "1234567", 19, historial, listaCitas);
        listaPacientes.add(pacienteOriginal);
        listaPacientes.add(pacienteOriginal2);

        Doctor doctor = new Doctor("Ana", "Gómez", "987654321", 40, listaPacientes, listaCitas);

        Cita cita = new Cita("abcd", LocalDateTime.now(), doctor, pacienteOriginal);

        pacienteOriginal.getListaCitas().add(cita);
        Paciente pacienteClon = pacienteOriginal.clone();

        System.out.println("Paciente Original: " + pacienteOriginal);
        System.out.println("Paciente Clon: " + pacienteClon);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
