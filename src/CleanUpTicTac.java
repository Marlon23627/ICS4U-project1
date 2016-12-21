
public class CleanUpTicTac implements LongCodeCleanUp {

	@Override
	public void cleanPieceEnter() {
		// TODO Auto-generated method stub
		/* Game board numbering system for imgXEXIST[i] = ; this will turn X or O on into that spot
		 * 0 | 1 | 2
		 * 3 | 4 | 5
		 * 6 | 7 | 8
		 */
		if(ProjectMain.mouseY >= 162 && ProjectMain.mouseY<= 324){ //we are clicking in top third
			if(ProjectMain.mouseX >= 160 && ProjectMain.mouseX <= 320){ //top left
				if(TicTacToe.gameBoard[0][0] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[0][0] = 1;//x player values are 1
						TicTacToe.imgXEXIST[0] = true;
					}
					else{
						TicTacToe.gameBoard[0][0] = 2; // o player values are 2
						TicTacToe.imgOEXIST[0] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 324 &&ProjectMain.mouseX <= 483){ // top middle
				if(TicTacToe.gameBoard[1][0] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[1][0] = 1;//x player values are 1
						TicTacToe.imgXEXIST[1] = true;
					}
					else{
						TicTacToe.gameBoard[1][0] = 2; // o player values are 2
						TicTacToe.imgOEXIST[1] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 483 &&ProjectMain.mouseX <= 642){ // top right
				if(TicTacToe.gameBoard[2][0] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[2][0] = 1;//x player values are 1
						TicTacToe.imgXEXIST[2] = true;
					}
					else{
						TicTacToe.gameBoard[2][0] = 2; // o player values are 2
						TicTacToe.imgOEXIST[2] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
		}
		else if(ProjectMain.mouseY > 324 && ProjectMain.mouseY<= 480){ //middle part of grid
			if(ProjectMain.mouseX >= 160 && ProjectMain.mouseX <= 320){ //top left
				if(TicTacToe.gameBoard[0][1] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[0][1] = 1;//x player values are 1
						TicTacToe.imgXEXIST[3] = true;
					}
					else{
						TicTacToe.gameBoard[0][1] = 2; // o player values are 2
						TicTacToe.imgOEXIST[3] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 324 &&ProjectMain.mouseX <= 483){ // top middle
				if(TicTacToe.gameBoard[1][1] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[1][1] = 1;//x player values are 1
						TicTacToe.imgXEXIST[4] = true;
					}
					else{
						TicTacToe.gameBoard[1][1] = 2; // o player values are 2
						TicTacToe.imgOEXIST[4] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 483 &&ProjectMain.mouseX <= 642){ // top right
				if(TicTacToe.gameBoard[2][1] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[2][1] = 1;//x player values are 1
						TicTacToe.imgXEXIST[5] = true;
					}
					else{
						TicTacToe.gameBoard[2][1] = 2; // o player values are 2
						TicTacToe.imgOEXIST[5] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
		}
		else if(ProjectMain.mouseY > 480 && ProjectMain.mouseY<= 646){
			if(ProjectMain.mouseX >= 160 && ProjectMain.mouseX <= 320){ //top left
				if(TicTacToe.gameBoard[0][2] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[0][2] = 1;//x player values are 1
						TicTacToe.imgXEXIST[6] = true;
					}
					else{
						TicTacToe.gameBoard[0][2] = 2; // o player values are 2
						TicTacToe.imgOEXIST[6] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 320 &&ProjectMain.mouseX <= 483){ // top middle
				if(TicTacToe.gameBoard[1][2] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[1][2] = 1;//x player values are 1
						TicTacToe.imgXEXIST[7] = true;
					}
					else{
						TicTacToe.gameBoard[1][2] = 2; // o player values are 2
						TicTacToe.imgOEXIST[7] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
			else if(ProjectMain.mouseX > 483 &&ProjectMain.mouseX <= 642){ // top right
				if(TicTacToe.gameBoard[2][2] == 0){
					if(TicTacToe.playerXTic){
						TicTacToe.gameBoard[2][2] = 1;//x player values are 1
						TicTacToe.imgXEXIST[8] = true;
					}
					else{
						TicTacToe.gameBoard[2][2] = 2; // o player values are 2
						TicTacToe.imgOEXIST[8] = true;
					}
					++TicTacToe.turns;//we have made a turn
				}
			}
		}
	}

	@Override
	public void cleanFindWinner() {
		// TODO Auto-generated method stub
boolean tempCheckWin = false;
		
		if((TicTacToe.gameBoard[0][0] == TicTacToe.gameBoard[0][1] && TicTacToe.gameBoard[0][1] == TicTacToe.gameBoard[0][2] ) 
				&& TicTacToe.gameBoard[0][0] != 0){ //row 1 down
			tempCheckWin = true;
		}
		else if((TicTacToe.gameBoard[1][0] == TicTacToe.gameBoard[1][1] && TicTacToe.gameBoard[1][1] == TicTacToe.gameBoard[1][2]) 
				&& TicTacToe.gameBoard[1][0] != 0){ //row 2 down
			tempCheckWin = true;
		}
		else if((TicTacToe.gameBoard[2][0] == TicTacToe.gameBoard[2][1] && TicTacToe.gameBoard[2][1] == TicTacToe.gameBoard[2][2])
				&& TicTacToe.gameBoard[2][0] != 0){ //row 3 down
			tempCheckWin = true;
		}
		else if((TicTacToe.gameBoard[0][0] == TicTacToe.gameBoard[1][0] && TicTacToe.gameBoard[1][0] == TicTacToe.gameBoard[2][0])
				&& TicTacToe.gameBoard[0][0] != 0){ //row 1 across
			tempCheckWin = true;
		}
		else if((TicTacToe.gameBoard[0][1] == TicTacToe.gameBoard[1][1] && TicTacToe.gameBoard[1][1] == TicTacToe.gameBoard[2][1]) 
				&& TicTacToe.gameBoard[0][1] != 0){ //row 2 across
			tempCheckWin = true;
		}
		else if((TicTacToe.gameBoard[0][2] == TicTacToe.gameBoard[1][2] && TicTacToe.gameBoard[1][2] == TicTacToe.gameBoard[2][2]) 
				&& TicTacToe.gameBoard[0][2] != 0){ //row 3 across
			tempCheckWin = true;
		}
		else if((TicTacToe.gameBoard[0][0] == TicTacToe.gameBoard[1][1] && TicTacToe.gameBoard[1][1] == TicTacToe.gameBoard[2][2]) 
				&& TicTacToe.gameBoard[0][0] != 0){ //left corner to bottom right corner
			tempCheckWin = true;
		}
		else if((TicTacToe.gameBoard[2][0] == TicTacToe.gameBoard[1][1] && TicTacToe.gameBoard[1][1] == TicTacToe.gameBoard[0][2])
				&& TicTacToe.gameBoard[2][0] != 0){ //right corner to left bottom corner
			tempCheckWin = true;
		}
		
		//if we have a win or no win change game state
		if(tempCheckWin && ((TicTacToe.turns-1) % 2 == 0)){
			TicTacToe.oWin = true;
			ProjectMain.gameState = 3;
		}
		else if (tempCheckWin && !(((TicTacToe.turns-1) % 2 == 0))){
			TicTacToe.xWin = true;
			ProjectMain.gameState = 3;
		}
		else if((TicTacToe.turns-1) == 9){// last turn made and no win?
			TicTacToe.tictacNoWin = true;
			ProjectMain.gameState = 3;
		}		
	}

}
