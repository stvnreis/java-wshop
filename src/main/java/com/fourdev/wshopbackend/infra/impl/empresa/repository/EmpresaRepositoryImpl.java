package com.fourdev.wshopbackend.infra.impl.empresa.repository;

import org.springframework.stereotype.Repository;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.infra.api.empresa.repository.EmpresaRepository;
import com.fourdev.wshopbackend.infra.impl.AbstractRepositoryImpl;

@Repository
public class EmpresaRepositoryImpl extends AbstractRepositoryImpl<Empresa>
        implements EmpresaRepository {
}
