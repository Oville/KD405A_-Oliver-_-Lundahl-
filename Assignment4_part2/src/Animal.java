/**create the animal class and sets the ints and strings it needs to create a animal*/
public abstract class Animal {
	private String latinName;
	private String friendlyName;

	public Animal(String latinName) {
		this.latinName = latinName;
	}

	public abstract String getInfo();

	public String getFriendlyName() {
		return this.friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getLatinName() {
		return this.latinName;
	}
}
