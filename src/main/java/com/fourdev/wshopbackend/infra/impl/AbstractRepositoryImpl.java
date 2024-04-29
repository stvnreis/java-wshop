package com.fourdev.wshopbackend.infra.impl;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.infra.api.AbstractRepository;
import com.fourdev.wshopbackend.infra.impl.empresa.repository.JpaEmpresaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class AbstractRepositoryImpl<T extends AbstractDomain> implements AbstractRepository<T> {

    protected JpaRepository jpaRepository;

    public AbstractRepositoryImpl(JpaRepository repository) {
        this.jpaRepository = repository;
    }

    @Override
    public void create(T entity) {
        this.jpaRepository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) this.jpaRepository.findAll();
    }

    @Override
    public T findById(Long id) {
        return (T) this.jpaRepository.findById(id).orElse(null);
    }
}
