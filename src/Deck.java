import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

import javax.imageio.ImageIO;


public class Deck {
	//import club pngs
	
	private BufferedImage ace_c,two_c,three_c,four_c, five_c, six_c,seven_c, eight_c, nine_c, ten_c, j_c, q_c,k_c, ace_d, two_d, three_d, four_d, five_d, six_d,
	seven_d, eight_d, nine_d, ten_d, j_d, q_d, k_d, ace_h, two_h, three_h, four_h, five_h, six_h, seven_h, eight_h, nine_h, ten_h, j_h, q_h, k_h,ace_s, two_s, three_s, four_s, five_s, six_s,
	seven_s, eight_s, nine_s, ten_s, j_s, q_s, k_s, joker;
	
	private Deque<Card> deck= new ArrayDeque<Card>();
	private Deque<Integer> taken= new ArrayDeque<Integer>();
	
	private Card aceD, twoD, threeD, fourD, fiveD, sixD, sevenD, eightD, nineD, tenD, jD, qD, kD, aceC, twoC, threeC, fourC, fiveC, sixC, sevenC, eightC, nineC, tenC, jC, qC, kC,aceH, twoH, 
	threeH, fourH, fiveH, sixH, sevenH, eightH, nineH, tenH, jH, qH, kH, aceS, twoS, threeS, fourS, fiveS, sixS, sevenS, eightS, nineS, tenS, jS, qS, kS, jokerCard;

	public Deck(){
		try{
			ace_c = ImageIO.read(new File("c1.png"));		aceC=new Card(1,2,ace_c);
			two_c = ImageIO.read(new File("c2.png"));		twoC=new Card(2,2,two_c);
			three_c = ImageIO.read(new File("c3.png"));		threeC=new Card(3,2,three_c);
			four_c = ImageIO.read(new File("c4.png"));		fourC=new Card(4,2,four_c);
			five_c = ImageIO.read(new File("c5.png"));		fiveC=new Card(5,2,five_c);
			six_c = ImageIO.read(new File("c6.png"));		sixC=new Card(6,2,six_c);
			seven_c = ImageIO.read(new File("c7.png"));		sevenC=new Card(7,2,seven_c);
			eight_c = ImageIO.read(new File("c8.png"));		eightC=new Card(8,2,eight_c);
			nine_c = ImageIO.read(new File("c9.png"));		nineC=new Card(9,2,nine_c);
			ten_c = ImageIO.read(new File("c10.png"));		tenC=new Card(10,2,ten_c);
			j_c = ImageIO.read(new File("cj.png"));			jC=new Card(11,2,j_c);
			q_c = ImageIO.read(new File("cq.png"));			qC=new Card(12,2,q_c);
			k_c = ImageIO.read(new File("ck.png"));			kC=new Card(13,2,k_c);
			//import diamond pngs
			ace_d = ImageIO.read(new File("d1.png"));		aceD=new Card(1,1,ace_d);
			two_d = ImageIO.read(new File("d2.png"));		twoD=new Card(2,1,two_d);
			three_d = ImageIO.read(new File("d3.png"));		threeD=new Card(3,1,three_d);
			four_d = ImageIO.read(new File("d4.png"));		fourD=new Card(4,1,four_d);
			five_d = ImageIO.read(new File("d5.png"));		fiveD=new Card(5,1,five_d);
			six_d = ImageIO.read(new File("d6.png"));		sixD=new Card(6,1,six_d);
			seven_d = ImageIO.read(new File("d7.png"));		sevenD=new Card(7,1,seven_d);
			eight_d = ImageIO.read(new File("d8.png"));		eightD=new Card(8,1,eight_d);
			nine_d = ImageIO.read(new File("d9.png"));		nineD=new Card(9,1,nine_d);
			ten_d = ImageIO.read(new File("d10.png"));		tenD=new Card(10,1,ten_d);
			j_d = ImageIO.read(new File("dj.png"));			jD=new Card(11,1,j_d);
			q_d = ImageIO.read(new File("dq.png"));			qD=new Card(12,1,q_d);
			k_d = ImageIO.read(new File("dk.png"));			kD=new Card(13,1,k_d);
			//import hearts pngs
			ace_h = ImageIO.read(new File("h1.png"));		aceH=new Card(1,3,ace_h);
			two_h = ImageIO.read(new File("h2.png"));		twoH=new Card(2,3,two_h);
			three_h = ImageIO.read(new File("h3.png"));		threeH=new Card(3,3,three_h);
			four_h = ImageIO.read(new File("h4.png"));		fourH=new Card(4,3,four_h);
			five_h = ImageIO.read(new File("h5.png"));		fiveH=new Card(5,3,five_h);
			six_h = ImageIO.read(new File("h6.png"));		sixH=new Card(6,3,six_h);
			seven_h = ImageIO.read(new File("h7.png"));		sevenH=new Card(7,3,seven_h);
			eight_h = ImageIO.read(new File("h8.png"));		eightH=new Card(8,3,eight_h);
			nine_h = ImageIO.read(new File("h9.png"));		nineH=new Card(9,3,nine_h);
			ten_h = ImageIO.read(new File("h10.png"));		tenH=new Card(10,3,ten_h);
			j_h = ImageIO.read(new File("hj.png"));			jH=new Card(11,3,j_h);
			q_h = ImageIO.read(new File("hq.png"));			qH=new Card(12,3,q_h);
			k_h = ImageIO.read(new File("hk.png"));			kH=new Card(13,3,k_h);
			//import spades pngs
			ace_s = ImageIO.read(new File("s1.png"));		aceS=new Card(1,4,ace_s);
			two_s = ImageIO.read(new File("s2.png"));		twoS=new Card(2,4,two_s);
			three_s = ImageIO.read(new File("s3.png"));		threeS=new Card(3,4,three_s);
			four_s = ImageIO.read(new File("s4.png"));		fourS=new Card(4,4,four_s);
			five_s = ImageIO.read(new File("s5.png"));		fiveS=new Card(5,4,five_s);
			six_s = ImageIO.read(new File("s6.png"));		sixS=new Card(6,4,six_s);
			seven_s = ImageIO.read(new File("s7.png"));		sevenS=new Card(7,4,seven_s);
			eight_s = ImageIO.read(new File("s8.png"));		eightS=new Card(8,4,eight_s);
			nine_s = ImageIO.read(new File("s9.png"));		nineS=new Card(9,4,nine_s);
			ten_s = ImageIO.read(new File("s10.png"));		tenS=new Card(10,4,ten_s);
			j_s = ImageIO.read(new File("sj.png"));			jS=new Card(11,4,j_s);
			q_s = ImageIO.read(new File("sq.png"));			qS=new Card(12,4,q_s);
			k_s = ImageIO.read(new File("sk.png"));			kS=new Card(13,4,k_s);
			joker = ImageIO.read(new File("jb.png"));		jokerCard=new Card(1,1,joker);
			jokerCard.flipJoker();
			} catch (Exception ex) {
				   System.out.println("image file not found");
			}
		
		buildDeck();
		shuffle();
		
			
	}
	
