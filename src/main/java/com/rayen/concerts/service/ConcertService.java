package com.rayen.concerts.service;

import java.util.List;

import com.rayen.concerts.entities.Genre;
import com.rayen.concerts.entities.Concert;

public interface ConcertService {
	
	 Concert saveConcert(Concert p);
	 Concert updateConcert(Concert p);
	 void deleteConcert(Concert p);
     void deleteConcertById(Long id);
	 Concert getConcert(Long id);
	 List<Concert> getAllConcerts();
	 
	 List<Concert> findByNomConcert(String nom);
	 List<Concert> findByNomConcertContains(String nom);
	 List<Concert> findByNomPrix (String nom, Double prix);
	 List<Concert> findByGenre (Genre genre);
	 List<Concert> findByGenreIdGen(Long id);
	 List<Concert> findByOrderByNomConcertAsc();
	 List<Concert> trierConcertsNomsPrix();

}
