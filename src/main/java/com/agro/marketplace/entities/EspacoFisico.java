package com.agro.marketplace.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "espaco_fisico")
public class EspacoFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String local;
    private Integer capacidade;

    public EspacoFisico() {

    }

    public EspacoFisico(Long id, String nome, String local, Integer capacidade) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
}
