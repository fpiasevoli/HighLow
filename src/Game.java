import java.awt.image.BufferedImage;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Game {
	private static final int HIGH=1, LOW=-1;
	
	private Deck deck;
	private int counter;
	private Card current, waiting;
	private Deque<Card> alreadyPlayed= new ArrayDeque<Card>();
	public Scanner scan = new Scanner(System.in);
	private StringBuffer played=new StringBuffer();


	
	
	public Game(){
		deck= new Deck();
		counter=0;
		current=deck.takeNext();		//take first card that the player will see
		alreadyPlayed.addLast(current);	//add to collection of cards already played
		waiting=deck.takeNext();		//take card that the player will have to guess if it is higher/lower than current
		System.out.println("Current card value is: "+ current.getValue());
		System.out.println("What is your prediction? 1= Higher, -1= Lower");
		
	}

	public int makeMove(int prediction){
		if(prediction!=-1 && prediction!=1){
			System.out.println("enter a proper index, you douche");
			int move = scan.nextInt();
			makeMove(move);
		}
		
		if(prediction==checkStatus()|| checkStatus()==0){
			System.out.println("Correct!");
			alreadyPlayed.addLast(waiting);
			
			played=played.append(current.getValue()+" ");
			
			current=waiting;
			waiting=deck.takeNext();
			if(waiting.returnJoker()){				
				System.out.println("WINNERRRRRRRRR");
				return 0;
			}
			counter++;
			System.out.println("Current card value is: "+ current.getValue());
			//System.out.println("Debug: card waiting is "+ waiting.getValue());
			System.out.println("What is your prediction? 1= Higher, -1= Lower");
			
			
			
			return 1;

		}else{
			System.out.println("Nah man. You're wrong!");
			System.out.println("The next card was "+ waiting.getValue());
			
			return -1;
			
		}
	}
	
	public int checkStatus(){
		if(waiting.getValue()==current.getValue()){		//if cards are of equal value, tie goes to the player
			return 0;
		}else if(waiting.getValue()>current.getValue()){
			return 1;
		} else{
			return -1;
		}
	}
	
	public int getCounter(){
		return counter;
	}
	
	public BufferedImage getCurrentImage(){
		return current.getImage();
	}
	
	public String getCardsPlayed(){
		return "The cards already played are: "+played.toString();
	}
}
