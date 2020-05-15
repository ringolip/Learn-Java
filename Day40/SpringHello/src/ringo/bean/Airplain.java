package ringo.bean;

public class Airplain {
	private String engine;
	private String captainName;
	private Integer personNum;
	private Integer wingLength;
	
	public Airplain() {
		super();
	}
	
	public String getEngine() {
		return engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getCaptainName() {
		return captainName;
	}
	
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	
	public Integer getPersonNum() {
		return personNum;
	}
	
	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
	}
	
	public Integer getWingLength() {
		return wingLength;
	}
	
	public void setWingLength(Integer wingLength) {
		this.wingLength = wingLength;
	}
	
	@Override
	public String toString() {
		return "Airplain [engine=" + engine + ", captainName=" + captainName + ", personNum=" + personNum
				+ ", wingLength=" + wingLength + "]";
	}
	
}
