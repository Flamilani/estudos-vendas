package com.project.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.vendas.DTO.ClienteDTO;
import com.project.vendas.entities.Cliente;
import com.project.vendas.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<ClienteDTO> findAll() {
		List<Cliente> res = clienteRepository.findAll();
		return res.stream().map(c-> new ClienteDTO(c)).collect(Collectors.toList());
	}



	
}
