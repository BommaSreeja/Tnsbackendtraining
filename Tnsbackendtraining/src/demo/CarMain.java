package demo;

public class CarMain {

	public static void main(String[] args) {
		Car C=new Car();
		C.name="honda";
		C.model="petrol";
		C.speed=180;
		
		Car C1=new Car();
		C1.name="hondaAmaze";
		C1.model="Diesel";
		C1.speed=120;
		
		System.out.println("Car:"+C.name+" "+C.model+" "+C.speed+"Km/h");
		System.out.println("Car1:"+C1.name+" "+C1.model+" "+C1.speed+"Km/h");
		

	}

}
