package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.treeptik.pojo.Categorie;
import fr.treeptik.service.CategorieService;

@Controller
@RequestMapping(value = "/api/categorie")
public class CategorieController extends GenericController<Categorie> {
	private CategorieService mainService;
	
	@Inject
	public CategorieController(CategorieService service){
		super(service);
		this.mainService = service;
	}
}
