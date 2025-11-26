package com.agro.marketplace.controller;

import com.agro.marketplace.entities.EspacoFisico;
import com.agro.marketplace.service.EspacoFisicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class EspacoFisicoController {

    private final EspacoFisicoService service;

    public EspacoFisicoController (EspacoFisicoService service){
        this.service=service;
    }

    @GetMapping
    public ResponseEntity<List<EspacoFisicoService>> getAll(){
        return ResponseEntity.ok(service.findAll());
    }

    public ResponseEntity<EspacoFisico> getById(@PathVariable Long id){
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
