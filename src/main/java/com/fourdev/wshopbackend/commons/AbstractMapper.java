package com.fourdev.wshopbackend.commons;

import com.fourdev.wshopbackend.domain.AbstractDomain;
import com.fourdev.wshopbackend.dto.AbstractDto;

import java.util.ArrayList;
import java.util.List;

public interface AbstractMapper<I extends AbstractDomain, O extends AbstractDto> {

    public I mapToDomain(O dto);

    public O mapToDto(I input);

    public default List<O> mapList(List<I> inputList) {
        List<O> outputList = new ArrayList<>();
        for (I item : inputList) {
            outputList.add(this.mapToDto(item));
        }
        return outputList;
    }
}
