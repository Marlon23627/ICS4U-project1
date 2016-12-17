import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class Stones extends GridMania implements GridGame{

	public Stones() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() throws IOException {
		// TODO Auto-generated method stub
		checkQuitGame();//check if user clicked x
	}

	@Override
	public void generateGrid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGridPiece() {
		// TODO Auto-generated method stub
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
	public void isWinner(int player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pieceExist() {
		// TODO Auto-generated method stub
		
	}

}
