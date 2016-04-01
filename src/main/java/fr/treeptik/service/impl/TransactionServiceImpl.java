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
import fr.treeptik.pojo.Compte;
import fr.treeptik.pojo.Transaction;
import fr.treeptik.pojo.Categorie;
import fr.treeptik.pojo.User;
import fr.treeptik.service.TransactionService;

@Service
public class TransactionServiceImpl extends GenericServiceImpl<Transaction, Long> implements TransactionService {
	private TransactionDAO mainDAO;

	@Inject
	public TransactionServiceImpl(TransactionDAO dao) {
		super(dao);
		this.mainDAO = dao;
	}
//
//	/**************************************************************************
//	 * 				Recherches générales sur dates et catégories
//	 *************************************************************************/
//	
//	public List<Transaction> list(Date start, Date end){
//		return mainDAO.findByDateBetween(start, end);
//	}
//	public List<Transaction> listBefore(Date end){
//		return mainDAO.findByDateBefore(end) ;
//	}
//	public List<Transaction> listAfter(Date start){
//		return mainDAO.findByDateAfter(start) ;
//	}
//	public List<Transaction> list(Collection<Categorie> categories) {
//		return mainDAO.findByCategorieIn(categories) ;
//	}
//	public List<Transaction> listCurrentYear() {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentYear();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findByDateBetween(start,end);
//	}
//	public List<Transaction> listCurrentMonth() {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentMonth();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findByDateBetween(start,end);
//	}
//	public List<Transaction> listCurrentWeek() {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentWeek();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findByDateBetween(start,end);
//	}
//
//	
//	
//	/**************************************************************************
//	 * 				Recherches par Compte sur dates et catégories
//	 *************************************************************************/
//
//
//	public List<Transaction> list(Compte entity) {
//		List <Transaction> 
//		sources 		=mainDAO.findBySource(entity),
//		destinations	=mainDAO.findByDestination(entity);
//	sources.addAll(destinations);
//	return sources;
//	}
//	public List<Transaction> listBefore(Compte entity, Date end) {
//		List <Transaction> 
//			sources 		=mainDAO.findBySourceAndDateBefore(entity, end),
//			destinations	=mainDAO.findByDestinationAndDateBefore(entity, end);
//		sources.addAll(destinations);
//		return sources;
//	}
//	public List<Transaction> listAfter(Compte entity, Date end) {
//		List <Transaction> 
//			sources 		=mainDAO.findBySourceAndDateAfter(entity, end),
//			destinations	=mainDAO.findByDestinationAndDateAfter(entity, end);
//		sources.addAll(destinations);
//		return sources;
//	}
//	public List<Transaction> list(Compte entity, Date start, Date end) {
//		List <Transaction> 
//			sources 		=mainDAO.findBySourceAndDateBetween(entity, start, end),
//			destinations	=mainDAO.findByDestinationAndDateBetween(entity, start, end);
//		sources.addAll(destinations);
//		return sources;
//	}
//	public List<Transaction> list(Compte entity, Collection<Categorie> categories) {
//		return mainDAO.findBySourceAndCategorieIn(entity, categories) ;
//	}
//	public List<Transaction> listCurrentYear(Compte entity) {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentYear();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findBySourceAndDateBetween(entity, start,end);
//	}
//	public List<Transaction> listCurrentMonth(Compte entity) {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentMonth();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findBySourceAndDateBetween(entity, start,end);
//	}
//	public List<Transaction> listCurrentWeek(Compte entity) {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentWeek();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findBySourceAndDateBetween(entity, start,end);
//	}
//
//	
//	
//	/**************************************************************************
//	 * 				Recherches par User sur dates et catégories
//	 *************************************************************************/
//
//	public List<Transaction> list(User entity) {
//		List <Transaction> 
//			sources 		=mainDAO.findBySourceUser(entity),
//			destinations	=mainDAO.findByDestinationUser(entity);
//		sources.addAll(destinations);
//		return sources;
//	}
//	public List<Transaction> listBefore(User entity, Date end) {
//		List <Transaction> 
//			sources 		=mainDAO.findBySourceUserAndDateBefore(entity, end),
//			destinations	=mainDAO.findByDestinationUserAndDateBefore(entity, end);
//		sources.addAll(destinations);
//		return sources;
//	}
//	public List<Transaction> listAfter(User entity, Date end) {
//		List <Transaction> 
//			sources 		=mainDAO.findBySourceUserAndDateAfter(entity, end),
//			destinations	=mainDAO.findByDestinationUserAndDateAfter(entity, end);
//		sources.addAll(destinations);
//		return sources;
//	}
//	public List<Transaction> list(User entity, Date start, Date end) {
//		List <Transaction> 
//			sources 		=mainDAO.findBySourceUserAndDateBetween(entity, start, end),
//			destinations	=mainDAO.findByDestinationUserAndDateBetween(entity, start, end);
//		sources.addAll(destinations);
//		return sources;
//	}
//	public List<Transaction> list(User entity, Collection<Categorie> categories) {
//		return mainDAO.findBySourceUserAndCategorieIn(entity, categories) ;
//	}
//	public List<Transaction> listCurrentYear(User entity) {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentYear();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findBySourceUserAndDateBetween(entity, start,end);
//	}
//	public List<Transaction> listCurrentMonth(User entity) {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentMonth();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findBySourceUserAndDateBetween(entity, start,end);
//	}
//	public List<Transaction> listCurrentWeek(User entity) {
//		Date end = new Date();
//		Date start;
//		try {
//			start = getCurrentWeek();
//		} catch (ParseException e) {
//			start = new Date();
//		}
//		return mainDAO.findBySourceUserAndDateBetween(entity, start,end);
//	}
//	
//	
//	
//	/**************************************************************************
//	 * 								Divers
//	 *************************************************************************/
//
//	private Date getCurrentYear() throws ParseException {
//		return new SimpleDateFormat("yyyy").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
//	}
//	private Date getCurrentMonth() throws ParseException {
//		return new SimpleDateFormat("yyyy-MM").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))+"-"+String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1));
//	}
//	private Date getCurrentWeek() throws ParseException {
//		return new SimpleDateFormat("yyyy-ww").parse(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))+"-"+String.valueOf(Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)));
//	}

}
