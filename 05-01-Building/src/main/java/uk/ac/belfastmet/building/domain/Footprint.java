package uk.ac.belfastmet.building.domain;

public class Footprint extends Building {
	
	private String footprint;
	private String lengthxwidth;
	private String description;

	public Footprint() {
		super();
	}

	public Footprint(String name, String country, String place, String image, String map, String footprint, String lengthxwidth, String description) {
		super(name, country, place, image, map);
		// TODO Auto-generated constructor stub
		this.footprint = footprint;
		this.lengthxwidth = lengthxwidth;
		this.description = description;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getLengthxwidth() {
		return lengthxwidth;
	}

	public void setLengthxwidth(String lengthxwidth) {
		this.lengthxwidth = lengthxwidth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
