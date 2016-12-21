import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class Stones extends GridMania implements GridGame{
	
	ResetVariables resetClass = new StoneReset(); // use later to do downcast etc
	
	private int stoneGameBoard[][]; // arranged as [x][y], eg. [0][0] is top left corner
	
	static int stoneTurns;
	
	static boolean player1Turn = true, player2Turn = false; //needed to draw whose turn it is, and whether to draw x or o
	
	static boolean oneWin = false, twoWin = false, stoneNoWin = false; //will be used to see who won at the end of game
	
	static int player1TurnsLeft = 3, player2TurnsLeft = 3;
	
	static boolean stoneEXIST[] = new boolean [25];	
	
	public Stones() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
		stoneEXIST = new boolean [25];
		
		player1Turn = true;
		player2Turn = false;
		
		player1TurnsLeft = 3;
		player2TurnsLeft = 3;
		
		oneWin = false;
		twoWin = false;
		
		generateGrid();
		
		for(int i= 0; i<25; i++){
			stoneEXIST[i] = true;
		}
	}
	
	public void enterMove(){
		if(player1TurnsLeft < 3 || player2TurnsLeft < 3){ // make sure they have made 1 turn before
			if(ProjectMain.mouseY >= 736 && ProjectMain.mouseY <= 764){
				if(ProjectMain.mouseX >= 341 && ProjectMain.mouseX <= 464){
					stoneTurns++; // this signifies that this is a certain players turn
					
					//reset data after turn
					player1TurnsLeft = 3; 
					player2TurnsLeft = 3;
					
					if(player1Turn){ // if this is player 1 playing, swap the booleans
						player2Turn = true;
						player1Turn = false;
					}
					else{
						player2Turn = false;
						player1Turn = true;
					}
				}
			}
		}
	}
	
	@Override
	public void run() throws IOException {
		// TODO Auto-generated method stub
		checkQuitGame();//check if user clicked x
		
		updateGridPiece();
		
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
		 * stoneGameBoard [x][y] = 1 // a 1 denotes a user has clicked there previeously
		 */
		if(player1TurnsLeft > 0 && player2TurnsLeft > 0){ //either one will break ability to choose piece if they have no turns left
			if(ProjectMain.mouseY >= 109 && ProjectMain.mouseY < 200){ // top row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(stoneGameBoard[0][0] == 0){
						stoneGameBoard[0][0] = 1; 
						stoneEXIST[0] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(stoneGameBoard[1][0] == 0){
						stoneGameBoard[1][0] = 1; 
						stoneEXIST[1] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(stoneGameBoard[2][0] == 0){
						stoneGameBoard[2][0] = 1; 
						stoneEXIST[2] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(stoneGameBoard[3][0] == 0){
						stoneGameBoard[3][0] = 1; 
						stoneEXIST[3] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(stoneGameBoard[4][0] == 0){
						stoneGameBoard[4][0] = 1; 
						stoneEXIST[4] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				
			}
			else if(ProjectMain.mouseY >= 202 && ProjectMain.mouseY < 353){ //2nd row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(stoneGameBoard[0][1] == 0){
						stoneGameBoard[0][1] = 1; 
						stoneEXIST[5] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(stoneGameBoard[1][1] == 0){
						stoneGameBoard[1][1] = 1; 
						stoneEXIST[6] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(stoneGameBoard[2][1] == 0){
						stoneGameBoard[2][1] = 1; 
						stoneEXIST[7] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(stoneGameBoard[3][1] == 0){
						stoneGameBoard[3][1] = 1; 
						stoneEXIST[8] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(stoneGameBoard[4][1] == 0){
						stoneGameBoard[4][1] = 1; 
						stoneEXIST[9] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
			}
			else if (ProjectMain.mouseY >= 355 && ProjectMain.mouseY < 476){ // 3rd row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(stoneGameBoard[0][2] == 0){
						stoneGameBoard[0][2] = 1; 
						stoneEXIST[10] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(stoneGameBoard[1][2] == 0){
						stoneGameBoard[1][2] = 1; 
						stoneEXIST[11] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(stoneGameBoard[2][2] == 0){
						stoneGameBoard[2][2] = 1; 
						stoneEXIST[12] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(stoneGameBoard[3][2] == 0){
						stoneGameBoard[3][2] = 1; 
						stoneEXIST[13] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(stoneGameBoard[4][2] == 0){
						stoneGameBoard[4][2] = 1; 
						stoneEXIST[14] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
			}
			else if(ProjectMain.mouseY >= 478 && ProjectMain.mouseY < 599){ // 4th row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(stoneGameBoard[0][3] == 0){
						stoneGameBoard[0][3] = 1; 
						stoneEXIST[15] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(stoneGameBoard[1][3] == 0){
						stoneGameBoard[1][3] = 1; 
						stoneEXIST[16] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(stoneGameBoard[2][3] == 0){
						stoneGameBoard[2][3] = 1; 
						stoneEXIST[17] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(stoneGameBoard[3][3] == 0){
						stoneGameBoard[3][3] = 1; 
						stoneEXIST[18] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(stoneGameBoard[4][3] == 0){
						stoneGameBoard[4][3] = 1; 
						stoneEXIST[19] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
			}
			else if(ProjectMain.mouseY >= 601 && ProjectMain.mouseY < 722){ // 5th row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(stoneGameBoard[0][4] == 0){
						stoneGameBoard[0][4] = 1; 
						stoneEXIST[20] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(stoneGameBoard[1][4] == 0){
						stoneGameBoard[1][4] = 1; 
						stoneEXIST[21] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(stoneGameBoard[2][4] == 0){
						stoneGameBoard[2][4] = 1; 
						stoneEXIST[22] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(stoneGameBoard[3][4] == 0){
						stoneGameBoard[3][4] = 1; 
						stoneEXIST[23] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(stoneGameBoard[4][4] == 0){
						stoneGameBoard[4][4] = 1; 
						stoneEXIST[24] = false; // stone is off board now
						
						if(player1Turn){
							player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							player2TurnsLeft--; 
						}
					}
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
		
	}

	@Override
	public void isWinner() {
		// TODO Auto-generated method stub
		int fullSpaces = 0; // count how many spaces in array contain 1 values
		
		for(int y = 0; y < 5; y++){
			
			for(int x = 0; x < 5; x++){
				
				if(stoneGameBoard[x][y] == 1)
					fullSpaces++;
			}
		}
		
		if(fullSpaces == 25){ // we have a full grid
			if(player1Turn){
				oneWin = true;//player 1 has used up a turn
				ProjectMain.gameState = 3;
			}
			else{
				twoWin = true; 
				ProjectMain.gameState = 3;
			}
		}
		
		
	}

	@Override
	public void pieceExist() {
		// TODO Auto-generated method stub
		
	}

}
