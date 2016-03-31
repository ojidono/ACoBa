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
import fr.treeptik.pojo.Compte;
import fr.treeptik.pojo.Transaction;
import fr.treeptik.pojo.User;
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

	/**************************************************************************
	 * 				Recherches générales sur dates et catégories
	 *************************************************************************/
	
	@RequestMapping(value = "/list/all/date/before", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listBefore(@RequestBody Date end){
		return mainService.listBefore(end);
	}
	@RequestMapping(value = "/list/all/date/after", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listAfter(@RequestBody Date start){
		return mainService.listAfter(start);
	}
	@RequestMapping(value = "/list/all/date", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody Date start, @RequestBody Date end){
		return mainService.list(start, end);
	}
	@RequestMapping(value = "/list/all/category", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody Collection<Categorie> categories){
		return mainService.list(categories);
	}
	@RequestMapping(value = "/list/all/date/year", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentYear(){
		return mainService.listCurrentYear();
	}
	@RequestMapping(value = "/list/all/date/month", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentMonth(){
		return mainService.listCurrentMonth();
	}
	@RequestMapping(value = "/list/all/date/week", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentWeek(){
		return mainService.listCurrentWeek();
	}

	/**************************************************************************
	 * 				Recherches Compte sur dates et catégories
	 *************************************************************************/
	
	@RequestMapping(value = "/list/compte/date/before", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listBefore(@RequestBody Compte entity, @RequestBody Date end){
		return mainService.listBefore(entity, end);
	}
	@RequestMapping(value = "/list/compte/date/after", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listAfter(@RequestBody Compte entity, @RequestBody Date start){
		return mainService.listAfter(entity, start);
	}
	@RequestMapping(value = "/list/compte/date", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody Compte entity, @RequestBody Date start, @RequestBody Date end){
		return mainService.list(entity, start, end);
	}
	@RequestMapping(value = "/list/compte/category", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody Compte entity, @RequestBody Collection<Categorie> categories){
		return mainService.list(entity, categories);
	}
	@RequestMapping(value = "/list/compte/date/year", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentYear(@RequestBody Compte entity){
		return mainService.listCurrentYear(entity);
	}
	@RequestMapping(value = "/list/compte/date/month", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentMonth(@RequestBody Compte entity){
		return mainService.listCurrentMonth(entity);
	}
	@RequestMapping(value = "/list/compte/date/week", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentWeek(@RequestBody Compte entity){
		return mainService.listCurrentWeek(entity);
	}

	/**************************************************************************
	 * 				Recherches User sur dates et catégories
	 *************************************************************************/
	
	@RequestMapping(value = "/list/user/date/before", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listBefore(@RequestBody User entity, @RequestBody Date end){
		return mainService.listBefore(entity, end);
	}
	@RequestMapping(value = "/list/user/date/after", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listAfter(@RequestBody User entity, @RequestBody Date start){
		return mainService.listAfter(entity, start);
	}
	@RequestMapping(value = "/list/user/date", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody User entity, @RequestBody Date start, @RequestBody Date end){
		return mainService.list(entity, start, end);
	}
	@RequestMapping(value = "/list/user/category", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> list(@RequestBody User entity, @RequestBody Collection<Categorie> categories){
		return mainService.list(entity, categories);
	}
	@RequestMapping(value = "/list/user/date/year", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentYear(@RequestBody User entity){
		return mainService.listCurrentYear(entity);
	}
	@RequestMapping(value = "/list/user/date/month", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentMonth(@RequestBody User entity){
		return mainService.listCurrentMonth(entity);
	}
	@RequestMapping(value = "/list/user/date/week", method = RequestMethod.POST)
	public @ResponseBody List<Transaction> listCurrentWeek(@RequestBody User entity){
		return mainService.listCurrentWeek(entity);
	}
}
