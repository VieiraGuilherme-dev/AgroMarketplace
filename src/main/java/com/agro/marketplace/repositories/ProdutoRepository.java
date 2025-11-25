package com.agro.marketplace.repositories;

import com.agro.marketplace.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
