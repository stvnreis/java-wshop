package com.fourdev.wshopbackend.infra.impl;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.infra.api.AbstractRepository;
import com.fourdev.wshopbackend.infra.api.AbstractService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AbstractServiceImpl<Domain extends AbstractDomain> implements AbstractService<Domain> {

    @Autowired(
            required = false
    )
    protected AbstractRepository<Domain> abstractRepository;

    @Override
    @Transactional
    public void create(Domain entity) {
        this.abstractRepository.create(entity);
    }

    @Override
    public List<Domain> findAll() {
        return this.abstractRepository.findAll();
    }

    @Override
    public Domain findById(Long id) {

        return this.abstractRepository.findById(id);
    }
}
