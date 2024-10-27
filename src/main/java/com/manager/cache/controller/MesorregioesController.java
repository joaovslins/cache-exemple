package com.manager.cache.controller;

import com.manager.cache.dto.LocalidadeDTO;
import com.manager.cache.service.MesorregioesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MesorregioesController {

    @Autowired
    private MesorregioesService service;


    @GetMapping("/mesorregioes")
    public List<LocalidadeDTO> getMesorregioes() {
        return service.getMesorregioes();
    }

    @GetMapping("/mesorregioes-update")
    public List<LocalidadeDTO> updateMesorregioes() {
        return service.updateMesorregioes();
    }
}
