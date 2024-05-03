package com.fourdev.wshopbackend.infra.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.infra.api.AbstractRepository;

public class AbstractRepositoryImpl<T extends AbstractDomain> implements AbstractRepository<T> {

    @Autowired(
            required = false
    )
    protected JpaRepository<T, Long> jpaRepository;

    public AbstractRepositoryImpl() {}

    @Override
    public void create(T entity) {
        this.jpaRepository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return this.jpaRepository.findAll();
    }

    @Override
    public T findById(Long id) {
        return this.jpaRepository.findById(id).orElse(null);
    }
}
