// 생성자 this()
// 생성자에서 다른 생성자 호출할 때 사용
// 다른 생성자 호출시 첫 줄에서만 사용가능

public class tae4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car5 c5 = new Car5();
		System.out.println(c5.color +" "+ c5.gearType +" "+ c5.door);
		Car5 c55 = new Car5("yellow");
		System.out.println(c55.color +" "+ c55.gearType +" "+ c55.door);
	}

}


class Car5 {
	String color;
	String gearType;
	int door;
	
	Car5(){
		this("white", "auto", 4);
	}
	
	Car5(String color){
		this(color, "auto", 4);
	}
	
	Car5(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}