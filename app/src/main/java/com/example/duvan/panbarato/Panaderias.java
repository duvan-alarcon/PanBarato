package com.example.duvan.panbarato;

import java.util.ArrayList;
import java.util.List;

public class Panaderias {
    String id, name, description, adres, ciudad;

    public Panaderias() {
    }

    public Panaderias(String id, String name, String description, String adres, String ciudad) {
        this.id= id;
        this.name = name;
        this.description = description;
        this.adres = adres;
        this.ciudad = ciudad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }



}