
public class tae6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPoint3D d3 = new MyPoint3D();
		d3.x = 4;
		d3.y = 5;
		d3.z = 6;
		
		System.out.println(d3);
		

	}

}

class MyPoint3{
	int x;
	int y;
	
	int getLocation() {
		return x+y;
	}
}

class MyPoint3D extends MyPoint3{
	int z;
	
	int getLocation() {
		return x+y+z;
	}
	
	public String toString() {
		return "x+y+z : " +x+y+z;
	}
	
	
}