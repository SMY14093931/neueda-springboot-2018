package uk.ac.belfastmet.tourism.domain;

public class Tourism {
	
	private String image;
	private String name;
	private String address;
	private String map;
	
	public Tourism() {
		super();
	}

	public Tourism(String image, String name, String address, String map) {
		super();
		this.image = image;
		this.name = name;
		this.address = address;
		this.map = map;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}
	

}
