package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
    private static Hospital instancia;

    private String nombre;
    private LinkedList<Paciente> listaPacientes;
    private LinkedList<Doctor> listaDoctores;
    private LinkedList<Cita> listaCitas;
    private LinkedList<Administrador> listaAdministradores;

    private Hospital() {
        this.nombre = "The Covenant Clinic";
        this.listaPacientes = new LinkedList<>();
        this.listaDoctores = new LinkedList<>();
        this.listaCitas = new LinkedList<>();
        this.listaAdministradores = new LinkedList<>();
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

    public LinkedList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }
    public void setListaAdministradores(LinkedList<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
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
        Paciente pacienteAux = BuscarPaciente(paciente.getId());
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
     * @param id
     * @return el paciente si es encontrado o null en caso contrario
     */
    public Paciente BuscarPaciente(String id) {
        return listaPacientes.stream()
                .filter(pacienteAux -> pacienteAux.getId().equals(id))
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
        Paciente pacienteAux = BuscarPaciente(paciente.getId());
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
        Paciente pacienteAux = BuscarPaciente(paciente.getId());
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
        Doctor doctorAux = BuscarDoctor(doctor.getId());
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
     * @param id
     * @return el doctor si es encontrado o null en caso contrario
     */
    public Doctor BuscarDoctor(String id) {
        return listaDoctores.stream()
                .filter(doctorAux -> doctorAux.getId().equals(id))
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
        Doctor doctorAux = BuscarDoctor(doctor.getId());
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
        Doctor doctorAux = BuscarDoctor(doctor.getId());
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

    public List<Cita> listarCitasPorFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        return listaCitas.stream()
                .filter(cita -> cita.getFechaCita().equals(fecha))
                .collect(Collectors.toList());
    }

    /**
     * Obtiene una lista de pacientes cuyos nombres son palíndromos.
     *
     * @return Lista de pacientes con nombres palíndromos.
     */
    public List<Paciente> obtenerPacientesConNombresPalindromos() {
        return listaPacientes.stream()
                .filter(paciente -> esPalindromo(paciente.getNombre()))
                .collect(Collectors.toList());
    }

    /**
     * Verifica si una cadena es un palíndromo (ignorando mayúsculas y espacios).
     *
     * @param nombre Cadena a evaluar.
     * @return true si es un palíndromo, false en caso contrario.
     */
    private boolean esPalindromo(String nombre) {
        String limpio = nombre.replaceAll("\\s+", "").toLowerCase();
        return limpio.equals(new StringBuilder(limpio).reverse().toString());
    }

    public List<Paciente> obtenerPacientesConDosVocalesIguales() {
        return listaPacientes.stream()
                .filter(paciente -> tieneDosVocalesIguales(paciente.getNombre()))
                .collect(Collectors.toList());
    }

    private boolean tieneDosVocalesIguales(String nombre) {
        String nombreLower = nombre.toLowerCase();
        String vocales = "aeiou";
        for (char vocal : vocales.toCharArray()) {
            if (nombreLower.chars().filter(ch -> ch == vocal).count() >= 2) {
                return true;
            }
        }
        return false;
    }
}