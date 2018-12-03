package uk.ac.belfastmet.building.service;

import java.util.ArrayList;

import uk.ac.belfastmet.building.domain.Footprint;

public class FootprintService {
	
	public FootprintService() {
		super();
	}
	
	public ArrayList<Footprint> getBuildingFootprint(){
		
		ArrayList<Footprint> fp = new ArrayList<Footprint>();
		
		Footprint AFAB = new Footprint("Aalsmeer Flower Auction Building", "Netherlands", "Aalsmeer", "AFAB.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2442.1793799113107!2d4.7803982157318465!3d52.25828757976551!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e0!3m2!1sen!2suk!4v1542988937831\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",  "518,000 m2", "740 m x 700 m", "The auction building of the flower auction in Aalsmeer.");
		fp.add (AFAB);
		Footprint DM = new Footprint("Dubai Mall", "United Arab Emirates", "Dubai", "DM.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3612.42564834957!2d55.19821571491066!3d25.12129658393153!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f6bb946a5da07%3A0xb3153f736c5dde8f!2sMall+of+the+Emirates!5e0!3m2!1sen!2suk!4v1542988986608\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "500,000 m2", "N/A", "description");
		fp.add (DM);
		Footprint TF = new Footprint("Tesla Factory", "United States", "Fremont, California", "TF.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3166.7037237530712!2d-121.92893838477659!3d37.467716679816505!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fb075776f1c3b%3A0xbe8bdd05c7262318!2sTesla+Service!5e0!3m2!1sen!2suk!4v1542989074885\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "427,354 m2", "N/A", "Automobile production facility of Tesla Motors.");
		fp.add (TF);
		Footprint BEF = new Footprint("Boeing Everett Factory", "United States", "Everett, Washington", "BEF.jpg", "<iframe src=\\\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.509781861559!2d-122.27426088443045!3d47.926522079207174!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x549001133b2ceee9%3A0x443d19a2005857c8!2sBoeing+Everett+Factory%2C+3003+W+Casino+Rd%2C+Everett%2C+WA+98204%2C+USA!5e0!3m2!1sen!2suk!4v1542987943826\\\" width=\\\"300\\\" height=\\\"225\\\" frameborder=\\\"0\\\" style=\\\"border:0\\\" allowfullscreen></iframe>", "398,000 m2", "900 m x 495 m", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.");
		fp.add (BEF);
		Footprint DTTP = new Footprint("Daikin Texas Technology Park", "United States", "Waller, Texas", "DTTP.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3453.5934936356357!2d-95.86331228497795!3d30.048518081880868!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8646d2de861ed379%3A0xb685128a4a3f270b!2sDaikin+Texas+Technology+Park!5e0!3m2!1sen!2suk!4v1542989147987\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",  "393,000 m2", "N/A", "Factory and distribution center for heating and air conditioning products");
		fp.add (DTTP);
		
		return fp;
	}

}
