package uk.ac.belfastmet.tourism.service;

import java.util.ArrayList;

import uk.ac.belfastmet.tourism.domain.Tourism;

public class TourismService {
	
	public TourismService() {
		super();
	}
	
	public ArrayList<Tourism> getSiteTours(){
		
		ArrayList<Tourism> tours = new ArrayList<Tourism>();
		
		Tourism titanic = new Tourism("Titanic1.jpg", "Titanic Museum", "Map");
		tours.add(titanic);
		Tourism crumlin = new Tourism("Crumlin1.jpg", "Crumlin Prison", "Map");
		tours.add(crumlin);
		Tourism bbt = new Tourism("BlackTaxiTour1.jpg", "Black Taxi Tour", "Map");
		tours.add(bbt);
		Tourism gm = new Tourism("GMImage1.jpg", "St.Geroge's Market", "Map");
		tours.add(gm);
		Tourism cq = new Tourism("CQImage1.jpg", "Cathedral Quarter", "Map");
		tours.add(cq);
		
		return tours;
	}
	
public ArrayList<Tourism> getWalkTours(){
		
		ArrayList<Tourism> tours = new ArrayList<Tourism>();
		
		Tourism lt = new Tourism("LTImage1.jpg", "Lagan Tow Path", "Map");
		tours.add(lt);
		Tourism bm = new Tourism("BMImage1.jpg", "Black Mountain", "Map");
		tours.add(bm);
		Tourism ch = new Tourism("cavehillImage1.jpg", "Cave Hill", "Map");
		tours.add(ch);
		Tourism hb = new Tourism("HBImage1.jpg", "Helen's Bay", "Map");
		tours.add(hb);
		
		return tours;
	}

}
