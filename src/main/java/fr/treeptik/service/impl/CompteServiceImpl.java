package fr.treeptik.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import fr.treeptik.dao.CompteDAO;
import fr.treeptik.pojo.Compte;
import fr.treeptik.service.CompteService;

@Service
public class CompteServiceImpl extends GenericServiceImpl<Compte, Long> implements CompteService {
	private CompteDAO mainDAO;

	@Inject
	public CompteServiceImpl(CompteDAO article) {
		super(article);
		this.mainDAO = article;
	}
}
