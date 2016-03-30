package fr.treeptik.dao;

import java.util.List;

import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.treeptik.pojo.Transaction;


@Repository
public interface TransactionDAO  extends JpaRepository<Transaction, Long> {
	public List<Transaction> findByCategorieIn(Collection categories);
}
