package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.treeptik.pojo.Compte;
import fr.treeptik.pojo.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
	
	@Query("SELECT c FROM User JOIN FETCH Compte c") 
	public List<Compte> getAccounts();
	
	public User findByIdAndPass(String id, String pass);
}
