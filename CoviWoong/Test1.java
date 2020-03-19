
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = {{10, 20}, {30, 40}};
		int[][] array2 = {{50, 60}, {20, 10}};
		int[][] result = new int[2][2];
		
		for (int a = 0; a < result.length; a++) {
			for (int b = 0; b < result.length; b++) {
				result[a][b] = array1[a][b] + array2[a][b];
				System.out.println(result[a][b]);
			}
		}
		
	}

}
