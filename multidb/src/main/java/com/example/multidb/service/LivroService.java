package com.example.multidb.service;

import java.util.List;

import com.example.multidb.model.app.Livro;

public interface LivroService {

	public List<Livro> obterLivros();

	public Livro criar(Livro livro);

}
