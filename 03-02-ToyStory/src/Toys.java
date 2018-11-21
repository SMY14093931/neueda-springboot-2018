
public class Toys {
	
	private String toy;
	private String fname;
	private String lname;
	
	public Toys(){
		super();
	}
	
	public Toys(String toy, String fname, String lname) {
		super();
		this.toy = toy;
		this.fname = fname;
		this.lname = lname;
	}

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
