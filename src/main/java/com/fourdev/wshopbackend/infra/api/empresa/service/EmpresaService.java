package com.fourdev.wshopbackend.infra.api.empresa.service;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.infra.api.AbstractService;

public interface EmpresaService extends AbstractService<Empresa> {

    Empresa findByCnpj(String dsCnpj);
}
