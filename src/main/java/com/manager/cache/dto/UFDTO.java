package com.manager.cache.dto;

import lombok.Data;

@Data
public class UFDTO {
    private Long id;
    private String sigla;
    private String nome;
    private RegiaoDTO regiao;
}
