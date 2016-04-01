package fr.treeptik.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.treeptik.service.GenericService;

/**
 * Implémentation du CRUD
 * @return retour (ModelAndView): contient 2 objects: 
 * 		page: [nom de la table]/[nom de de la méthode]
 * 		content: divers contenus attendus  
 */
public abstract class GenericController <T> {
	public GenericService<T, Long> genericService;
	public String table;
	public Class<T> classeObjet;
	
	public GenericController(GenericService<T, Long> service, String table, Class<T> classObjet){
		this.genericService = service;
		this.table = table;
		this.classeObjet = classObjet;
	}

	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView retour = new ModelAndView("", "page", table+"/list");
		retour.addObject("content", genericService.findAll());
		return retour;
	}

	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public ModelAndView detail(@PathVariable(value="id") Long id) {
		ModelAndView retour = new ModelAndView("", "page", table+"/detail");
		retour.addObject("content", genericService.find(id));
		return retour;
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@RequestBody T entity) {
		ModelAndView retour = new ModelAndView("", "page", table+"/save");
		retour.addObject("content", genericService.save(entity));
		return retour;
	}
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public ModelAndView save() {
		ModelAndView retour = new ModelAndView();
		System.out.println("YAHA");
		try {
			retour.addObject("entity", classeObjet.newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return retour;
	}
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ModelAndView delete(@RequestBody T entity) {
		ModelAndView retour = new ModelAndView("", "page", table+"/delete");
		genericService.delete(entity);
		retour.addObject("content", entity);
		return retour;
	}
}
