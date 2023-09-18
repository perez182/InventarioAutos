package com.mx.CrudInventarioAutos.servicio;

import java.util.List;

import com.mx.CrudInventarioAutos.dominio.Auto;

public interface Metodos {
	public void guardarP(Auto auto);
	public Auto guardarF(Auto auto);
	
	public void editar(Auto auto);
	public void eliminar(Auto auto);
	public Auto buscar(Auto auto);
	
	public List<Auto> listaMarca(Auto auto);
	
	public List<Auto> listar();
	
	public void ventas(Auto auto);
	
	
	
	
	
}
