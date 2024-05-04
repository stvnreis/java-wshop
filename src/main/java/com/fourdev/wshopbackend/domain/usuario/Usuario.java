package com.fourdev.wshopbackend.domain.usuario;

import com.fourdev.wshopbackend.domain.AbstractDomain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario implements AbstractDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String dsUsuario;

    private String dsNome;

    @Column(unique = true, nullable = false, length = 36)
    private String cdUsuarioExterno;

    @Column(nullable = false)
    private String dsSenha;

    @Override
    public Long getId() {

        return this.idUsuario;
    }
}
