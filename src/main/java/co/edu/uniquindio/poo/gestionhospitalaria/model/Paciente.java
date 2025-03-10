package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class Paciente extends Persona {
    private HistorialMedico historialMedico;
    private LinkedList<Cita> listaCitas;

    public Paciente(String nombre, String apellido, String cedula, Integer edad, HistorialMedico historialMedico, LinkedList<Cita> listaCitas) {
        super(nombre, apellido, cedula, edad);
        this.historialMedico = historialMedico;
        this.listaCitas = listaCitas;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }
    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public LinkedList<Cita> getListaCitas() {
        return listaCitas;
    }
    public void setListaCitas(LinkedList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "historialMedico=" + historialMedico +
                ", listaCitas=" + listaCitas +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                '}';
    }
}