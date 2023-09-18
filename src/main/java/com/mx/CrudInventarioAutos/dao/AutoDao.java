package com.mx.CrudInventarioAutos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.CrudInventarioAutos.dominio.Auto;
import java.util.List;


@Repository
public interface AutoDao extends CrudRepository<Auto,Integer>{
	//buscar por modelo
	public List<Auto> findByModelo(String modelo);
	
	// listar por marca
	public List<Auto> findAllByMarca(String marca);
	
	//eliminar
	public void delete(Auto auto);
	
	/*
	 * 
	 * 
	 * */
	
	
}
