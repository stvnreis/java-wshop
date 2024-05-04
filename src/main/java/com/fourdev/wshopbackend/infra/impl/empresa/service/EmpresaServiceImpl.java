package com.fourdev.wshopbackend.infra.impl.empresa.service;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.infra.api.empresa.repository.EmpresaRepository;
import com.fourdev.wshopbackend.infra.api.empresa.service.EmpresaService;
import com.fourdev.wshopbackend.infra.impl.AbstractServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor_ = @__(@Autowired))
public class EmpresaServiceImpl extends AbstractServiceImpl<Empresa>
        implements EmpresaService {

    private final EmpresaRepository empresaRepository;

    @Override
    public Empresa findByCnpj(String dsCnpj) {

        return this.empresaRepository.findByCnpj(dsCnpj);
    }
}
