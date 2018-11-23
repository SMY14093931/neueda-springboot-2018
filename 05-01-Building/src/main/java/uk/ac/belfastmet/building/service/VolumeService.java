package uk.ac.belfastmet.building.service;

import java.util.ArrayList;

import uk.ac.belfastmet.building.domain.Volume;

public class VolumeService {
	
	public VolumeService() {
		super();
	}
	
	public ArrayList<Volume> getBuildingVolume(){
		
		ArrayList<Volume> vol = new ArrayList<Volume>();
		
		Volume BEF = new Volume("Boeing Everett Factory", "United States", "Everett, Washington", "BEF.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.509781861559!2d-122.27426088443045!3d47.926522079207174!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x549001133b2ceee9%3A0x443d19a2005857c8!2sBoeing+Everett+Factory%2C+3003+W+Casino+Rd%2C+Everett%2C+WA+98204%2C+USA!5e0!3m2!1sen!2suk!4v1542987943826\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "398000 m2", "13300000 m3", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.");
				vol.add(BEF);
		Volume GMM = new Volume("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "GMM.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.1621309239226!2d39.823546014839145!3d21.42287138578621!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204b74d3fb493%3A0x55d1f94f8e094785!2sMasjid+al-Haram!5e0!3m2!1sen!2suk!4v1542986294354\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "356,000 m2", "8 million m3", "The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.");
				vol.add(GMM);
		Volume JLP = new Volume("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "JLP.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3533.311232635592!2d1.3534309477235402!3d43.657198572241676!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12aeaf8f817ebb9d%3A0x9505125f3635881c!2sAiles+Anciennes+Toulouse!5e0!3m2!1sen!2suk!4v1542987194413\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "122,500 m2", "5.6 million m3", "The assembly hall of the Airbus A380, the world's largest airliner.");
				vol.add(JLP);
		Volume BCWC = new Volume("Boeing Composite Wing Center", "United States", "Everett, Washington", "BCWC.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d171119.40210607857!2d-122.35508717255965!3d47.92205532204323!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x5490013dcbbc07bf%3A0x8c23d0804adcbbbe!2sWA-526%2C+Everett%2C+WA%2C+USA!5e0!3m2!1sen!2suk!4v1542987456102\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "111,500 m2", "3.7 million m3", "Boeing's assembly site for the production of composite wings for the 777-8 and 777-9");
				vol.add(BCWC);
		Volume Aerium = new Volume("Aerium", "Germany", "Halbe, Brandenburg", "Aerium.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2454.240971861252!2d13.746428315723426!3d52.03892397972594!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47a804edb23f5915%3A0x20148692752fbd91!2sTropical+Islands!5e0!3m2!1sen!2suk!4v1542987543457\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>", "70,000 m2", "5.2 million m3", "A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park, called Tropical Islands Resort.");
				vol.add(Aerium);
				
		return vol;
	}

}
