package fr.treeptik.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import fr.treeptik.pojo.Categorie;
import fr.treeptik.pojo.Transaction;

public interface TransactionService extends GenericService<Transaction, Long>{
	public List<Transaction> list(Date start, Date end);
	public List<Transaction> listBefore(Date end);
	public List<Transaction> listAfter(Date start);
	public List<Transaction> list(Collection<Categorie> categories);
	public List<Transaction> listCurrentYear();
	public List<Transaction> listCurrentMonth();
	public List<Transaction> listCurrentWeek();
}
