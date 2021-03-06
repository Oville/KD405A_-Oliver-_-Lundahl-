/*create the cat class and gives it the needed variables and the parameters needed to crate a cat*/
public class Cat extends Mamal {
	private int numberOfLives;

	public Cat(String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.numberOfLives= numberOfLives;
	}

	public int getnumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int lives) {
		this.numberOfLives = lives;
	}

	@Override
	public String getInfo() {
		return " The cat has " + this.numberOfLives + " and is called " + getFriendlyName() + " and is called in latin "
				+ getLatinName() + " and is pregnant for " + getGestationTime();
	}
}