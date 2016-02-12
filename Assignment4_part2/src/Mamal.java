/** create the abstrakt class mamal and sets the needed ints and strings needed to create a mamal */
public abstract class Mamal extends Animal {
	private int gestationTime;

	public Mamal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
	}

	public int getGestationTime() {
		return gestationTime;
	}
}
