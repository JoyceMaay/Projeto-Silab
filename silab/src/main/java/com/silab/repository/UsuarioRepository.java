package com.silab.repository;

import org.springframework.data.repository.CrudRepository;

import com.silab.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}