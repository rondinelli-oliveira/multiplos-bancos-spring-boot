package com.example.multidb.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.multidb.model.app.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
