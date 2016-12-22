import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;

public class ProjectMain {

	static int mouseX; // will be used to track mouse clicks throughout the game
	static int mouseY;
	
	static int gameState = 0; // how we will change the menus and what graphics to output
	
	static TicTacToe ticTacPlay;// static reference to be called throughout
	static Stones stonesPlay; // static setup
	
	static long waitTimeSelection; // holds snap shot of time for delay of click function
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// declare and initialize a JFrame
				JFrame myFrame = new JFrame();

				// config frame settings
				myFrame.setLocationRelativeTo(null);

				myFrame.setTitle("Grid Mania");
				myFrame.setSize(800, 800);
				myFrame.setResizable(false);
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// Get the size of the screen
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

				int x = (dim.width - myFrame.getSize().width) / 2;

				int y = (dim.height - myFrame.getSize().height) / 2;

				// center it
				myFrame.setLocation(x, y);

				// make our frame visible
				myFrame.setVisible(true);
				
				GridMania mainPanel = new GridMania(); //main game panel
				
				ticTacPlay = new TicTacToe();// static reference to be called throughout
				stonesPlay = new Stones();

				mainPanel.setSize(800, 800);
				mainPanel.setBackground(Color.BLACK);

				// put the panel inside the frame
				myFrame.setContentPane(mainPanel);
				
				// enable mouse motion listener
				mainPanel.addMouseMotionListener(mainPanel);
				// enable mouse listener
				mainPanel.addMouseListener(mainPanel);
				
				// enable mouse motion listener --- this is for tic tac toe class ---
				ticTacPlay.addMouseMotionListener(ticTacPlay);
				// enable mouse listener
				ticTacPlay.addMouseListener(ticTacPlay);
				
				ticTacPlay.setSize(800, 800);				
				ticTacPlay.setBackground(Color.BLACK);

				// enable mouse motion listener  -- this is for stones game -- 
				stonesPlay.addMouseMotionListener(stonesPlay);
				// enable mouse listener
				stonesPlay.addMouseListener(stonesPlay);
				
				stonesPlay.setSize(800, 800);
				stonesPlay.setBackground(Color.BLACK);

				
				while(true){
					switch(gameState){
					case 0: // main menu
							mainPanel.requestFocus();
							mainPanel.run();
							mainPanel.repaint();
						break;
					case 1: // tic tact toe
							ticTacPlay.requestFocus();
							ticTacPlay.run(); // run the run mehtod in tic tac toe game
							mainPanel.repaint();
							break;
					case 2: //run stones code
							stonesPlay.requestFocus();
							stonesPlay.run(); // same as tic tac
							mainPanel.repaint();
							break;
					case 3: // this is win screen
							mainPanel.run(true);
							break;
					}
					
		}

	}

}
