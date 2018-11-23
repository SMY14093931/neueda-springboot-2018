package uk.ac.belfastmet.building.domain;

public class FloorArea extends Building {
	
	private String floorarea;

	public FloorArea() {
		super();
	}

	public FloorArea(String name, String country, String place, String image, String map, String floorarea) {
		super(name, country, place, image, map);
		// TODO Auto-generated constructor stub
		this.floorarea = floorarea;
	}

	public String getFloorarea() {
		return floorarea;
	}

	public void setFloorarea(String floorarea) {
		this.floorarea = floorarea;
	}

}
