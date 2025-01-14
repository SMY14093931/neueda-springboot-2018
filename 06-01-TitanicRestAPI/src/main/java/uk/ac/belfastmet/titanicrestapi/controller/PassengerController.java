package uk.ac.belfastmet.titanicrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.titanicrestapi.domain.Passenger;
import uk.ac.belfastmet.titanicrestapi.repository.PassengerRepository;

@RestController
@RequestMapping("")
public class PassengerController {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	
	public PassengerController(PassengerRepository passengerReposiotry) {
		super();
		this.passengerRepository = passengerReposiotry;
	}

	@GetMapping("passengers")
	public Iterable<Passenger> getAllPassengers() {
		return this.passengerRepository.findAll();
	}
	
	@GetMapping("passengers/{passengerId}")
	public Passenger getPassenger(@PathVariable("passengerId") Integer passengerId) {
		return this.passengerRepository.findByPassengerId(passengerId);
	}
	
	@PostMapping("passengers")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
		return this.passengerRepository.save(passenger);
	}
	
	@PutMapping("passengers/{passengerId}")
	public Passenger updatePassenger(@PathVariable("passengerId") Integer passengerId
			, @RequestBody Passenger passenger) {
		return this.passengerRepository.save(passenger);
	}
	
	
	@DeleteMapping("passengers/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId) {
		this.passengerRepository.deleteById(passengerId);
		return "{\"Delete\": \"Success\", \"Passenger\": " + passengerId +"}";
	}
	


}
