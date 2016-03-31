package fr.treeptik.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import fr.treeptik.pojo.Categorie;
import fr.treeptik.pojo.Compte;
import fr.treeptik.pojo.Transaction;
import fr.treeptik.pojo.User;

public interface TransactionService extends GenericService<Transaction, Long>{
	public List<Transaction> list(Date start, Date end);
	public List<Transaction> listBefore(Date end);
	public List<Transaction> listAfter(Date start);
	public List<Transaction> list(Collection<Categorie> categories);
	public List<Transaction> listCurrentYear();
	public List<Transaction> listCurrentMonth();
	public List<Transaction> listCurrentWeek();
	
	
	
	public List<Transaction> listBefore(Compte entity, Date end);
	public List<Transaction> listAfter(Compte entity, Date start);
	public List<Transaction> list(Compte entity, Date start, Date end);
	public List<Transaction> list(Compte entity, Collection<Categorie> categories);
	public List<Transaction> listCurrentYear(Compte entity);
	public List<Transaction> listCurrentMonth(Compte entity);
	public List<Transaction> listCurrentWeek(Compte entity);
	
	
	
	public List<Transaction> listBefore(User entity, Date end);
	public List<Transaction> listAfter(User entity, Date start);
	public List<Transaction> list(User entity, Date start, Date end);
	public List<Transaction> list(User entity, Collection<Categorie> categories);
	public List<Transaction> listCurrentYear(User entity);
	public List<Transaction> listCurrentMonth(User entity);
	public List<Transaction> listCurrentWeek(User entity);
}
