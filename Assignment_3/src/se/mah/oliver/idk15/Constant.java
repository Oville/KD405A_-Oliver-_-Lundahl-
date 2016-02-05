package se.mah.oliver.idk15;

public class Constant {
public static int MAX_PRICE = 30000;
public static int MIN_PRICE=0;
public static int MAX_SIZE = 28;
public static int MIN_SIZE= 8;
public static final String[] ALLOWED_COLORS = {"black","green","red","blue","white"};
/**the method changes the color name to lowercase and checks if it is a valid name. 
 * if the name is valid foundcolor=true and the color is returned.
 * if the color is invalid or not on the list it is set to black instead.*/
public static String CheckValue(String color){
	color.toLowerCase();
	boolean foundcolor= false;
	for (int i=0; i< ALLOWED_COLORS.length; i++){
		if(color.equals(ALLOWED_COLORS[i])){
			foundcolor=true;
		}
	}
if (foundcolor){
	return color;
}else {
	return "black";
}
}
	
}
