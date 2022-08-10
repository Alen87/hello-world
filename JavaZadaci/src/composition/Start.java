package composition;

import java.util.Arrays;

public class Start {
	public Start() {
		
		Wall wall1 =new Wall("West");
		Wall wall2 =new Wall("East");
		Wall wall3 =new Wall("South");
		Wall wall4 =new Wall("North");
		
		
		Ceiling ceiling = new Ceiling(12,55);
		Bed bed = new Bed("Modern",4,3,2,1);
		Lamp lamp = new Lamp("Calssic" ,false,75);
		
		
		
		
		Bedroom  bedroom = new Bedroom("Alen",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
		
		bedroom.toString();
		
		bedroom.makeBed();
		
		bedroom.getLamp().turnOn();
		
				
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Start();
		
	}
	

}
