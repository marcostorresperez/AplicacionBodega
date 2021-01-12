package com.example.aplicacionbodega.pojo;

import java.io.Serializable;

public class Usuario implements Serializable {

    private int id;
    private String nombre;
    private String apellidos;
    private String clave;
    private String email;

    public Usuario(int id, String nombre, String apellidos, String clave, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", clave='" + clave + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
