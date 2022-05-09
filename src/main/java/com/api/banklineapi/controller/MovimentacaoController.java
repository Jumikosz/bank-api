package com.api.banklineapi.controller;

import com.api.banklineapi.dto.NovaMovimentacao;
import com.api.banklineapi.dto.NovoCorrentista;
import com.api.banklineapi.model.Correntista;
import com.api.banklineapi.model.Movimentacao;
import com.api.banklineapi.repository.CorrentistaRepository;
import com.api.banklineapi.repository.MovimentacaoRepository;
import com.api.banklineapi.service.CorrentistaService;
import com.api.banklineapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao) {
        service.save(movimentacao);
    }
}
