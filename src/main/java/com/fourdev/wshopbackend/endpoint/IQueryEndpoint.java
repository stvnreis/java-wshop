package com.fourdev.wshopbackend.endpoint;

import com.fourdev.wshopbackend.dto.AbstractDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IQueryEndpoint<T extends AbstractDto> {

    public ResponseEntity<List<T>> findAll();

    public ResponseEntity<T> findById(Long id);
}
