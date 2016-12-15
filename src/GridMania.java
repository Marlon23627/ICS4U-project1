import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public abstract class GridMania extends JPanel 
{
	BufferedImage mainMenu, ticTac, stones, xWin, oWin, oneWin, twoWin; //menus images
	BufferedImage xPiece, oPiece, stonePiece; //game component images
	BufferedImage xPlayer, oPlayer, player1, player2; //which player images
	BufferedImage turn3, turn2, turn1, turn0; // which turn images
	public GridMania() throws IOException{
		URL fileURL; //get images all loaded in
		
		//menus
		fileURL = getClass().getResource("main menu.png");
		mainMenu = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("stonesGame.png");
		stones = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("tic tac to.png");
		ticTac = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("play1WIN.png");
		oneWin = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("play2WIN.png");
		twoWin = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("playOWIN.png");
		oWin = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("playXWIN.png");
		xWin = ImageIO.read(fileURL);
		
		//pieces
		fileURL = getClass().getResource("x.png");
		xPiece = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("o.png");
		oPiece = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("Stone.png");
		stonePiece = ImageIO.read(fileURL);
		
		//player id
		fileURL = getClass().getResource("Player O.png");
		oPlayer = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("PLayer X.png");
		xPlayer = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("PLayer 1.png");
		player1 = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("PLayer 2.png");
		player2 = ImageIO.read(fileURL);
		
		//stones count
		fileURL = getClass().getResource("TurnsLeft3.png");
		turn3 = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("TurnsLeft2.png");
		turn2 = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("TurnsLeft1.png");
		turn1 = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("TurnsLeft0.png");
		turn0 = ImageIO.read(fileURL);
		
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(mainMenu, 0, 0, null);
	}
	
	//abstract void run(); 	//how game will run
}
