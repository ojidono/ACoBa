package fr.treeptik.dao;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.treeptik.pojo.Transaction;
import fr.treeptik.pojo.Categorie;


@Repository
public interface TransactionDAO  extends JpaRepository<Transaction, Long> {
	public List<Transaction> findByCategorieIn(Collection<Categorie> categories);
	public List<Transaction> findByDateAfter(Date start);
	public List<Transaction> findByDateBefore(Date end);
	public List<Transaction> findByDateBetween(Date start, Date end);
}
