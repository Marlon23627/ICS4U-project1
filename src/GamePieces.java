
public abstract class GamePieces implements Grid
{
	private char type;
	
	public GamePieces(char pieceType)
	{
		type = pieceType; //The piece type will determine if it's for tictactoe or stones and output an image accordingly
	}
	
	public char getType()
	{
		return type; //returns the type of gamepieces being used
	}
	
	public abstract int getPieceX();//get x coordinate of the gamePiece
	public abstract int getPieceY();//get y coordinate of the gamePiece
	public abstract boolean changePiece(); //true = add, false = remove
	//May need to add a method that checks if a piece is already there?
	
}
