package com.rayen.concerts.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Concert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConcert;
	private String nomConcert;
	private Double prixConcert;
	private Date dateCreation;
	
	@ManyToOne
	private Genre genre;

	
	

	public Concert() {
		super();
	}

	public Concert(String nomConcert, Double prixConcert, Date dateCreation) {
		super();
		this.nomConcert = nomConcert;
		this.prixConcert = prixConcert;
		this.dateCreation = dateCreation;
	}



	public Long getIdConcert() {
		return idConcert;
	}

	public void setIdConcert(Long idConcert) {
		this.idConcert = idConcert;
	}

	public String getNomConcert() {
		return nomConcert;
	}

	public void setNomConcert(String nomConcert) {
		this.nomConcert = nomConcert;
	}

	public Double getPrixConcert() {
		return prixConcert;
	}

	public void setPrixConcert(Double prixConcert) {
		this.prixConcert = prixConcert;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Concert [idConcert=" + idConcert + ", nomConcert=" + nomConcert + ", prixConcert=" + prixConcert
				+ ", dateCreation=" + dateCreation + "]";
	}
}
