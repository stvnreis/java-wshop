package com.fourdev.wshopbackend.endpoint.empresa.endpoint;

import static java.util.Objects.nonNull;

import com.fourdev.wshopbackend.domain.empresa.Empresa;
import com.fourdev.wshopbackend.dto.empresa.EmpresaDto;
import com.fourdev.wshopbackend.endpoint.AbstractEndpoint;
import com.fourdev.wshopbackend.infra.api.empresa.service.EmpresaService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empresa")
@AllArgsConstructor(onConstructor_ = @__(@Autowired))
public class EmpresaEndpoint extends AbstractEndpoint<Empresa, EmpresaDto> {

    private final EmpresaService empresaService;

    @GetMapping("cnpj/{cnpj}")
    public ResponseEntity<EmpresaDto> getEmpresaByCnpj(@PathVariable String cnpj) {

        EmpresaDto empresa = this.abstractMapper.mapToDto(this.empresaService.findByCnpj(cnpj));

        return nonNull(empresa) ? ok(empresa) : noContent();
    }
}
