package com.rayen.concerts.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rayen.concerts.entities.Genre;

@RepositoryRestResource(path = "gen")
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
