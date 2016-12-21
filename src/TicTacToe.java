import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class TicTacToe extends GridMania implements GridGame{

	TicTacToeReset resetTicTac = new TicTacToeReset();
	
	CleanUpTicTac cleanCode = new CleanUpTicTac();
	
	static int gameBoard[][]; // arranged as [x][y], eg. [0][0] is top left corner
	
	static int turns;
	
	static boolean playerXTic = true, playerOTic = false; //needed to draw whose turn it is, and whether to draw x or o
	
	static boolean xWin = false, oWin = false, tictacNoWin = false; //will be used to see who won at the end of game

	static boolean imgXEXIST[] = new boolean [9];
	static boolean imgOEXIST[] = new boolean [9];
	
	public TicTacToe() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		resetTicTac.resetVariables(); //reset the necessary variables for new game
		
		generateGrid(); //creates new grid, sets turns to first player
	}

	@Override
	public void run() throws IOException {
		// TODO Auto-generated method stub
		checkQuitGame(); // see if x clicked, method in super class, THIS IS NOT WORKING NOW
		
		determinePlayer(turns); //check whose turn
		
		if((System.currentTimeMillis() - ProjectMain.waitTimeSelection) >= 500){ // this checks for delay (avoids clicking into board from main menu
			updateGridPiece();
		}
		isWinner();
	}

	public void determinePlayer(int turn) { //is it an x or o
		// TODO Auto-generated method stub
		if(turn % 2 == 0){
			playerXTic = false; //not his turn
			playerOTic = true; // his turn, o turn on even numbers
		}
		else{
			playerXTic = true; // x turn on odd numbers
			playerOTic = false; 
		}
			
	}
	
	@Override
	public void generateGrid() {
		// TODO Auto-generated method stub
		gameBoard = new int[3][3];//create a grid, each space is 0, the user will choose between 1 and 2	
		turns = 1; // count turns to see if full grid, multiples of 2 is player 2 turn, player one the odd numbers
	}

	@Override
	public void updateGridPiece() {
		// TODO Auto-generated method stub
		/* Game board numbering system for imgXEXIST[i] = ; this will turn X or O on into that spot
		 * 0 | 1 | 2
		 * 3 | 4 | 5
		 * 6 | 7 | 8
		 */
		cleanCode.cleanPieceEnter();
	}

	@Override
	public void isWinner() {
		cleanCode.cleanFindWinner();
	}

}
