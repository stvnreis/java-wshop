package com.fourdev.wshopbackend.endpoint;

import com.fourdev.wshopbackend.commons.AbstractMapper;
import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.dto.AbstractDto;
import com.fourdev.wshopbackend.infra.api.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.*;

public abstract class AbstractEndpoint<T extends AbstractDomain, E extends AbstractDto> implements IPostEndpoint<T, E>, IQueryEndpoint<E> {
    @Autowired
    protected AbstractMapper abstractMapper;
    @Autowired
    protected AbstractService abstractService;

    @Override
    @PostMapping
    public ResponseEntity<Map<String, Object>> create(@RequestBody E dto) {
        try {
            this.abstractService.create(this.abstractMapper.mapToDomain((E) dto));

            return this.created("Cadastro realizado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping
    public ResponseEntity<List<E>> findAll() {
        List<T> data = (List<T>) this.abstractService.findAll();
        return new ResponseEntity<>((List<E>) this.abstractMapper.mapList(data), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<E> findById(@PathVariable("id") Long id) {
        T data = (T) this.abstractService.findById(id);
        return new ResponseEntity<>((E) this.abstractMapper.mapToDto(data), HttpStatus.OK);
    }

    protected ResponseEntity<E> ok(E data) {
        return new ResponseEntity<>(data, OK);
    }

    protected ResponseEntity<Map<String, Object>> created(String message) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        return new ResponseEntity<>(map, CREATED);
    }
}
