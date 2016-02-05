package se.mah.oliver.idk15;

public class Bike {
	private String color = "black";
	private int price = 0;
	private int size = 8;
	private static int MAX_PRICE = 3000;
/** Checks if the bikes size is valid, and if not sets the size to 28.
 *  It checks the color of the bike, and if it is invalid sets it to black */
	public Bike(String color, int size) {
		if (size >= Constant.MIN_SIZE && size <= Constant.MAX_SIZE) {
			this.size = size;
		} else {
			this.size = 28;
		}
		this.color = Constant.CheckValue(color);

	}
	/** Checks if the bikes size is valid, and if not sets the size to 28. 
	 * The method checks if the price is right, and if it is not between 0 and 30000 sets it to 1000.
	 * The color is checked and the method checks if it is valid, if not it sets it to black.   */
	public Bike(String color, int size, int price) {
		if (size >= Constant.MIN_SIZE && size <= Constant.MAX_SIZE) {
			this.size = size;
		} else {
			this.size = 28;
		}
		if (price >= Constant.MIN_PRICE && price <= Constant.MAX_PRICE) {
			this.price = price;
		} else {
			this.price = 1000;
		}
		this.color = Constant.CheckValue(color);
	}

	public String getColor() {
		return this.color;
	}

	public void setprice(int price) {
		if (price > 0 && price <= MAX_PRICE) {
			this.price = price;
		}
	}
public int getprice(){
	return this.price;
}
public int getsize(){
	return this.size;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
