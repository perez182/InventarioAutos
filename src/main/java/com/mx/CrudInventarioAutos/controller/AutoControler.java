package com.mx.CrudInventarioAutos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudInventarioAutos.dao.AutoDao;
import com.mx.CrudInventarioAutos.dominio.Auto;
import com.mx.CrudInventarioAutos.servicio.Implementacion;

@RestController
@CrossOrigin
@RequestMapping(path="api/webservice")
public class AutoControler {
	
	@Autowired
	AutoDao dao;
	
	@Autowired
	Implementacion imp;
	
	@GetMapping(path="bienvenidos")
	public String bienvenidos() {
		return "Bienvenidos a la web service";
	}
	
	
	@GetMapping(path="bienvenidosa")
	public ResponseEntity<String> bienvenidosa() {
		String mensaje = "Bienvenidos";
		return new ResponseEntity<String>(mensaje,HttpStatus.OK);
		
	}
	
	@RequestMapping(path="listarDao")
	public List<Auto> listarDao(){
		List<Auto> autos=(List<Auto>) dao.findAll();
		System.out.println(autos);
		return autos;
	}
	
	//url -> http://localhost:9001/api/webservice/listarDao
	@RequestMapping(path="gananciasDao")
	public ResponseEntity<String> gananciasDao(){
		double ganancias=0;
		String mensaje= "Aun no hay ventas!";
		for(Auto a: dao.findAll()) {
			ganancias+=(a.getPrecioVenta()* a.getCantidadVenta());
		}
		return new ResponseEntity<String>(mensaje,HttpStatus.OK);
	}
	
	//url -> http://localhost:9001/api/webservice/listar
	@RequestMapping(path="listar")
	public ResponseEntity<List<Auto>> listar() {
		List<Auto> lista= new ArrayList<>();
		lista=imp.listar();
		return ResponseEntity.status(HttpStatus.CREATED).body(lista);
	}
	
	//url -> http://localhost:9001/api/webservice/guardar
	@GetMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Auto auto){
		String mensaje= null;
		System.out.println(auto);
		
		String marca= auto.getMarca();
		if(marca.equals("CHEVROLET") || marca.equals("NISSAN")||marca.equals("AUDI")) {
			Auto aux=imp.buscar_null(auto);
			if(aux==null) {
				imp.guardarP(auto);
				mensaje= "Se guardo auto!\n"+" Modelo: \n"+auto.getModelo()+" Marca: \n"+auto.getMarca();
			}
			else {
				mensaje="El auto ya esta registrado";
			}
			
		}
		else {
			mensaje="No se guardo el auto! Solo manejamos marca CHEVROLET, NISSAN Y AUDI";
		}
		return new ResponseEntity<String>(mensaje,HttpStatus.OK);
	}
	
	@RequestMapping(path="eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Auto auto){
		String mensaje=null;
		Auto aux=imp.buscar(auto);
		if(aux!=null) {
			mensaje= "Se elimino el modelo";
			
		}else {
			mensaje="No existe el auto";
		}
		
		return null;
	}
	
}
