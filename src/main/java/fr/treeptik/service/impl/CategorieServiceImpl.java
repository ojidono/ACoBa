package fr.treeptik.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import fr.treeptik.dao.CategorieDAO;
import fr.treeptik.pojo.Categorie;
import fr.treeptik.service.CategorieService;

@Service
public class CategorieServiceImpl extends GenericServiceImpl<Categorie, Long> implements CategorieService {
	private CategorieDAO mainDAO;

	@Inject
	public CategorieServiceImpl(CategorieDAO dao) {
		super(dao);
		this.mainDAO = dao;
	}

}
