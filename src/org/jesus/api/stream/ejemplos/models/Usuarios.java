package org.jesus.api.stream.ejemplos.models;

public class Usuarios {
    private String nombre;
    private String apellido;
    private Integer id;
    public static int ultimoId = 0;
    
    public Usuarios(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() { return nombre + " " + apellido; }

}
