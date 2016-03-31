package fr.treeptik.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import fr.treeptik.dao.TransactionDAO;
import fr.treeptik.pojo.Transaction;
import fr.treeptik.pojo.Categorie;
import fr.treeptik.service.TransactionService;

@Service
public class TransactionServiceImpl extends GenericServiceImpl<Transaction, Long> implements TransactionService {
	private TransactionDAO mainDAO;

	@Inject
	public TransactionServiceImpl(TransactionDAO article) {
		super(article);
		this.mainDAO = article;
	}

	public List<Transaction> list(Date start, Date end){
		return mainDAO.findByDateBetween(start, end);
	}
	public List<Transaction> listBefore(Date end){
		return mainDAO.findByDateBefore(end) ;
	}
	public List<Transaction> listAfter(Date start){
		return mainDAO.findByDateAfter(start) ;
	}
	public List<Transaction> list(Collection<Categorie> categories) {
		return mainDAO.findByCategorieIn(categories) ;
	}
	public List<Transaction> listCurrentYear() {
		Date end = new Date();
		Date start;
		try {
			start = new SimpleDateFormat("yyyy").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
		} catch (ParseException e) {
			start = new Date();
		}
		return mainDAO.findByDateBetween(start,end);
	}
	public List<Transaction> listCurrentMonth() {
		Date end = new Date();
		Date start;
		try {
			start = new SimpleDateFormat("yyyy-MM").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))+"-"+String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1));
		} catch (ParseException e) {
			start = new Date();
		}
		return mainDAO.findByDateBetween(start,end);
	}
	public List<Transaction> listCurrentWeek() {
		Date end = new Date();
		Date start;
		try {
			start = new SimpleDateFormat("yyyy-ww").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))+"-"+String.valueOf(Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)));
		} catch (ParseException e) {
			start = new Date();
		}
		return mainDAO.findByDateBetween(start,end);
	}

}
