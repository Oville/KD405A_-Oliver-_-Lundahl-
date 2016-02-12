/* create the dog class and gives it the needed variables and the parameters needed to crate a dog*/
public class Dog extends Mamal {
	private boolean Stupid;

	public Dog(String latinName, int gestationTime, Boolean stupid) {
		super(latinName, gestationTime);
		this.Stupid = stupid;
	}

	public Dog(String latinName, int gestationTime, Boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.Stupid = stupid;
		setFriendlyName(friendlyName);
	}

	public boolean isStupid() {
		return this.Stupid;
	}

	@Override
	public String getInfo() {
		String a;
		if (Stupid) {
			a = "";
		} else {
			a = "not";
		}
		return "name" + getFriendlyName() + "latin name" + getLatinName() + "pregnant for" + getGestationTime()
				+ " and is " + a + " stupid";
	}
}
