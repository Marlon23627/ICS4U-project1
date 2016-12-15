import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a game: TicTacToe or Stones?"); //user selects their game
		
		if(sc.nextLine().equals("Stones"))
		{
			//creates the grid
			System.out.println("Welcome to Stones!");
			Grid stones = new Stones();
			stones.generateGrid();
			
			//Player1 selects their coordinates for the game
			System.out.println("Player 1, please select your coordinates");
			GamePieces player1 = new Stones("stones", sc.nextInt(), sc.nextInt());
			
		}
		
		else if(sc.nextLine().equals("TicTacToe"))
		{
			Grid tictactoe = new TicTacToe();
		}
		
		else
		{
			System.out.println("That is not a valid game!");
		}
		
		GamePieces stones = new Stones("stones", sc.nextInt(), sc.nextInt());
		stones.changePiece(); //gets rid of it now
			
		// declare and initialize a JFrame
				JFrame myFrame = new JFrame();

				// config frame settings
				myFrame.setLocationRelativeTo(null);

				myFrame.setTitle("Grid Mania");
				myFrame.setSize(800, 800);
				myFrame.setResizable(false);
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// Get the size of the screen
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

				int x = (dim.width - myFrame.getSize().width) / 2;

				int y = (dim.height - myFrame.getSize().height) / 2;

				// center it
				myFrame.setLocation(x, y);

				// make our frame visible
				myFrame.setVisible(true);
	}

}
