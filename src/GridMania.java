import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GridMania extends JPanel implements MouseMotionListener, MouseListener
{

	Boolean gameStart = true; // only true on first set up
	
	BufferedImage mainMenu, ticTac, stones, xWin, oWin, oneWin, twoWin; //menus images
	
	BufferedImage xPiece[] = new BufferedImage [9];
	BufferedImage oPiece[] = new BufferedImage [9]; 
	BufferedImage stonePiece [] = new BufferedImage[25]; //game component images
	
	
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
		for(int i = 0; i< 9; i++){
			xPiece[i] = ImageIO.read(fileURL);
		}

		fileURL = getClass().getResource("o.png");
		for(int i = 0; i< 9; i++){
			oPiece[i] = ImageIO.read(fileURL);
		}
		
		fileURL = getClass().getResource("Stone.png");
		for(int i = 0; i< 25; i++){
			stonePiece[i] = ImageIO.read(fileURL);
		}
		
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
		fileURL = getClass().getResource("TrunsLeft3.png");
		turn3 = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("TrunsLeft2.png");
		turn2 = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("TrunsLeft1.png");
		turn1 = ImageIO.read(fileURL);
		
		fileURL = getClass().getResource("TrunsLeft0.png");
		turn0 = ImageIO.read(fileURL);
		
	}
	
	public void paintComponent(Graphics g){
		
		switch(ProjectMain.gameState){
		
		case 0: //main menu board
				g.drawImage(mainMenu, 0, 0, null);
				break;
		case 1: // draw tic tac image board
				g.drawImage(ticTac, 0, 0, null);
				
				if(TicTacToe.playerXTic == true) // draw whose playing
					g.drawImage(xPlayer,332, 104, null);
				else
					g.drawImage(oPlayer,332, 104, null);
				
				for(int y = 168, row = 0, i = 0; row < 3 ; row++, y += 161){ 	// i is is which grid box, 0-2 on top row, 3-5 middle, etc
					for(int x = 168; x < 500;x+=160, i++){ 
						if(TicTacToe.imgXEXIST[i] == true)      //if at this position x should exist, draw one
							g.drawImage(xPiece[i], x, y, null);
						else if(TicTacToe.imgOEXIST[i] == true) // same but with o
							g.drawImage(oPiece[i], x, y, null);
					}
				}
				
				break;
		
		case 2: // draw stones image baord
				g.drawImage(stones, 0, 0, null);
				break;
				
		case 3:// winner in tic tac menue
				if(TicTacToe.xWin)
					g.drawImage(xWin, 0, 0, null);
				else if(TicTacToe.oWin)
					g.drawImage(oWin, 0, 0, null);
				break;
		}
	}
	
	public void run() throws IOException{
		if(ProjectMain.mouseX <= 382 && ProjectMain.mouseX >= 93){
			if(ProjectMain.mouseY <= 580 && ProjectMain.mouseY >= 287){
					ProjectMain.gameState = 1;
			}
		}
		
		if(ProjectMain.mouseX <= 701 && ProjectMain.mouseX >= 411){
			if(ProjectMain.mouseY <= 580 && ProjectMain.mouseY >= 287){
				ProjectMain.gameState = 2;
			}
		}
		
	}
	//how main menu runs
	
	public void run(boolean winScreen) throws IOException{ // this is called upon win and seves only as exit gate way code
		checkQuitGame();
	}

	public void checkQuitGame() throws IOException{
		if(ProjectMain.mouseX <= 776 && ProjectMain.mouseX >= 746){			//check for exit
			if(ProjectMain.mouseY <= 54 && ProjectMain.mouseY >= 22){
				ProjectMain.gameState = 0;
				reInstateGame(); // exit game, start fresh again
			}
		}
	}
	
	public void reInstateGame() throws IOException {
		ProjectMain.ticTacPlay = new TicTacToe(); // reinstate to start fresh new game
		ProjectMain.stonesPlay = new Stones();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ProjectMain.mouseX = e.getX();
		ProjectMain.mouseY = e.getY();
		
		System.out.println(ProjectMain.mouseX  + "   " + ProjectMain.mouseY);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
