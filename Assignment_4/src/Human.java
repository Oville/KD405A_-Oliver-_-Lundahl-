/* creates the human class and gives it its variables needed to create a human*/
public class Human {
private Dog dog;
private String name="";
public Human(String name){
	this.name=name;
}
public String getName(){
	return this.name;
}
public void buyDog(Dog dog){
this.dog = dog;	
}
public String getInfo(){
	String i;
	if(dog!=null){
	i= name + " äger en hund som heter " + dog.getName();
	}else{
		i= name + " äger ingen hund "; 
	}
	return i;
	}
}


