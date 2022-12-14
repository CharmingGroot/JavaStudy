package git_only.com.mc.a_objectClass;

public class Card {
	String kind;
	int number;
	
	 Card() {
		 this("Spade",1); 
	}
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
}

class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("Heart",10);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.toString());
	}
}