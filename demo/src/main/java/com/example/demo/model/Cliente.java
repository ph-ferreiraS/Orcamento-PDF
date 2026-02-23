package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Entity
@Getter
@Setter
@ToString
public class Cliente {
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    private String telefone;
    private int idade;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Carro> carros;
}
