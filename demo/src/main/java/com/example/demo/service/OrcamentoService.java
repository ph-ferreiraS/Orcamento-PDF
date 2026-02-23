package com.example.demo.service;

import com.example.demo.model.Orcamento;
import com.example.demo.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class OrcamentoService {

    private final OrcamentoRepository orcamentoRepository;

    public OrcamentoService(OrcamentoRepository orcamentoRepository) {
        this.orcamentoRepository = orcamentoRepository;
    }

    public Orcamento salvarNovoOrcamento(Orcamento orcamento) {
        // O valor (BigDecimal preco) já vem preenchido pelo usuário no site

        // Regra: Garantir que a data do orçamento seja a do momento atual
        orcamento.setDateTime(LocalDateTime.now());

        // Aqui você pode adicionar uma validação simples
        if (orcamento.getPreco() == null) {
            throw new RuntimeException("O valor do orçamento deve ser preenchido manualmente!");
        }

        // Salva no MySQL através do Repository
        return orcamentoRepository.save(orcamento);
    }
}