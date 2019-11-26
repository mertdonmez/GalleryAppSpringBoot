package com.example.gallery.model;

import java.util.HashSet;
import java.util.Set;

public class Musteri {

    public Long id;
    public String adi;
    public String soyadi;
    public Set<Araba> araba = new HashSet<Araba>();

    public Musteri(){

    }

    public Musteri(Long id, String adi, String soyadi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Set<Araba> getAraba() {
        return araba;
    }

    public void setAraba(Set<Araba> araba) {
        this.araba = araba;
    }

    @Override
    public String toString() {
        return  "Musteri [id=" + id + ", adi=" + adi + ", soyAdi=" + soyadi + "]";
    }
}
