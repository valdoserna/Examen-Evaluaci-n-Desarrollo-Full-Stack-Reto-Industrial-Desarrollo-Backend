package com.mx.Articulos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Articulos.Dominio.Articulos;

public interface ArticulosDao extends JpaRepository<Articulos, Integer> {

}
