package com.fourdev.wshopbackend.infra.impl.usuario.service;

import org.springframework.stereotype.Service;

import com.fourdev.wshopbackend.commons.utils.HashUtils;
import com.fourdev.wshopbackend.domain.usuario.Usuario;
import com.fourdev.wshopbackend.infra.api.usuario.service.UsuarioService;
import com.fourdev.wshopbackend.infra.impl.AbstractServiceImpl;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
@Service
public class UsuarioServiceImpl extends AbstractServiceImpl<Usuario> implements UsuarioService {

    @Override
    public void create(Usuario entity) {

        entity.setDsSenha(HashUtils.hashData(entity.getDsSenha()));

        super.create(entity);
    }
}
