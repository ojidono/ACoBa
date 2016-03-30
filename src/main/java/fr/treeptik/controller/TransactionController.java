package fr.treeptik.controller;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.treeptik.pojo.Categorie;
import fr.treeptik.pojo.Transaction;
import fr.treeptik.service.TransactionService;

@Controller
@RequestMapping(value = "/api/transaction")
public class TransactionController extends GenericController<Transaction> {
	private TransactionService mainService;
	
	@Inject
	public TransactionController(TransactionService service){
		super(service);
		this.mainService = service;
	}

	@RequestMapping(value = "/list/date/before", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listBefore(@RequestBody Date end){
		return mainService.listBefore(end);
	}
	@RequestMapping(value = "/list/date/after", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listAfter(@RequestBody Date start){
		return mainService.listAfter(start);
	}
	@RequestMapping(value = "/list/date", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody Date start, @RequestBody Date end){
		return mainService.list(start, end);
	}
	@RequestMapping(value = "/list/category", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody Collection<Categorie> categories){
		return mainService.list(categories);
	}
	@RequestMapping(value = "/list/date/year", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentYear(){
		return mainService.listCurrentYear();
	}
	@RequestMapping(value = "/list/date/month", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentMonth(){
		return mainService.listCurrentMonth();
	}
	@RequestMapping(value = "/list/date/week", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentWeek(){
		return mainService.listCurrentWeek();
	}
}
