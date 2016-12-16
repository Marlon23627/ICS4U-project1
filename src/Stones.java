
public class Stones extends GamePieces implements Grid
{
	private int stonePieceX;
	private int stonePieceY;
	private int stonesTotal;
	private char[][] grid = new char [5][5];
	private int gridSize;
	private boolean player; 
	
	public Stones()
	{
		gridSize = 25;
		stonesTotal = 25;
	}
	
	public Stones(String sPiece, int sPieces)
	{
		super(sPiece);
		stonesTotal = sPieces;
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
		
		System.out.println("  1 2 3 4 5"); 
		//prints out the grid with all the stones in it
		for(int i = 0; i < 5; i++)
		{
			System.out.print(i + 1 + " ");
			for(int j = 0; j < 5; j++)
			{
				System.out.print(grid[i][j]);
				System.out.print(" "); //spaces out the stones

			}
			System.out.println();
		}
		
		return gridSize;
	}

	@Override
	public int updateGrid() 
	{
		System.out.println("  1 2 3 4 5");
		//prints out the grid with all the stones in it
		for(int i = 0; i < 5; i++)
		{
			System.out.print(i + 1 + " ");
			for(int j = 0; j < 5; j++)
			{
				System.out.print(grid[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}	
		if(stonesTotal == 0 && player == true)
		{
			System.out.println("GAME OVER! PLAYER 1 WINS!!!"); // Gotta figure out how to end / terminate
			
		}
		else if (stonesTotal == 0 && player == false)
		{
			System.out.println("GAME OVER! PLAYER 2 WINS!!!"); // Gotta figure out how to end /terminate
		}
		return stonesTotal;
	}
	

//	@Override
//	public boolean checkGridWin() {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public void determinePlayer(boolean turn) 
	{
		//checks whos turn it is by switching between true or false in main
		if(turn = true)
		{
			player = true;
		}
		else
			player = false;
	}
	public void setCoordinates(int sX, int sY)
	{
		stonePieceX = sX;
		stonePieceY = sY;
	}

	@Override
	public boolean changePiece() 
	{
		if(grid[stonePieceX - 1][stonePieceY - 1] != ' ')
		{
			grid[stonePieceX - 1][stonePieceY - 1] = ' ';//gets rid of the stone in that position
			stonesTotal--;
		}
		
		else //if the user picks a spot that already has a stone
		{
			System.out.println("That stone has already been removed!");
			//***FIGURE OUT HOW TO FIX MULTIPLE SIMILAR COORDIANTE PICKS***//
		}
		return false;
	}

	@Override
	public int piecesTotal() {
		// TODO Auto-generated method stub
		return stonesTotal;
	}
}
