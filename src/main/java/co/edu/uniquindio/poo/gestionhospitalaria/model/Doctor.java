package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class Doctor extends Persona {
    private LinkedList<Paciente> listaPacientes;
    private LinkedList<Cita> listaCitas;

    public Doctor(String nombre, String apellido, String cedula, Integer edad, LinkedList<Paciente> listaPacientes, LinkedList<Cita> listaCitas) {
        super(nombre, apellido, cedula, edad);
        this.listaPacientes = listaPacientes;
        this.listaCitas = listaCitas;
    }

    public LinkedList<Paciente> getListaPacientes() {
        return listaPacientes;
    }
    public void setListaPacientes(LinkedList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public LinkedList<Cita> getListaCitas() {
        return listaCitas;
    }
    public void setListaCitas(LinkedList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "listaPacientes=" + listaPacientes +
                ", listaCitas=" + listaCitas +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                '}';
    }
}