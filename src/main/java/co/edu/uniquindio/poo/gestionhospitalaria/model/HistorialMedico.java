package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class HistorialMedico {
    private LinkedList<Medicamento> listaMedicamentos;
    private LinkedList<Enfermedad> listaEnfermedades;

    public HistorialMedico(LinkedList<Medicamento> listaMedicamentos, LinkedList<Enfermedad> listaEnfermedades) {
        this.listaMedicamentos = listaMedicamentos;
        this.listaEnfermedades = listaEnfermedades;
    }

    public LinkedList<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }
    public void setListaMedicamentos(LinkedList<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public LinkedList<Enfermedad> getListaEnfermedades() {
        return listaEnfermedades;
    }
    public void setListaEnfermedades(LinkedList<Enfermedad> listaEnfermedades) {
        this.listaEnfermedades = listaEnfermedades;
    }

    @Override
    public String toString() {
        return "HistorialMedico{" +
                "listaMedicamentos=" + listaMedicamentos +
                ", listaEnfermedades=" + listaEnfermedades +
                '}';
    }
}