package com.fourdev.wshopbackend.infra.impl.empresa.mapper;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.dto.empresa.EmpresaDto;
import com.fourdev.wshopbackend.infra.api.empresa.mapper.EmpresaMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpresaMapperImpl implements EmpresaMapper {

    @Override
    public Empresa mapToDomain(EmpresaDto dto) {

        Empresa empresa = new Empresa();

        empresa.setIdEmpresa(dto.getIdEmpresa());
        empresa.setDsNomeFantasia(dto.getDsNomeFantasia());
        empresa.setDsRazaoSocial(dto.getDsRazaoSocial());

        return empresa;
    }

    @Override
    public EmpresaDto mapToDto(Empresa input) {

        EmpresaDto empresaDto = new EmpresaDto();

        empresaDto.setIdEmpresa(input.getIdEmpresa());
        empresaDto.setDsNomeFantasia(input.getDsNomeFantasia());
        empresaDto.setDsRazaoSocial(input.getDsRazaoSocial());

        return empresaDto;
    }
}
