
public class StoneReset extends ResetVariables {

	@Override
	void resetVariables() {
		// TODO Auto-generated method stub
		Stones.stoneEXIST = new boolean [25];
		
		Stones.player1Turn = true;
		Stones.player2Turn = false;
		
		Stones.oneWin = false;
		Stones.twoWin = false;
	}

	void resetAfterTurn(){ //downcast this
		//reset neccessary varibles after switch players
	}
}
