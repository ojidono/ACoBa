package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.treeptik.pojo.User;
import fr.treeptik.service.GenericService;

@Controller
@RequestMapping(value = "/user")
public class CompteController extends GenericController<User> {
	
	@Inject
	public CompteController(GenericService<User, Long> service){
		super(service);
	}
}
