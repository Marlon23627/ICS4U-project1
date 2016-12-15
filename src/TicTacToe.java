import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class TicTacToe extends GridMania implements GridGame, MouseMotionListener, MouseListener{

	public TicTacToe() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		checkQuitGame(); // see if x clicked, method in super class, THIS IS NOT WORKING NOW
	}

	@Override
	public int generateGrid() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateGridPiece() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkGridWin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void determinePlayer(boolean turn) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ProjectMain.mouseX = e.getX();
		ProjectMain.mouseY = e.getY();
	}

}
