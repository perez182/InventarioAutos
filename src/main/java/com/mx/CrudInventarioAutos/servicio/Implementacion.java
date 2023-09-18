package com.mx.CrudInventarioAutos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudInventarioAutos.dao.AutoDao;
import com.mx.CrudInventarioAutos.dominio.Auto;

@Service
public class Implementacion implements Metodos {
	@Autowired
	AutoDao dao;

	@Override
	public void guardarP(Auto auto) {
		dao.save(auto);
	}

	@Override
	public Auto guardarF(Auto auto) {	
		return dao.save(auto);
	}

	@Override
	public void editar(Auto auto) {
		dao.save(auto);
	}

	@Override
	public void eliminar(Auto auto) {
		dao.delete(auto);	
	}
	
	public void eliminarNombre(Auto auto) {
		for(Auto a:listar()) {
			if(a.getModelo().equals(auto.getModelo())) {
				dao.delete(a);
			}
		}
	}

	@Override
	public Auto buscar(Auto auto) {
		// TODO Auto-generated method stub
		return dao.findById(auto.getId()).orElseThrow(()->new RuntimeException("No existe el auto"));
	}

	public Auto buscar_null(Auto auto) {
		// TODO Auto-generated method stub
		return dao.findById(auto.getId()).orElse(null);
	}
	
	@Override
	public List<Auto> listaMarca(Auto auto) {
	
		return dao.findAllByMarca(auto.getMarca());
	}

	@Override
	public List<Auto> listar() {
		// TODO Auto-generated method stub
		return (List<Auto>) dao.findAll();
	}

	@Override
	public void ventas(Auto auto) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean existAuto(Auto auto) {
		return false;
	}
	
	
	
}
