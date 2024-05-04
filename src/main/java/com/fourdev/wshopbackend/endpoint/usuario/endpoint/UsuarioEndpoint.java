package com.fourdev.wshopbackend.endpoint.usuario.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourdev.wshopbackend.domain.usuario.Usuario;
import com.fourdev.wshopbackend.dto.usuario.UsuarioDto;
import com.fourdev.wshopbackend.endpoint.AbstractEndpoint;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
@RestController
@RequestMapping("usuario")
public class UsuarioEndpoint extends AbstractEndpoint<Usuario, UsuarioDto> {

}
