
public class TicTacToeReset extends ResetVariables {

	@Override
	void resetVariables() {
		// TODO Auto-generated method stub
		//reset old static variables for fresh game     
				TicTacToe.imgXEXIST = new boolean[9];
				
				TicTacToe.imgOEXIST = new boolean[9];
			
				TicTacToe.playerXTic = true;
				
				TicTacToe.playerOTic = false;
				
				TicTacToe.xWin = false;
				
				TicTacToe.oWin = false;
	}

}
