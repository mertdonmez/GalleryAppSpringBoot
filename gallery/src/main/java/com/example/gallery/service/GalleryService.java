package com.example.gallery.service;

import com.example.gallery.model.Musteri;

import java.util.List;

public interface GalleryService {

    List<Musteri> findMusteriler();
    Musteri findMusteri(Long id);


}
