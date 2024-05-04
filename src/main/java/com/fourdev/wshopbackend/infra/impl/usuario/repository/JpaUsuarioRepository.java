package com.fourdev.wshopbackend.infra.impl.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fourdev.wshopbackend.domain.usuario.Usuario;

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
@Repository
public interface JpaUsuarioRepository extends JpaRepository<Usuario, Long> {

}
