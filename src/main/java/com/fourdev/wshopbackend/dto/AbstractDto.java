package com.fourdev.wshopbackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface AbstractDto {

    @JsonIgnore
    public Long getId();
}
