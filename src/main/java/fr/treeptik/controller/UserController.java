package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.treeptik.pojo.User;
import fr.treeptik.service.UserService;

@Controller
@RequestMapping(value = "/api/user")
public class UserController extends GenericController<User> {
	private UserService mainService;
	
	@Inject
	public UserController(UserService service){
		super(service,"user", User.class);
		this.mainService = service;
	}
}
