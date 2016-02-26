package SearchGuit;

import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class searchstation extends Thread{
	private Parser parser;
	private SearchGui gui;
	
	public searchstation(Parser p, SearchGui g){
		this.parser=p;
		this.gui=g;
	}
	
	public void run(){
		
	String searchURL = Constants.getURL(gui.textFieldFrom.getText(),gui.textFieldTo.getText(),1);
	Journeys journeys = Parser.getJourneys(searchURL);
	
	
	for (Journey journey : journeys.getJourneys()) {
		gui.textArea.setText(journey.getStartStation()+" - ");
		gui.textArea.append(journey.getEndStation()+"");
		String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
		gui.textArea.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+"\n"+	 " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
	} 
}
}