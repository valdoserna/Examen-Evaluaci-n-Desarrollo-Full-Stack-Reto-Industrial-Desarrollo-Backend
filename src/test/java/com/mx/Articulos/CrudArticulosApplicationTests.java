package com.mx.Articulos;


import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mx.Articulos.Dominio.Articulos;
import com.mx.Articulos.Service.Implementacion;

@RunWith(SpringRunner.class)
@SpringBootTest
class CrudArticulosApplicationTests {
	@Autowired
	Implementacion imp;
	Articulos articulos = new Articulos();

	@Test
	@Order(1)
	public void Listar() {
		List<Articulos> lista = imp.listar();
		System.out.println("lista de Articulos" + lista);
		assertFalse(lista.isEmpty(), "la lista esta vacia");
	}/*
	
	@Test
	@Order(2)
	public void guardar() {
		articulos.setId(4);
		articulos.setNombre("pinzas");
		articulos.setPrecio(502.50);
		articulos.setStock(15);
		articulos.setUnidad("Pieza");
		imp.guardar(articulos);
	}*/
}