	public void buildDeck(){ //populate deck
		deck.push(aceD); deck.push(twoD); deck.push(threeD); deck.push(fourD); deck.push(fiveD); deck.push(sixD); deck.push(sevenD);
		deck.push(eightD); deck.push(nineD); deck.push(tenD); deck.push(jD); deck.push(qD); deck.push(kD); deck.push(aceC); deck.push(twoC); 
		deck.push(threeC); deck.push(fourC); deck.push(fiveC); deck.push(sixC); deck.push(sevenC); deck.push(eightC); deck.push(nineC); deck.push(tenC);
		deck.push(jC); deck.push(qC); deck.push(kC);deck.push(aceH); deck.push(twoH); deck.push(threeH); deck.push(fourH); deck.push(fiveH); 
		deck.push(sixH); deck.push(sevenH); deck.push(eightH);	 deck.push(nineH); deck.push(tenH); deck.push(jH); deck.push(qH); deck.push(kH); 
		deck.push(aceS); deck.push(twoS); deck.push(threeS); deck.push(fourS); deck.push(fiveS); deck.push(sixS); deck.push(sevenS); 
		deck.push(eightS); deck.push(nineS); deck.push(tenS); deck.push(jS); deck.push(qS); deck.push(kS);
		
		//System.out.println("buildDeck() done");
		
	}
	
	public void shuffle(){		//assign random order to every card in the deck, return newly ordered deck
		Deque<Card> temp= new ArrayDeque<Card>();
		Card[] hold= new Card[60];		//was getting array index exceptions so I just made the array bigger than it had to be. This is okay because
		//int j=0;
		
		for(Card current: deck){
			//j++;
			//System.out.println("on card # "+j);
			
			int index = new Random().nextInt(52); 
			
			//System.out.println("rand index: "+index);
			

			while(taken.contains(index)){
				index= new Random().nextInt(52);	//check if index has already been assigned
				//System.out.println("index changed to: "+index);
			}
			
			taken.add(index);	//add index to taken
			//System.out.println("added "+ index+" to taken");
			current.setRand(index);	
			hold[index]=current;		//place into array in proper numerical order from which they will be drawn
			
		}
		
		
		for(int i=0; i<52; i++){
			temp.addLast(hold[i]);		//push onto deque in proper order
			//System.out.println("added "+ hold[i].toString()+ "to temp");
		}
		
		deck=temp; //set new shuffled deck to instance variable
		
		
		//System.out.println("shuffle done");
		
	}
	
	public Card takeNext(){
		if(deck.isEmpty()){
			System.out.println("Deck is empty...You win!!");
			return jokerCard;
		}else{
			return deck.removeFirst();
		}
	}
	
	

}
