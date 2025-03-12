package co.edu.uniquindio.poo.gestionhospitalaria.model;

import java.util.LinkedList;

public class Doctor extends Persona {
    private LinkedList<Paciente> listaPacientes;
    private LinkedList<Cita> listaCitas;
    private LinkedList<Medicamento> listaMedicamentos;
    private LinkedList<Enfermedad> listaEnfermedades;

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

    /**
     * Agrega un medicamento si este no existe
     *
     * @param medicamento
     * @return mensaje indicando si fue añadido o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarMedicamento(Medicamento medicamento) throws IllegalArgumentException {
        String respuesta = "El medicamento se añadió correctamente";
        if (medicamento == null) {
            throw new IllegalArgumentException("El medicamento no puede ser nulo");
        }
        Medicamento medicamentoAux = BuscarMedicamento(medicamento.getNombreMedicamento());
        if (medicamentoAux == null) {
            listaMedicamentos.add(medicamento);
        } else {
            respuesta = "Este medicamento ya existe";
        }
        return respuesta;
    }

    /**
     * Busca un medicamento mediante su nombre en la lista de medicamentos
     *
     * @param nombreMedicamento
     * @return el medicamento si es encontrado o null en caso contrario
     */
    public Medicamento BuscarMedicamento(String nombreMedicamento) {
        return listaMedicamentos.stream()
                .filter(medicamentoAux -> medicamentoAux.getNombreMedicamento().equals(nombreMedicamento))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina un medicamento siempre y cuando este exista en la lista
     *
     * @param medicamento
     * @return un mensaje indicando si fue eliminado o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarMedicamento(Medicamento medicamento) throws IllegalArgumentException {
        String respuesta = "El medicamento se eliminó correctamente";
        if (medicamento == null) {
            throw new IllegalArgumentException("El medicamento no puede ser nulo");
        }
        Medicamento medicamentoAux = BuscarMedicamento(medicamento.getNombreMedicamento());
        if (medicamentoAux != null) {
            listaMedicamentos.remove(medicamento);
        } else {
            respuesta = "Este medicamento no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza un medicamento de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     *
     * @param medicamento
     * @param medicamentoActualizado
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarMedicamento(Medicamento medicamento, Medicamento medicamentoActualizado) throws IllegalArgumentException {
        String respuesta = "El medicamento ha sido actualizado";

        if (medicamento == null || medicamentoActualizado == null) {
            throw new IllegalArgumentException("El medicamento no puede ser nulo");
        }
        Medicamento medicamentoAux = BuscarMedicamento(medicamento.getNombreMedicamento());
        if (medicamentoAux != null) {
            listaMedicamentos.remove(medicamento);
            listaMedicamentos.add(medicamentoActualizado);
        } else {
            respuesta = "Este medicamento no existe";
        }
        return respuesta;
    }


    /**
     * Agrega una enfermedad si esta no existe
     *
     * @param enfermedad
     * @return mensaje indicando si fue añadida o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarEnfermedad(Enfermedad enfermedad) throws IllegalArgumentException {
        String respuesta = "La enfermedad se añadió correctamente";
        if (enfermedad == null) {
            throw new IllegalArgumentException("La enfermedad no puede ser nula");
        }
        Enfermedad enfermedadAux = BuscarEnfermedad(enfermedad.getNombreEnfermedad());
        if (enfermedadAux == null) {
            listaEnfermedades.add(enfermedad);
        } else {
            respuesta = "Esta enfermedad ya existe";
        }
        return respuesta;
    }

    /**
     * Busca una enfermedad mediante su nombre en la lista de enfermedades
     *
     * @param nombreEnfermedad
     * @return la enfermedad si es encontrada o null en caso contrario
     */
    public Enfermedad BuscarEnfermedad(String nombreEnfermedad) {
        return listaEnfermedades.stream()
                .filter(enfermedadAux -> enfermedadAux.getNombreEnfermedad().equals(nombreEnfermedad))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina una enfermedad siempre y cuando esta exista en la lista
     *
     * @param enfermedad
     * @return un mensaje indicando si fue eliminada o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarEnfermedad(Enfermedad enfermedad) throws IllegalArgumentException {
        String respuesta = "La enfermedad se eliminó correctamente";
        if (enfermedad == null) {
            throw new IllegalArgumentException("La enfermedad no puede ser nula");
        }
        Enfermedad enfermedadAux = BuscarEnfermedad(enfermedad.getNombreEnfermedad());
        if (enfermedadAux != null) {
            listaEnfermedades.remove(enfermedad);
        } else {
            respuesta = "Esta enfermedad no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza una enfermedad de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     *
     * @param enfermedad
     * @param enfermedadActualizada
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarEnfermedad(Enfermedad enfermedad, Enfermedad enfermedadActualizada) throws IllegalArgumentException {
        String respuesta = "La enfermedad ha sido actualizada";

        if (enfermedad == null || enfermedadActualizada == null) {
            throw new IllegalArgumentException("La enfermedad no puede ser nula");
        }
        Enfermedad enfermedadAux = BuscarEnfermedad(enfermedad.getNombreEnfermedad());
        if (enfermedadAux != null) {
            listaEnfermedades.remove(enfermedad);
            listaEnfermedades.add(enfermedadActualizada);
        } else {
            respuesta = "Esta enfermedad no existe";
        }
        return respuesta;
    }
}