package uk.ac.belfastmet.building.service;

import java.util.ArrayList;

import uk.ac.belfastmet.building.domain.FloorArea;

public class FloorAreaService {
	
	public FloorAreaService() {
		super();
	}
	
	public ArrayList<FloorArea> getBuildingFloorArea(){
		
		ArrayList<FloorArea> fa = new ArrayList<FloorArea>();
		
		FloorArea NCGC = new FloorArea("New Century Global Center", "China", "Chengdu", "1,760,000 m2", "NCGC.jpg", "map");
		fa.add(NCGC);
		FloorArea DIAT = new FloorArea("Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", "1,713,000 m2", "DIAT.jpg", "map");
		fa.add(DIAT);
		FloorArea AABE = new FloorArea("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815 m2", "AABE.jpg", "map");
		fa.add(AABE);
		FloorArea CW = new FloorArea("CentralWorld", "Thailand", "Bangkok", "1,024,000 m2", "CW.jpg", "map");
		fa.add(CW);
		FloorArea AFAB = new FloorArea("Aalsmeer Flower Auction Building", "Netherlands", "Aalsmeer", "990,000 m2", "NCGC.jpg", "map");
		fa.add(AFAB);
		
		return fa;
		
	}

}
