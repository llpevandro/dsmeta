package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		//métodos pra tratar o erro de datas informadas vazias, colocando mindate como 1 ano atrás e maxdate data atual
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()); //data dia de hoje
		
		
		//convertendo as strings de data em LocalDate do java
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, pageable);
	}
	
}
