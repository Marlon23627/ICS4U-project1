
public interface GridGame {
	
	void isWinner(); //check for win
	
	void generateGrid(); //generate grid at start of game
	
	void updateGridPiece(); //mechanism to put in xo or to update removed blocks (for stones)
	
}
