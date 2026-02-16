package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class Orcamento {
    private boolean completo;
    private boolean polimento;
    private boolean pintura;
    private boolean desconto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "orcamento")
    private Carro carro;

    private int prazo;
    private String descricao;
    private String pecas;
    private BigDecimal preco;
    private LocalDateTime dateTime;
}
