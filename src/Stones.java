
public class Stones extends GamePieces implements Grid
{
	private int stonePieceX;
	private int stonePieceY;
	private int[][] piece;
	private char[][] grid = new char [5][5];
	private int gridSize;
	
	public Stones()
	{
		gridSize = 25;
	}
	
	public Stones(String sPiece, int sPieceX, int sPieceY)
	{
		super(sPiece);
		stonePieceX = sPieceX; //gets piece that player wants to remove
		stonePieceY = sPieceY;
	}

	@Override
	public int generateGrid() 
	{	
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				grid[i][j] = 'O'; // give each grid part a stone 
			}
		}
		
		System.out.println("  12345");
		//prints out the grid with all the stones in it
		for(int i = 0; i < 5; i++)
		{
			System.out.print(i + 1 + " ");
			for(int j = 0; j < 5; j++)
			{
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		
		return gridSize;
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
