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
				break;
		
		case 2: // draw stones image baord
				g.drawImage(stones, 0, 0, null);
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
	//how game will run
	
	public void checkQuitGame(){
		if(ProjectMain.mouseX <= 970 && ProjectMain.mouseX >= 934){			//check for exit
			if(ProjectMain.mouseY <= 67 && ProjectMain.mouseY >= 29){
				ProjectMain.gameState = 0;
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
