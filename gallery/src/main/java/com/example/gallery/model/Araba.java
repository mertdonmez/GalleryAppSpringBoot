package com.example.gallery.model;

import java.sql.Date;

public class Araba {

    private Long id;
    private String model;
    private Date modelYil;
    private Musteri musteri;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Date getModelYil() {
        return modelYil;
    }
    public void setModelYil(Date modelYil) {
        this.modelYil = modelYil;
    }
    public Musteri getMusteri() {
        return musteri;
    }
    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }
    @Override
    public String toString() {
        return "Araba [id=" + id + ", com.example.gallery.model=" + model + ", modelYil=" + modelYil + ", musteri=" + musteri
                + "]";
    }

}
