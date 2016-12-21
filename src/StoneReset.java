
public class StoneReset extends ResetVariables {

	@Override
	void resetVariables() { // this resets for a new game of stones
		// TODO Auto-generated method stub
		Stones.stoneEXIST = new boolean [25];
		
		Stones.player1Turn = true;
		Stones.player2Turn = false;
		
		Stones.player1TurnsLeft = 3;
		Stones.player2TurnsLeft = 3;
		
		Stones.oneWin = false;
		Stones.twoWin = false;
		
		for(int i= 0; i<25; i++){
			Stones.stoneEXIST[i] = true;
		}
	}

	void resetAfterTurn(){ //this will be accessed by downcast
		//reset neccessary varibles after enter move
		Stones.stoneTurns++; // this signifies that this is a certain players turn
		
		//reset data after turn
		Stones.player1TurnsLeft = 3; 
		Stones.player2TurnsLeft = 3;
		
		if(Stones.player1Turn){ // if this is player 1 playing, swap the booleans
			Stones.player2Turn = true;
			Stones.player1Turn = false;
		}
		else{
			Stones.player2Turn = false;
			Stones.player1Turn = true;
		}
	}
}
