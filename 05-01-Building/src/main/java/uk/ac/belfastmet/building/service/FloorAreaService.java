package uk.ac.belfastmet.building.service;

import java.util.ArrayList;

import uk.ac.belfastmet.building.domain.FloorArea;

public class FloorAreaService {
	
	public FloorAreaService() {
		super();
	}
	
	public ArrayList<FloorArea> getBuildingFloorArea(){
		
		ArrayList<FloorArea> fa = new ArrayList<FloorArea>();
		
		FloorArea NCGC = new FloorArea("New Century Global Center", "China", "Chengdu", "1,760,000 m2", "NCGC.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3435.206680734412!2d104.06704671508834!3d30.571710400426376!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x36efc66e38e922db%3A0x523ef7736d271b8c!2sNew+Century+Global+Center%2C+Wuhou+Qu%2C+Chengdu+Shi%2C+Sichuan+Sheng%2C+China!5e0!3m2!1sen!2suk!4v1543835649254\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
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
