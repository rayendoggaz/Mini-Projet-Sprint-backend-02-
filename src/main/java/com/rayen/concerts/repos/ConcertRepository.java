package com.rayen.concerts.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rayen.concerts.entities.Genre;
import com.rayen.concerts.entities.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long> {
	List<Concert> findByNomConcert(String nom);
	List<Concert> findByNomConcertContains(String nom);   
	
	@Query("select p from Concert p where p.nomConcert like %:nom and p.prixConcert > :prix")
	List<Concert> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
    
	@Query("select p from Concert p where p.genre = ?1")
	List<Concert> findByGenre (Genre genre);
	
	List<Concert> findByGenreIdGen(Long id);
	
	List<Concert> findByOrderByNomConcertAsc();
	
	@Query("select p from Concert p order by p.nomConcert ASC, p.prixConcert DESC")
	List<Concert> trierConcertsNomsPrix ();
	              

}
