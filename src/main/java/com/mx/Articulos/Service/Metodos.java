package com.mx.Articulos.Service;

import java.util.List;

import com.mx.Articulos.Dominio.Articulos;

public interface Metodos {

	void guardar(Articulos articulos);

	void editar(Articulos articulos);

	void eliminar(Articulos articulos);

	Articulos buscar(Articulos articulos);

	List<Articulos> listar();

}
