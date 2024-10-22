package com.rayen.concerts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rayen.concerts.entities.Genre;
import com.rayen.concerts.entities.Concert;
import com.rayen.concerts.repos.ConcertRepository;

@Service
public class ConcertServiceImpl implements ConcertService {

	@Autowired
	ConcertRepository concertRepository;
	
	@Override
	public Concert saveConcert(Concert p) {
		return concertRepository.save(p);
		
	}

	@Override
	public Concert updateConcert(Concert p) {
		return concertRepository.save(p);
		
	}

	@Override
	public void deleteConcert(Concert p) {
		concertRepository.delete(p);

	}

   @Override
	public void deleteConcertById(Long id) {
		concertRepository.deleteById(id);
		
	}

	@Override
	public Concert getConcert(Long id) {
		return  concertRepository.findById(id).get();
	
	}

	@Override
	public List<Concert> getAllConcerts() {
		return concertRepository.findAll();
	}
	
    @Override
	public List<Concert> findByNomConcert(String nom) {
		return concertRepository.findByNomConcert(nom);
	}

	@Override
	public List<Concert> findByNomConcertContains(String nom) {
		return concertRepository.findByNomConcertContains(nom);
	}

	@Override
	public List<Concert> findByNomPrix(String nom, Double prix) {
		return concertRepository.findByNomPrix(nom, prix);
	}
	
	@Override
	public List<Concert> findByGenre(Genre genre) {
		return concertRepository.findByGenre(genre);
	}

	@Override
	public List<Concert> findByGenreIdGen(Long id) {
		return concertRepository.findByGenreIdGen(id);
	}

	@Override
	public List<Concert> findByOrderByNomConcertAsc() {
		return concertRepository.findByOrderByNomConcertAsc();
	}

	@Override
	public List<Concert> trierConcertsNomsPrix() {
		return concertRepository.trierConcertsNomsPrix();
	}


}
