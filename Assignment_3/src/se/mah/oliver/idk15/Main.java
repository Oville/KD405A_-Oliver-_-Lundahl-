package se.mah.oliver.idk15;

import java.util.ArrayList;

public class Main {

	public static void main (String[] args){
ArrayList<Bike> myBikes= new ArrayList <Bike>();
myBikes= new ArrayList<Bike>(9);
myBikes.add(new Bike ("black", 24, 5000));
myBikes.add(new Bike ("blue", 18, 500));
myBikes.add(new Bike ("red", 20, 7000));
myBikes.add(new Bike ("green", 15, 3500));
myBikes.add(new Bike ("black", 12, 9500));
myBikes.add(new Bike ("white", 24, 9000));
myBikes.add(new Bike ("red", 16, 4500));;
myBikes.add(new Bike ("black", 12, 1000));
myBikes.add(new Bike ("green", 24, 6000));
myBikes.add(new Bike ("black", 22, 9900));
for(int i=0; i<myBikes.size(); i++){
Bike b = myBikes.get(i);
System.out.println("en "+b.getColor()+" "+"cyckel "+"som �r"+" "+ b.getsize()+" "+"och kostar"+" "+ b.getprice() );
}
}
}