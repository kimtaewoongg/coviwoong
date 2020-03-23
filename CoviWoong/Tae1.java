
public class Tae1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card cad = new Card();
		System.out.println(cad.kind + " " + cad.number );
		Card ccad = new Card("taewoong", 10);
		System.out.println(ccad.kind + " " + ccad.number );
		
		
	}
}

class Card{
	String kind;
	int number;
	Card(){
		kind = "spade";
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}
