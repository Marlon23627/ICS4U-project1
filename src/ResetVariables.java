import java.io.IOException;

public abstract class ResetVariables {
	abstract void resetVariables();
	
	public void reInstateGame() throws IOException { //method will be called from main panel
		ProjectMain.ticTacPlay = new TicTacToe(); // reinstate to start fresh new game
		ProjectMain.stonesPlay = new Stones();
	}
}
