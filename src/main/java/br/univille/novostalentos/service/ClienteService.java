package br.univille.novostalentos.service;

import java.util.List;

import br.univille.novostalentos.entity.Cliente;

public interface ClienteService {
    List<Cliente> getAll();
    Cliente save(Cliente cliente);
    Cliente findById(Long id);
    void delete(Long id);
}
