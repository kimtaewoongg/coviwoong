
public class tae5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InitTest itest = new InitTest();
		
		System.out.println(itest.x +" "+ itest.y + " " + itest.d);
		System.out.println(itest.toString());
		InitTest itest2 = new InitTest();
		System.out.println(itest2.toString());
		System.out.println(itest);
	
	}

}

class InitTest{
	int x;
	int y = x;
	double d;
	
	void method1() {
		int i;
		//int j = i;  // 지역변수는 초기화가 자동적으로 x
	}
}