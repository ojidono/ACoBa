package fr.treeptik.dao;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.treeptik.pojo.Compte;
import fr.treeptik.pojo.Transaction;
import fr.treeptik.pojo.Categorie;
import fr.treeptik.pojo.User;

@Repository
public interface TransactionDAO extends JpaRepository<Transaction, Long> {
//	public List<Transaction> findByCategorieIn(Collection<Categorie> categories);
//	public List<Transaction> findByDateAfter(Date start);
//	public List<Transaction> findByDateBefore(Date end);
//	public List<Transaction> findByDateBetween(Date start, Date end);
//	public List<Transaction> findBySource(Compte source);
//	public List<Transaction> findByDestination(Compte destination);
//	public List<Transaction> findBySourceUser(User entity);
//	public List<Transaction> findByDestinationUser(User entity);
//	
//	
//	
//	public List<Transaction> findBySourceAndDateBefore(Compte source, Date end);
//	public List<Transaction> findBySourceAndDateAfter(Compte source, Date start);
//	public List<Transaction> findBySourceAndDateBetween(Compte source, Date start, Date end);
//	public List<Transaction> findBySourceAndCategorieIn(Compte source, Collection<Categorie> categories);
//	
//	public List<Transaction> findByDestinationAndDateBefore(Compte destination, Date end);
//	public List<Transaction> findByDestinationAndDateAfter(Compte destination, Date start);
//	public List<Transaction> findByDestinationAndDateBetween(Compte destination, Date start, Date end);
//	public List<Transaction> findByDestinationAndCategorieIn(Compte destination, Collection<Categorie> categories);
//	
//
//	
//	public List<Transaction> findBySourceUserAndDateBetween(User entity, Date start, Date end);
//	public List<Transaction> findBySourceUserAndDateBefore(User entity, Date end);
//	public List<Transaction> findBySourceUserAndDateAfter(User entity, Date start);
//	public List<Transaction> findBySourceUserAndCategorieIn(User entity, Collection<Categorie> categories);
//	
//	public List<Transaction> findByDestinationUserAndDateBetween(User entity, Date start, Date end);
//	public List<Transaction> findByDestinationUserAndDateBefore(User entity, Date end);
//	public List<Transaction> findByDestinationUserAndDateAfter(User entity, Date start);
//	public List<Transaction> findByDestinationUserAndCategorieIn(User entity, Collection<Categorie> categories);
}
