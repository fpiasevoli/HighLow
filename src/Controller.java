import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Controller {
	
	private void playGame(){
		
		Scanner scan = new Scanner(System.in);
		
		int highscore=0;
		
		int decision=1;
		
		
		while(decision==1){
			int counter=0;
			
			
			Game play= new Game();
			//ImageIcon image= new ImageIcon(play.getCurrentImage());
			//pane.add(new JLabel(image),BorderLayout.CENTER);
		
			int still_alive=1;
		
			while(still_alive==1){
				
				System.out.println("Number of cards played: "+counter);
				counter++;
				int move = scan.nextInt();
				still_alive=play.makeMove(move);
				System.out.println(play.getCardsPlayed());
			
		
			}
		
			if(counter>highscore){	//set high score
				highscore=--counter;
				System.out.println("New highscore!!!! "+ highscore);
			}
			
			
			System.out.println("Current highscore: "+ highscore);
			System.out.println("Would you like to play again?? Answer 1 for yes, 0 for no");
			decision = scan.nextInt();
		
		

		}
	}
	
	
	
	
	public static void main(String[] args){
		
		Controller play= new Controller();
		
		//Create and set up the window.
        JFrame frame = new JFrame("High Low");
        
        Container pane= frame.getContentPane();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        JButton higher = new JButton("Higher");
        pane.add(higher, BorderLayout.PAGE_START);
        
        //Make the center component big, since that's the
        //typical usage of BorderLayout.
        JButton button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(new JLabel("Hello Filip Piasevoli"));
        
        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.LINE_START);
        
        JButton lower = new JButton("Lower");
        pane.add(lower, BorderLayout.PAGE_END);
        
        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.LINE_END);
       
        frame.pack();
        frame.setVisible(true);
        
        
		
		play.playGame();
		
		
		
		
	}
}
