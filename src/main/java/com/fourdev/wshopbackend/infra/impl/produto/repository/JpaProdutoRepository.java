package com.fourdev.wshopbackend.infra.impl.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fourdev.wshopbackend.domain.produto.Produto;

/**
 * @author stevenreis
 * @since 1.0 (02/05/24)
 */
@Repository
public interface JpaProdutoRepository extends JpaRepository<Produto, Long> {

}
