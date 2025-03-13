package co.edu.uniquindio.poo.gestionhospitalaria.model;

public class Persona {
    public String nombre;
    public String apellido;
    public String id;
    public Integer edad;

    public Persona (String nombre, String apellido, String id, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                '}';
    }
}