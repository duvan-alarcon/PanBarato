package com.example.duvan.panbarato;

import java.util.ArrayList;
import java.util.List;

public class Panaderias {
    String name, description, adres;

    public Panaderias(String name, String description, String adres) {
        this.name = name;
        this.description = description;
        this.adres = adres;
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

    public List<Panaderias> getPanaderias() {
        return panaderiasArrayList;
    }

    public void setPanaderias(List<Panaderias> panaderias) {
        this.panaderiasArrayList = panaderias;
    }

    List<Panaderias> panaderiasArrayList;

    private void initializeData() {
        panaderiasArrayList = new ArrayList<>();
        //panaderias.add(new Panaderias(String Rname, String Rdescription, String address));
        panaderiasArrayList.add(new Panaderias("Buen pan", "El mejor pan de la ciudad", "Centro comercial los molinos"));
    }

}