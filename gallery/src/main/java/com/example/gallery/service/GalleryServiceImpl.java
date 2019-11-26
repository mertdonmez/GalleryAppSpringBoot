package com.example.gallery.service;

import com.example.gallery.dao.MusteriRepository;
import com.example.gallery.model.Musteri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService {

    private MusteriRepository musteriRepository;

    @Autowired
    public void setMusteriRepository(MusteriRepository musteriRepository){
        this.musteriRepository = musteriRepository;
    }

    @Override
    public List<Musteri> findMusteriler() {
        return musteriRepository.findAll();
    }

    @Override
    public Musteri findMusteri(Long id) {
        Musteri musteri = musteriRepository.findById(id);
        return musteri;
    }
}
