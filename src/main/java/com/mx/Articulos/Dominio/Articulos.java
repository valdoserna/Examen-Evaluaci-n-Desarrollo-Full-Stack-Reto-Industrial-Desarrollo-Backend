package com.mx.Articulos.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Articulos")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Data
public class Articulos {
	@Id
	@Column(name = "ID_Articulo")
	private int id;
	private String nombre;
	private double precio;
	private int stock;
	private String unidad;

	@Override
	public String toString() {
		return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", unidad="
				+ unidad + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

}
