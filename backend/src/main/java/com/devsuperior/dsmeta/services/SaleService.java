package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

//anotação para tornar a classe como componente do sistema
@Service
public class SaleService {

	//método para acessar o banco de dados
	@Autowired
	private SaleRepository repository;
	
	//buscar as vendas dentro do banco de dados
	public List<Sale> findSales() {
		return repository.findAll();
	}
	
}
