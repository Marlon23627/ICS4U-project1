import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class Stones extends GridMania implements GridGame{
	
	ResetVariables resetClass = new StoneReset(); // use later to do downcast etc
	
	CleanUpStones cleanCode = new CleanUpStones();
	
	static int stoneGameBoard[][]; // arranged as [x][y], eg. [0][0] is top left corner
	
	static int stoneTurns;
	
	static boolean player1Turn = true, player2Turn = false; //needed to draw whose turn it is, and whether to draw x or o
	
	static boolean oneWin = false, twoWin = false, stoneNoWin = false; //will be used to see who won at the end of game
	
	static int player1TurnsLeft = 3, player2TurnsLeft = 3;
	
	static boolean stoneEXIST[] = new boolean [25];	
	
	public Stones() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		generateGrid(); // reset the grid basics
		
		resetClass.resetVariables(); //resets necessary static variables and arrays for new game
	}
	
	public void enterMove(){
		if(player1TurnsLeft < 3 || player2TurnsLeft < 3){ // make sure they have made 1 turn before
			if(ProjectMain.mouseY >= 736 && ProjectMain.mouseY <= 764){
				if(ProjectMain.mouseX >= 341 && ProjectMain.mouseX <= 464){
					((StoneReset)resetClass).resetAfterTurn(); //down cast to this method to reset necessary variables after each enter move
				}
			}
		}
	}
	
	@Override
	public void run() throws IOException {
		// TODO Auto-generated method stub
		checkQuitGame();//check if user clicked x
		
		if((System.currentTimeMillis() - ProjectMain.waitTimeSelection) >= 500){ // this checks for delay (avoids clicking into board from main menu
			updateGridPiece();
		}
		
		isWinner();
		
		enterMove();
	}

	@Override
	public void generateGrid() {
		// TODO Auto-generated method stub
		stoneGameBoard = new int[5][5];
		stoneTurns = 1;
	}

	@Override
	public void updateGridPiece() {
		// TODO Auto-generated method stub
		/*
		 * This is layout for grid of stones for stoneEXIST[i] i corresponds to numbers
		 *
		 * 0 | 1 | 2 | 3 | 4
		 * 5 | 6 | 7 | 8 | 9
		 * 10| 11| 12| 13| 14
		 * 15| 16| 17| 18| 19
		 * 20| 21| 22| 23| 24
		 * 
		 * stoneGameBoard [x][y] = 1 // a 1 denotes a user has clicked there previously
		 */
		cleanCode.cleanPieceEnter(); //all code for this is done in a separate class for the sake of being clean
	}

	@Override
	public void isWinner() {
		// TODO Auto-generated method stub
		cleanCode.cleanFindWinner(); //all code for this is done in a separate class for the sake of being clean
		
	}

}
