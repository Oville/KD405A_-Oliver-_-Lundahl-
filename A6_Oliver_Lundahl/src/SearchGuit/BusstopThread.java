package SearchGuit;

import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class BusstopThread extends Thread {
private Parser parser;
private SearchGui seek;
public BusstopThread(Parser p, SearchGui Seek){
this.parser=p;
this.seek=Seek;
}
public void run(){
	  System.out.println("// Stations when searching for stations containing \"Malm\""); 
			seek.searchStations.addAll(Parser.getStationsFromURL(seek.textFieldBusStop.getText()));
			for (Station s: seek.searchStations){
				seek.textAreaBusstop.append(s.getStationName() +" number:" +s.getStationNbr()+"\n");
			}
}
}
