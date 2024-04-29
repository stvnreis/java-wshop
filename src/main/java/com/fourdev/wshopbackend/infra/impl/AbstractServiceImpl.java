package com.fourdev.wshopbackend.infra.impl;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.infra.api.AbstractRepository;
import com.fourdev.wshopbackend.infra.api.AbstractService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AbstractServiceImpl<T extends AbstractDomain> implements AbstractService<T> {

    @Autowired
    protected AbstractRepository abstractRepository;

    @Override
    @Transactional
    public void create(T entity) {
        this.abstractRepository.create(entity);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) this.abstractRepository.findAll();
    }

    @Override
    public T findById(Long id) {

        return (T) this.abstractRepository.findById(id);
    }
}
