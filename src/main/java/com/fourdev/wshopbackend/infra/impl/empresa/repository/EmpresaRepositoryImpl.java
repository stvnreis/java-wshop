package com.fourdev.wshopbackend.infra.impl.empresa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.infra.api.empresa.repository.EmpresaRepository;
import com.fourdev.wshopbackend.infra.impl.AbstractRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmpresaRepositoryImpl extends AbstractRepositoryImpl<Empresa>
        implements EmpresaRepository {

    private final JpaEmpresaRepository jpaEmpresaRepository;

    @Override
    public Empresa findByCnpj(String cnpj) {

        return this.jpaEmpresaRepository.findByCnpj(cnpj);
    }
}
