package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.treeptik.pojo.Transaction;
import fr.treeptik.service.TransactionService;

@Controller
@RequestMapping(value = "/api//transaction")
public class TransactionController extends GenericController<Transaction> {
	private TransactionService mainService;
	
	@Inject
	public TransactionController(TransactionService service){
		super(service);
		this.mainService = service;
	}
}
