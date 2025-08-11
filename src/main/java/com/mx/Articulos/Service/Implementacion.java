package com.mx.Articulos.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Articulos.Dao.ArticulosDao;
import com.mx.Articulos.Dominio.Articulos;

@Service // contiene la lógica de negocio de la aplicación
public class Implementacion implements Metodos {

	@Autowired//inyeccion de dependencias
	ArticulosDao dao;

	@Override
	public void guardar(Articulos articulos) {
		dao.save(articulos);
		System.out.println("Se guardo el articulo");
		// TODO Auto-generated method stub

	}

	@Override
	public void editar(Articulos articulos) {
		dao.save(articulos);
		System.out.println("Se edito el articulo");
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Articulos articulos) {
		dao.delete(articulos);
		System.out.println("Se elimino el articulo");
		// TODO Auto-generated method stub

	}

	@Override
	public Articulos buscar(Articulos articulos) {
		// TODO Auto-generated method stub
		return dao.findById(articulos.getId()).orElse(null);
	}

	@Override
	public List<Articulos> listar() {
		// TODO Auto-generated method stub
		return (List<Articulos>) dao.findAll();
	}

}
