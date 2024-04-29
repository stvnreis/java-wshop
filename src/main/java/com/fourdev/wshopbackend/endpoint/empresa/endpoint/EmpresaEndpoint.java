package com.fourdev.wshopbackend.endpoint.empresa.endpoint;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.dto.empresa.EmpresaDto;
import com.fourdev.wshopbackend.endpoint.AbstractEndpoint;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empresa")
@AllArgsConstructor(onConstructor_ = @__(@Autowired))
public class EmpresaEndpoint extends AbstractEndpoint<Empresa, EmpresaDto> {
}
