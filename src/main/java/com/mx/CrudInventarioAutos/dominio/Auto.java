package com.mx.CrudInventarioAutos.dominio;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AUTOS")
public class Auto {
	@Id
	@Column
	int id;
	
	
	String modelo;
	
	String marca;
	String color;
	String tipo;
	@Column(name="NUM_PUERTAS")
	int numPuertas;
	int cilindros;
	@Column(name="PRECIO_COMPRA")
	double precioCompra;
	@Column(name="PRECIO_VENTA")
	double precioVenta;
	@Column(name="CANTIDAD_VENTA")
	int cantidadVenta;
	
	double ganancia;
	@JsonFormat(pattern="DD/MM/YY HH:MM:SS",timezone="America/Mexico_City")
	@Column(name="FECHA_VENTA")
	Date fechaVenta;
	
	int inventario;
	
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}


	
	public Auto(int id, String modelo, String marca, String color, String tipo, int numPuertas, int cilindros,
			double precioCompra, double precioVenta, int cantidadVenta, double ganancia, Date fechaVenta,
			int inventario) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
		this.numPuertas = numPuertas;
		this.cilindros = cilindros;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.cantidadVenta = cantidadVenta;
		this.ganancia = ganancia;
		this.fechaVenta = fechaVenta;
		this.inventario = inventario;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public int getCilindros() {
		return cilindros;
	}


	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public int getCantidadVenta() {
		return cantidadVenta;
	}


	public void setCantidadVenta(int cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}


	public double getGanancia() {
		return ganancia;
	}


	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}


	public Date getFechaVenta() {
		return fechaVenta;
	}


	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}


	public int getInventario() {
		return inventario;
	}


	public void setInventario(int inventario) {
		this.inventario = inventario;
	}



	@Override
	public String toString() {
		return "Auto [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", tipo=" + tipo
				+ ", numPuertas=" + numPuertas + ", cilindros=" + cilindros + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", cantidadVenta=" + cantidadVenta + ", ganancia=" + ganancia
				+ ", fechaVenta=" + fechaVenta + ", inventario=" + inventario + "]";
	}
	

	
}
