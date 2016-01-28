package se.mah.ke.k3lara;
public class House{
	 private int yearBuilt;
	 private int size;
	 private final int minSize = 10;
	 private final int maxSize=1000;
	 private final int minYear=1800;
	 private final int maxYear=2015;
	 public House(int yearBuilt,int size){
			if(size>=minSize && size<=maxSize){
				this.size = size;	
			}
			else{this.size = 10;									
			}if(yearBuilt>=minYear && yearBuilt<=maxYear){
				this.yearBuilt = yearBuilt;}
			else{
				this.yearBuilt = 0;
			}
	 }
	 public int getYearBuilt(){
	 return	 this.yearBuilt;
	 }
	 public int getSize(){
	 return this.size;
	 }
	}

	