package com.fourdev.wshopbackend.infra.impl.usuario.mapper;

import static java.util.Objects.isNull;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.fourdev.wshopbackend.domain.usuario.Usuario;
import com.fourdev.wshopbackend.dto.usuario.UsuarioDto;
import com.fourdev.wshopbackend.infra.api.usuario.mapper.UsuarioMapper;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario mapToDomain(UsuarioDto dto) {

        Usuario usuario = new Usuario();

        usuario.setIdUsuario(dto.getId());
        usuario.setDsUsuario(dto.getDsUsuario());
        usuario.setDsNome(dto.getDsNome());
        usuario.setDsSenha(dto.getDsSenha());
        usuario.setCdUsuarioExterno(isNull(dto.getCdUsuarioExterno()) ? UUID.randomUUID().toString() : dto.getCdUsuarioExterno());

        return usuario;
    }

    @Override
    public UsuarioDto mapToDto(Usuario input) {

        UsuarioDto usuario = new UsuarioDto();

        usuario.setIdUsuario(input.getId());
        usuario.setDsUsuario(input.getDsUsuario());
        usuario.setDsNome(input.getDsNome());
        usuario.setCdUsuarioExterno(input.getCdUsuarioExterno());

        return usuario;
    }
}
