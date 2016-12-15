
public class Stones extends GamePieces implements Grid
{
	private int stonePieceX;
	private int stonePieceY;
	private int[][] piece;
	
	public Stones(String sPiece, int sPieceX, int sPieceY)
	{
		super(sPiece);
		stonePieceX = sPieceX; //gets piece that player wants to remove
		stonePieceY = sPieceY;
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
	public int getPieceX() 
	{
		return stonePieceY;
	}

	@Override
	public int getPieceY() 
	{
		return stonePieceY;
	}

	@Override
	public boolean changePiece() 
	{
		piece = new int[stonePieceX][stonePieceY]; //gets rid of that piece now
		return false;
	}
}
