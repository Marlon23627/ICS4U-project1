
public interface GridGame {
	
	void isWinner(int player); //chekck for win, pass in which player turn it was when the win took place
	
	void generateGrid(); //generate grid at start of game
	
	void updateGridPiece(); //mechanism to put in xo or to update removed blocks (for stones)
	
	boolean checkGridWin(); // test to see if there is winner
	
	void determinePlayer(int turn);
	
	void pieceExist();
}
