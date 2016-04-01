package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.treeptik.pojo.Compte;
import fr.treeptik.service.CompteService;

@Controller
@RequestMapping(value = "/api/compte")
public class CompteController extends GenericController<Compte> {
	private CompteService mainService;
	
	@Inject
	public CompteController(CompteService service){
		super(service,"compte", Compte.class);
		this.mainService = service;
	}
}
