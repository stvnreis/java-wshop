package com.fourdev.wshopbackend.infra.impl.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.infra.sql.postgres.empresa.EmpresaSelectSql;

@Repository
public interface JpaEmpresaRepository extends JpaRepository<Empresa, Long> {

    @Override
    @Query(
            value = EmpresaSelectSql.select_all_empresa,
            nativeQuery = true
    )
    List<Empresa> findAll();

    @Query(
            value = EmpresaSelectSql.select_empresa_by_cnpj,
            nativeQuery = true
    )
    Empresa findByCnpj(@Param("ra_cnpj") String dsCnpj);
}