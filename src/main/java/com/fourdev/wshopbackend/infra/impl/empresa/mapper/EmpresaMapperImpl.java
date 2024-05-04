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
        empresa.setDsCnpj(dto.getDsCnpj());

        return empresa;
    }

    @Override
    public EmpresaDto mapToDto(Empresa domain) {

        EmpresaDto empresaDto = new EmpresaDto();

        empresaDto.setIdEmpresa(domain.getIdEmpresa());
        empresaDto.setDsNomeFantasia(domain.getDsNomeFantasia());
        empresaDto.setDsRazaoSocial(domain.getDsRazaoSocial());
        empresaDto.setDsCnpj(domain.getDsCnpj());

        return empresaDto;
    }
}
