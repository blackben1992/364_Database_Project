
public class Prescription {
	private int rX;
	private String name;
	private int numberSupplied;
	private int numberOfRefills;

	public int getNumberOfRefills() {
		return numberOfRefills;
	}

	public void setNumberOfRefills(int numberOfRefills) {
		this.numberOfRefills = numberOfRefills;
	}

	private String sideEffects;

	public Prescription(int rX, String name, int numberSupplied, int numberOfRefills, String sideEffects) {
		this.rX = rX;
		this.name = name;
		this.numberSupplied = numberSupplied;
		this.numberOfRefills = numberOfRefills;
		this.sideEffects = sideEffects;
	}

	public int getrX() {
		return rX;
	}

	public void setrX(int rX) {
		this.rX = rX;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberSupplied() {
		return numberSupplied;
	}

	public void setNumberSupplied(int numberSupplied) {
		this.numberSupplied = numberSupplied;
	}

	public String getSideEffects() {
		return sideEffects;
	}

	public void setSideEffects(String sideEffects) {
		this.sideEffects = sideEffects;
	}
}
