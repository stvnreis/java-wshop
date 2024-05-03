package com.fourdev.wshopbackend.infra.impl.produto.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fourdev.wshopbackend.domain.produto.Produto;
import com.fourdev.wshopbackend.dto.ProdutoDto;
import com.fourdev.wshopbackend.infra.api.empresa.mapper.EmpresaMapper;
import com.fourdev.wshopbackend.infra.api.produto.mapper.ProdutoMapper;

import lombok.RequiredArgsConstructor;

/**
 * @author stevenreis
 * @since 1.0 (02/05/24)
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProdutoMapperImpl implements ProdutoMapper {

    private final EmpresaMapper empresaMapper;

    @Override
    public Produto mapToDomain(ProdutoDto dto) {

        Produto produto = new Produto();

        produto.setIdProduto(dto.getIdProduto());
        produto.setDsProduto(dto.getDsProduto());
        produto.setVlProduto(dto.getVlProduto());

        produto.setEmpresa(this.empresaMapper.mapToDomain(dto.getEmpresa()));

        return produto;
    }

    @Override
    public ProdutoDto mapToDto(Produto input) {

        ProdutoDto produto = new ProdutoDto();

        produto.setIdProduto(input.getIdProduto());
        produto.setDsProduto(input.getDsProduto());
        produto.setVlProduto(input.getVlProduto());

        produto.setEmpresa(this.empresaMapper.mapToDto(input.getEmpresa()));

        return produto;
    }
}
