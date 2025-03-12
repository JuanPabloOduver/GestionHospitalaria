package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class HistorialMedico implements  SistemaClonacionHistorialMedico{
    private LinkedList<Medicamento> listaMedicamentos;
    private LinkedList<Enfermedad> listaEnfermedades;

    public HistorialMedico() {
        this.listaMedicamentos = new LinkedList<>();
        this.listaEnfermedades = new LinkedList<>();
    }

    public HistorialMedico(LinkedList<Medicamento> listaMedicamentos, LinkedList<Enfermedad> listaEnfermedades) {
        this.listaMedicamentos = new LinkedList<>(listaMedicamentos);
        this.listaEnfermedades = new LinkedList<>(listaEnfermedades);
    }

    @Override
    public HistorialMedico clone() {
        LinkedList<Medicamento> medicamentosClonados = new LinkedList<>();
        for (Medicamento m : listaMedicamentos) {
            medicamentosClonados.add(m.clone()); // Clonando cada medicamento
        }

        LinkedList<Enfermedad> enfermedadesClonadas = new LinkedList<>();
        for (Enfermedad e : listaEnfermedades) {
            enfermedadesClonadas.add(e.clone()); // Clonando cada enfermedad
        }

        return new HistorialMedico(medicamentosClonados, enfermedadesClonadas);
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