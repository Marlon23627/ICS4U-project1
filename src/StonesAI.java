
public class StonesAI extends Stones
{
	private int  aiTurns;
	private int aiY;
	private int aiX;
	
	public StonesAI()
	{
		aiTurns = 0;
		aiY = 0;
		aiX = 0;
	}
	
	public int aiTurns()
	{
		aiTurns = (int) (Math.random() * 3 + 1); //FIX... gotta make a random generator from 1 - 3;
		return aiTurns;
	}
	
	public void aiMoves()
	{
//		for(int i = 0; i < aiTurns; i++)
//		{
			aiY = (int)(Math.random() * 5 + 1); //pick a random value from a range of 0 - 4;
			aiX = (int)(Math.random() * 5 + 1); //picka random value froma range of 0 - 4;
//		}
	}
	//returns the AI's chosen coordinates
	public int getAiY()
	{
		return aiY;
	}
	public int getAiX()
	{
		return aiX;
	}

}
