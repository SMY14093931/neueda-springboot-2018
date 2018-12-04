package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer>{
	
	Passenger findByPassengerId(Integer passengerId);

	Passenger findByName(String name);
	
	Iterable<Passenger> findBySex(String sex);


}
