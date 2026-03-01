package com.example.demo.controller;

import com.example.demo.model.Orcamento;
import com.example.demo.service.OrcamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orcamentos") //nome da página, tem que bater com o .http
public class OrcamentoController {
    private final OrcamentoService orcamentoService; // final, para não permitir alteração depois de definido

    public OrcamentoController(OrcamentoService orcamentoService) {
        this.orcamentoService = orcamentoService; //construtor para a injetar a dependência, se não ficaria null
    }

    @PostMapping
    public ResponseEntity<Orcamento> criar(@RequestBody Orcamento orcamento) { //<> generics, está recebendo o tipo Orcamento (classe do model)
            Orcamento orcamentoSalvo = orcamentoService.salvarNovoOrcamento(orcamento); //persistido, service salva no DB e devolve
            return ResponseEntity.ok(orcamentoSalvo);//esse orcamentoSalvo vai possuir o id que foi gerado pelo DB
    }
}