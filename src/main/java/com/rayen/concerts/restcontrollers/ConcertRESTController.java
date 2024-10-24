package com.rayen.concerts.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rayen.concerts.entities.Concert;
import com.rayen.concerts.service.ConcertService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ConcertRESTController {
	@Autowired
	ConcertService concertService;
	
	@RequestMapping(path="all",method =RequestMethod.GET)
	public List<Concert> getAllConcerts() {
		return concertService.getAllConcerts();
	 } 		
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	//@GetMapping("/getbyid/{id}")
	public Concert getConcertById(@PathVariable("id") Long id) {	
		return concertService.getConcert(id);
    }
	
	@RequestMapping(value="/addconsert",method = RequestMethod.POST)
	//@PostMapping("/addconsert")
	public Concert createConcert(@RequestBody Concert concert) {
		return concertService.saveConcert(concert);
	}

	@RequestMapping(value="/updateconsert",method = RequestMethod.PUT)
	//@PutMapping("/updateconsert")
	public Concert updateConcert(@RequestBody Concert concert) {
		return concertService.updateConcert(concert);
	}

	@RequestMapping(value="/delconsert/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/delconsert/{id}")
	public void deleteConcert(@PathVariable("id") Long id)
	{
		concertService.deleteConcertById(id);
	}
	
	@RequestMapping(value="/consertsgen/{idGen}",method = RequestMethod.GET)
	public List<Concert> getConcertsByGenId(@PathVariable("idGen") Long idGen) {
		return concertService.findByGenreIdGen(idGen);
	 }


}
