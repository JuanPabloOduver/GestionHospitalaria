package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.time.LocalTime;
import java.util.LinkedList;

public interface GestorConfiguracionHospital {
    public LocalTime horarioAtencionInicio = null;
    public LocalTime horarioAtencionFin = null;
    public Integer maxPacientesMedico = null;
    public LinkedList<String> reglasFacturacion = new LinkedList<String>();
}