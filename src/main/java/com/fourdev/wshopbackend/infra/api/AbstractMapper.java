package com.fourdev.wshopbackend.infra.api;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.dto.AbstractDto;

import java.util.ArrayList;
import java.util.List;

public interface AbstractMapper<Domain extends AbstractDomain, Dto extends AbstractDto> {

    Domain mapToDomain(Dto dto);

    Dto mapToDto(Domain domain);

    default List<Dto> mapListToDto(List<Domain> domainList) {
        List<Dto> dtoList = new ArrayList<>();
        for (Domain item : domainList) {
            dtoList.add(this.mapToDto(item));
        }
        return dtoList;
    }

    default List<Domain> mapListToDomain(List<Dto> dtoList) {
        List<Domain> domainList = new ArrayList<>();
        for (Dto item : dtoList) {
            domainList.add(this.mapToDomain(item));
        }
        return domainList;
    }
}
