package fr.treeptik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.treeptik.pojo.Compte;
import fr.treeptik.service.CompteService;

@Controller
@RequestMapping(value = "/compte")
public class CompteController {
	
	@Autowired
	private CompteService mainService;
	
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView("compte");
		System.out.println("MIAWWWWWWWWWWWWWWWw");
		Compte compte = new Compte();
		modelAndView.addObject("compte", compte);
		return modelAndView;
	}
}
