package league_invaders;

import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	public static final int width = 500;
	public static final int height = 800;
	GamePanel gp;
public static void main(String[] args) {
new LeagueInvaders().setup();

}
LeagueInvaders(){
frame = new JFrame();
frame.setSize(width, height);
gp = new GamePanel();

}
void setup() {
	frame.add(gp);
	frame.getContentPane().setPreferredSize(new Dimension(width, height));
    frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gp.StartGame();
	frame.addKeyListener(gp);
}

	
}




