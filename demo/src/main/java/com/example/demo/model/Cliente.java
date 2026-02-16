package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Cliente {
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    private String telefone;
    private int idade;
    private List<Carro> carros;
}
