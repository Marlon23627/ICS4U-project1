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
		
		//*********CODE FOR STONES GAME********//
		if(sc.nextLine().equals("Stones"))
		{
			//creates the grid
			System.out.println("Welcome to Stones!");
			Grid stones = new Stones();
			stones.generateGrid();
			
			//Player1 selects their coordinates for the game
			GamePieces play = new Stones("stones", 25);
			
			//Game ends when all stones are gone
			while(play.piecesTotal() != 0)
			{
				play.determinePlayer(true); //true = player1
				System.out.println("Player 1, please select your coordinates"); //Coordinates are selected by row then column... gotta fix
				((Stones)play).setCoordinates(sc.nextInt(), sc.nextInt()); // another downcast!!!!
				play.changePiece();
				play.updateGrid();
				
				//they can get 2 more turns
				for(int i = 0; i < 2; i++)
				{
					System.out.println("Remove another piece? yes or no?");
					sc.nextLine();
					if(sc.nextLine().equals("yes"))
					{
						System.out.println("Select your new coordinates");
						((Stones)play).setCoordinates(sc.nextInt(), sc.nextInt()); //downcast is here!!!
						if(play.changePiece() == false)
						{
							i--;
						}
						play.updateGrid();
					}
					else
					{
						i = 2;
					}
					//HAVE TO ADD CODE FOR IF THEY DONT SAY YES OR NO
				}
				
				//Player2 selects their coordinates for the game now
				play.determinePlayer(false);
				System.out.println("Player 2, please select your coordinates");
				((Stones)play).setCoordinates(sc.nextInt(), sc.nextInt()); // another downcast!!!!
				play.changePiece();
				play.updateGrid();
				
				//they can get 2 more turns
				for(int i = 0; i < 2; i++)
				{
					System.out.println("Remove another piece? yes or no?");
					sc.nextLine();
					if(sc.nextLine().equals("yes"))
					{
						System.out.println("Select your new coordinates");
						((Stones)play).setCoordinates(sc.nextInt(), sc.nextInt()); //downcast is here!!!
						if(play.changePiece() == false) //checks if they pick a spot that has already been chosen
						{
							i--;
						}
						play.updateGrid();
					}
					else
					{
						i = 2;
					}
				}
			}
		}
		
		//CODE FOR TICTACTOE GAME
		else if(sc.nextLine().equals("TicTacToe"))
		{
			Grid tictactoe = new TicTacToe();
		}
		
		else
		{
			System.out.println("That is not a valid game!");
		}
	}

}
