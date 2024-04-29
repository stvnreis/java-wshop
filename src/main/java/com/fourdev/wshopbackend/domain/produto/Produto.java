package com.fourdev.wshopbackend.domain.produto;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto implements AbstractDomain {

    @Id
    private Long idProduto;

    private String dsProduto;

    private Double vlProduto;

    @Override
    public Long getId() {
        return this.idProduto;
    }
}
