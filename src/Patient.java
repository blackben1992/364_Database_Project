
public class Patient {
	private String sSN;
	private String fName;
	private String mName;
	private String lName;
	private String dateOfBirth;
	private String insuranceName;
	private String address;

	public Patient(String sSN, String fName, String mName, String lName, String dateOfBirth, String insuranceName,
			String address) {
		this.sSN = sSN;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.dateOfBirth = dateOfBirth;
		this.insuranceName = insuranceName;
		this.address = address;
	}

	public String getsSN() {
		return sSN;
	}

	public void setsSN(String sSN) {
		this.sSN = sSN;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
