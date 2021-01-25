package com.alianza.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alianza.prueba.model.Client;

public interface IClientRepo extends JpaRepository<Client, Integer>{
	
}
