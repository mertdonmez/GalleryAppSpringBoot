package com.example.gallery.dao;

import com.example.gallery.model.Musteri;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MusteriRepositoryImpl implements MusteriRepository {

    private Map<Long , Musteri> musteriMap = new HashMap<>();

    public MusteriRepositoryImpl(){
        Musteri musteri1 = new Musteri(1L,"Mert","Donmez");
        Musteri musteri2 = new Musteri(2L,"Ismail","Donmez");

        musteriMap.put(musteri1.getId(),musteri1);
        musteriMap.put(musteri2.getId(),musteri2);

    }


    @Override
    public List<Musteri> findAll() {
        return new ArrayList<>(musteriMap.values());
    }

    @Override
    public Musteri findById(Long id) {
        return musteriMap.get(id);
    }
}
