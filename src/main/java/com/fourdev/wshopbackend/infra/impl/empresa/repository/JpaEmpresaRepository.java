package com.fourdev.wshopbackend.infra.impl.empresa.repository;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmpresaRepository extends JpaRepository<Empresa, Long> {
}