package com.fourdev.wshopbackend.infra.impl.usuario.repository;

import org.springframework.stereotype.Repository;

import com.fourdev.wshopbackend.domain.usuario.Usuario;
import com.fourdev.wshopbackend.infra.api.usuario.repository.UsuarioRepository;
import com.fourdev.wshopbackend.infra.impl.AbstractRepositoryImpl;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
@Repository
public class UsuarioRepositoryImpl extends AbstractRepositoryImpl<Usuario> implements UsuarioRepository {

}
