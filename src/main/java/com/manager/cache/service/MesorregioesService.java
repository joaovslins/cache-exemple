package com.manager.cache.service;

import com.manager.cache.consumer.Mesorregioes;
import com.manager.cache.dto.LocalidadeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

import java.util.List;

@Service
public class MesorregioesService {

    @Autowired
    private Mesorregioes mesorregioes;

    @Cacheable("mesorregioes")
    public List<LocalidadeDTO> getMesorregioes(){
        return this.updateMesorregioes();
    }

    @CachePut("mesorregioes")
    public List<LocalidadeDTO> updateMesorregioes() {
        return mesorregioes.getMesorregioes();
    }
}
