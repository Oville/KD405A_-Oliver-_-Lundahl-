package se.mah.oliver.idk15;

import java.util.ArrayList;
/** create a array list for bikes and specifies ints for the bike.
 * take all bikes and prints them in the text field */
public class BikeStore {
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	private int size = 8;
	private int price = 0;
	private String color = "black";

	public String getAllBikes() {
		String s = "";
		for (Bike bike : bikes) {
			s = s + "\n one" + bike.getColor() + " " + "that is" + bike.getsize() + " " + "and costs" + bike.getprice();
		}
		System.out.println(s);
		return s;
	}
/** checks if the size is between min and max and if it is outside of the size sets it to 28.
 * checks if the price is between min and max and if it is not sets it to 1000
 * checks if the color is a valid color and if not it sets it to black. */
	public void addBike(String color, int size, int price) {
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
		
		bikes.add(new Bike(this.color,this.size,this.price));
	}

}
