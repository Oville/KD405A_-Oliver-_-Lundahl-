
public class Snake extends Animal {
	private boolean poisonus;

	public Snake(String latinName, boolean poisonus) {
		super(latinName);
	this.poisonus=poisonus;
	}
	public boolean giftig() {
		if (poisonus) {
			return true;
		} else {
			return false;
		}
	
	}
@Override
public String getInfo(){
	String p;
	if(giftig()){
		p="";
	}else{ 
	p="not";
	}
	return "The snake named "+getLatinName()+" is "+p+ "poisonus";
}
}