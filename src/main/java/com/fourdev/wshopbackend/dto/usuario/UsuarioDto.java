package com.fourdev.wshopbackend.dto.usuario;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fourdev.wshopbackend.dto.AbstractDto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
@Getter
@Setter
public class UsuarioDto implements AbstractDto {

    private Long idUsuario;

    private String dsUsuario;

    private String dsNome;

    private String cdUsuarioExterno;

    private String dsSenha;

    @JsonIgnore
    @Override
    public Long getId() {

        return this.idUsuario;
    }

    @JsonIgnore
    public String getDsSenha() {
        return this.dsSenha;
    }

    @JsonProperty
    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }
}
