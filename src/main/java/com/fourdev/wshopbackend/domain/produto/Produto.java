package com.fourdev.wshopbackend.domain.produto;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.domain.categoria.Categoria;
import com.fourdev.wshopbackend.domain.empresa.Empresa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto implements AbstractDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    private String dsProduto;

    private Double vlProduto;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @Override
    public Long getId() {
        return this.idProduto;
    }
}
