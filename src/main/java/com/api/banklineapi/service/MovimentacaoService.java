package com.api.banklineapi.service;

import com.api.banklineapi.dto.NovaMovimentacao;
import com.api.banklineapi.model.Movimentacao;
import com.api.banklineapi.model.MovimentacaoTipo;
import com.api.banklineapi.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository repository;
    public void save (NovaMovimentacao novaMovimentacao){
        Movimentacao movimentacao = new Movimentacao();
        Double valor = novaMovimentacao.getValor();
        if (novaMovimentacao.getTipo() == MovimentacaoTipo.DESPESA){
            valor = valor * -1;}
        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(novaMovimentacao.getDescricao());
        movimentacao.setIdConta(novaMovimentacao.getIdConta());
        movimentacao.setTipo(novaMovimentacao.getTipo());
        movimentacao.setValor(valor);

        repository.save(movimentacao);
    }
}
