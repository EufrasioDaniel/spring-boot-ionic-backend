package com.nelioAlves.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioAlves.cursomc.domain.Pedido;
import com.nelioAlves.cursomc.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) //Responde pelo get no end point categorias
	public ResponseEntity<?> find(@PathVariable Integer id) { //Reponseentity é um objeto que tem varias informações de resposta http
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}