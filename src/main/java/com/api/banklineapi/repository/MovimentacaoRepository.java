package com.api.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository <Movimentacao, Integer> {

}
