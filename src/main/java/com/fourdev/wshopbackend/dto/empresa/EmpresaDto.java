package com.fourdev.wshopbackend.dto.empresa;

import com.fourdev.wshopbackend.dto.AbstractDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpresaDto implements AbstractDto {

    private Long idEmpresa;

    private String dsNomeFantasia;

    private String dsRazaoSocial;

    @Override
    public Long getId() {
        return this.idEmpresa;
    }
}
