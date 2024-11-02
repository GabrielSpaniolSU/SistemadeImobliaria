package com.example.sistemadeimobliaria.service;


import com.example.sistemadeimobliaria.dto.ClienteDto;
import com.example.sistemadeimobliaria.model.Cliente;
import com.example.sistemadeimobliaria.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteDto> getAllClientes() {
        return clienteRepository
                .findAll()
                .stream()
                .map(cliente -> ClienteDto
                        .builder()
                        .nome(cliente.getNome())
                        .cpf(cliente.getCpf())
                        .email(cliente.getEmail())
                        .dataCadastro(cliente.getDataCadastro())
                        .telefone(cliente.getTelefone())
                        .endereco(cliente.getEndereco())
                        .build()
                )
        .toList();
    }
}
