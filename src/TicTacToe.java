import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class TicTacToe extends GridMania implements GridGame{

	private int gameBoard[][]; // arranged as [x][y], eg. [0][0] is top left corner
	
	static int turns;
	
	static boolean playerXTic = true, playerOTic = false; //needed to draw whose turn it is, and whether to draw x or o
	
	static boolean xWin = false, oWin = false; //will be used to see who won at the end of game

	static boolean imgXEXIST[] = new boolean [9];
	static boolean imgOEXIST[] = new boolean [9];
	
	public TicTacToe() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		//reset old static variables for fresh game     
		imgXEXIST = new boolean[9];
		imgOEXIST = new boolean[9];
		
		playerXTic = true;
		playerOTic = false;
		xWin = false;
		oWin = false;
		
		generateGrid();
		
	}

	@Override
	public void run() throws IOException {
		// TODO Auto-generated method stub
		checkQuitGame(); // see if x clicked, method in super class, THIS IS NOT WORKING NOW
		determinePlayer(turns); //check whose turn
		updateGridPiece();
		pieceExist(); // this checks positions for taken spots, used for drawing 
		isWinner();
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
		if(ProjectMain.mouseY >= 162 && ProjectMain.mouseY<= 324){ //we are clicking in top third
			if(ProjectMain.mouseX >= 160 && ProjectMain.mouseX <= 320){ //top left
				if(gameBoard[0][0] == 0){
					if(playerXTic)
						gameBoard[0][0] = 1;//x player values are 1
					else
						gameBoard[0][0] = 2; // o player values are 2
					++turns;//we have made a turn
					System.out.println("works");
				}
			}
			else if(ProjectMain.mouseX > 324 &&ProjectMain.mouseX <= 483){ // top middle
				if(gameBoard[1][0] == 0){
					if(playerXTic)
						gameBoard[1][0] = 1;//x player values are 1
					else
						gameBoard[1][0] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 483 &&ProjectMain.mouseX <= 642){ // top right
				if(gameBoard[2][0] == 0){
					if(playerXTic)
						gameBoard[2][0] = 1;//x player values are 1
					else
						gameBoard[2][0] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
		}
		else if(ProjectMain.mouseY > 324 && ProjectMain.mouseY<= 480){ //middle part of grid
			if(ProjectMain.mouseX >= 160 && ProjectMain.mouseX <= 320){ //top left
				if(gameBoard[0][1] == 0){
					if(playerXTic)
						gameBoard[0][1] = 1;//x player values are 1
					else
						gameBoard[0][1] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 324 &&ProjectMain.mouseX <= 483){ // top middle
				if(gameBoard[1][1] == 0){
					if(playerXTic)
						gameBoard[1][1] = 1;//x player values are 1
					else
						gameBoard[1][1] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 483 &&ProjectMain.mouseX <= 642){ // top right
				if(gameBoard[2][1] == 0){
					if(playerXTic)
						gameBoard[2][1] = 1;//x player values are 1
					else
						gameBoard[2][1] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
		}
		else if(ProjectMain.mouseY > 480 && ProjectMain.mouseY<= 646){
			if(ProjectMain.mouseX >= 160 && ProjectMain.mouseX <= 320){ //top left
				if(gameBoard[0][2] == 0){
					if(playerXTic)
						gameBoard[0][2] = 1;//x player values are 1
					else
						gameBoard[0][2] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 324 &&ProjectMain.mouseX <= 483){ // top middle
				if(gameBoard[1][2] == 0){
					if(playerXTic)
						gameBoard[1][2] = 1;//x player values are 1
					else
						gameBoard[1][2] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 483 &&ProjectMain.mouseX <= 642){ // top right
				if(gameBoard[2][2] == 0){
					if(playerXTic)
						gameBoard[2][2] = 1;//x player values are 1
					else
						gameBoard[2][2] = 2; // o player values are 2
					++turns;//we have made a turn
				}
			}
		}
	}

	@Override
	public boolean checkGridWin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void determinePlayer(int turn) {
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
	public void isWinner() {
		boolean tempCheckWin = false;
		
		if((gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2] )&& gameBoard[0][0] != 0){
			tempCheckWin = true;
		}
		else if((gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]) && gameBoard[1][0] != 0){
			tempCheckWin = true;
		}
		else if((gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2])&& gameBoard[2][0] != 0){
			tempCheckWin = true;
		}
		else if((gameBoard[0][0] == gameBoard[1][0] && gameBoard[1][0] == gameBoard[2][0]) && gameBoard[0][0] != 0){
			tempCheckWin = true;
		}
		else if((gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]) && gameBoard[1][0] != 0){
			tempCheckWin = true;
		}
		else if((gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2]) && gameBoard[2][0] != 0){
			tempCheckWin = true;
		}
		else if((gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) && gameBoard[0][0] != 0){
			tempCheckWin = true;
		}
		else if((gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2])&& gameBoard[2][0] != 0){
			tempCheckWin = true;
		}
		
		if(tempCheckWin && (turns % 2 == 0)){
			oWin = true;
			ProjectMain.gameState = 3;
		}
		else if (tempCheckWin && !(turns % 2 == 0)){
			xWin = true;
			ProjectMain.gameState = 3;
		}
			
	}

	@Override
	public void pieceExist() {
		// TODO Auto-generated method stub
		/* Game board numbering system ie. for i
		 * 0 | 1 | 2
		 * 3 | 4 | 5
		 * 6 | 7 | 8
		 * 
		 * a 1 at position [x][y] in gameBoard signifies an X
		 * a 2 signifies an O
		 */
		for(int y = 0, i = 0; y < 3; y++){ 	// i is is which grid box, 0-2 on top row, 3-5 middle, etc
			for(int x = 0; x < 3;x++, i++){ 
				if(gameBoard[x][y] == 1)      // there is an X there
					imgXEXIST[i] = true;
				else if(gameBoard[x][y] == 2)   // there is an Y there
					imgOEXIST[i] = true;
			}
		}
		
	}

}
