package com.fourdev.wshopbackend.domain.empresa;

import com.fourdev.wshopbackend.domain.AbstractDomain;
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

    @Override
    public Long getId() {
        return this.idEmpresa;
    }
}
