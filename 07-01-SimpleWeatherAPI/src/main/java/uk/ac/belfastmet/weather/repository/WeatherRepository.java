package uk.ac.belfastmet.weather.repository;

import uk.ac.belfastmet.weather.domain.Location;

public interface WeatherRepository {
	
	Location findByName(String name);

}
