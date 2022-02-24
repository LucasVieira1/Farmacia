package com.example.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lojagames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	List<Produto> findByPrecoBetween(BigDecimal inicio, BigDecimal fim);
	
	List<Produto> findAllByNomeContainingIgnoreCaseAndLaboratorioContainingIgnoreCase(String nome, String laboratorio);
	
//	List<Produto> findUserByNameList(@Param("names") Collection<String> names);
	
	/*
	 * Desafio 
	 * consulta preço inicial e preço final, e aparecer o que estiver entre(BEETWEN) 
	 * consulta que busque por nome e laboratorio
	 */
}
