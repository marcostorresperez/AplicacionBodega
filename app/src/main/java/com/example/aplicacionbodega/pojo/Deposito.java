package com.example.aplicacionbodega.pojo;

import java.util.ArrayList;

public class Deposito {
    public int id;
    public int capacidad;
    public int stock;
    public ArrayList<Uva> listaUvas;

    public Deposito(int id, int capacidad, int stock, ArrayList<Uva> listaUvas) {
        this.id = id;
        this.capacidad = capacidad;
        this.stock = stock;
        this.listaUvas = listaUvas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Uva> getListaUvas() {
        return listaUvas;
    }

    public void setListaUvas(ArrayList<Uva> listaUvas) {
        this.listaUvas = listaUvas;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                ", stock=" + stock +
                ", listaUvas=" + listaUvas +
                '}';
    }
}
