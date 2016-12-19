
public abstract class GamePieces implements Grid
{
	private String type;
	
	public GamePieces()
	{
		type = "";
	}
	
	public GamePieces(String pieceType)
	{
		type = pieceType; //The piece type will determine if it's for tictactoe or stones and output an image accordingly
	}

	public String getType()
	{
		return type; //returns the type of gamepieces being used
	}
	
	public abstract boolean changePiece(); //true = adding a piece, false = removing a piece
	public abstract int piecesTotal();
	//May need to add a method that checks if a piece is already there?
	
}
