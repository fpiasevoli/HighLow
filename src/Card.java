import java.awt.image.BufferedImage;


public class Card {
	
	private static final int DIAMOND=1, CLUB=2, HEART=3, SPADE=4;
	
	private BufferedImage face;
	private int value, suit, rand;
	private boolean isJoker=false;
	
	public Card(int rank, int suit, BufferedImage cardFace){
		this.value=rank;
		this.suit=suit;
		this.face=cardFace;
	}

	public BufferedImage getFace() {
		return face;
	}

	public int getValue() {
		return value;
	}
	
	public void flipJoker(){
		isJoker=true;
	}
	
	public boolean returnJoker(){
		return isJoker;
	}

	public int getSuit() {
		return suit;
	}
	
	public int getRand(){
		return rand;
	}
	
	public BufferedImage getImage(){
		return face;
	}
	
	public void setRand(int x){
		this.rand=x;
	}

	public String toString(){
		return "This card has value "+ getValue()+ " and is of suit " + getSuit()+ " ";
	}
}
