
public class CleanUpStones implements LongCodeCleanUp {

	@Override
	public void cleanPieceEnter() {
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
		if(Stones.player1TurnsLeft > 0 && Stones.player2TurnsLeft > 0){ //either one will break ability to choose piece if they have no turns left
			if(ProjectMain.mouseY >= 109 && ProjectMain.mouseY < 228){ // top row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(Stones.stoneGameBoard[0][0] == 0){
						Stones.stoneGameBoard[0][0] = 1; 
						Stones.stoneEXIST[0] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 232 && ProjectMain.mouseX < 344){ //2nd x axis
					if(Stones.stoneGameBoard[1][0] == 0){
						Stones.stoneGameBoard[1][0] = 1; 
						Stones.stoneEXIST[1] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(Stones.stoneGameBoard[2][0] == 0){
						Stones.stoneGameBoard[2][0] = 1; 
						Stones.stoneEXIST[2] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(Stones.stoneGameBoard[3][0] == 0){
						Stones.stoneGameBoard[3][0] = 1; 
						Stones.stoneEXIST[3] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(Stones.stoneGameBoard[4][0] == 0){
						Stones.stoneGameBoard[4][0] = 1; 
						Stones.stoneEXIST[4] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				
			}
			else if(ProjectMain.mouseY >= 232 && ProjectMain.mouseY < 353){ //2nd row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(Stones.stoneGameBoard[0][1] == 0){
						Stones.stoneGameBoard[0][1] = 1; 
						Stones.stoneEXIST[5] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(Stones.stoneGameBoard[1][1] == 0){
						Stones.stoneGameBoard[1][1] = 1; 
						Stones.stoneEXIST[6] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(Stones.stoneGameBoard[2][1] == 0){
						Stones.stoneGameBoard[2][1] = 1; 
						Stones.stoneEXIST[7] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(Stones.stoneGameBoard[3][1] == 0){
						Stones.stoneGameBoard[3][1] = 1; 
						Stones.stoneEXIST[8] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(Stones.stoneGameBoard[4][1] == 0){
						Stones.stoneGameBoard[4][1] = 1; 
						Stones.stoneEXIST[9] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
			}
			else if (ProjectMain.mouseY >= 355 && ProjectMain.mouseY < 476){ // 3rd row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(Stones.stoneGameBoard[0][2] == 0){
						Stones.stoneGameBoard[0][2] = 1; 
						Stones.stoneEXIST[10] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(Stones.stoneGameBoard[1][2] == 0){
						Stones.stoneGameBoard[1][2] = 1; 
						Stones.stoneEXIST[11] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(Stones.stoneGameBoard[2][2] == 0){
						Stones.stoneGameBoard[2][2] = 1; 
						Stones.stoneEXIST[12] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(Stones.stoneGameBoard[3][2] == 0){
						Stones.stoneGameBoard[3][2] = 1; 
						Stones.stoneEXIST[13] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(Stones.stoneGameBoard[4][2] == 0){
						Stones.stoneGameBoard[4][2] = 1; 
						Stones.stoneEXIST[14] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
			}
			else if(ProjectMain.mouseY >= 478 && ProjectMain.mouseY < 599){ // 4th row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(Stones.stoneGameBoard[0][3] == 0){
						Stones.stoneGameBoard[0][3] = 1; 
						Stones.stoneEXIST[15] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(Stones.stoneGameBoard[1][3] == 0){
						Stones.stoneGameBoard[1][3] = 1; 
						Stones.stoneEXIST[16] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(Stones.stoneGameBoard[2][3] == 0){
						Stones.stoneGameBoard[2][3] = 1; 
						Stones.stoneEXIST[17] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(Stones.stoneGameBoard[3][3] == 0){
						Stones.stoneGameBoard[3][3] = 1; 
						Stones.stoneEXIST[18] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(Stones.stoneGameBoard[4][3] == 0){
						Stones.stoneGameBoard[4][3] = 1; 
						Stones.stoneEXIST[19] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
			}
			else if(ProjectMain.mouseY >= 601 && ProjectMain.mouseY < 722){ // 5th row
				if(ProjectMain.mouseX >= 102 && ProjectMain.mouseX < 222){ //1st x axis
					if(Stones.stoneGameBoard[0][4] == 0){
						Stones.stoneGameBoard[0][4] = 1; 
						Stones.stoneEXIST[20] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 224 && ProjectMain.mouseX < 344){ //2nd x axis
					if(Stones.stoneGameBoard[1][4] == 0){
						Stones.stoneGameBoard[1][4] = 1; 
						Stones.stoneEXIST[21] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 346 && ProjectMain.mouseX < 466){ //3 x axis
					if(Stones.stoneGameBoard[2][4] == 0){
						Stones.stoneGameBoard[2][4] = 1; 
						Stones.stoneEXIST[22] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 468 && ProjectMain.mouseX < 588){ // 4 x axis
					if(Stones.stoneGameBoard[3][4] == 0){
						Stones.stoneGameBoard[3][4] = 1; 
						Stones.stoneEXIST[23] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
				else if(ProjectMain.mouseX >= 590 && ProjectMain.mouseX < 710){ // 5 x axis
					if(Stones.stoneGameBoard[4][4] == 0){
						Stones.stoneGameBoard[4][4] = 1; 
						Stones.stoneEXIST[24] = false; // stone is off board now
						
						if(Stones.player1Turn){
							Stones.player1TurnsLeft--;//player 1 has used up a turn
						}
						else{
							Stones.player2TurnsLeft--; 
						}
					}
				}
			}
		}
	}

	@Override
	public void cleanFindWinner() {
		// TODO Auto-generated method stub
		int fullSpaces = 0; // count how many spaces in array contain 1 values
		
		for(int y = 0; y < 5; y++){
			for(int x = 0; x < 5; x++){
				if(Stones.stoneGameBoard[x][y] == 1)
					fullSpaces++;
			}
		}
		
		if(fullSpaces == 25){ // we have a full grid
			if(Stones.player1Turn){
				Stones.oneWin = true;//player 1 has used up a turn
				ProjectMain.gameState = 3;// go to win screen
			}
			else{
				Stones.twoWin = true; 
				ProjectMain.gameState = 3;
			}
		}
	}

}
