package uk.ac.belfastmet.tourism.service;

import java.util.ArrayList;

import uk.ac.belfastmet.tourism.domain.Tourism;


public class TourismService {
	
	public TourismService() {
		super();
	}
	
	public ArrayList<Tourism> get SiteTourism() {
		
		ArrayList<Tourism> tours = new ArrayList<Tourism>();
		
		Tourism titanic = new Tourism();
		tours.add(titanic);
	}

}
