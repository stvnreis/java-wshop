package com.fourdev.wshopbackend.infra.impl.produto.repository;

import org.springframework.stereotype.Repository;

import com.fourdev.wshopbackend.domain.produto.Produto;
import com.fourdev.wshopbackend.infra.api.produto.repository.ProdutoRepository;
import com.fourdev.wshopbackend.infra.impl.AbstractRepositoryImpl;

/**
 * @author stevenreis
 * @since 1.0 (02/05/24)
 */
@Repository
public class ProdutoRepositoryImpl extends AbstractRepositoryImpl<Produto> implements ProdutoRepository {

}
