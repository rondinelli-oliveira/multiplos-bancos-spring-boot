package com.example.multidb.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multidb.model.auth.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}