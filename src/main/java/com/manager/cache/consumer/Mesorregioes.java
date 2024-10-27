package com.manager.cache.consumer;

import com.manager.cache.dto.LocalidadeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "mesorregioesData", url = "https://servicodados.ibge.gov.br/api/v1/localidades/mesorregioes")
public interface Mesorregioes {


    @GetMapping
    List<LocalidadeDTO> getMesorregioes();
}
