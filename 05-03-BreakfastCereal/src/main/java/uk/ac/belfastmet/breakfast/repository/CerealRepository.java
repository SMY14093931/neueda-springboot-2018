package uk.ac.belfastmet.breakfast.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.breakfast.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer>{
	
	Cereal findByCerealId(Integer cerealId);

	Iterable<Cereal> findByCerealContaining(String cereal);

}
