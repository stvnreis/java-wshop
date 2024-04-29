package com.fourdev.wshopbackend.endpoint;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.dto.AbstractDto;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface IPostEndpoint<T extends AbstractDomain, E extends AbstractDto> {

    public ResponseEntity<Map<String, Object>> create(E dto);
}
