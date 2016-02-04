package se.mah.oliver.idk15;

public class Bike {
	private String color = "black";
	private int price = 0;
	private int size = 8;
	private static int MAX_PRICE = 3000;

	public Bike(String color, int size) {

	}

	public Bike(String color, int size, int price) {

	}

	public String getColor() {
		return this.color;
	}

	public int getsize() {
		return this.size;
	}

	public int getprice() {
		return this.price;
	}

	public void setprice(int price) {
		if (price > 0 && price <= MAX_PRICE) {
			this.price = price;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
