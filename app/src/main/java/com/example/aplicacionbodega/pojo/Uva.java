package com.example.aplicacionbodega.pojo;

public class Uva {
    public String nombre;
    public String variedad;
    public String fecha;
    public int cantidad;

    public Uva(String nombre, String variedad, String fecha, int cantidad) {
        this.nombre = nombre;
        this.variedad = variedad;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Uva{" +
                "nombre='" + nombre + '\'' +
                ", variedad='" + variedad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
