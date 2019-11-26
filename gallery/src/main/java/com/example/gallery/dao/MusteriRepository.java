package com.example.gallery.dao;

import com.example.gallery.model.Musteri;

import java.util.List;

public interface MusteriRepository {

    List<Musteri> findAll();
    Musteri findById(Long id);

}
