package com.agro.marketplace.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "produtos")
public class Produto {

    @Id
    private Long id;

    private String nome;
    private String tipo;
    private Double preco;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "produtor_id")
    private Usuario produtor;


}
