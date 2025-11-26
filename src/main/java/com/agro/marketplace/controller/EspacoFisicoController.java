package com.agro.marketplace.controller;

import com.agro.marketplace.entities.EspacoFisico;
import com.agro.marketplace.service.EspacoFisicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EspacoFisicoController {

    private final EspacoFisicoService service;

    public EspacoFisicoController(EspacoFisicoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<EspacoFisico>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EspacoFisico> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EspacoFisico> create(@RequestBody EspacoFisico espaco) {
        return ResponseEntity.ok(service.save(espaco));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EspacoFisico> update(@PathVariable Long id, @RequestBody EspacoFisico espaco){
        return service.findById(id)
                .map(existing -> {
                    espaco.setId(id);
                    return ResponseEntity.ok(service.save(espaco));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}