package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.time.LocalDate;

public class Enfermedad {
    private String nombreEnfermedad;
    private LocalDate fechaDiagnostico;

    public Enfermedad(String nombreEnfermedad, LocalDate fechaDiagnostico) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }
    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public LocalDate getFechaDiagnostico() {
        return fechaDiagnostico;
    }
    public void setFechaDiagnostico(LocalDate fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "nombreEnfermedad='" + nombreEnfermedad + '\'' +
                ", fechaDiagnostico=" + fechaDiagnostico +
                '}';
    }
}