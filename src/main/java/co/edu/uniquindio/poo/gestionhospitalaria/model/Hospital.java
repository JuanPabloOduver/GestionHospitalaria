package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class Hospital {
    private static Hospital instancia;

    private String nombre;
    private LinkedList<Paciente> listaPacientes;
    private LinkedList<Doctor> listaDoctores;
    private LinkedList<Cita> listaCitas;

    private Hospital() {
        this.nombre = "Coveland ";
        this.listaPacientes = new LinkedList<>();
        this.listaDoctores = new LinkedList<>();
        this.listaCitas = new LinkedList<>();
    }

    public static Hospital getInstancia() {
        if (instancia == null) {
            instancia = new Hospital();
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public LinkedList<Cita> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(LinkedList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public static void setInstancia(Hospital instancia) {
        Hospital.instancia = instancia;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
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

    /**
     * Agrega una cita si esta no existe
     *
     * @param cita
     * @return mensaje indicando si fue añadida o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarCita(Cita cita) throws IllegalArgumentException {
        String respuesta = "La cita se añadió correctamente";
        if (cita == null) {
            throw new IllegalArgumentException("La cita no puede ser nula");
        }
        Cita citaAux = BuscarCita(cita.getIdCita());
        if (citaAux == null) {
            listaCitas.add(cita);
        } else {
            respuesta = "Esta cita ya existe";
        }
        return respuesta;
    }

    /**
     * Busca una cita mediante su nombre en la lista de citaes
     *
     * @param nombreCita
     * @return la cita si es encontrada o null en caso contrario
     */
    public Cita BuscarCita(String nombreCita) {
        return listaCitas.stream()
                .filter(citaAux -> citaAux.getIdCita().equals(nombreCita))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina una cita siempre y cuando esta exista en la lista
     *
     * @param cita
     * @return un mensaje indicando si fue eliminada o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarCita(Cita cita) throws IllegalArgumentException {
        String respuesta = "La cita se eliminó correctamente";
        if (cita == null) {
            throw new IllegalArgumentException("La cita no puede ser nula");
        }
        Cita citaAux = BuscarCita(cita.getIdCita());
        if (citaAux != null) {
            listaCitas.remove(cita);
        } else {
            respuesta = "Esta cita no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza una cita de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     *
     * @param cita
     * @param citaActualizada
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarCita(Cita cita, Cita citaActualizada) throws IllegalArgumentException {
        String respuesta = "La cita ha sido actualizada";

        if (cita == null || citaActualizada == null) {
            throw new IllegalArgumentException("La cita no puede ser nula");
        }
        Cita citaAux = BuscarCita(cita.getIdCita());
        if (citaAux != null) {
            listaCitas.remove(cita);
            listaCitas.add(citaActualizada);
        } else {
            respuesta = "Esta cita no existe";
        }
        return respuesta;
    }
}