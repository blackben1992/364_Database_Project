public class Doctor {
	private String iD;
	private String location;
	private String name;

	public Doctor(String iD, String location, String name) {
		this.iD = iD;
		this.location = location;
		this.name = name;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
