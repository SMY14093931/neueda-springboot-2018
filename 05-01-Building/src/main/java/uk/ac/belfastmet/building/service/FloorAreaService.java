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
		FloorArea DIAT = new FloorArea("Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", "1,713,000 m2", "DIAT.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7217.261585778085!2d55.35841057507676!3d25.249357539311525!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x15a80cf878932d49!2sAirport+Terminal+3!5e0!3m2!1sen!2suk!4v1543837106131\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		fa.add(DIAT);
		FloorArea AABE = new FloorArea("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815 m2", "AABE.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.26570011013!2d39.823552964934635!3d21.418798979724297!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204c82533f16f%3A0xca0cff6480eeca59!2sAbraj+Al+Bait+Mall+(Kingdom+Clock+Tower)!5e0!3m2!1sen!2suk!4v1543837200618\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		fa.add(AABE);
		FloorArea CW = new FloorArea("Central World", "Thailand", "Bangkok", "1,024,000 m2", "CW.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3875.533971517945!2d100.53763631485495!3d13.746641201116544!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x30e29ecfeecc36a5%3A0x598d0d8037b6c2d!2sCar+Park+Central+World!5e0!3m2!1sen!2suk!4v1543837251521\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		fa.add(CW);
		FloorArea AFAB = new FloorArea("Aalsmeer Flower Auction Building", "Netherlands", "Aalsmeer", "990,000 m2", "NCGC.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2442.1791990971183!2d4.78039821568183!3d52.258290863343795!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e0!3m2!1sen!2suk!4v1543837297164\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		fa.add(AFAB);
		
		return fa;
		
	}

}
