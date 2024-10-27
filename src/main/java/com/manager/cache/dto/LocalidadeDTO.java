package com.manager.cache.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LocalidadeDTO implements Serializable {
    private Long id;
    private String nome;
    private UFDTO uf;
}
