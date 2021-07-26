package io.github.giovanicaf.autenticacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.giovanicaf.autenticacao.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
