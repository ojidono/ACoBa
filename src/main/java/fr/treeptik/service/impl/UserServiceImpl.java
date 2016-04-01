package fr.treeptik.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import fr.treeptik.dao.UserDAO;
import fr.treeptik.pojo.User;
import fr.treeptik.service.UserService;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {
	private UserDAO mainDAO;

	@Inject
	public UserServiceImpl(UserDAO dao) {
		super(dao);
		this.mainDAO = dao;
	}
}
