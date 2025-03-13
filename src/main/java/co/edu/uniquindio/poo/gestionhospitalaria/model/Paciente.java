package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class Paciente extends Persona implements SistemaClonacionPaciente {
    private HistorialMedico historialMedico;
    private LinkedList<Cita> listaCitas;

    public Paciente(String nombre, String apellido, String id, Integer edad, HistorialMedico historialMedico, LinkedList<Cita> listaCitas) {
        super(nombre, apellido, id, edad);
        this.historialMedico = historialMedico;
        this.listaCitas = new LinkedList<>(listaCitas);
    }

    @Override
    public Paciente clone() {
        HistorialMedico historialClonado = this.historialMedico.clone();
        LinkedList<Cita> citasClonadas = new LinkedList<>(this.listaCitas);
        return new Paciente(this.getNombre(), this.getApellido(), this.getId(),
                this.getEdad(), historialClonado, citasClonadas);
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }
    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public LinkedList<Cita> getListaCitas() {
        return new LinkedList<>(listaCitas);
    }
    public void setListaCitas(LinkedList<Cita> listaCitas) {
        this.listaCitas = new LinkedList<>(listaCitas);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "historialMedico=" + historialMedico +
                ", listaCitas=" + listaCitas +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", id='" + getId() + '\'' +
                ", edad=" + getEdad() +
                '}';
    }
}