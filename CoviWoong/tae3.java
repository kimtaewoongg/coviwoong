
public class tae3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath2.add(200L, 100L)); // Ŭ�����޼��� ȣ��(��ü �������� ȣ�Ⱑ��)
		MyMath2 mm = new MyMath2();	// �ν��Ͻ� ����
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add()); // �ν��Ͻ��޼���(ȣ��)
	}

}

class MyMath2{
	long a, b;
	
	
	long add() {	// �ν��Ͻ� �޼���
		return a + b;
	}
	
	static long add(long a, long b) { // Ŭ�����޼���(static�޼���)
		return a + b;
	}
}