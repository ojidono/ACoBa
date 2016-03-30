package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.treeptik.pojo.Transaction;
import fr.treeptik.service.GenericService;

@Controller
@RequestMapping(value = "/transaction")
public class TransactionController extends GenericController<Transaction> {
	
	@Inject
	public TransactionController(GenericService<Transaction, Long> service){
		super(service);
	}
}
