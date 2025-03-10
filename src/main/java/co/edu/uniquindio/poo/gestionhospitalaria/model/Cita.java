package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.time.LocalDateTime;

public class Cita {
    private LocalDateTime fechaHoraCita;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(LocalDateTime fechaCita, Doctor doctor, Paciente paciente) {
        this.fechaHoraCita = fechaCita;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public LocalDateTime getFechaHoraCita() {
        return fechaHoraCita;
    }
    public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fechaHoraCita=" + fechaHoraCita +
                ", doctor=" + doctor +
                ", paciente=" + paciente +
                '}';
    }
}