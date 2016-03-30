package fr.treeptik.service.impl;

import java.text.SimpleDateFormat;
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
//	public List<Transaction> listCurrentYear() {
//		return mainDAO.findByDateBetween(SimpleDateFormat.getInstance().format(SystemClockFactory.getDatetime()), SystemClockFactory.getDatetime());
//	}
//	public List<Transaction> listCurrentMonth() {
//		return mainDAO.findByDateBetween(start, SystemClockFactory.getDatetime());
//	}
//	public List<Transaction> listCurrentWeek() {
//		return mainDAO.findByDateBetween(start, SystemClockFactory.getDatetime());
//	}

}
