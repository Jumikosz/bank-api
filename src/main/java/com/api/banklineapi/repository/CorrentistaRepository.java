package com.api.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository <Correntista, Integer> {

}
