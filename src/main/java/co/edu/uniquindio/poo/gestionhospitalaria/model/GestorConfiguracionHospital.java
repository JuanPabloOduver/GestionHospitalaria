package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.time.LocalTime;
import java.util.LinkedList;

public class GestorConfiguracionHospital {
    private static GestorConfiguracionHospital instancia;
    private LocalTime horarioAtencionInicio;
    private LocalTime horarioAtencionFin;
    private Integer maxPacientesMedico;
    private LinkedList<String> reglasFacturacion;

    private GestorConfiguracionHospital() {
        this.reglasFacturacion = new LinkedList<>();
    }

    public static GestorConfiguracionHospital getInstancia() {
        if (instancia == null) {
            instancia = new GestorConfiguracionHospital();
        }
        return instancia;
    }

    public LocalTime getHorarioAtencionInicio() {
        return horarioAtencionInicio;
    }
    public void setHorarioAtencionInicio(LocalTime horarioAtencionInicio) {
        this.horarioAtencionInicio = horarioAtencionInicio;
    }

    public LocalTime getHorarioAtencionFin() {
        return horarioAtencionFin;
    }
    public void setHorarioAtencionFin(LocalTime horarioAtencionFin) {
        this.horarioAtencionFin = horarioAtencionFin;
    }

    public Integer getMaxPacientesMedico() {
        return maxPacientesMedico;
    }
    public void setMaxPacientesMedico(Integer maxPacientesMedico) {
        this.maxPacientesMedico = maxPacientesMedico;
    }

    public LinkedList<String> getReglasFacturacion() {
        return reglasFacturacion;
    }
    public void agregarReglaFacturacion(String regla) {
        this.reglasFacturacion.add(regla);
    }
    public void eliminarReglaFacturacion(String regla) {
        this.reglasFacturacion.remove(regla);
    }
}