package com.agro.marketplace.service;

import com.agro.marketplace.entities.EspacoFisico;
import com.agro.marketplace.repositories.EspacoFisicoRepository;

import java.util.List;
import java.util.Optional;

public class EspacoFisicoService {

    private final EspacoFisicoRepository repository;

    public EspacoFisicoService(EspacoFisicoRepository repository){
        this.repository = repository;
    }

    public List<EspacoFisico> findAll(){
        return repository.findAll();
    }

    public Optional<EspacoFisico> findById(Long id){
        return repository.findById(id);
    }

    public EspacoFisico save(EspacoFisico espaco){
        return repository.save(espaco);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
