
public interface Grid {
	
	int generateGrid(); //generate grid at start of game
	
	int updateGridPiece(); //mechanism to put in xo or to update removed blocks (for stones)
	
	boolean checkGridWin(); // test to see if there is winner
	
	void determinePlayer(boolean turn);
}
