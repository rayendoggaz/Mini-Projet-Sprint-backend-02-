package com.rayen.concerts.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomconsert", types = { Concert.class })
public interface ConcertProjection {
	public String getNomConcert();
}

