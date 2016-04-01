package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.treeptik.pojo.Categorie;

@Repository
public interface CategorieDAO extends JpaRepository<Categorie, Long> {
//	public List<Categorie> findByNom();
}
