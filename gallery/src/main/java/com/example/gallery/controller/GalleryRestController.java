package com.example.gallery.controller;

import com.example.gallery.model.Musteri;
import com.example.gallery.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/rest")
public class GalleryRestController {

    @Autowired
    private GalleryService galleryService;

    @RequestMapping(method = RequestMethod.GET,value = "/index")
    @ResponseBody
    public ResponseEntity<List<Musteri>> getMusteriler(){
        List<Musteri> musteriListesi = galleryService.findMusteriler();
        return ResponseEntity.ok(musteriListesi);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index/{id}")
    @ResponseBody
    public ResponseEntity<Musteri> getMusteri(@PathVariable("id") Long id) {
        Musteri musteri = galleryService.findMusteri(id);
        return ResponseEntity.ok(musteri);
    }


}
