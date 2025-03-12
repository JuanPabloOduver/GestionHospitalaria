package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita implements SistemaClonacionCita{
    private String idCita;
    private LocalDate fechaCita;
    private LocalTime horaCita;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(String idCita, LocalDate fechaCita, LocalTime horaCita, Doctor doctor, Paciente paciente) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    @Override
    public Cita clone() {
        return new Cita(this.idCita, this.fechaCita, this.horaCita, this.doctor, this.paciente);
    }

    public String getIdCita() {
        return idCita;
    }
    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHoraCita() {
        return horaCita;
    }
    public void setHoraCita(LocalTime horaCita) {
        this.horaCita = horaCita;
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
                ", fechaCita=" + fechaCita +
                ", horaCita=" + horaCita +
                ", doctor=" + doctor +
                ", paciente=" + paciente +
                '}';
    }
}