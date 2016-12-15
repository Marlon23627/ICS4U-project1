import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;

public class ProjectMain {

	static int mouseX; // will be used to track mouse clicks throughout the game
	static int mouseY;
	

	static TicTacToe ticTacPlay;// static reference to be called throughout
	static Stones stonesPlay; // static setup
	
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
				
				GridMania myPanel = new GridMania(); //main game panel
				
				ticTacPlay = new TicTacToe();// static reference to be called throughout
				stonesPlay = new Stones();

				myPanel.setSize(800, 800);
				myPanel.setBackground(Color.BLACK);

				// put the panel inside the frame
				myFrame.setContentPane(myPanel);
				
				myPanel.requestFocus();

				// enable mouse motion listener
				myPanel.addMouseMotionListener(myPanel);

				// enable mouse listener
				myPanel.addMouseListener(myPanel);
				
				while(true){
					myPanel.run();
					myPanel.repaint();
				}
				
				
	}

}
