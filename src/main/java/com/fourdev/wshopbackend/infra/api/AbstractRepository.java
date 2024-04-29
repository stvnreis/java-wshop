package com.fourdev.wshopbackend.infra.api;

import com.fourdev.wshopbackend.domain.AbstractDomain;

import java.util.List;

public interface AbstractRepository<T extends AbstractDomain> {

    public void create(T entity);

    public List<T> findAll();

    public T findById(Long id);
}
