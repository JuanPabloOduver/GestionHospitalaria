package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.time.LocalDateTime;

public class Cita {
    private String idCita;
    private LocalDateTime fechaHoraCita;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(String idCita, LocalDateTime fechaCita, Doctor doctor, Paciente paciente) {
        this.idCita = idCita;
        this.fechaHoraCita = fechaCita;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public String getIdCita() {
        return idCita;
    }
    public void setIdCita(String idCita) {
        this.idCita = idCita;
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
                "idCita='" + idCita + '\'' +
                ", fechaHoraCita=" + fechaHoraCita +
                ", doctor=" + doctor +
                ", paciente=" + paciente +
                '}';
    }
}