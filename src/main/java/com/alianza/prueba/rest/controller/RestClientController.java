package com.alianza.prueba.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alianza.prueba.model.Client;
import com.alianza.prueba.repository.IClientRepo;

@RestController
@RequestMapping("/client")
public class RestClientController {
	
	@Autowired
	private IClientRepo repo;
	
	@GetMapping
	public List<Client> listar() {
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Client cli) {
		repo.save(cli);
	}

}
