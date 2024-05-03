package com.fourdev.wshopbackend.domain.empresa;

import java.util.List;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.domain.produto.Produto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "empresa")
public class Empresa implements AbstractDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    private String dsNomeFantasia;

    private String dsRazaoSocial;

    @OneToMany
    private List<Produto> produtos;

    @Override
    public Long getId() {
        return this.idEmpresa;
    }
}
