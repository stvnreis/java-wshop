package com.fourdev.wshopbackend.endpoint;

import static java.util.Objects.isNull;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fourdev.wshopbackend.commons.AbstractMapper;
import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.dto.AbstractDto;
import com.fourdev.wshopbackend.infra.api.AbstractService;

public abstract class AbstractEndpoint<Domain extends AbstractDomain, Dto extends AbstractDto> implements IPostEndpoint<Domain, Dto>, IQueryEndpoint<Dto> {
    @Autowired(
            required = false
    )
    protected AbstractMapper<Domain, Dto> abstractMapper;
    @Autowired(
            required = false
    )
    protected AbstractService<Domain> abstractService;

    @Override
    @PostMapping
    public ResponseEntity<Map<String, Object>> create(@RequestBody Dto dto) {
        try {
            this.abstractService.create(this.abstractMapper.mapToDomain(dto));

            return this.created("Cadastro realizado com sucesso!");
        } catch (Exception e) {
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Dto>> findAll() {
        List<Domain> data = this.abstractService.findAll();
        return new ResponseEntity<>(this.abstractMapper.mapList(data), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Dto> findById(@PathVariable("id") Long id) {
        Domain data = this.abstractService.findById(id);
        return isNull(data) ? noContent() : ok(this.abstractMapper.mapToDto(data));
    }

    protected ResponseEntity<Dto> ok(Dto data) {
        return new ResponseEntity<>(data, OK);
    }

    protected ResponseEntity<Dto> noContent() {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    protected ResponseEntity<Map<String, Object>> created(String message) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        return new ResponseEntity<>(map, CREATED);
    }
}
