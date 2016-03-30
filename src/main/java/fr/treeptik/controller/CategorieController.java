package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.treeptik.pojo.Categorie;
import fr.treeptik.service.GenericService;

@Controller
@RequestMapping(value = "/categorie")
public class CategorieController extends GenericController<Categorie> {
	
	@Inject
	public CategorieController(GenericService<Categorie, Long> service){
		super(service);
	}
}
