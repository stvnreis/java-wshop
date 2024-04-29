package com.fourdev.wshopbackend.infra.impl.empresa.repository;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.infra.api.empresa.repository.EmpresaRepository;
import com.fourdev.wshopbackend.infra.impl.AbstractRepositoryImpl;
import org.springframework.stereotype.Component;

@Component
public class EmpresaRepositoryImpl extends AbstractRepositoryImpl<Empresa>
        implements EmpresaRepository {

    public EmpresaRepositoryImpl(JpaEmpresaRepository repository) {
        super(repository);
    }
}
