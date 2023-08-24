package io.github.wekers.vendasapp.repository;

import io.github.wekers.vendasapp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
