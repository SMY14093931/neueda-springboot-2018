package uk.ac.belfastmet.titanicconsumer.domain;



public class Passenger {
	
	private Integer passengerId;
	private String survived;
	private String pclass;
	private String name;
	private String sex;
	private String age;
	private String sibSp;
	private String parch;
	private String ticket;
	private Double fare;
	private String cabin;
	private String embarked;
	
	public Passenger() {
		super();
	}

	public Passenger(String survived, String pclass, String name, String sex, String age,
			String sibSp, String parch, String ticket, Double fare, String cabin, String embarked) {
		super();
		this.survived = survived;
		this.pclass = pclass;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sibSp = sibSp;
		this.parch = parch;
		this.ticket = ticket;
		this.fare = fare;
		this.cabin = cabin;
		this.embarked = embarked;
	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public String getSurvived() {
		return survived;
	}

	public void setSurvived(String survived) {
		this.survived = survived;
	}

	public String getPclass() {
		return pclass;
	}

	public void setPclass(String pclass) {
		this.pclass = pclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSibSp() {
		return sibSp;
	}

	public void setSibSp(String sibSp) {
		this.sibSp = sibSp;
	}

	public String getParch() {
		return parch;
	}

	public void setParch(String parch) {
		this.parch = parch;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getEmbarked() {
		return embarked;
	}

	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}
	
	
	
	

}
