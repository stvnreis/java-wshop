package com.fourdev.wshopbackend.dto;

import com.fourdev.wshopbackend.dto.empresa.EmpresaDto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author stevenreis
 * @since 1.0 (02/05/24)
 */
@Getter
@Setter
public class ProdutoDto implements AbstractDto {

    private Long idProduto;

    private String dsProduto;

    private EmpresaDto empresa;

    private Double vlProduto;

    @Override
    public Long getId() {

        return this.idProduto;
    }
}
