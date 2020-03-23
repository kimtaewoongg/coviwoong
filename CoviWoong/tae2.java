
public class tae2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("white", "auto", 4);
		System.out.println(c.color +" "+ c.gearType+" "+ c.door);
	}

}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
