package fr.treeptik.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.treeptik.pojo.Compte;
import fr.treeptik.pojo.Transaction;

@Repository
public interface CompteDAO extends JpaRepository<Compte, Long> {	
	@Query("SELECT tr FROM Compte JOIN FETCH Transaction tr")
	public List<Transaction> getTransactions();
	
	@Query("SELECT tr FROM Transaction tr JOIN Compte  WHERE date BETWEEN ?1 AND ?2")
	public List<Transaction> getTransactions(Date start, Date end);

	@Query("SELECT tr FROM Compte JOIN FETCH Transaction tr WHERE Categorie IN ?1")
	public List<Transaction> findByCategorieIn(Collection categories);
	
	@Query("SELECT SUM(pos.valeur)-SUM(neg.valeur) AS situation FROM Compte JOIN ")
	public Long situation();
}
