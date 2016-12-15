import java.io.IOException;

public class Stones extends GridMania implements GridGame{

	public Stones() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		checkQuitGame();//check if user clicked x
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
}
