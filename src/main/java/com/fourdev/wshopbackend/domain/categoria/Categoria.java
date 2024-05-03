package com.fourdev.wshopbackend.domain.categoria;

import java.util.List;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.domain.produto.Produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author stevenreis
 * @since 1.0 (02/05/24)
 */
@Getter
@Setter
@Entity
@Table(name = "categoria")
public class Categoria implements AbstractDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    private String dsCategoria;

    @OneToMany
    private List<Produto> produtos;

    @Override
    public Long getId() {

        return this.idCategoria;
    }
}
