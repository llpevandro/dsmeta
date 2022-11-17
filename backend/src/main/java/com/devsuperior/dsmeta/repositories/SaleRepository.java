package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//componente responsável por acessar o banco de dados. Buscar venda, CRUD...
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
