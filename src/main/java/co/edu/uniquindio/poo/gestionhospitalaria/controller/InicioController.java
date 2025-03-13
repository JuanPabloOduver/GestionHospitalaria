package co.edu.uniquindio.poo.gestionhospitalaria.controller;

import co.edu.uniquindio.poo.gestionhospitalaria.model.Hospital;

public class InicioController {

    private Hospital hospital;

    public InicioController(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital getHospital() {
        return hospital;
    }
}