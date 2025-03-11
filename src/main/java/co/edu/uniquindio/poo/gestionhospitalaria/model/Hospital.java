package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class Hospital {
    private LinkedList<Paciente> listaPacientes;
    private LinkedList<Doctor> listaDoctores;

    public Hospital(LinkedList<Paciente> listaPacientes, LinkedList<Doctor> listaDoctores) {
        this.listaPacientes = listaPacientes;
        this.listaDoctores = listaDoctores;
    }

    public LinkedList<Paciente> getListaPacientes() {
        return listaPacientes;
    }
    public void setListaPacientes(LinkedList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public LinkedList<Doctor> getListaDoctores() {
        return listaDoctores;
    }
    public void setListaDoctores(LinkedList<Doctor> listaDoctores) {
        this.listaDoctores = listaDoctores;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "listaPacientes=" + listaPacientes +
                ", listaDoctores=" + listaDoctores +
                '}';
    }

    /**
     * Agrega un paciente si este no existe
     *
     * @param paciente
     * @return mensaje indicando si fue añadido o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarPaciente(Paciente paciente) throws IllegalArgumentException {
        String respuesta = "El paciente se añadió correctamente";
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        Paciente pacienteAux = BuscarPaciente(paciente.getCedula());
        if (pacienteAux == null) {
            listaPacientes.add(paciente);
        } else {
            respuesta = "Este paciente ya existe";
        }
        return respuesta;
    }

    /**
     * Busca un paciente mediante su cédula en la lista de pacientes
     *
     * @param cedula
     * @return el paciente si es encontrado o null en caso contrario
     */
    public Paciente BuscarPaciente(String cedula) {
        return listaPacientes.stream()
                .filter(pacienteAux -> pacienteAux.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina un paciente siempre y cuando este exista en la lista
     *
     * @param paciente
     * @return un mensaje indicando si fue eliminado o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarPaciente(Paciente paciente) throws IllegalArgumentException {
        String respuesta = "El paciente se eliminó correctamente";
        if (paciente == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        Paciente pacienteAux = BuscarPaciente(paciente.getCedula());
        if (pacienteAux != null) {
            listaPacientes.remove(paciente);
        } else {
            respuesta = "Este paciente no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza un paciente de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     *
     * @param paciente
     * @param pacienteActualizado
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarPaciente(Paciente paciente, Paciente pacienteActualizado) throws IllegalArgumentException {
        String respuesta = "El paciente ha sido actualizado";

        if (paciente == null || pacienteActualizado == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        Paciente pacienteAux = BuscarPaciente(paciente.getCedula());
        if (pacienteAux != null) {
            listaPacientes.remove(paciente);
            listaPacientes.add(pacienteActualizado);
        } else {
            respuesta = "Este paciente no existe";
        }
        return respuesta;
    }

    /**
     * Agrega un doctor si este no existe
     *
     * @param doctor
     * @return mensaje indicando si fue añadido o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarDoctor(Doctor doctor) throws IllegalArgumentException {
        String respuesta = "El doctor se añadió correctamente";
        if (doctor == null) {
            throw new IllegalArgumentException("El doctor no puede ser nulo");
        }
        Doctor doctorAux = BuscarDoctor(doctor.getCedula());
        if (doctorAux == null) {
            listaDoctores.add(doctor);
        } else {
            respuesta = "Este doctor ya existe";
        }
        return respuesta;
    }

    /**
     * Busca un doctor mediante su cédula en la lista de doctors
     *
     * @param cedula
     * @return el doctor si es encontrado o null en caso contrario
     */
    public Doctor BuscarDoctor(String cedula) {
        return listaDoctores.stream()
                .filter(doctorAux -> doctorAux.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina un doctor siempre y cuando este exista en la lista
     *
     * @param doctor
     * @return un mensaje indicando si fue eliminado o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarDoctor(Doctor doctor) throws IllegalArgumentException {
        String respuesta = "El doctor se eliminó correctamente";
        if (doctor == null) {
            throw new IllegalArgumentException("El doctor no puede ser nulo");
        }
        Doctor doctorAux = BuscarDoctor(doctor.getCedula());
        if (doctorAux != null) {
            listaDoctores.remove(doctor);
        } else {
            respuesta = "Este doctor no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza un doctor de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     *
     * @param doctor
     * @param doctorActualizado
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarDoctor(Doctor doctor, Doctor doctorActualizado) throws IllegalArgumentException {
        String respuesta = "El doctor ha sido actualizado";

        if (doctor == null || doctorActualizado == null) {
            throw new IllegalArgumentException("El doctor no puede ser nulo");
        }
        Doctor doctorAux = BuscarDoctor(doctor.getCedula());
        if (doctorAux != null) {
            listaDoctores.remove(doctor);
            listaDoctores.add(doctorActualizado);
        } else {
            respuesta = "Este doctor no existe";
        }
        return respuesta;
    }
}